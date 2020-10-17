# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24")
        buf.write("^\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3\3\7\3\'")
        buf.write("\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3")
        buf.write("\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b?\n\b\f")
        buf.write("\b\16\bB\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tJ\n\t\f\t\16")
        buf.write("\tM\13\t\3\n\3\n\3\n\5\nR\n\n\3\13\3\13\3\13\3\13\3\13")
        buf.write("\5\13Y\n\13\3\f\3\f\3\f\3\f\2\4\16\20\r\2\4\6\b\n\f\16")
        buf.write("\20\22\24\26\2\5\3\2\16\17\4\2\6\6\20\21\4\2\7\b\17\17")
        buf.write("\2X\2\30\3\2\2\2\4\32\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2")
        buf.write("\n\62\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20C\3\2\2\2\22")
        buf.write("Q\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30\31\5\4\3\2\31\3\3")
        buf.write("\2\2\2\32\33\5\6\4\2\33\34\7\3\2\2\34 \7\t\2\2\35\37\5")
        buf.write("\26\f\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2")
        buf.write("\2!#\3\2\2\2\" \3\2\2\2#$\7\n\2\2$(\7\13\2\2%\'\5\b\5")
        buf.write("\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2")
        buf.write("*(\3\2\2\2+,\7\f\2\2,-\7\2\2\3-\5\3\2\2\2./\7\4\2\2/\7")
        buf.write("\3\2\2\2\60\61\5\n\6\2\61\t\3\2\2\2\62\63\7\5\2\2\63\64")
        buf.write("\5\f\7\2\64\65\7\r\2\2\65\13\3\2\2\2\66\67\5\16\b\2\67")
        buf.write("\r\3\2\2\289\b\b\1\29:\5\20\t\2:@\3\2\2\2;<\f\3\2\2<=")
        buf.write("\t\2\2\2=?\5\20\t\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3")
        buf.write("\2\2\2A\17\3\2\2\2B@\3\2\2\2CD\b\t\1\2DE\5\22\n\2EK\3")
        buf.write("\2\2\2FG\f\3\2\2GH\t\3\2\2HJ\5\22\n\2IF\3\2\2\2JM\3\2")
        buf.write("\2\2KI\3\2\2\2KL\3\2\2\2L\21\3\2\2\2MK\3\2\2\2NR\5\24")
        buf.write("\13\2OP\t\4\2\2PR\5\22\n\2QN\3\2\2\2QO\3\2\2\2R\23\3\2")
        buf.write("\2\2SY\7\22\2\2TU\7\t\2\2UV\5\f\7\2VW\7\n\2\2WY\3\2\2")
        buf.write("\2XS\3\2\2\2XT\3\2\2\2Y\25\3\2\2\2Z[\5\6\4\2[\\\7\23\2")
        buf.write("\2\\\27\3\2\2\2\b (@KQX")
        return buf.getvalue()


class MyExprParser ( Parser ):

    grammarFileName = "MyExpr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'main'", "'int'", "'return'", "'%'", 
                     "'~'", "'!'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
                     "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "Lparen", "Rparen", 
                      "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", "Mul", 
                      "Div", "Integer", "Identifier", "Whitespace" ]

    RULE_program = 0
    RULE_main_fun = 1
    RULE_int_type = 2
    RULE_statement = 3
    RULE_return_stat = 4
    RULE_expression = 5
    RULE_additive = 6
    RULE_multiplicative = 7
    RULE_unary = 8
    RULE_primary = 9
    RULE_parameter = 10

    ruleNames =  [ "program", "main_fun", "int_type", "statement", "return_stat", 
                   "expression", "additive", "multiplicative", "unary", 
                   "primary", "parameter" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    Lparen=7
    Rparen=8
    Lbrace=9
    Rbrace=10
    Semicolon=11
    Add=12
    Sub=13
    Mul=14
    Div=15
    Integer=16
    Identifier=17
    Whitespace=18

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

        def additive(self):
            return self.getTypedRuleContext(MyExprParser.AdditiveContext,0)


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
            self.state = 52
            self.additive(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AdditiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_additive

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class Add_noneContext(AdditiveContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.AdditiveContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def multiplicative(self):
            return self.getTypedRuleContext(MyExprParser.MultiplicativeContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd_none" ):
                listener.enterAdd_none(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd_none" ):
                listener.exitAdd_none(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd_none" ):
                return visitor.visitAdd_none(self)
            else:
                return visitor.visitChildren(self)


    class Add_operateContext(AdditiveContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.AdditiveContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def additive(self):
            return self.getTypedRuleContext(MyExprParser.AdditiveContext,0)

        def multiplicative(self):
            return self.getTypedRuleContext(MyExprParser.MultiplicativeContext,0)

        def Add(self):
            return self.getToken(MyExprParser.Add, 0)
        def Sub(self):
            return self.getToken(MyExprParser.Sub, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd_operate" ):
                listener.enterAdd_operate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd_operate" ):
                listener.exitAdd_operate(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd_operate" ):
                return visitor.visitAdd_operate(self)
            else:
                return visitor.visitChildren(self)



    def additive(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MyExprParser.AdditiveContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 12
        self.enterRecursionRule(localctx, 12, self.RULE_additive, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = MyExprParser.Add_noneContext(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 55
            self.multiplicative(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 62
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MyExprParser.Add_operateContext(self, MyExprParser.AdditiveContext(self, _parentctx, _parentState))
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_additive)
                    self.state = 57
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 58
                    localctx.op = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not(_la==MyExprParser.Add or _la==MyExprParser.Sub):
                        localctx.op = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 59
                    self.multiplicative(0) 
                self.state = 64
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx

    class MultiplicativeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_multiplicative

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class Mul_noneContext(MultiplicativeContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.MultiplicativeContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def unary(self):
            return self.getTypedRuleContext(MyExprParser.UnaryContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMul_none" ):
                listener.enterMul_none(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMul_none" ):
                listener.exitMul_none(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMul_none" ):
                return visitor.visitMul_none(self)
            else:
                return visitor.visitChildren(self)


    class Mul_operateContext(MultiplicativeContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.MultiplicativeContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def multiplicative(self):
            return self.getTypedRuleContext(MyExprParser.MultiplicativeContext,0)

        def unary(self):
            return self.getTypedRuleContext(MyExprParser.UnaryContext,0)

        def Mul(self):
            return self.getToken(MyExprParser.Mul, 0)
        def Div(self):
            return self.getToken(MyExprParser.Div, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMul_operate" ):
                listener.enterMul_operate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMul_operate" ):
                listener.exitMul_operate(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMul_operate" ):
                return visitor.visitMul_operate(self)
            else:
                return visitor.visitChildren(self)



    def multiplicative(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MyExprParser.MultiplicativeContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 14
        self.enterRecursionRule(localctx, 14, self.RULE_multiplicative, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = MyExprParser.Mul_noneContext(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 66
            self.unary()
            self._ctx.stop = self._input.LT(-1)
            self.state = 73
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MyExprParser.Mul_operateContext(self, MyExprParser.MultiplicativeContext(self, _parentctx, _parentState))
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_multiplicative)
                    self.state = 68
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 69
                    localctx.op = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MyExprParser.T__3) | (1 << MyExprParser.Mul) | (1 << MyExprParser.Div))) != 0)):
                        localctx.op = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 70
                    self.unary() 
                self.state = 75
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx

    class UnaryContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_unary

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class Unary_noneContext(UnaryContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.UnaryContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def primary(self):
            return self.getTypedRuleContext(MyExprParser.PrimaryContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUnary_none" ):
                listener.enterUnary_none(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUnary_none" ):
                listener.exitUnary_none(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnary_none" ):
                return visitor.visitUnary_none(self)
            else:
                return visitor.visitChildren(self)


    class Unary_operateContext(UnaryContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.UnaryContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def unary(self):
            return self.getTypedRuleContext(MyExprParser.UnaryContext,0)

        def Sub(self):
            return self.getToken(MyExprParser.Sub, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUnary_operate" ):
                listener.enterUnary_operate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUnary_operate" ):
                listener.exitUnary_operate(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnary_operate" ):
                return visitor.visitUnary_operate(self)
            else:
                return visitor.visitChildren(self)



    def unary(self):

        localctx = MyExprParser.UnaryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_unary)
        self._la = 0 # Token type
        try:
            self.state = 79
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MyExprParser.Lparen, MyExprParser.Integer]:
                localctx = MyExprParser.Unary_noneContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 76
                self.primary()
                pass
            elif token in [MyExprParser.T__4, MyExprParser.T__5, MyExprParser.Sub]:
                localctx = MyExprParser.Unary_operateContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 77
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MyExprParser.T__4) | (1 << MyExprParser.T__5) | (1 << MyExprParser.Sub))) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 78
                self.unary()
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

    class PrimaryContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MyExprParser.RULE_primary

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PrimaryParenContext(PrimaryContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.PrimaryContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Lparen(self):
            return self.getToken(MyExprParser.Lparen, 0)
        def expression(self):
            return self.getTypedRuleContext(MyExprParser.ExpressionContext,0)

        def Rparen(self):
            return self.getToken(MyExprParser.Rparen, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrimaryParen" ):
                listener.enterPrimaryParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrimaryParen" ):
                listener.exitPrimaryParen(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrimaryParen" ):
                return visitor.visitPrimaryParen(self)
            else:
                return visitor.visitChildren(self)


    class PrimaryIntegerContext(PrimaryContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MyExprParser.PrimaryContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Integer(self):
            return self.getToken(MyExprParser.Integer, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrimaryInteger" ):
                listener.enterPrimaryInteger(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrimaryInteger" ):
                listener.exitPrimaryInteger(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrimaryInteger" ):
                return visitor.visitPrimaryInteger(self)
            else:
                return visitor.visitChildren(self)



    def primary(self):

        localctx = MyExprParser.PrimaryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_primary)
        try:
            self.state = 86
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MyExprParser.Integer]:
                localctx = MyExprParser.PrimaryIntegerContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 81
                self.match(MyExprParser.Integer)
                pass
            elif token in [MyExprParser.Lparen]:
                localctx = MyExprParser.PrimaryParenContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 82
                self.match(MyExprParser.Lparen)
                self.state = 83
                self.expression()
                self.state = 84
                self.match(MyExprParser.Rparen)
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
            self.state = 88
            self.int_type()
            self.state = 89
            self.match(MyExprParser.Identifier)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[6] = self.additive_sempred
        self._predicates[7] = self.multiplicative_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def additive_sempred(self, localctx:AdditiveContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         

    def multiplicative_sempred(self, localctx:MultiplicativeContext, predIndex:int):
            if predIndex == 1:
                return self.precpred(self._ctx, 1)
         




