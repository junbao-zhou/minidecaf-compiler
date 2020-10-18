grammar MyExpr;

import MyExprLex;

program: main_fun;
main_fun:
	int_type 'main' '(' parameter* ')' '{' statement* '}' EOF;

int_type: 'int';

statement: return_stat;

return_stat: 'return' expression ';';

expression: logical_or;

logical_or:
	logical_and						# or_none
	| logical_or '||' logical_and	# or_operate;

logical_and:
	equality					# and_none
	| logical_and '&&' equality	# and_operate;

equality:
	relational									# equal_none
	| equality op = ('==' | '!=') relational	# equal_operate;

relational:
	additive												# relation_none
	| relational op = ('<' | '>' | '<=' | '>=') additive	# relation_operate;

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
