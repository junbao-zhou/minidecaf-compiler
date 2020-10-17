# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f")
        buf.write("F\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2")
        buf.write("\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3")
        buf.write("\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t")
        buf.write("\3\t\3\n\6\n:\n\n\r\n\16\n;\3\13\3\13\3\f\6\fA\n\f\r\f")
        buf.write("\16\fB\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21")
        buf.write("\n\23\13\25\2\27\f\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\2")
        buf.write("F\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13")
        buf.write("\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3")
        buf.write("\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\36\3\2\2\2\7 \3\2\2")
        buf.write("\2\t\"\3\2\2\2\13\'\3\2\2\2\r+\3\2\2\2\17\60\3\2\2\2\21")
        buf.write("\64\3\2\2\2\239\3\2\2\2\25=\3\2\2\2\27@\3\2\2\2\31\32")
        buf.write("\7o\2\2\32\33\7c\2\2\33\34\7k\2\2\34\35\7p\2\2\35\4\3")
        buf.write("\2\2\2\36\37\7}\2\2\37\6\3\2\2\2 !\7\177\2\2!\b\3\2\2")
        buf.write("\2\"#\7R\2\2#$\7W\2\2$%\7U\2\2%&\7J\2\2&\n\3\2\2\2\'(")
        buf.write("\7T\2\2()\7G\2\2)*\7V\2\2*\f\3\2\2\2+,\7N\2\2,-\7P\2\2")
        buf.write("-.\7Q\2\2./\7V\2\2/\16\3\2\2\2\60\61\7P\2\2\61\62\7Q\2")
        buf.write("\2\62\63\7V\2\2\63\20\3\2\2\2\64\65\7P\2\2\65\66\7G\2")
        buf.write("\2\66\67\7I\2\2\67\22\3\2\2\28:\t\2\2\298\3\2\2\2:;\3")
        buf.write("\2\2\2;9\3\2\2\2;<\3\2\2\2<\24\3\2\2\2=>\t\3\2\2>\26\3")
        buf.write("\2\2\2?A\5\25\13\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2")
        buf.write("\2\2CD\3\2\2\2DE\b\f\2\2E\30\3\2\2\2\5\2;B\3\b\2\2")
        return buf.getvalue()


class IR2asmLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    Integer = 9
    Whitespace = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "'{'", "'}'", "'PUSH'", "'RET'", "'LNOT'", "'NOT'", 
            "'NEG'" ]

    symbolicNames = [ "<INVALID>",
            "Integer", "Whitespace" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "Integer", "WhitespaceChar", "Whitespace" ]

    grammarFileName = "IR2asm.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


