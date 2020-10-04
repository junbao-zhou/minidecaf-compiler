# Generated from MyExpr/MyExpr.g4 by ANTLR 4.8
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


    # Enter a parse tree produced by MyExprParser#function.
    def enterFunction(self, ctx:MyExprParser.FunctionContext):
        pass

    # Exit a parse tree produced by MyExprParser#function.
    def exitFunction(self, ctx:MyExprParser.FunctionContext):
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


    # Enter a parse tree produced by MyExprParser#ret.
    def enterRet(self, ctx:MyExprParser.RetContext):
        pass

    # Exit a parse tree produced by MyExprParser#ret.
    def exitRet(self, ctx:MyExprParser.RetContext):
        pass


    # Enter a parse tree produced by MyExprParser#expression.
    def enterExpression(self, ctx:MyExprParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyExprParser#expression.
    def exitExpression(self, ctx:MyExprParser.ExpressionContext):
        pass



del MyExprParser