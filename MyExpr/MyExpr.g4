grammar MyExpr;

import MyExprLex;

program: function;
function:
	int_type Identifier Lparen Rparen Lbrace statement Rbrace;

int_type: 'int';

statement: ret expression ';';

ret: 'return';

expression: Integer;
