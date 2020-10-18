	.file	"test.c"
	.option nopic
	.attribute arch, "rv32i2p0_m2p0"
	.attribute unaligned_access, 0
	.attribute stack_align, 16
	.text
	.align	2
	.globl	foo
	.type	foo, @function
foo:
	slt	a0,a0,a1
	xori	a0,a0,1
	ret
	.size	foo, .-foo
	.ident	"GCC: (SiFive GCC 8.3.0-2020.04.0) 8.3.0"
