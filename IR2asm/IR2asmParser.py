# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f")
        buf.write("\61\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4")
        buf.write("\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3")
        buf.write("\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\5\3\5")
        buf.write("\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b")
        buf.write("\n\f\16\20\2\2\2-\2\22\3\2\2\2\4\24\3\2\2\2\6#\3\2\2\2")
        buf.write("\b%\3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16,\3\2\2\2\20.\3\2")
        buf.write("\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\7\3\2\2\25\31\7")
        buf.write("\4\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27")
        buf.write("\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34")
        buf.write("\35\7\5\2\2\35\5\3\2\2\2\36$\5\b\5\2\37$\5\n\6\2 $\5\f")
        buf.write("\7\2!$\5\16\b\2\"$\5\20\t\2#\36\3\2\2\2#\37\3\2\2\2# ")
        buf.write("\3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\6\2\2&\'")
        buf.write("\7\13\2\2\'\t\3\2\2\2()\7\7\2\2)\13\3\2\2\2*+\7\b\2\2")
        buf.write("+\r\3\2\2\2,-\7\t\2\2-\17\3\2\2\2./\7\n\2\2/\21\3\2\2")
        buf.write("\2\4\31#")
        return buf.getvalue()


class IR2asmParser ( Parser ):

    grammarFileName = "IR2asm.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'main'", "'{'", "'}'", "'PUSH'", "'RET'", 
                     "'LNOT'", "'NOT'", "'NEG'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "Integer", "Whitespace" ]

    RULE_program = 0
    RULE_main_fun = 1
    RULE_instruction = 2
    RULE_push = 3
    RULE_ret = 4
    RULE_lnot = 5
    RULE_bitwise = 6
    RULE_neg = 7

    ruleNames =  [ "program", "main_fun", "instruction", "push", "ret", 
                   "lnot", "bitwise", "neg" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    Integer=9
    Whitespace=10

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
            return self.getTypedRuleContext(IR2asmParser.Main_funContext,0)


        def getRuleIndex(self):
            return IR2asmParser.RULE_program

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

        localctx = IR2asmParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
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

        def instruction(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IR2asmParser.InstructionContext)
            else:
                return self.getTypedRuleContext(IR2asmParser.InstructionContext,i)


        def getRuleIndex(self):
            return IR2asmParser.RULE_main_fun

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

        localctx = IR2asmParser.Main_funContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_main_fun)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(IR2asmParser.T__0)
            self.state = 19
            self.match(IR2asmParser.T__1)
            self.state = 23
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IR2asmParser.T__3) | (1 << IR2asmParser.T__4) | (1 << IR2asmParser.T__5) | (1 << IR2asmParser.T__6) | (1 << IR2asmParser.T__7))) != 0):
                self.state = 20
                self.instruction()
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 26
            self.match(IR2asmParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class InstructionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def push(self):
            return self.getTypedRuleContext(IR2asmParser.PushContext,0)


        def ret(self):
            return self.getTypedRuleContext(IR2asmParser.RetContext,0)


        def lnot(self):
            return self.getTypedRuleContext(IR2asmParser.LnotContext,0)


        def bitwise(self):
            return self.getTypedRuleContext(IR2asmParser.BitwiseContext,0)


        def neg(self):
            return self.getTypedRuleContext(IR2asmParser.NegContext,0)


        def getRuleIndex(self):
            return IR2asmParser.RULE_instruction

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruction" ):
                listener.enterInstruction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruction" ):
                listener.exitInstruction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruction" ):
                return visitor.visitInstruction(self)
            else:
                return visitor.visitChildren(self)




    def instruction(self):

        localctx = IR2asmParser.InstructionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_instruction)
        try:
            self.state = 33
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IR2asmParser.T__3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.push()
                pass
            elif token in [IR2asmParser.T__4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 29
                self.ret()
                pass
            elif token in [IR2asmParser.T__5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 30
                self.lnot()
                pass
            elif token in [IR2asmParser.T__6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 31
                self.bitwise()
                pass
            elif token in [IR2asmParser.T__7]:
                self.enterOuterAlt(localctx, 5)
                self.state = 32
                self.neg()
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

    class PushContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Integer(self):
            return self.getToken(IR2asmParser.Integer, 0)

        def getRuleIndex(self):
            return IR2asmParser.RULE_push

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPush" ):
                listener.enterPush(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPush" ):
                listener.exitPush(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPush" ):
                return visitor.visitPush(self)
            else:
                return visitor.visitChildren(self)




    def push(self):

        localctx = IR2asmParser.PushContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_push)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(IR2asmParser.T__3)
            self.state = 36
            self.match(IR2asmParser.Integer)
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
            return IR2asmParser.RULE_ret

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

        localctx = IR2asmParser.RetContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_ret)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(IR2asmParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LnotContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_lnot

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLnot" ):
                listener.enterLnot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLnot" ):
                listener.exitLnot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLnot" ):
                return visitor.visitLnot(self)
            else:
                return visitor.visitChildren(self)




    def lnot(self):

        localctx = IR2asmParser.LnotContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_lnot)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(IR2asmParser.T__5)
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


        def getRuleIndex(self):
            return IR2asmParser.RULE_bitwise

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

        localctx = IR2asmParser.BitwiseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_bitwise)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(IR2asmParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class NegContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_neg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNeg" ):
                listener.enterNeg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNeg" ):
                listener.exitNeg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNeg" ):
                return visitor.visitNeg(self)
            else:
                return visitor.visitChildren(self)




    def neg(self):

        localctx = IR2asmParser.NegContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_neg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(IR2asmParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





