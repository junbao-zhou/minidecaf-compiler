# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23")
        buf.write("K\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3\3\7\3\'")
        buf.write("\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3")
        buf.write("\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\t\3")
        buf.write("\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\2\2\r\2\4")
        buf.write("\6\b\n\f\16\20\22\24\26\2\2\2D\2\30\3\2\2\2\4\32\3\2\2")
        buf.write("\2\6.\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f:\3\2\2\2\16")
        buf.write("<\3\2\2\2\20?\3\2\2\2\22B\3\2\2\2\24E\3\2\2\2\26G\3\2")
        buf.write("\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\5\6\4\2\33\34\7")
        buf.write("\3\2\2\34 \7\b\2\2\35\37\5\26\f\2\36\35\3\2\2\2\37\"\3")
        buf.write("\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7")
        buf.write("\t\2\2$(\7\n\2\2%\'\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2")
        buf.write("\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\13\2\2,-\7\2\2")
        buf.write("\3-\5\3\2\2\2./\7\4\2\2/\7\3\2\2\2\60\61\5\n\6\2\61\t")
        buf.write("\3\2\2\2\62\63\7\5\2\2\63\64\5\f\7\2\64\65\7\f\2\2\65")
        buf.write("\13\3\2\2\2\66;\5\16\b\2\67;\5\20\t\28;\5\22\n\29;\5\24")
        buf.write("\13\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\r\3")
        buf.write("\2\2\2<=\7\6\2\2=>\5\f\7\2>\17\3\2\2\2?@\7\7\2\2@A\5\f")
        buf.write("\7\2A\21\3\2\2\2BC\7\16\2\2CD\5\f\7\2D\23\3\2\2\2EF\7")
        buf.write("\21\2\2F\25\3\2\2\2GH\5\6\4\2HI\7\22\2\2I\27\3\2\2\2\5")
        buf.write(" (:")
        return buf.getvalue()


class MyExprParser ( Parser ):

    grammarFileName = "MyExpr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'main'", "'int'", "'return'", "'!'", 
                     "'~'", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", 
                     "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Lparen", "Rparen", "Lbrace", 
                      "Rbrace", "Semicolon", "Add", "Sub", "Mul", "Div", 
                      "Integer", "Identifier", "Whitespace" ]

    RULE_program = 0
    RULE_main_fun = 1
    RULE_int_type = 2
    RULE_statement = 3
    RULE_return_stat = 4
    RULE_expression = 5
    RULE_bool_not = 6
    RULE_bitwise = 7
    RULE_negtive = 8
    RULE_integer = 9
    RULE_parameter = 10

    ruleNames =  [ "program", "main_fun", "int_type", "statement", "return_stat", 
                   "expression", "bool_not", "bitwise", "negtive", "integer", 
                   "parameter" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    Lparen=6
    Rparen=7
    Lbrace=8
    Rbrace=9
    Semicolon=10
    Add=11
    Sub=12
    Mul=13
    Div=14
    Integer=15
    Identifier=16
    Whitespace=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def main_fun(self):
            return self.getTypedRuleContext(MyExprParser.Main_funContext,0)


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
            self.state = 22
            self.main_fun()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Main_funContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def int_type(self):
            return self.getTypedRuleContext(MyExprParser.Int_typeContext,0)


        def Lparen(self):
            return self.getToken(MyExprParser.Lparen, 0)

        def Rparen(self):
            return self.getToken(MyExprParser.Rparen, 0)

        def Lbrace(self):
            return self.getToken(MyExprParser.Lbrace, 0)

        def Rbrace(self):
            return self.getToken(MyExprParser.Rbrace, 0)

        def EOF(self):
            return self.getToken(MyExprParser.EOF, 0)

        def parameter(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyExprParser.ParameterContext)
            else:
                return self.getTypedRuleContext(MyExprParser.ParameterContext,i)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyExprParser.StatementContext)
            else:
                return self.getTypedRuleContext(MyExprParser.StatementContext,i)


        def getRuleIndex(self):
            return MyExprParser.RULE_main_fun

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMain_fun" ):
                listener.enterMain_fun(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMain_fun" ):
                listener.exitMain_fun(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMain_fun" ):
                return visitor.visitMain_fun(self)
            else:
                return visitor.visitChildren(self)




    def main_fun(self):

        localctx = MyExprParser.Main_funContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_main_fun)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.int_type()
            self.state = 25
            self.match(MyExprParser.T__0)
            self.state = 26
            self.match(MyExprParser.Lparen)
            self.state = 30
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==MyExprParser.T__1:
                self.state = 27
                self.parameter()
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 33
            self.match(MyExprParser.Rparen)
            self.state = 34
            self.match(MyExprParser.Lbrace)
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==MyExprParser.T__2:
                self.state = 35
                self.statement()
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 41
            self.match(MyExprParser.Rbrace)
            self.state = 42
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
            self.state = 44
            self.match(MyExprParser.T__1)
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

        def return_stat(self):
            return self.getTypedRuleContext(MyExprParser.Return_statContext,0)


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
            self.state = 46
            self.return_stat()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Return_statContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)


        def Semicolon(self):
            return self.getToken(MyExprParser.Semicolon, 0)

        def getRuleIndex(self):
            return MyExprParser.RULE_return_stat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReturn_stat" ):
                listener.enterReturn_stat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReturn_stat" ):
                listener.exitReturn_stat(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturn_stat" ):
                return visitor.visitReturn_stat(self)
            else:
                return visitor.visitChildren(self)




    def return_stat(self):

        localctx = MyExprParser.Return_statContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_return_stat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.match(MyExprParser.T__2)
            self.state = 49
            self.expression()
            self.state = 50
            self.match(MyExprParser.Semicolon)
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

        def bool_not(self):
            return self.getTypedRuleContext(MyExprParser.Bool_notContext,0)


        def bitwise(self):
            return self.getTypedRuleContext(MyExprParser.BitwiseContext,0)


        def negtive(self):
            return self.getTypedRuleContext(MyExprParser.NegtiveContext,0)


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
            self.state = 56
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MyExprParser.T__3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 52
                self.bool_not()
                pass
            elif token in [MyExprParser.T__4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 53
                self.bitwise()
                pass
            elif token in [MyExprParser.Sub]:
                self.enterOuterAlt(localctx, 3)
                self.state = 54
                self.negtive()
                pass
            elif token in [MyExprParser.Integer]:
                self.enterOuterAlt(localctx, 4)
                self.state = 55
                self.integer()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Bool_notContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MyExprParser.RULE_bool_not

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBool_not" ):
                listener.enterBool_not(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBool_not" ):
                listener.exitBool_not(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBool_not" ):
                return visitor.visitBool_not(self)
            else:
                return visitor.visitChildren(self)




    def bool_not(self):

        localctx = MyExprParser.Bool_notContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_bool_not)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.match(MyExprParser.T__3)
            self.state = 59
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class BitwiseContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MyExprParser.RULE_bitwise

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBitwise" ):
                listener.enterBitwise(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBitwise" ):
                listener.exitBitwise(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBitwise" ):
                return visitor.visitBitwise(self)
            else:
                return visitor.visitChildren(self)




    def bitwise(self):

        localctx = MyExprParser.BitwiseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_bitwise)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(MyExprParser.T__4)
            self.state = 62
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class NegtiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Sub(self):
            return self.getToken(MyExprParser.Sub, 0)

        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MyExprParser.RULE_negtive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNegtive" ):
                listener.enterNegtive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNegtive" ):
                listener.exitNegtive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNegtive" ):
                return visitor.visitNegtive(self)
            else:
                return visitor.visitChildren(self)




    def negtive(self):

        localctx = MyExprParser.NegtiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_negtive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(MyExprParser.Sub)
            self.state = 65
            self.expression()
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
        self.enterRule(localctx, 18, self.RULE_integer)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(MyExprParser.Integer)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ParameterContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def int_type(self):
            return self.getTypedRuleContext(MyExprParser.Int_typeContext,0)


        def Identifier(self):
            return self.getToken(MyExprParser.Identifier, 0)

        def getRuleIndex(self):
            return MyExprParser.RULE_parameter

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParameter" ):
                listener.enterParameter(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParameter" ):
                listener.exitParameter(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameter" ):
                return visitor.visitParameter(self)
            else:
                return visitor.visitChildren(self)




    def parameter(self):

        localctx = MyExprParser.ParameterContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_parameter)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self.int_type()
            self.state = 70
            self.match(MyExprParser.Identifier)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





