// Generated from /diskd/MyData/Programming/Compile/minidecaf-2018011106/MyExpr/MyExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Lparen=16, 
		Rparen=17, Lbrace=18, Rbrace=19, Semicolon=20, Add=21, Sub=22, Mul=23, 
		Div=24, Integer=25, Identifier=26, Whitespace=27;
	public static final int
		RULE_program = 0, RULE_main_fun = 1, RULE_int_type = 2, RULE_statement = 3, 
		RULE_declaration = 4, RULE_return_stat = 5, RULE_expression = 6, RULE_assignment = 7, 
		RULE_logical_or = 8, RULE_logical_and = 9, RULE_equality = 10, RULE_relational = 11, 
		RULE_additive = 12, RULE_multiplicative = 13, RULE_unary = 14, RULE_primary = 15, 
		RULE_parameter = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_fun", "int_type", "statement", "declaration", "return_stat", 
			"expression", "assignment", "logical_or", "logical_and", "equality", 
			"relational", "additive", "multiplicative", "unary", "primary", "parameter"
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

	@Override
	public String getGrammarFileName() { return "MyExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Main_funContext main_fun() {
			return getRuleContext(Main_funContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			main_fun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_funContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public TerminalNode Lbrace() { return getToken(MyExprParser.Lbrace, 0); }
		public TerminalNode Rbrace() { return getToken(MyExprParser.Rbrace, 0); }
		public TerminalNode EOF() { return getToken(MyExprParser.EOF, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_fun; }
	}

	public final Main_funContext main_fun() throws RecognitionException {
		Main_funContext _localctx = new Main_funContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			int_type();
			setState(37);
			match(T__0);
			setState(38);
			match(Lparen);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(39);
				parameter();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(Rparen);
			setState(46);
			match(Lbrace);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << Lparen) | (1L << Semicolon) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(Rbrace);
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_typeContext extends ParserRuleContext {
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stat_retContext extends StatementContext {
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Stat_retContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_declrContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Stat_declrContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_exprContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stat_exprContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new Stat_retContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				return_stat();
				}
				break;
			case T__13:
			case T__14:
			case Lparen:
			case Semicolon:
			case Sub:
			case Integer:
			case Identifier:
				_localctx = new Stat_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(59);
					expression();
					}
				}

				setState(62);
				match(Semicolon);
				}
				break;
			case T__1:
				_localctx = new Stat_declrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			int_type();
			setState(67);
			match(Identifier);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(68);
				match(T__2);
				setState(69);
				expression();
				}
			}

			setState(72);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__3);
			setState(75);
			expression();
			setState(76);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assign_noneContext extends AssignmentContext {
		public Logical_orContext logical_or() {
			return getRuleContext(Logical_orContext.class,0);
		}
		public Assign_noneContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends AssignmentContext {
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Assign_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				logical_or(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(Identifier);
				setState(82);
				match(T__2);
				setState(83);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_orContext extends ParserRuleContext {
		public Logical_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or; }
	 
		public Logical_orContext() { }
		public void copyFrom(Logical_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Or_operateContext extends Logical_orContext {
		public Logical_orContext logical_or() {
			return getRuleContext(Logical_orContext.class,0);
		}
		public Logical_andContext logical_and() {
			return getRuleContext(Logical_andContext.class,0);
		}
		public Or_operateContext(Logical_orContext ctx) { copyFrom(ctx); }
	}
	public static class Or_noneContext extends Logical_orContext {
		public Logical_andContext logical_and() {
			return getRuleContext(Logical_andContext.class,0);
		}
		public Or_noneContext(Logical_orContext ctx) { copyFrom(ctx); }
	}

	public final Logical_orContext logical_or() throws RecognitionException {
		return logical_or(0);
	}

	private Logical_orContext logical_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_orContext _localctx = new Logical_orContext(_ctx, _parentState);
		Logical_orContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logical_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(87);
			logical_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operateContext(new Logical_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or);
					setState(89);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(90);
					match(T__4);
					setState(91);
					logical_and(0);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_andContext extends ParserRuleContext {
		public Logical_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and; }
	 
		public Logical_andContext() { }
		public void copyFrom(Logical_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_noneContext extends Logical_andContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public And_noneContext(Logical_andContext ctx) { copyFrom(ctx); }
	}
	public static class And_operateContext extends Logical_andContext {
		public Logical_andContext logical_and() {
			return getRuleContext(Logical_andContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public And_operateContext(Logical_andContext ctx) { copyFrom(ctx); }
	}

	public final Logical_andContext logical_and() throws RecognitionException {
		return logical_and(0);
	}

	private Logical_andContext logical_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_andContext _localctx = new Logical_andContext(_ctx, _parentState);
		Logical_andContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(98);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operateContext(new Logical_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and);
					setState(100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(101);
					match(T__5);
					setState(102);
					equality(0);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Equal_operateContext extends EqualityContext {
		public Token op;
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public Equal_operateContext(EqualityContext ctx) { copyFrom(ctx); }
	}
	public static class Equal_noneContext extends EqualityContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public Equal_noneContext(EqualityContext ctx) { copyFrom(ctx); }
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equality, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(109);
			relational(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equal_operateContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(112);
					((Equal_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==T__7) ) {
						((Equal_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(113);
					relational(0);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalContext extends ParserRuleContext {
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	 
		public RelationalContext() { }
		public void copyFrom(RelationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Relation_noneContext extends RelationalContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public Relation_noneContext(RelationalContext ctx) { copyFrom(ctx); }
	}
	public static class Relation_operateContext extends RelationalContext {
		public Token op;
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public Relation_operateContext(RelationalContext ctx) { copyFrom(ctx); }
	}

	public final RelationalContext relational() throws RecognitionException {
		return relational(0);
	}

	private RelationalContext relational(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalContext _localctx = new RelationalContext(_ctx, _parentState);
		RelationalContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_relational, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Relation_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(120);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_operateContext(new RelationalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					((Relation_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
						((Relation_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(124);
					additive(0);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveContext extends ParserRuleContext {
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	 
		public AdditiveContext() { }
		public void copyFrom(AdditiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Add_noneContext extends AdditiveContext {
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public Add_noneContext(AdditiveContext ctx) { copyFrom(ctx); }
	}
	public static class Add_operateContext extends AdditiveContext {
		public Token op;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public TerminalNode Add() { return getToken(MyExprParser.Add, 0); }
		public TerminalNode Sub() { return getToken(MyExprParser.Sub, 0); }
		public Add_operateContext(AdditiveContext ctx) { copyFrom(ctx); }
	}

	public final AdditiveContext additive() throws RecognitionException {
		return additive(0);
	}

	private AdditiveContext additive(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveContext _localctx = new AdditiveContext(_ctx, _parentState);
		AdditiveContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(131);
			multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_operateContext(new AdditiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					((Add_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Sub) ) {
						((Add_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(135);
					multiplicative(0);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeContext extends ParserRuleContext {
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
	 
		public MultiplicativeContext() { }
		public void copyFrom(MultiplicativeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mul_noneContext extends MultiplicativeContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Mul_noneContext(MultiplicativeContext ctx) { copyFrom(ctx); }
	}
	public static class Mul_operateContext extends MultiplicativeContext {
		public Token op;
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode Mul() { return getToken(MyExprParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MyExprParser.Div, 0); }
		public Mul_operateContext(MultiplicativeContext ctx) { copyFrom(ctx); }
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		return multiplicative(0);
	}

	private MultiplicativeContext multiplicative(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, _parentState);
		MultiplicativeContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(142);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_operateContext(new MultiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative);
					setState(144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					((Mul_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << Mul) | (1L << Div))) != 0)) ) {
						((Mul_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(146);
					unary();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unary_noneContext extends UnaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Unary_noneContext(UnaryContext ctx) { copyFrom(ctx); }
	}
	public static class Unary_operateContext extends UnaryContext {
		public Token op;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode Sub() { return getToken(MyExprParser.Sub, 0); }
		public Unary_operateContext(UnaryContext ctx) { copyFrom(ctx); }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lparen:
			case Integer:
			case Identifier:
				_localctx = new Unary_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				primary();
				}
				break;
			case T__13:
			case T__14:
			case Sub:
				_localctx = new Unary_operateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((Unary_operateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << Sub))) != 0)) ) {
					((Unary_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryParenContext extends PrimaryContext {
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public PrimaryParenContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryIntegerContext extends PrimaryContext {
		public TerminalNode Integer() { return getToken(MyExprParser.Integer, 0); }
		public PrimaryIntegerContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryIdentifierContext extends PrimaryContext {
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public PrimaryIdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(Integer);
				}
				break;
			case Lparen:
				_localctx = new PrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(Lparen);
				setState(159);
				expression();
				setState(160);
				match(Rparen);
				}
				break;
			case Identifier:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			int_type();
			setState(166);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return logical_or_sempred((Logical_orContext)_localctx, predIndex);
		case 9:
			return logical_and_sempred((Logical_andContext)_localctx, predIndex);
		case 10:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 11:
			return relational_sempred((RelationalContext)_localctx, predIndex);
		case 12:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 13:
			return multiplicative_sempred((MultiplicativeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_or_sempred(Logical_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_sempred(Logical_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_sempred(RelationalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_sempred(AdditiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_sempred(MultiplicativeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\7\3\63\n"+
		"\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5?\n\5\3\5\3\5\5\5C"+
		"\n\5\3\6\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\fu\n\f\f\f\16\fx\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0080\n\r"+
		"\f\r\16\r\u0083\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008b\n\16\f\16"+
		"\16\16\u008e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17"+
		"\16\17\u0099\13\17\3\20\3\20\3\20\5\20\u009e\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\3\22\3\22\2\b\22\24\26\30\32\34\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\t\n\3\2\13\16\3\2\27"+
		"\30\4\2\17\17\31\32\4\2\20\21\30\30\2\u00a9\2$\3\2\2\2\4&\3\2\2\2\6:\3"+
		"\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20V\3\2\2\2\22X\3"+
		"\2\2\2\24c\3\2\2\2\26n\3\2\2\2\30y\3\2\2\2\32\u0084\3\2\2\2\34\u008f\3"+
		"\2\2\2\36\u009d\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$%\5\4\3\2%\3\3"+
		"\2\2\2&\'\5\6\4\2\'(\7\3\2\2(,\7\22\2\2)+\5\"\22\2*)\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\23\2\2\60\64\7\24\2\2\61"+
		"\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\678\7\25\2\289\7\2\2\39\5\3\2\2\2:;\7\4\2\2"+
		";\7\3\2\2\2<C\5\f\7\2=?\5\16\b\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@C\7\26"+
		"\2\2AC\5\n\6\2B<\3\2\2\2B>\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DE\5\6\4\2EH\7"+
		"\34\2\2FG\7\5\2\2GI\5\16\b\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\26\2\2"+
		"K\13\3\2\2\2LM\7\6\2\2MN\5\16\b\2NO\7\26\2\2O\r\3\2\2\2PQ\5\20\t\2Q\17"+
		"\3\2\2\2RW\5\22\n\2ST\7\34\2\2TU\7\5\2\2UW\5\16\b\2VR\3\2\2\2VS\3\2\2"+
		"\2W\21\3\2\2\2XY\b\n\1\2YZ\5\24\13\2Z`\3\2\2\2[\\\f\3\2\2\\]\7\7\2\2]"+
		"_\5\24\13\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2"+
		"\2\2cd\b\13\1\2de\5\26\f\2ek\3\2\2\2fg\f\3\2\2gh\7\b\2\2hj\5\26\f\2if"+
		"\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\25\3\2\2\2mk\3\2\2\2no\b\f\1\2"+
		"op\5\30\r\2pv\3\2\2\2qr\f\3\2\2rs\t\2\2\2su\5\30\r\2tq\3\2\2\2ux\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2w\27\3\2\2\2xv\3\2\2\2yz\b\r\1\2z{\5\32\16\2{\u0081"+
		"\3\2\2\2|}\f\3\2\2}~\t\3\2\2~\u0080\5\32\16\2\177|\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\b\16\1\2\u0085\u0086\5\34\17\2\u0086\u008c"+
		"\3\2\2\2\u0087\u0088\f\3\2\2\u0088\u0089\t\4\2\2\u0089\u008b\5\34\17\2"+
		"\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\33\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\17\1\2\u0090"+
		"\u0091\5\36\20\2\u0091\u0097\3\2\2\2\u0092\u0093\f\3\2\2\u0093\u0094\t"+
		"\5\2\2\u0094\u0096\5\36\20\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009e\5 \21\2\u009b\u009c\t\6\2\2\u009c\u009e\5\36\20\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e\37\3\2\2\2\u009f\u00a6\7\33\2"+
		"\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7\23\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a6\7\34\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3"+
		"\2\2\2\u00a5\u00a4\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9"+
		"\7\34\2\2\u00a9#\3\2\2\2\20,\64>BHV`kv\u0081\u008c\u0097\u009d\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}