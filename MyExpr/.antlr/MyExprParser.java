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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Lparen=20, Rparen=21, Lbrace=22, Rbrace=23, Semicolon=24, 
		Add=25, Sub=26, Mul=27, Div=28, Integer=29, Identifier=30, Whitespace=31;
	public static final int
		RULE_int_type = 0, RULE_program = 1, RULE_main_fun = 2, RULE_block_item = 3, 
		RULE_statement = 4, RULE_declaration = 5, RULE_return_stat = 6, RULE_expression = 7, 
		RULE_assignment = 8, RULE_conditional = 9, RULE_logical_or = 10, RULE_logical_and = 11, 
		RULE_equality = 12, RULE_relational = 13, RULE_additive = 14, RULE_multiplicative = 15, 
		RULE_unary = 16, RULE_primary = 17, RULE_parameter = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"int_type", "program", "main_fun", "block_item", "statement", "declaration", 
			"return_stat", "expression", "assignment", "conditional", "logical_or", 
			"logical_and", "equality", "relational", "additive", "multiplicative", 
			"unary", "primary", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'if'", "'else'", "'='", "'return'", "'?'", 
			"':'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'%'", "'~'", "'!'", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Lparen", "Rparen", "Lbrace", 
			"Rbrace", "Semicolon", "Add", "Sub", "Mul", "Div", "Integer", "Identifier", 
			"Whitespace"
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

	public static class Int_typeContext extends ParserRuleContext {
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
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
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		public List<Block_itemContext> block_item() {
			return getRuleContexts(Block_itemContext.class);
		}
		public Block_itemContext block_item(int i) {
			return getRuleContext(Block_itemContext.class,i);
		}
		public Main_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_fun; }
	}

	public final Main_funContext main_fun() throws RecognitionException {
		Main_funContext _localctx = new Main_funContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			int_type();
			setState(43);
			match(T__1);
			setState(44);
			match(Lparen);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(45);
				parameter();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(Rparen);
			setState(52);
			match(Lbrace);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << Lparen) | (1L << Semicolon) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				{
				setState(53);
				block_item();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(Rbrace);
			setState(60);
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

	public static class Block_itemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_item);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__17:
			case T__18:
			case Lparen:
			case Semicolon:
			case Sub:
			case Integer:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
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
	public static class Stat_conditionContext extends StatementContext {
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Stat_conditionContext(StatementContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new Stat_retContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				return_stat();
				}
				break;
			case T__17:
			case T__18:
			case Lparen:
			case Semicolon:
			case Sub:
			case Integer:
			case Identifier:
				_localctx = new Stat_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(67);
					expression();
					}
				}

				setState(70);
				match(Semicolon);
				}
				break;
			case T__2:
				_localctx = new Stat_conditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__2);
				setState(72);
				match(Lparen);
				setState(73);
				expression();
				setState(74);
				match(Rparen);
				setState(75);
				statement();
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(76);
					match(T__3);
					setState(77);
					statement();
					}
					break;
				}
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
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			int_type();
			setState(83);
			match(Identifier);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(84);
				match(T__4);
				setState(85);
				expression();
				}
			}

			setState(88);
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
		enterRule(_localctx, 12, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			expression();
			setState(92);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Assign_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				conditional();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(Identifier);
				setState(98);
				match(T__4);
				setState(99);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionContext extends ConditionalContext {
		public Logical_orContext logical_or() {
			return getRuleContext(Logical_orContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionContext(ConditionalContext ctx) { copyFrom(ctx); }
	}
	public static class Condition_noneContext extends ConditionalContext {
		public Logical_orContext logical_or() {
			return getRuleContext(Logical_orContext.class,0);
		}
		public Condition_noneContext(ConditionalContext ctx) { copyFrom(ctx); }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Condition_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				logical_or(0);
				}
				break;
			case 2:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				logical_or(0);
				setState(104);
				match(T__6);
				setState(105);
				expression();
				setState(106);
				match(T__7);
				setState(107);
				conditional();
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logical_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(112);
			logical_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operateContext(new Logical_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or);
					setState(114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(115);
					match(T__8);
					setState(116);
					logical_and(0);
					}
					} 
				}
				setState(121);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logical_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(123);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operateContext(new Logical_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and);
					setState(125);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(126);
					match(T__9);
					setState(127);
					equality(0);
					}
					} 
				}
				setState(132);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_equality, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(134);
			relational(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equal_operateContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(137);
					((Equal_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__10 || _la==T__11) ) {
						((Equal_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(138);
					relational(0);
					}
					} 
				}
				setState(143);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relational, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Relation_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(145);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_operateContext(new RelationalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					((Relation_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
						((Relation_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(149);
					additive(0);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(156);
			multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_operateContext(new AdditiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive);
					setState(158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(159);
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
					setState(160);
					multiplicative(0);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(167);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_operateContext(new MultiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative);
					setState(169);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(170);
					((Mul_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Mul) | (1L << Div))) != 0)) ) {
						((Mul_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(171);
					unary();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 32, RULE_unary);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lparen:
			case Integer:
			case Identifier:
				_localctx = new Unary_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				primary();
				}
				break;
			case T__17:
			case T__18:
			case Sub:
				_localctx = new Unary_operateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((Unary_operateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << Sub))) != 0)) ) {
					((Unary_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
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
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(Integer);
				}
				break;
			case Lparen:
				_localctx = new PrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(Lparen);
				setState(184);
				expression();
				setState(185);
				match(Rparen);
				}
				break;
			case Identifier:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
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
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			int_type();
			setState(191);
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
		case 10:
			return logical_or_sempred((Logical_orContext)_localctx, predIndex);
		case 11:
			return logical_and_sempred((Logical_andContext)_localctx, predIndex);
		case 12:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 13:
			return relational_sempred((RelationalContext)_localctx, predIndex);
		case 14:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16"+
		"\4\64\13\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\5\3\5\5\5"+
		"C\n\5\3\6\3\6\5\6G\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\5\6S\n"+
		"\6\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0083"+
		"\n\r\f\r\16\r\u0086\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008e\n\16"+
		"\f\16\16\16\u0091\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0099\n\17"+
		"\f\17\16\17\u009c\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a4\n\20"+
		"\f\20\16\20\u00a7\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00af\n\21"+
		"\f\21\16\21\u00b2\13\21\3\22\3\22\3\22\5\22\u00b7\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00bf\n\23\3\24\3\24\3\24\3\24\2\b\26\30\32\34\36"+
		" \25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2\r\16\3\2\17\22"+
		"\3\2\33\34\4\2\23\23\35\36\4\2\24\25\34\34\2\u00c3\2(\3\2\2\2\4*\3\2\2"+
		"\2\6,\3\2\2\2\bB\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16\\\3\2\2\2\20`\3\2\2"+
		"\2\22f\3\2\2\2\24o\3\2\2\2\26q\3\2\2\2\30|\3\2\2\2\32\u0087\3\2\2\2\34"+
		"\u0092\3\2\2\2\36\u009d\3\2\2\2 \u00a8\3\2\2\2\"\u00b6\3\2\2\2$\u00be"+
		"\3\2\2\2&\u00c0\3\2\2\2()\7\3\2\2)\3\3\2\2\2*+\5\6\4\2+\5\3\2\2\2,-\5"+
		"\2\2\2-.\7\4\2\2.\62\7\26\2\2/\61\5&\24\2\60/\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\27\2\2\66"+
		":\7\30\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2"+
		"\2\2<:\3\2\2\2=>\7\31\2\2>?\7\2\2\3?\7\3\2\2\2@C\5\n\6\2AC\5\f\7\2B@\3"+
		"\2\2\2BA\3\2\2\2C\t\3\2\2\2DS\5\16\b\2EG\5\20\t\2FE\3\2\2\2FG\3\2\2\2"+
		"GH\3\2\2\2HS\7\32\2\2IJ\7\5\2\2JK\7\26\2\2KL\5\20\t\2LM\7\27\2\2MP\5\n"+
		"\6\2NO\7\6\2\2OQ\5\n\6\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RD\3\2\2\2RF\3\2"+
		"\2\2RI\3\2\2\2S\13\3\2\2\2TU\5\2\2\2UX\7 \2\2VW\7\7\2\2WY\5\20\t\2XV\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\32\2\2[\r\3\2\2\2\\]\7\b\2\2]^\5\20\t\2"+
		"^_\7\32\2\2_\17\3\2\2\2`a\5\22\n\2a\21\3\2\2\2bg\5\24\13\2cd\7 \2\2de"+
		"\7\7\2\2eg\5\20\t\2fb\3\2\2\2fc\3\2\2\2g\23\3\2\2\2hp\5\26\f\2ij\5\26"+
		"\f\2jk\7\t\2\2kl\5\20\t\2lm\7\n\2\2mn\5\24\13\2np\3\2\2\2oh\3\2\2\2oi"+
		"\3\2\2\2p\25\3\2\2\2qr\b\f\1\2rs\5\30\r\2sy\3\2\2\2tu\f\3\2\2uv\7\13\2"+
		"\2vx\5\30\r\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3"+
		"\2\2\2|}\b\r\1\2}~\5\32\16\2~\u0084\3\2\2\2\177\u0080\f\3\2\2\u0080\u0081"+
		"\7\f\2\2\u0081\u0083\5\32\16\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\31\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u0088\b\16\1\2\u0088\u0089\5\34\17\2\u0089\u008f\3\2\2\2\u008a"+
		"\u008b\f\3\2\2\u008b\u008c\t\2\2\2\u008c\u008e\5\34\17\2\u008d\u008a\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\33\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\17\1\2\u0093\u0094\5\36"+
		"\20\2\u0094\u009a\3\2\2\2\u0095\u0096\f\3\2\2\u0096\u0097\t\3\2\2\u0097"+
		"\u0099\5\36\20\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\b\20\1\2\u009e\u009f\5 \21\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\f"+
		"\3\2\2\u00a1\u00a2\t\4\2\2\u00a2\u00a4\5 \21\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\37\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\21\1\2\u00a9\u00aa\5\"\22\2\u00aa"+
		"\u00b0\3\2\2\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\t\5\2\2\u00ad\u00af\5\""+
		"\22\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b7\5$\23\2"+
		"\u00b4\u00b5\t\6\2\2\u00b5\u00b7\5\"\22\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00bf\7\37\2\2\u00b9\u00ba\7\26\2\2\u00ba"+
		"\u00bb\5\20\t\2\u00bb\u00bc\7\27\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\7"+
		" \2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"%\3\2\2\2\u00c0\u00c1\5\2\2\2\u00c1\u00c2\7 \2\2\u00c2\'\3\2\2\2\23\62"+
		":BFPRXfoy\u0084\u008f\u009a\u00a5\u00b0\u00b6\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}