lexer grammar IR2asmLex;

Integer: [-]? [0-9]+;

fragment WhitespaceChar: [ \t\n\r];
Whitespace: WhitespaceChar+ -> skip;

// Identifier
fragment IdentLeadChar: [a-zA-Z_];
fragment WordChar: [a-zA-Z0-9_];
Identifier: IdentLeadChar WordChar*;