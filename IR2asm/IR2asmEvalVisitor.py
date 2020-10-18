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

    def visitInstruction(self, ctx: IR2asmParser.InstructionContext):
        return self.visitChildren(ctx)

    def visitPush(self, ctx: IR2asmParser.PushContext):
        return f"""
    addi sp, sp, -4 
    li t1 , {ctx.Integer().getText()}
    sw t1, 0(sp)
"""

    def visitRet(self, ctx: IR2asmParser.RetContext):
        return """
    lw a0, 0(sp)
    addi sp, sp, 4
    jr ra
"""

    def visitTwo_op(self, ctx: IR2asmParser.Two_opContext):
        return f"""
    lw t1, 4(sp)
    lw t2, 0(sp)
{self.visitChildren(ctx)}
    addi sp, sp, 4
    sw t1, 0(sp)
"""

    def visitOne_op(self, ctx: IR2asmParser.One_opContext):
        return f"""
    lw t1, 0(sp) 
{self.visitChildren(ctx)}
    sw t1, 0(sp)
"""

    def visitLor(self, ctx: IR2asmParser.LorContext):
        return """\
    or t1, t1, t2
    snez	t1,t1\
"""

    def visitLand(self, ctx: IR2asmParser.LandContext):
        return """\
    snez t1, t1
    snez t2, t2
    and t1, t1, t2\
"""

    def visitEq(self, ctx: IR2asmParser.EqContext):
        return """\
    sub t1, t1, t2
    seqz    t1, t1\
"""

    def visitNe(self, ctx: IR2asmParser.NeContext):
        return """\
    sub t1, t1, t2
    snez    t1, t1\
"""

    def visitLt(self, ctx: IR2asmParser.LtContext):
        return """\
    slt t1, t1, t2\
"""

    def visitGt(self, ctx: IR2asmParser.GtContext):
        return """\
    sgt t1, t1, t2\
"""

    def visitLe(self, ctx: IR2asmParser.LeContext):
        return """\
    sgt t1, t1, t2
    xori    t1, t1, 1\
"""

    def visitGe(self, ctx: IR2asmParser.GeContext):
        return """\
    slt t1, t1, t2
    xori    t1, t1, 1\
"""

    def visitLnot(self, ctx: IR2asmParser.LnotContext):
        return """\
    seqz t1, t1\
"""

    def visitBitwise(self, ctx: IR2asmParser.BitwiseContext):
        return """\
    not t1, t1\
"""

    def visitNeg(self, ctx: IR2asmParser.NegContext):
        return """\
    neg t1, t1\
"""

    def visitAdd(self, ctx: IR2asmParser.AddContext):
        return """\
    add t1, t1, t2\
"""

    def visitSub(self, ctx: IR2asmParser.SubContext):
        return """\
    sub t1, t1, t2\
"""

    def visitMul(self, ctx: IR2asmParser.MulContext):
        return """\
    mul t1, t1, t2\
"""

    def visitDiv(self, ctx: IR2asmParser.DivContext):
        return """\
    div t1, t1, t2\
"""

    def visitRem(self, ctx: IR2asmParser.RemContext):
        return """\
    rem t1, t1, t2\
"""
