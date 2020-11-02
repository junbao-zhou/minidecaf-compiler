lexer grammar MyExprLex;

// 括号
Lparen: '(';
Rparen: ')';

Lbrace: '{';
Rbrace: '}';

Semicolon: ';';

// 运算符
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';

// 整数
Integer: [0-9]+;

// Identifier
fragment IdentLeadChar: [a-zA-Z_];
fragment WordChar: [a-zA-Z0-9_];
Identifier: IdentLeadChar WordChar*;

// 空白
fragment WhitespaceChar: [ \t\n\r];
Whitespace: WhitespaceChar+ -> skip;

// type Type: 'int';

// Return: 'return';
