lexer grammar IR2asmLex;

Integer: [0-9]+;

fragment WhitespaceChar: [ \t\n\r];
Whitespace: WhitespaceChar+ -> skip;