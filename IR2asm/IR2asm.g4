grammar IR2asm;
import IR2asmLex;
program: (func | global_var)*;

global_var: Identifier '=' (Integer)?;

func: Identifier '{' instruction* '}';

instruction:
	globaladdr
	| store_reg
	| call
	| label
	| br
	| beqz
	| bnez
	| prologue
	| epilogue
	| frameaddr
	| load
	| store
	| pop
	| push
	| ret
	| two_op
	| one_op;

globaladdr: 'GLOBALADDR' Identifier;
store_reg: 'STORE_REG' Identifier;
call: 'CALL' Identifier;
label: 'LABEL' Identifier;
br: 'BR' Identifier;
beqz: 'BEQZ' Identifier;
bnez: 'BNEZ' Identifier;
prologue: 'PROLOGUE' Integer;
epilogue: 'EPILOGUE' Integer;
frameaddr: 'FRAMEADDR' Integer;
load: 'LOAD';
store: 'STORE';
pop: 'POP';
push: 'PUSH' Integer;
ret: 'RET';
two_op:
	lor
	| land
	| eq
	| ne
	| lt
	| gt
	| le
	| ge
	| add
	| sub
	| mul
	| div
	| rem;
one_op: neg | bitwise | lnot;
lor: 'LOR';
land: 'LAND';
eq: 'EQ';
ne: 'NE';
lt: 'LT';
gt: 'GT';
le: 'LE';
ge: 'GE';
add: 'ADD';
sub: 'SUB';
mul: 'MUL';
div: 'DIV';
rem: 'REM';
neg: 'NEG';
bitwise: 'NOT';
lnot: 'LNOT';