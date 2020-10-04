grammar MyExpr;

import MyExprLex;

program: function;
function:
	int_type Identifier Lparen Rparen Lbrace statement Rbrace EOF;

int_type: 'int';

statement: ret expression ';';

ret: 'return';

expression: integer;

integer: Integer;
