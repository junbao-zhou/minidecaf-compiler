grammar MyExpr;

import MyExprLex;

program: main_fun;
main_fun:
	int_type 'main' '(' parameter* ')' '{' statement* '}' EOF;

int_type: 'int';

statement: return_stat;

return_stat: 'return' expression ';';

expression: bool_not | bitwise | negtive | integer;

bool_not: '!' expression;
bitwise: '~' expression;
negtive: '-' expression;

integer: Integer;

parameter: int_type Identifier;
