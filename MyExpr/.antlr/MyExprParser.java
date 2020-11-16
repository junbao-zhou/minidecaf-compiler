// Generated from /home/bowman/D/MyData/Programming/Compile/minidecaf-2018011106/MyExpr/MyExpr.g4 by ANTLR 4.8
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Lparen=25, Rparen=26, Lbrace=27, Rbrace=28, Semicolon=29, Add=30, Sub=31, 
		Mul=32, Div=33, Integer=34, Identifier=35, Whitespace=36;
	public static final int
		RULE_int_type = 0, RULE_program = 1, RULE_main_fun = 2, RULE_compound_statement = 3, 
		RULE_block_item = 4, RULE_statement = 5, RULE_declaration = 6, RULE_return_stat = 7, 
		RULE_expression = 8, RULE_assignment = 9, RULE_conditional = 10, RULE_logical_or = 11, 
		RULE_logical_and = 12, RULE_equality = 13, RULE_relational = 14, RULE_additive = 15, 
		RULE_multiplicative = 16, RULE_unary = 17, RULE_primary = 18, RULE_parameter = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"int_type", "program", "main_fun", "compound_statement", "block_item", 
			"statement", "declaration", "return_stat", "expression", "assignment", 
			"conditional", "logical_or", "logical_and", "equality", "relational", 
			"additive", "multiplicative", "unary", "primary", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'if'", "'else'", "'for'", "'while'", "'do'", 
			"'break'", "'continue'", "'='", "'return'", "'?'", "':'", "'||'", "'&&'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'%'", "'~'", "'!'", "'('", 
			"')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", 
			"Mul", "Div", "Integer", "Identifier", "Whitespace"
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
			setState(40);
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
			setState(42);
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
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyExprParser.EOF, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
			setState(44);
			int_type();
			setState(45);
			match(T__1);
			setState(46);
			match(Lparen);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(47);
				parameter();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(Rparen);
			setState(54);
			compound_statement();
			setState(55);
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode Lbrace() { return getToken(MyExprParser.Lbrace, 0); }
		public TerminalNode Rbrace() { return getToken(MyExprParser.Rbrace, 0); }
		public List<Block_itemContext> block_item() {
			return getRuleContexts(Block_itemContext.class);
		}
		public Block_itemContext block_item(int i) {
			return getRuleContext(Block_itemContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Lbrace);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Lbrace) | (1L << Semicolon) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				{
				setState(58);
				block_item();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(Rbrace);
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
		enterRule(_localctx, 8, RULE_block_item);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__22:
			case T__23:
			case Lparen:
			case Lbrace:
			case Semicolon:
			case Sub:
			case Integer:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
	public static class Stat_for_loop_declrContext extends StatementContext {
		public ExpressionContext cond_expr;
		public ExpressionContext post_expr;
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Stat_for_loop_declrContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_continueContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public Stat_continueContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_compoundContext extends StatementContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Stat_compoundContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_do_loopContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public Stat_do_loopContext(StatementContext ctx) { copyFrom(ctx); }
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
	public static class Stat_while_loopContext extends StatementContext {
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Stat_while_loopContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_exprContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stat_exprContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_for_loop_no_declrContext extends StatementContext {
		public ExpressionContext pre_expr;
		public ExpressionContext cond_expr;
		public ExpressionContext post_expr;
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(MyExprParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MyExprParser.Semicolon, i);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Stat_for_loop_no_declrContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_breakContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public Stat_breakContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Stat_retContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				return_stat();
				}
				break;
			case 2:
				_localctx = new Stat_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(71);
					expression();
					}
				}

				setState(74);
				match(Semicolon);
				}
				break;
			case 3:
				_localctx = new Stat_conditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__2);
				setState(76);
				match(Lparen);
				setState(77);
				expression();
				setState(78);
				match(Rparen);
				setState(79);
				statement();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(80);
					match(T__3);
					setState(81);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Stat_compoundContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				compound_statement();
				}
				break;
			case 5:
				_localctx = new Stat_for_loop_no_declrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(T__4);
				setState(86);
				match(Lparen);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(87);
					((Stat_for_loop_no_declrContext)_localctx).pre_expr = expression();
					}
				}

				setState(90);
				match(Semicolon);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(91);
					((Stat_for_loop_no_declrContext)_localctx).cond_expr = expression();
					}
				}

				setState(94);
				match(Semicolon);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(95);
					((Stat_for_loop_no_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(98);
				match(Rparen);
				setState(99);
				statement();
				}
				break;
			case 6:
				_localctx = new Stat_for_loop_declrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__4);
				setState(101);
				match(Lparen);
				setState(102);
				declaration();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(103);
					((Stat_for_loop_declrContext)_localctx).cond_expr = expression();
					}
				}

				setState(106);
				match(Semicolon);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(107);
					((Stat_for_loop_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(110);
				match(Rparen);
				setState(111);
				statement();
				}
				break;
			case 7:
				_localctx = new Stat_while_loopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				match(T__5);
				setState(114);
				match(Lparen);
				setState(115);
				expression();
				setState(116);
				match(Rparen);
				setState(117);
				statement();
				}
				break;
			case 8:
				_localctx = new Stat_do_loopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(T__6);
				setState(120);
				statement();
				setState(121);
				match(T__5);
				setState(122);
				match(Lparen);
				setState(123);
				expression();
				setState(124);
				match(Rparen);
				setState(125);
				match(Semicolon);
				}
				break;
			case 9:
				_localctx = new Stat_breakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(T__7);
				setState(128);
				match(Semicolon);
				}
				break;
			case 10:
				_localctx = new Stat_continueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				match(T__8);
				setState(130);
				match(Semicolon);
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
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			int_type();
			setState(134);
			match(Identifier);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(135);
				match(T__9);
				setState(136);
				expression();
				}
			}

			setState(139);
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
		enterRule(_localctx, 14, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__10);
			setState(142);
			expression();
			setState(143);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Assign_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				conditional();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(Identifier);
				setState(149);
				match(T__9);
				setState(150);
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
		enterRule(_localctx, 20, RULE_conditional);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Condition_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				logical_or(0);
				}
				break;
			case 2:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				logical_or(0);
				setState(155);
				match(T__11);
				setState(156);
				expression();
				setState(157);
				match(T__12);
				setState(158);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logical_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(163);
			logical_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operateContext(new Logical_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or);
					setState(165);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(166);
					match(T__13);
					setState(167);
					logical_and(0);
					}
					} 
				}
				setState(172);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logical_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(174);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operateContext(new Logical_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and);
					setState(176);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(177);
					match(T__14);
					setState(178);
					equality(0);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equality, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(185);
			relational(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equal_operateContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(187);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(188);
					((Equal_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
						((Equal_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(189);
					relational(0);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_relational, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Relation_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(196);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_operateContext(new RelationalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational);
					setState(198);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(199);
					((Relation_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						((Relation_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(200);
					additive(0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(207);
			multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_operateContext(new AdditiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive);
					setState(209);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(210);
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
					setState(211);
					multiplicative(0);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(218);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_operateContext(new MultiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative);
					setState(220);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(221);
					((Mul_operateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << Mul) | (1L << Div))) != 0)) ) {
						((Mul_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(222);
					unary();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 34, RULE_unary);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lparen:
			case Integer:
			case Identifier:
				_localctx = new Unary_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				primary();
				}
				break;
			case T__22:
			case T__23:
			case Sub:
				_localctx = new Unary_operateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((Unary_operateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Sub))) != 0)) ) {
					((Unary_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
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
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Integer);
				}
				break;
			case Lparen:
				_localctx = new PrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(Lparen);
				setState(235);
				expression();
				setState(236);
				match(Rparen);
				}
				break;
			case Identifier:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
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
		enterRule(_localctx, 38, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			int_type();
			setState(242);
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
		case 11:
			return logical_or_sempred((Logical_orContext)_localctx, predIndex);
		case 12:
			return logical_and_sempred((Logical_andContext)_localctx, predIndex);
		case 13:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 14:
			return relational_sempred((RelationalContext)_localctx, predIndex);
		case 15:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4\63"+
		"\n\4\f\4\16\4\66\13\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5"+
		"\3\5\3\5\3\6\3\6\5\6G\n\6\3\7\3\7\5\7K\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7U\n\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\5\7_\n\7\3\7\3\7\5\7c\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0086\n\7\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cc\n\20\f\20\16\20\u00cf\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\3"+
		"\23\3\23\3\23\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2"+
		"\n\24\3\25\3\25\3\25\3\25\2\b\30\32\34\36 \"\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\7\3\2\22\23\3\2\24\27\3\2 !\4\2\30\30\"#\4\2\31"+
		"\32!!\2\u0101\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b;\3\2\2\2\nF\3\2\2\2\f"+
		"\u0085\3\2\2\2\16\u0087\3\2\2\2\20\u008f\3\2\2\2\22\u0093\3\2\2\2\24\u0099"+
		"\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00af\3\2\2\2\34\u00ba\3"+
		"\2\2\2\36\u00c5\3\2\2\2 \u00d0\3\2\2\2\"\u00db\3\2\2\2$\u00e9\3\2\2\2"+
		"&\u00f1\3\2\2\2(\u00f3\3\2\2\2*+\7\3\2\2+\3\3\2\2\2,-\5\6\4\2-\5\3\2\2"+
		"\2./\5\2\2\2/\60\7\4\2\2\60\64\7\33\2\2\61\63\5(\25\2\62\61\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67"+
		"8\7\34\2\289\5\b\5\29:\7\2\2\3:\7\3\2\2\2;?\7\35\2\2<>\5\n\6\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\36\2\2C\t\3\2"+
		"\2\2DG\5\f\7\2EG\5\16\b\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2H\u0086\5\20"+
		"\t\2IK\5\22\n\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2L\u0086\7\37\2\2MN\7\5\2"+
		"\2NO\7\33\2\2OP\5\22\n\2PQ\7\34\2\2QT\5\f\7\2RS\7\6\2\2SU\5\f\7\2TR\3"+
		"\2\2\2TU\3\2\2\2U\u0086\3\2\2\2V\u0086\5\b\5\2WX\7\7\2\2XZ\7\33\2\2Y["+
		"\5\22\n\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\37\2\2]_\5\22\n\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`b\7\37\2\2ac\5\22\n\2ba\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\7\34\2\2e\u0086\5\f\7\2fg\7\7\2\2gh\7\33\2\2hj\5\16\b\2ik\5\22"+
		"\n\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\37\2\2mo\5\22\n\2nm\3\2\2\2no\3"+
		"\2\2\2op\3\2\2\2pq\7\34\2\2qr\5\f\7\2r\u0086\3\2\2\2st\7\b\2\2tu\7\33"+
		"\2\2uv\5\22\n\2vw\7\34\2\2wx\5\f\7\2x\u0086\3\2\2\2yz\7\t\2\2z{\5\f\7"+
		"\2{|\7\b\2\2|}\7\33\2\2}~\5\22\n\2~\177\7\34\2\2\177\u0080\7\37\2\2\u0080"+
		"\u0086\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0086\7\37\2\2\u0083\u0084\7"+
		"\13\2\2\u0084\u0086\7\37\2\2\u0085H\3\2\2\2\u0085J\3\2\2\2\u0085M\3\2"+
		"\2\2\u0085V\3\2\2\2\u0085W\3\2\2\2\u0085f\3\2\2\2\u0085s\3\2\2\2\u0085"+
		"y\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\r\3\2\2\2\u0087"+
		"\u0088\5\2\2\2\u0088\u008b\7%\2\2\u0089\u008a\7\f\2\2\u008a\u008c\5\22"+
		"\n\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\37\2\2\u008e\17\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0091\5\22"+
		"\n\2\u0091\u0092\7\37\2\2\u0092\21\3\2\2\2\u0093\u0094\5\24\13\2\u0094"+
		"\23\3\2\2\2\u0095\u009a\5\26\f\2\u0096\u0097\7%\2\2\u0097\u0098\7\f\2"+
		"\2\u0098\u009a\5\22\n\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\25\3\2\2\2\u009b\u00a3\5\30\r\2\u009c\u009d\5\30\r\2\u009d\u009e\7\16"+
		"\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\27\3\2\2"+
		"\2\u00a4\u00a5\b\r\1\2\u00a5\u00a6\5\32\16\2\u00a6\u00ac\3\2\2\2\u00a7"+
		"\u00a8\f\3\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a7"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\16\1\2\u00b0\u00b1\5\34"+
		"\17\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\f\3\2\2\u00b3\u00b4\7\21\2\2\u00b4"+
		"\u00b6\5\34\17\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\b\17\1\2\u00bb\u00bc\5\36\20\2\u00bc\u00c2\3\2\2\2\u00bd\u00be"+
		"\f\3\2\2\u00be\u00bf\t\2\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bd\3\2\2\2"+
		"\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\b\20\1\2\u00c6\u00c7\5 \21\2"+
		"\u00c7\u00cd\3\2\2\2\u00c8\u00c9\f\3\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00cc"+
		"\5 \21\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\21\1"+
		"\2\u00d1\u00d2\5\"\22\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\f\3\2\2\u00d4"+
		"\u00d5\t\4\2\2\u00d5\u00d7\5\"\22\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9!\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\b\22\1\2\u00dc\u00dd\5$\23\2\u00dd\u00e3\3\2\2\2"+
		"\u00de\u00df\f\3\2\2\u00df\u00e0\t\5\2\2\u00e0\u00e2\5$\23\2\u00e1\u00de"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\5&\24\2\u00e7\u00e8\t\6\2\2"+
		"\u00e8\u00ea\5$\23\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea%\3"+
		"\2\2\2\u00eb\u00f2\7$\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5\22\n\2\u00ee"+
		"\u00ef\7\34\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\7%\2\2\u00f1\u00eb\3\2"+
		"\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f4"+
		"\5\2\2\2\u00f4\u00f5\7%\2\2\u00f5)\3\2\2\2\30\64?FJTZ^bjn\u0085\u008b"+
		"\u0099\u00a2\u00ac\u00b7\u00c2\u00cd\u00d8\u00e3\u00e9\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}