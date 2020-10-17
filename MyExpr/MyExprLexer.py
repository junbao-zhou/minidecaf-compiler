# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23")
        buf.write("i\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3")
        buf.write("\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7")
        buf.write("\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16")
        buf.write("\3\16\3\17\3\17\3\20\6\20S\n\20\r\20\16\20T\3\21\3\21")
        buf.write("\3\22\3\22\3\23\3\23\6\23]\n\23\r\23\16\23^\3\24\3\24")
        buf.write("\3\25\6\25d\n\25\r\25\16\25e\3\25\3\25\2\2\26\3\3\5\4")
        buf.write("\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17")
        buf.write("\35\20\37\21!\2#\2%\22\'\2)\23\3\2\6\3\2\62;\5\2C\\aa")
        buf.write("c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2h\2\3\3\2\2\2\2")
        buf.write("\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3")
        buf.write("\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2")
        buf.write("\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2")
        buf.write("\2\2\37\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\60")
        buf.write("\3\2\2\2\7\64\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2")
        buf.write("\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27")
        buf.write("I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37R\3\2")
        buf.write("\2\2!V\3\2\2\2#X\3\2\2\2%Z\3\2\2\2\'`\3\2\2\2)c\3\2\2")
        buf.write("\2+,\7o\2\2,-\7c\2\2-.\7k\2\2./\7p\2\2/\4\3\2\2\2\60\61")
        buf.write("\7k\2\2\61\62\7p\2\2\62\63\7v\2\2\63\6\3\2\2\2\64\65\7")
        buf.write("t\2\2\65\66\7g\2\2\66\67\7v\2\2\678\7w\2\289\7t\2\29:")
        buf.write("\7p\2\2:\b\3\2\2\2;<\7#\2\2<\n\3\2\2\2=>\7\u0080\2\2>")
        buf.write("\f\3\2\2\2?@\7*\2\2@\16\3\2\2\2AB\7+\2\2B\20\3\2\2\2C")
        buf.write("D\7}\2\2D\22\3\2\2\2EF\7\177\2\2F\24\3\2\2\2GH\7=\2\2")
        buf.write("H\26\3\2\2\2IJ\7-\2\2J\30\3\2\2\2KL\7/\2\2L\32\3\2\2\2")
        buf.write("MN\7,\2\2N\34\3\2\2\2OP\7\61\2\2P\36\3\2\2\2QS\t\2\2\2")
        buf.write("RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U \3\2\2\2VW\t")
        buf.write("\3\2\2W\"\3\2\2\2XY\t\4\2\2Y$\3\2\2\2Z\\\5!\21\2[]\5#")
        buf.write("\22\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_&\3\2")
        buf.write("\2\2`a\t\5\2\2a(\3\2\2\2bd\5\'\24\2cb\3\2\2\2de\3\2\2")
        buf.write("\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\25\2\2h*\3\2\2\2")
        buf.write("\6\2T^e\3\b\2\2")
        return buf.getvalue()


class MyExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    Lparen = 6
    Rparen = 7
    Lbrace = 8
    Rbrace = 9
    Semicolon = 10
    Add = 11
    Sub = 12
    Mul = 13
    Div = 14
    Integer = 15
    Identifier = 16
    Whitespace = 17

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "'int'", "'return'", "'!'", "'~'", "'('", "')'", "'{'", 
            "'}'", "';'", "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>",
            "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", 
            "Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "Lparen", "Rparen", 
                  "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", "Mul", 
                  "Div", "Integer", "IdentLeadChar", "WordChar", "Identifier", 
                  "WhitespaceChar", "Whitespace" ]

    grammarFileName = "MyExpr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


