grammar IR2asm;
import IR2asmLex;
program: main_fun;

main_fun: 'main' '{' instruction* '}';

instruction: push | ret | lnot | bitwise | neg;

push: 'PUSH' Integer;
ret: 'RET';
lnot: 'LNOT';
bitwise: 'NOT';
neg: 'NEG';
