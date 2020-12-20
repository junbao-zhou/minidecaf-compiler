grammar MyExpr;

import MyExprLex;

type_t: 'int';

program: (function | global_declaration)* EOF;

global_declaration: type_t Identifier ('=' Integer)? ';';

parameter_list: (type_t Identifier (',' type_t Identifier)*)?;

function:
	type_t Identifier '(' parameter_list ')' (
		func_compound_statement
		| ';'
	);

block_items: '{' block_item* '}';

func_compound_statement: block_items;

compound_statement: block_items;

block_item: statement | declaration;

statement:
	return_stat												# stat_ret
	| expression? ';'										# stat_expr
	| 'if' '(' expression ')' statement ('else' statement)?	# stat_condition
	| compound_statement									# stat_compound
	| 'for' '(' pre_expr = expression? ';' cond_expr = expression? ';' post_expr = expression? ')'
		statement																				# stat_for_loop_no_declr
	| 'for' '(' declaration cond_expr = expression? ';' post_expr = expression? ')' statement	#
		stat_for_loop_declr
	| 'while' '(' expression ')' statement			# stat_while_loop
	| 'do' statement 'while' '(' expression ')' ';'	# stat_do_loop
	| 'break' ';'									# stat_break
	| 'continue' ';'								# stat_continue;

declaration: type_t Identifier ('=' expression)? ';';

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
	postfix							# unary_none
	| op = ('-' | '~' | '!') unary	# unary_operate;

postfix:
	primary									# postfix_none
	| Identifier '(' expression_list ')'	# postfix_callfunc;

expression_list: (expression (',' expression)*)?;

primary:
	Integer					# primaryInteger
	| '(' expression ')'	# primaryParen
	| Identifier			# primaryIdentifier;

