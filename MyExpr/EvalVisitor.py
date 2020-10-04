import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    # Visit a parse tree produced by MyExprParser#program.
    def visitProgram(self, ctx: MyExprParser.ProgramContext):

        return """\
        .text
        .globl	main\
        """ + ctx.function().accept(self)

    # Visit a parse tree produced by MyExprParser#function.
    def visitFunction(self, ctx: MyExprParser.FunctionContext):
        functionIdent = ctx.Identifier().getText()
        if functionIdent != 'main':
            raise Exception('Not Main')
        return f"""
    {functionIdent}:
        """ + ctx.statement().accept(self)

    # Visit a parse tree produced by MyExprParser#statement.
    def visitStatement(self, ctx: MyExprParser.StatementContext):
        return ctx.expression().accept(self) + "RET\n"

    # Visit a parse tree produced by MyExprParser#expression.
    def visitExpression(self, ctx: MyExprParser.ExpressionContext):
        return ctx.integer().accept(self)

    # Visit a parse tree produced by MyExprParser#integer.
    def visitInteger(self, ctx: MyExprParser.IntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return "PUSH " + str(i) + "\n"
