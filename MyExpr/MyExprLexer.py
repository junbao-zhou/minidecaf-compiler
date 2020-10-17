# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24")
        buf.write("m\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3")
        buf.write("\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3")
        buf.write("\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3")
        buf.write("\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21W\n\21\r")
        buf.write("\21\16\21X\3\22\3\22\3\23\3\23\3\24\3\24\6\24a\n\24\r")
        buf.write("\24\16\24b\3\25\3\25\3\26\6\26h\n\26\r\26\16\26i\3\26")
        buf.write("\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13")
        buf.write("\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\23)\2+")
        buf.write("\24\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17")
        buf.write("\17\"\"\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2")
        buf.write("\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2")
        buf.write("\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2\'")
        buf.write("\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\62\3\2\2\2\7\66\3\2\2")
        buf.write("\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3")
        buf.write("\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2")
        buf.write("\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2!V\3\2\2\2#Z\3\2\2")
        buf.write("\2%\\\3\2\2\2\'^\3\2\2\2)d\3\2\2\2+g\3\2\2\2-.\7o\2\2")
        buf.write("./\7c\2\2/\60\7k\2\2\60\61\7p\2\2\61\4\3\2\2\2\62\63\7")
        buf.write("k\2\2\63\64\7p\2\2\64\65\7v\2\2\65\6\3\2\2\2\66\67\7t")
        buf.write("\2\2\678\7g\2\289\7v\2\29:\7w\2\2:;\7t\2\2;<\7p\2\2<\b")
        buf.write("\3\2\2\2=>\7\'\2\2>\n\3\2\2\2?@\7\u0080\2\2@\f\3\2\2\2")
        buf.write("AB\7#\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7+\2\2F\22")
        buf.write("\3\2\2\2GH\7}\2\2H\24\3\2\2\2IJ\7\177\2\2J\26\3\2\2\2")
        buf.write("KL\7=\2\2L\30\3\2\2\2MN\7-\2\2N\32\3\2\2\2OP\7/\2\2P\34")
        buf.write("\3\2\2\2QR\7,\2\2R\36\3\2\2\2ST\7\61\2\2T \3\2\2\2UW\t")
        buf.write("\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\"\3\2")
        buf.write("\2\2Z[\t\3\2\2[$\3\2\2\2\\]\t\4\2\2]&\3\2\2\2^`\5#\22")
        buf.write("\2_a\5%\23\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c")
        buf.write("(\3\2\2\2de\t\5\2\2e*\3\2\2\2fh\5)\25\2gf\3\2\2\2hi\3")
        buf.write("\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\26\2\2l,\3\2")
        buf.write("\2\2\6\2Xbi\3\b\2\2")
        return buf.getvalue()


class MyExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    Lparen = 7
    Rparen = 8
    Lbrace = 9
    Rbrace = 10
    Semicolon = 11
    Add = 12
    Sub = 13
    Mul = 14
    Div = 15
    Integer = 16
    Identifier = 17
    Whitespace = 18

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "'int'", "'return'", "'%'", "'~'", "'!'", "'('", "')'", 
            "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>",
            "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", 
            "Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Lparen", 
                  "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", 
                  "Mul", "Div", "Integer", "IdentLeadChar", "WordChar", 
                  "Identifier", "WhitespaceChar", "Whitespace" ]

    grammarFileName = "MyExpr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


