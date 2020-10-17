# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
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


    # Visit a parse tree produced by MyExprParser#main_fun.
    def visitMain_fun(self, ctx:MyExprParser.Main_funContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#int_type.
    def visitInt_type(self, ctx:MyExprParser.Int_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#statement.
    def visitStatement(self, ctx:MyExprParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#return_stat.
    def visitReturn_stat(self, ctx:MyExprParser.Return_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#expression.
    def visitExpression(self, ctx:MyExprParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#add_none.
    def visitAdd_none(self, ctx:MyExprParser.Add_noneContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#add_operate.
    def visitAdd_operate(self, ctx:MyExprParser.Add_operateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#mul_none.
    def visitMul_none(self, ctx:MyExprParser.Mul_noneContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#mul_operate.
    def visitMul_operate(self, ctx:MyExprParser.Mul_operateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#unary_none.
    def visitUnary_none(self, ctx:MyExprParser.Unary_noneContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#unary_operate.
    def visitUnary_operate(self, ctx:MyExprParser.Unary_operateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#primaryInteger.
    def visitPrimaryInteger(self, ctx:MyExprParser.PrimaryIntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#primaryParen.
    def visitPrimaryParen(self, ctx:MyExprParser.PrimaryParenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyExprParser#parameter.
    def visitParameter(self, ctx:MyExprParser.ParameterContext):
        return self.visitChildren(ctx)



del MyExprParser