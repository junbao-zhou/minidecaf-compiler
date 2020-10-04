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
        string = f"""
    {functionIdent}:
        """
        return string + ctx.statement().accept(self) + """
        ret"""

    # Visit a parse tree produced by MyExprParser#statement.
    def visitStatement(self, ctx: MyExprParser.StatementContext):

        return "li  a0  " + ctx.expression().accept(self)

    # Visit a parse tree produced by MyExprParser#expression.
    def visitExpression(self, ctx: MyExprParser.ExpressionContext):

        return ctx.Integer().getText()
