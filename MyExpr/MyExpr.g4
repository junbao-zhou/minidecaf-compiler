grammar MyExpr;

import MyExprLex;

program: function;
function:
	'int' Identifier Lparen Rparen Lbrace statement Rbrace;

statement: 'return' expression ';';

expression: Integer;
