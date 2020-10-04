// Generated from d:\MyData\Programming\Compile\minidecaf-2018011106\MyExpr\MyExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Lparen=3, Rparen=4, Lbrace=5, Rbrace=6, Semicolon=7, Add=8, 
		Sub=9, Mul=10, Div=11, Integer=12, Identifier=13, Whitespace=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", 
			"Add", "Sub", "Mul", "Div", "Integer", "IdentLeadChar", "WordChar", "Identifier", 
			"WhitespaceChar", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'return'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", 
			"Add", "Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MyExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rD\n\r\r\r\16\r"+
		"E\3\16\3\16\3\17\3\17\3\20\3\20\6\20N\n\20\r\20\16\20O\3\21\3\21\3\22"+
		"\6\22U\n\22\r\22\16\22V\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17!\2#\20\3\2\6\3\2\62;\5\2C"+
		"\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2"+
		"\2#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\13\64\3\2"+
		"\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@"+
		"\3\2\2\2\31C\3\2\2\2\33G\3\2\2\2\35I\3\2\2\2\37K\3\2\2\2!Q\3\2\2\2#T\3"+
		"\2\2\2%&\7k\2\2&\'\7p\2\2\'(\7v\2\2(\4\3\2\2\2)*\7t\2\2*+\7g\2\2+,\7v"+
		"\2\2,-\7w\2\2-.\7t\2\2./\7p\2\2/\6\3\2\2\2\60\61\7*\2\2\61\b\3\2\2\2\62"+
		"\63\7+\2\2\63\n\3\2\2\2\64\65\7}\2\2\65\f\3\2\2\2\66\67\7\177\2\2\67\16"+
		"\3\2\2\289\7=\2\29\20\3\2\2\2:;\7-\2\2;\22\3\2\2\2<=\7/\2\2=\24\3\2\2"+
		"\2>?\7,\2\2?\26\3\2\2\2@A\7\61\2\2A\30\3\2\2\2BD\t\2\2\2CB\3\2\2\2DE\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2F\32\3\2\2\2GH\t\3\2\2H\34\3\2\2\2IJ\t\4\2\2"+
		"J\36\3\2\2\2KM\5\33\16\2LN\5\35\17\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P \3\2\2\2QR\t\5\2\2R\"\3\2\2\2SU\5!\21\2TS\3\2\2\2UV\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\22\2\2Y$\3\2\2\2\6\2EOV\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}