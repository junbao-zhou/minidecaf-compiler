from .IR2asmVisitor import IR2asmVisitor
from .IR2asmParser import IR2asmParser


class IR2asmEvalVisitor(IR2asmVisitor):

    # Visit a parse tree produced by IR2asmParser#program.
    def visitProgram(self, ctx: IR2asmParser.ProgramContext):
        return """
	.text
	.global main
""" + ctx.main_fun().accept(self)

    # Visit a parse tree produced by IR2asmParser#main_fun.
    def visitMain_fun(self, ctx: IR2asmParser.Main_funContext):
        string = """
main:
"""
        for instruct in ctx.instruction():
            string = string + instruct.accept(self)
        return string

    # Visit a parse tree produced by IR2asmParser#instruction.
    def visitInstruction(self, ctx: IR2asmParser.InstructionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by IR2asmParser#push.
    def visitPush(self, ctx: IR2asmParser.PushContext):
        return f"""
	addi sp, sp, -4 
	li t1 , {ctx.Integer().getText()}
	sw t1, 0(sp)
"""

    # Visit a parse tree produced by IR2asmParser#ret.
    def visitRet(self, ctx: IR2asmParser.RetContext):
        return """
	lw a0, 0(sp)
	addi sp, sp, 4
	jr ra
"""

    # Visit a parse tree produced by IR2asmParser#lnot.
    def visitLnot(self, ctx: IR2asmParser.LnotContext):
        return """
    lw t1, 0(sp) 
    seqz t1, t1
    sw t1, 0(sp)
"""

    # Visit a parse tree produced by IR2asmParser#bitwise.
    def visitBitwise(self, ctx: IR2asmParser.BitwiseContext):
        return """
    lw t1, 0(sp) 
    not t1, t1
    sw t1, 0(sp)
"""

    # Visit a parse tree produced by IR2asmParser#neg.
    def visitNeg(self, ctx: IR2asmParser.NegContext):
        return """
    lw t1, 0(sp) 
    neg t1, t1
    sw t1, 0(sp)
"""
