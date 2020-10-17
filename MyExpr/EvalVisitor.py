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

    # Visit a parse tree produced by MyExprParser#bool_not.
    def visitBool_not(self, ctx: MyExprParser.Bool_notContext):
        return self.visitChildren(ctx) + """
LNOT
"""

    # Visit a parse tree produced by MyExprParser#bitwise.
    def visitBitwise(self, ctx: MyExprParser.BitwiseContext):
        return self.visitChildren(ctx) + """
NOT
"""

    # Visit a parse tree produced by MyExprParser#negtive.
    def visitNegtive(self, ctx: MyExprParser.NegtiveContext):
        return self.visitChildren(ctx) + """
NEG
"""

    # Visit a parse tree produced by MyExprParser#integer.
    def visitInteger(self, ctx: MyExprParser.IntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return "PUSH " + str(i) + "\n"
