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
        self.function_name = "main"
        for instruct in ctx.instruction():
            string = string + instruct.accept(self)
        return string

    def visitInstruction(self, ctx: IR2asmParser.InstructionContext):
        return self.visitChildren(ctx)

    def visitLabel(self, ctx):
        return f"""
    {ctx.Identifier().getText()}:
"""

    def visitBr(self, ctx):
        return f"""
    j {ctx.Identifier().getText()}
"""

    def visitBeqz(self, ctx):
        return f"""
    lw t1, 0(sp)
    addi sp, sp, 4
    beqz t1, {ctx.Identifier().getText()}
"""

    def visitBnez(self, ctx):
        return f"""
    lw t1, 0(sp)
    addi sp, sp, 4
    bnez t1, {ctx.Identifier().getText()}
"""

    def visitPrologue(self, ctx):
        framesize = 8+4*int(ctx.Integer().getText())
        return f"""
    addi sp, sp, -{framesize}
    sw ra, {framesize-4}(sp)
    sw fp, {framesize-8}(sp)
    addi fp, sp, {framesize}
"""

    def visitEpilogue(self, ctx):
        framesize = 8+4*int(ctx.Integer().getText())
        return f"""
    {self.function_name}_epilogue:
    lw a0, 0(sp)
    addi sp, sp, 4
    lw fp, {framesize-8}(sp)
    lw ra, {framesize-4}(sp)
    addi sp, sp, {framesize}
    jr ra
"""

    def visitFrameaddr(self, ctx):
        return f"""
    addi sp, sp, -4
    addi t1, fp, {-12-4*int(ctx.Integer().getText())}
    sw t1, 0(sp)
"""

    def visitLoad(self, ctx):
        return f"""
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)
"""

    def visitStore(self, ctx):
        return f"""
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)
"""

    def visitPop(self, ctx):
        return f"""
    addi sp, sp, 4
"""

    def visitPush(self, ctx: IR2asmParser.PushContext):
        return f"""
    addi sp, sp, -4 
    li t1 , {ctx.Integer().getText()}
    sw t1, 0(sp)
"""

    def visitRet(self, ctx: IR2asmParser.RetContext):
        return f"""
    j {self.function_name}_epilogue
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
