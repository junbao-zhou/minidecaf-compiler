grammar MyExpr;

import MyExprLex;

int_type: 'int';

program: main_fun;

main_fun:
	int_type 'main' '(' parameter* ')' '{' block_item* '}' EOF;

block_item: statement | declaration;

statement:
	return_stat												# stat_ret
	| expression? ';'										# stat_expr
	| 'if' '(' expression ')' statement ('else' statement)?	# stat_condition;

declaration: int_type Identifier ('=' expression)? ';';

return_stat: 'return' expression ';';

expression: assignment;

assignment:
	conditional					# assign_none
	| Identifier '=' expression	# assign;

conditional:
	logical_or									# condition_none
	| logical_or '?' expression ':' conditional	# condition;

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
	| '(' expression ')'	# primaryParen
	| Identifier			# primaryIdentifier;

parameter: int_type Identifier;
