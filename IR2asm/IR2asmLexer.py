# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21")
        buf.write("d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2\3")
        buf.write("\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6")
        buf.write("\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3")
        buf.write("\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r")
        buf.write("\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17X\n\17\r\17")
        buf.write("\16\17Y\3\20\3\20\3\21\6\21_\n\21\r\21\16\21`\3\21\3\21")
        buf.write("\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f")
        buf.write("\27\r\31\16\33\17\35\20\37\2!\21\3\2\4\3\2\62;\5\2\13")
        buf.write("\f\17\17\"\"\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2")
        buf.write("\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21")
        buf.write("\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3")
        buf.write("\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2")
        buf.write("\5(\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13\61\3\2\2\2\r\65\3")
        buf.write("\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2")
        buf.write("\27J\3\2\2\2\31N\3\2\2\2\33R\3\2\2\2\35W\3\2\2\2\37[\3")
        buf.write("\2\2\2!^\3\2\2\2#$\7o\2\2$%\7c\2\2%&\7k\2\2&\'\7p\2\2")
        buf.write("\'\4\3\2\2\2()\7}\2\2)\6\3\2\2\2*+\7\177\2\2+\b\3\2\2")
        buf.write("\2,-\7R\2\2-.\7W\2\2./\7U\2\2/\60\7J\2\2\60\n\3\2\2\2")
        buf.write("\61\62\7T\2\2\62\63\7G\2\2\63\64\7V\2\2\64\f\3\2\2\2\65")
        buf.write("\66\7N\2\2\66\67\7P\2\2\678\7Q\2\289\7V\2\29\16\3\2\2")
        buf.write("\2:;\7P\2\2;<\7Q\2\2<=\7V\2\2=\20\3\2\2\2>?\7P\2\2?@\7")
        buf.write("G\2\2@A\7I\2\2A\22\3\2\2\2BC\7C\2\2CD\7F\2\2DE\7F\2\2")
        buf.write("E\24\3\2\2\2FG\7U\2\2GH\7W\2\2HI\7D\2\2I\26\3\2\2\2JK")
        buf.write("\7O\2\2KL\7W\2\2LM\7N\2\2M\30\3\2\2\2NO\7F\2\2OP\7K\2")
        buf.write("\2PQ\7X\2\2Q\32\3\2\2\2RS\7T\2\2ST\7G\2\2TU\7O\2\2U\34")
        buf.write("\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2")
        buf.write("\2\2Z\36\3\2\2\2[\\\t\3\2\2\\ \3\2\2\2]_\5\37\20\2^]\3")
        buf.write("\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\21")
        buf.write("\2\2c\"\3\2\2\2\5\2Y`\3\b\2\2")
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
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    Integer = 14
    Whitespace = 15

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "'{'", "'}'", "'PUSH'", "'RET'", "'LNOT'", "'NOT'", 
            "'NEG'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'REM'" ]

    symbolicNames = [ "<INVALID>",
            "Integer", "Whitespace" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "Integer", 
                  "WhitespaceChar", "Whitespace" ]

    grammarFileName = "IR2asm.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


