# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyExprParser import MyExprParser
else:
    from MyExprParser import MyExprParser

# This class defines a complete listener for a parse tree produced by MyExprParser.
class MyExprListener(ParseTreeListener):

    # Enter a parse tree produced by MyExprParser#program.
    def enterProgram(self, ctx:MyExprParser.ProgramContext):
        pass

    # Exit a parse tree produced by MyExprParser#program.
    def exitProgram(self, ctx:MyExprParser.ProgramContext):
        pass


    # Enter a parse tree produced by MyExprParser#main_fun.
    def enterMain_fun(self, ctx:MyExprParser.Main_funContext):
        pass

    # Exit a parse tree produced by MyExprParser#main_fun.
    def exitMain_fun(self, ctx:MyExprParser.Main_funContext):
        pass


    # Enter a parse tree produced by MyExprParser#int_type.
    def enterInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass

    # Exit a parse tree produced by MyExprParser#int_type.
    def exitInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass


    # Enter a parse tree produced by MyExprParser#statement.
    def enterStatement(self, ctx:MyExprParser.StatementContext):
        pass

    # Exit a parse tree produced by MyExprParser#statement.
    def exitStatement(self, ctx:MyExprParser.StatementContext):
        pass


    # Enter a parse tree produced by MyExprParser#return_stat.
    def enterReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass

    # Exit a parse tree produced by MyExprParser#return_stat.
    def exitReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass


    # Enter a parse tree produced by MyExprParser#expression.
    def enterExpression(self, ctx:MyExprParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyExprParser#expression.
    def exitExpression(self, ctx:MyExprParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MyExprParser#bool_not.
    def enterBool_not(self, ctx:MyExprParser.Bool_notContext):
        pass

    # Exit a parse tree produced by MyExprParser#bool_not.
    def exitBool_not(self, ctx:MyExprParser.Bool_notContext):
        pass


    # Enter a parse tree produced by MyExprParser#bitwise.
    def enterBitwise(self, ctx:MyExprParser.BitwiseContext):
        pass

    # Exit a parse tree produced by MyExprParser#bitwise.
    def exitBitwise(self, ctx:MyExprParser.BitwiseContext):
        pass


    # Enter a parse tree produced by MyExprParser#negtive.
    def enterNegtive(self, ctx:MyExprParser.NegtiveContext):
        pass

    # Exit a parse tree produced by MyExprParser#negtive.
    def exitNegtive(self, ctx:MyExprParser.NegtiveContext):
        pass


    # Enter a parse tree produced by MyExprParser#integer.
    def enterInteger(self, ctx:MyExprParser.IntegerContext):
        pass

    # Exit a parse tree produced by MyExprParser#integer.
    def exitInteger(self, ctx:MyExprParser.IntegerContext):
        pass


    # Enter a parse tree produced by MyExprParser#parameter.
    def enterParameter(self, ctx:MyExprParser.ParameterContext):
        pass

    # Exit a parse tree produced by MyExprParser#parameter.
    def exitParameter(self, ctx:MyExprParser.ParameterContext):
        pass


