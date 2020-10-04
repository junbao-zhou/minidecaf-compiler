# Generated from MyExpr/MyExpr.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyExprParser import MyExprParser
else:
    from MyExprParser import MyExprParser

# This class defines a complete generic visitor for a parse tree produced by MyExprParser.

class MyExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyExprParser#program.
    def visitProgram(self, ctx:MyExprParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#function.
    def visitFunction(self, ctx:MyExprParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#int_type.
    def visitInt_type(self, ctx:MyExprParser.Int_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#statement.
    def visitStatement(self, ctx:MyExprParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#ret.
    def visitRet(self, ctx:MyExprParser.RetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#expression.
    def visitExpression(self, ctx:MyExprParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#integer.
    def visitInteger(self, ctx:MyExprParser.IntegerContext):
        return self.visitChildren(ctx)



del MyExprParser