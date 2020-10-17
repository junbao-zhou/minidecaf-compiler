import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    # Visit a parse tree produced by MyExprParser#program.
    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        return ctx.main_fun().accept(self)

    # Visit a parse tree produced by MyExprParser#function.
    def visitMain_fun(self, ctx: MyExprParser.Main_funContext):
        string = """
main{
"""
        for i in ctx.statement():
            string += i.accept(self)
        string += "}"
        return string

    # Visit a parse tree produced by MyExprParser#statement.
    def visitStatement(self, ctx: MyExprParser.StatementContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyExprParser#return_stat.
    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        return ctx.expression().accept(self) + "RET\n"

    # Visit a parse tree produced by MyExprParser#expression.
    def visitExpression(self, ctx: MyExprParser.ExpressionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyExprParser#add_operate.
    def visitAdd_operate(self, ctx: MyExprParser.Add_operateContext):
        string = ctx.additive().accept(self)
        string += ctx.multiplicative().accept(self)
        if ctx.op.text == '+':
            string += """
ADD
"""
        elif ctx.op.text == '-':
            string += """
SUB
"""
        return string

    # Visit a parse tree produced by MyExprParser#mul_operate.
    def visitMul_operate(self, ctx: MyExprParser.Mul_operateContext):
        string = ctx.multiplicative().accept(self)
        string += ctx.unary().accept(self)
        if ctx.op.text == '*':
            string += """
MUL
"""
        elif ctx.op.text == '/':
            string += """
DIV
"""
        elif ctx.op.text == '%':
            string += """
REM
"""
        return string

    # Visit a parse tree produced by MyExprParser#unary_operate.
    def visitUnary_operate(self, ctx: MyExprParser.Unary_operateContext):
        string = ctx.unary().accept(self)
        if ctx.op.text == '-':
            string += """
NEG
"""
        elif ctx.op.text == '~':
            string += """
NOT
"""
        elif ctx.op.text == '!':
            string += """
LNOT
"""
        return string

    # Visit a parse tree produced by MyExprParser#primaryInteger.
    def visitPrimaryInteger(self, ctx: MyExprParser.PrimaryIntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return "PUSH " + str(i) + "\n"

    # Visit a parse tree produced by MyExprParser#primaryParen.
    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)
