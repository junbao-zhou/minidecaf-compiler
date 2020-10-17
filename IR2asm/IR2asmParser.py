# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21")
        buf.write("J\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t")
        buf.write("\16\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13\3\3\3\3")
        buf.write("\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4")
        buf.write("\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3")
        buf.write("\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b")
        buf.write("\n\f\16\20\22\24\26\30\32\2\2\2F\2\34\3\2\2\2\4\36\3\2")
        buf.write("\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2")
        buf.write("\16;\3\2\2\2\20=\3\2\2\2\22?\3\2\2\2\24A\3\2\2\2\26C\3")
        buf.write("\2\2\2\30E\3\2\2\2\32G\3\2\2\2\34\35\5\4\3\2\35\3\3\2")
        buf.write("\2\2\36\37\7\3\2\2\37#\7\4\2\2 \"\5\6\4\2! \3\2\2\2\"")
        buf.write("%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7")
        buf.write("\5\2\2\'\5\3\2\2\2(\63\5\b\5\2)\63\5\n\6\2*\63\5\f\7\2")
        buf.write("+\63\5\16\b\2,\63\5\20\t\2-\63\5\22\n\2.\63\5\24\13\2")
        buf.write("/\63\5\26\f\2\60\63\5\30\r\2\61\63\5\32\16\2\62(\3\2\2")
        buf.write("\2\62)\3\2\2\2\62*\3\2\2\2\62+\3\2\2\2\62,\3\2\2\2\62")
        buf.write("-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61")
        buf.write("\3\2\2\2\63\7\3\2\2\2\64\65\7\6\2\2\65\66\7\20\2\2\66")
        buf.write("\t\3\2\2\2\678\7\7\2\28\13\3\2\2\29:\7\b\2\2:\r\3\2\2")
        buf.write("\2;<\7\t\2\2<\17\3\2\2\2=>\7\n\2\2>\21\3\2\2\2?@\7\13")
        buf.write("\2\2@\23\3\2\2\2AB\7\f\2\2B\25\3\2\2\2CD\7\r\2\2D\27\3")
        buf.write("\2\2\2EF\7\16\2\2F\31\3\2\2\2GH\7\17\2\2H\33\3\2\2\2\4")
        buf.write("#\62")
        return buf.getvalue()


class IR2asmParser ( Parser ):

    grammarFileName = "IR2asm.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'main'", "'{'", "'}'", "'PUSH'", "'RET'", 
                     "'LNOT'", "'NOT'", "'NEG'", "'ADD'", "'SUB'", "'MUL'", 
                     "'DIV'", "'REM'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Integer", "Whitespace" ]

    RULE_program = 0
    RULE_main_fun = 1
    RULE_instruction = 2
    RULE_push = 3
    RULE_ret = 4
    RULE_lnot = 5
    RULE_bitwise = 6
    RULE_neg = 7
    RULE_add = 8
    RULE_sub = 9
    RULE_mul = 10
    RULE_div = 11
    RULE_rem = 12

    ruleNames =  [ "program", "main_fun", "instruction", "push", "ret", 
                   "lnot", "bitwise", "neg", "add", "sub", "mul", "div", 
                   "rem" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    Integer=14
    Whitespace=15

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
            self.state = 26
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
            self.state = 28
            self.match(IR2asmParser.T__0)
            self.state = 29
            self.match(IR2asmParser.T__1)
            self.state = 33
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IR2asmParser.T__3) | (1 << IR2asmParser.T__4) | (1 << IR2asmParser.T__5) | (1 << IR2asmParser.T__6) | (1 << IR2asmParser.T__7) | (1 << IR2asmParser.T__8) | (1 << IR2asmParser.T__9) | (1 << IR2asmParser.T__10) | (1 << IR2asmParser.T__11) | (1 << IR2asmParser.T__12))) != 0):
                self.state = 30
                self.instruction()
                self.state = 35
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 36
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


        def add(self):
            return self.getTypedRuleContext(IR2asmParser.AddContext,0)


        def sub(self):
            return self.getTypedRuleContext(IR2asmParser.SubContext,0)


        def mul(self):
            return self.getTypedRuleContext(IR2asmParser.MulContext,0)


        def div(self):
            return self.getTypedRuleContext(IR2asmParser.DivContext,0)


        def rem(self):
            return self.getTypedRuleContext(IR2asmParser.RemContext,0)


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
            self.state = 48
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IR2asmParser.T__3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 38
                self.push()
                pass
            elif token in [IR2asmParser.T__4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 39
                self.ret()
                pass
            elif token in [IR2asmParser.T__5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 40
                self.lnot()
                pass
            elif token in [IR2asmParser.T__6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 41
                self.bitwise()
                pass
            elif token in [IR2asmParser.T__7]:
                self.enterOuterAlt(localctx, 5)
                self.state = 42
                self.neg()
                pass
            elif token in [IR2asmParser.T__8]:
                self.enterOuterAlt(localctx, 6)
                self.state = 43
                self.add()
                pass
            elif token in [IR2asmParser.T__9]:
                self.enterOuterAlt(localctx, 7)
                self.state = 44
                self.sub()
                pass
            elif token in [IR2asmParser.T__10]:
                self.enterOuterAlt(localctx, 8)
                self.state = 45
                self.mul()
                pass
            elif token in [IR2asmParser.T__11]:
                self.enterOuterAlt(localctx, 9)
                self.state = 46
                self.div()
                pass
            elif token in [IR2asmParser.T__12]:
                self.enterOuterAlt(localctx, 10)
                self.state = 47
                self.rem()
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
            self.state = 50
            self.match(IR2asmParser.T__3)
            self.state = 51
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
            self.state = 53
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
            self.state = 55
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
            self.state = 57
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
            self.state = 59
            self.match(IR2asmParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AddContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_add

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd" ):
                listener.enterAdd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd" ):
                listener.exitAdd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd" ):
                return visitor.visitAdd(self)
            else:
                return visitor.visitChildren(self)




    def add(self):

        localctx = IR2asmParser.AddContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_add)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self.match(IR2asmParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class SubContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_sub

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSub" ):
                listener.enterSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSub" ):
                listener.exitSub(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSub" ):
                return visitor.visitSub(self)
            else:
                return visitor.visitChildren(self)




    def sub(self):

        localctx = IR2asmParser.SubContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_sub)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(IR2asmParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class MulContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_mul

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMul" ):
                listener.enterMul(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMul" ):
                listener.exitMul(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMul" ):
                return visitor.visitMul(self)
            else:
                return visitor.visitChildren(self)




    def mul(self):

        localctx = IR2asmParser.MulContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_mul)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(IR2asmParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class DivContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_div

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDiv" ):
                listener.enterDiv(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDiv" ):
                listener.exitDiv(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDiv" ):
                return visitor.visitDiv(self)
            else:
                return visitor.visitChildren(self)




    def div(self):

        localctx = IR2asmParser.DivContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_div)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(IR2asmParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class RemContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IR2asmParser.RULE_rem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRem" ):
                listener.enterRem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRem" ):
                listener.exitRem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRem" ):
                return visitor.visitRem(self)
            else:
                return visitor.visitChildren(self)




    def rem(self):

        localctx = IR2asmParser.RemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_rem)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self.match(IR2asmParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





