// Generated from /diskd/MyData/Programming/Compile/minidecaf-2018011106/MyExpr/MyExpr.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Lparen=16, 
		Rparen=17, Lbrace=18, Rbrace=19, Semicolon=20, Add=21, Sub=22, Mul=23, 
		Div=24, Integer=25, Identifier=26, Whitespace=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "Lparen", "Rparen", 
			"Lbrace", "Rbrace", "Semicolon", "Add", "Sub", "Mul", "Div", "Integer", 
			"IdentLeadChar", "WordChar", "Identifier", "WhitespaceChar", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'int'", "'='", "'return'", "'||'", "'&&'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'%'", "'~'", "'!'", "'('", "')'", "'{'", 
			"'}'", "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\6\32\u0081\n\32\r\32\16\32\u0082\3\33\3\33\3\34\3\34\3\35\3\35\6\35"+
		"\u008b\n\35\r\35\16\35\u008c\3\36\3\36\3\37\6\37\u0092\n\37\r\37\16\37"+
		"\u0093\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\2\67\29\34;\2=\35\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\3?\3"+
		"\2\2\2\5D\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13Q\3\2\2\2\rT\3\2\2\2\17W\3\2"+
		"\2\2\21Z\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33g\3"+
		"\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2"+
		"\2)u\3\2\2\2+w\3\2\2\2-y\3\2\2\2/{\3\2\2\2\61}\3\2\2\2\63\u0080\3\2\2"+
		"\2\65\u0084\3\2\2\2\67\u0086\3\2\2\29\u0088\3\2\2\2;\u008e\3\2\2\2=\u0091"+
		"\3\2\2\2?@\7o\2\2@A\7c\2\2AB\7k\2\2BC\7p\2\2C\4\3\2\2\2DE\7k\2\2EF\7p"+
		"\2\2FG\7v\2\2G\6\3\2\2\2HI\7?\2\2I\b\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7v\2"+
		"\2MN\7w\2\2NO\7t\2\2OP\7p\2\2P\n\3\2\2\2QR\7~\2\2RS\7~\2\2S\f\3\2\2\2"+
		"TU\7(\2\2UV\7(\2\2V\16\3\2\2\2WX\7?\2\2XY\7?\2\2Y\20\3\2\2\2Z[\7#\2\2"+
		"[\\\7?\2\2\\\22\3\2\2\2]^\7>\2\2^\24\3\2\2\2_`\7@\2\2`\26\3\2\2\2ab\7"+
		">\2\2bc\7?\2\2c\30\3\2\2\2de\7@\2\2ef\7?\2\2f\32\3\2\2\2gh\7\'\2\2h\34"+
		"\3\2\2\2ij\7\u0080\2\2j\36\3\2\2\2kl\7#\2\2l \3\2\2\2mn\7*\2\2n\"\3\2"+
		"\2\2op\7+\2\2p$\3\2\2\2qr\7}\2\2r&\3\2\2\2st\7\177\2\2t(\3\2\2\2uv\7="+
		"\2\2v*\3\2\2\2wx\7-\2\2x,\3\2\2\2yz\7/\2\2z.\3\2\2\2{|\7,\2\2|\60\3\2"+
		"\2\2}~\7\61\2\2~\62\3\2\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\64\3\2\2"+
		"\2\u0084\u0085\t\3\2\2\u0085\66\3\2\2\2\u0086\u0087\t\4\2\2\u00878\3\2"+
		"\2\2\u0088\u008a\5\65\33\2\u0089\u008b\5\67\34\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d:\3\2\2\2"+
		"\u008e\u008f\t\5\2\2\u008f<\3\2\2\2\u0090\u0092\5;\36\2\u0091\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\b\37\2\2\u0096>\3\2\2\2\6\2\u0082\u008c\u0093"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}