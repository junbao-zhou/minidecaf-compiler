# Generated from MyExpr/MyExpr.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20")
        buf.write("(\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3")
        buf.write("\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2")
        buf.write("\4\6\b\n\f\16\2\2\2 \2\20\3\2\2\2\4\22\3\2\2\2\6\33\3")
        buf.write("\2\2\2\b\35\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2\2")
        buf.write("\20\21\5\4\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7\17\2")
        buf.write("\2\24\25\7\5\2\2\25\26\7\6\2\2\26\27\7\7\2\2\27\30\5\b")
        buf.write("\5\2\30\31\7\b\2\2\31\32\7\2\2\3\32\5\3\2\2\2\33\34\7")
        buf.write("\3\2\2\34\7\3\2\2\2\35\36\5\n\6\2\36\37\5\f\7\2\37 \7")
        buf.write("\t\2\2 \t\3\2\2\2!\"\7\4\2\2\"\13\3\2\2\2#$\5\16\b\2$")
        buf.write("\r\3\2\2\2%&\7\16\2\2&\17\3\2\2\2\2")
        return buf.getvalue()


class MyExprParser ( Parser ):

    grammarFileName = "MyExpr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'int'", "'return'", "'('", "')'", "'{'", 
                     "'}'", "';'", "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "Lparen", "Rparen", 
                      "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", "Mul", 
                      "Div", "Integer", "Identifier", "Whitespace" ]

    RULE_program = 0
    RULE_function = 1
    RULE_int_type = 2
    RULE_statement = 3
    RULE_ret = 4
    RULE_expression = 5
    RULE_integer = 6

    ruleNames =  [ "program", "function", "int_type", "statement", "ret", 
                   "expression", "integer" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    Lparen=3
    Rparen=4
    Lbrace=5
    Rbrace=6
    Semicolon=7
    Add=8
    Sub=9
    Mul=10
    Div=11
    Integer=12
    Identifier=13
    Whitespace=14

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def function(self):
            return self.getTypedRuleContext(MyExprParser.FunctionContext,0)


        def getRuleIndex(self):
            return MyExprParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MyExprParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.function()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def int_type(self):
            return self.getTypedRuleContext(MyExprParser.Int_typeContext,0)


        def Identifier(self):
            return self.getToken(MyExprParser.Identifier, 0)

        def Lparen(self):
            return self.getToken(MyExprParser.Lparen, 0)

        def Rparen(self):
            return self.getToken(MyExprParser.Rparen, 0)

        def Lbrace(self):
            return self.getToken(MyExprParser.Lbrace, 0)

        def statement(self):
            return self.getTypedRuleContext(MyExprParser.StatementContext,0)


        def Rbrace(self):
            return self.getToken(MyExprParser.Rbrace, 0)

        def EOF(self):
            return self.getToken(MyExprParser.EOF, 0)

        def getRuleIndex(self):
            return MyExprParser.RULE_function

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction" ):
                listener.enterFunction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction" ):
                listener.exitFunction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction" ):
                return visitor.visitFunction(self)
            else:
                return visitor.visitChildren(self)




    def function(self):

        localctx = MyExprParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_function)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.int_type()
            self.state = 17
            self.match(MyExprParser.Identifier)
            self.state = 18
            self.match(MyExprParser.Lparen)
            self.state = 19
            self.match(MyExprParser.Rparen)
            self.state = 20
            self.match(MyExprParser.Lbrace)
            self.state = 21
            self.statement()
            self.state = 22
            self.match(MyExprParser.Rbrace)
            self.state = 23
            self.match(MyExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Int_typeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_int_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInt_type" ):
                listener.enterInt_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInt_type" ):
                listener.exitInt_type(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInt_type" ):
                return visitor.visitInt_type(self)
            else:
                return visitor.visitChildren(self)




    def int_type(self):

        localctx = MyExprParser.Int_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_int_type)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(MyExprParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ret(self):
            return self.getTypedRuleContext(MyExprParser.RetContext,0)


        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)


        def Semicolon(self):
            return self.getToken(MyExprParser.Semicolon, 0)

        def getRuleIndex(self):
            return MyExprParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = MyExprParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.ret()
            self.state = 28
            self.expression()
            self.state = 29
            self.match(MyExprParser.Semicolon)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RetContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_ret

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRet" ):
                listener.enterRet(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRet" ):
                listener.exitRet(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRet" ):
                return visitor.visitRet(self)
            else:
                return visitor.visitChildren(self)




    def ret(self):

        localctx = MyExprParser.RetContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_ret)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(MyExprParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def integer(self):
            return self.getTypedRuleContext(MyExprParser.IntegerContext,0)


        def getRuleIndex(self):
            return MyExprParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = MyExprParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33
            self.integer()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IntegerContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Integer(self):
            return self.getToken(MyExprParser.Integer, 0)

        def getRuleIndex(self):
            return MyExprParser.RULE_integer

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInteger" ):
                listener.enterInteger(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInteger" ):
                listener.exitInteger(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInteger" ):
                return visitor.visitInteger(self)
            else:
                return visitor.visitChildren(self)




    def integer(self):

        localctx = MyExprParser.IntegerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_integer)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(MyExprParser.Integer)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





