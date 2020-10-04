# Generated from MyExpr/MyExpr.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20")
        buf.write("Z\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3\2")
        buf.write("\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3")
        buf.write("\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3")
        buf.write("\f\3\r\6\rD\n\r\r\r\16\rE\3\16\3\16\3\17\3\17\3\20\3\20")
        buf.write("\6\20N\n\20\r\20\16\20O\3\21\3\21\3\22\6\22U\n\22\r\22")
        buf.write("\16\22V\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t")
        buf.write("\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17!\2#\20\3\2")
        buf.write("\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"")
        buf.write("\"\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2")
        buf.write("\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2")
        buf.write("\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37")
        buf.write("\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7\60\3\2\2\2")
        buf.write("\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21")
        buf.write(":\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@\3\2\2\2\31C\3\2")
        buf.write("\2\2\33G\3\2\2\2\35I\3\2\2\2\37K\3\2\2\2!Q\3\2\2\2#T\3")
        buf.write("\2\2\2%&\7k\2\2&\'\7p\2\2\'(\7v\2\2(\4\3\2\2\2)*\7t\2")
        buf.write("\2*+\7g\2\2+,\7v\2\2,-\7w\2\2-.\7t\2\2./\7p\2\2/\6\3\2")
        buf.write("\2\2\60\61\7*\2\2\61\b\3\2\2\2\62\63\7+\2\2\63\n\3\2\2")
        buf.write("\2\64\65\7}\2\2\65\f\3\2\2\2\66\67\7\177\2\2\67\16\3\2")
        buf.write("\2\289\7=\2\29\20\3\2\2\2:;\7-\2\2;\22\3\2\2\2<=\7/\2")
        buf.write("\2=\24\3\2\2\2>?\7,\2\2?\26\3\2\2\2@A\7\61\2\2A\30\3\2")
        buf.write("\2\2BD\t\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2")
        buf.write("F\32\3\2\2\2GH\t\3\2\2H\34\3\2\2\2IJ\t\4\2\2J\36\3\2\2")
        buf.write("\2KM\5\33\16\2LN\5\35\17\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2")
        buf.write("\2OP\3\2\2\2P \3\2\2\2QR\t\5\2\2R\"\3\2\2\2SU\5!\21\2")
        buf.write("TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b")
        buf.write("\22\2\2Y$\3\2\2\2\6\2EOV\3\b\2\2")
        return buf.getvalue()


class MyExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    Lparen = 3
    Rparen = 4
    Lbrace = 5
    Rbrace = 6
    Semicolon = 7
    Add = 8
    Sub = 9
    Mul = 10
    Div = 11
    Integer = 12
    Identifier = 13
    Whitespace = 14

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'int'", "'return'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
            "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>",
            "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", 
            "Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace" ]

    ruleNames = [ "T__0", "T__1", "Lparen", "Rparen", "Lbrace", "Rbrace", 
                  "Semicolon", "Add", "Sub", "Mul", "Div", "Integer", "IdentLeadChar", 
                  "WordChar", "Identifier", "WhitespaceChar", "Whitespace" ]

    grammarFileName = "MyExpr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


