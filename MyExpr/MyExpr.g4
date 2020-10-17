grammar MyExpr;

import MyExprLex;

program: main_fun;
main_fun:
	int_type 'main' '(' parameter* ')' '{' statement* '}' EOF;

int_type: 'int';

statement: return_stat;

return_stat: 'return' expression ';';

expression: additive;

additive:
	multiplicative								# add_none
	| additive op = ('+' | '-') multiplicative	# add_operate;

multiplicative:
	unary											# mul_none
	| multiplicative op = ('*' | '/' | '%') unary	# mul_operate;

unary:
	primary							# unary_none
	| op = ('-' | '~' | '!') unary	# unary_operate;

primary:
	Integer					# primaryInteger
	| '(' expression ')'	# primaryParen;

parameter: int_type Identifier;
