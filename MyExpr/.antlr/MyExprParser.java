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
		T__24=25, Lparen=26, Rparen=27, Lbrace=28, Rbrace=29, Semicolon=30, Add=31, 
		Sub=32, Mul=33, Div=34, Integer=35, Identifier=36, Whitespace=37;
	public static final int
		RULE_type_t = 0, RULE_program = 1, RULE_global_declaration = 2, RULE_parameter_list = 3, 
		RULE_function = 4, RULE_block_items = 5, RULE_func_compound_statement = 6, 
		RULE_compound_statement = 7, RULE_block_item = 8, RULE_statement = 9, 
		RULE_declaration_expr = 10, RULE_declaration = 11, RULE_return_stat = 12, 
		RULE_condition_expression = 13, RULE_expression = 14, RULE_assignment = 15, 
		RULE_conditional = 16, RULE_logical_or = 17, RULE_logical_and = 18, RULE_equality = 19, 
		RULE_relational = 20, RULE_additive = 21, RULE_multiplicative = 22, RULE_unary = 23, 
		RULE_postfix = 24, RULE_expression_list = 25, RULE_primary = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"type_t", "program", "global_declaration", "parameter_list", "function", 
			"block_items", "func_compound_statement", "compound_statement", "block_item", 
			"statement", "declaration_expr", "declaration", "return_stat", "condition_expression", 
			"expression", "assignment", "conditional", "logical_or", "logical_and", 
			"equality", "relational", "additive", "multiplicative", "unary", "postfix", 
			"expression_list", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'='", "','", "'if'", "'else'", "'for'", "'while'", "'do'", 
			"'break'", "'continue'", "'return'", "'?'", "':'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'%'", "'~'", "'!'", "'&'", "'('", 
			"')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", 
			"Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace"
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

	public static class Type_tContext extends ParserRuleContext {
		public Type_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_t; }
	 
		public Type_tContext() { }
		public void copyFrom(Type_tContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_ptrContext extends Type_tContext {
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
		}
		public TerminalNode Mul() { return getToken(MyExprParser.Mul, 0); }
		public Type_ptrContext(Type_tContext ctx) { copyFrom(ctx); }
	}
	public static class Type_intContext extends Type_tContext {
		public Type_intContext(Type_tContext ctx) { copyFrom(ctx); }
	}

	public final Type_tContext type_t() throws RecognitionException {
		return type_t(0);
	}

	private Type_tContext type_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_tContext _localctx = new Type_tContext(_ctx, _parentState);
		Type_tContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_type_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Type_intContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(55);
			match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_ptrContext(new Type_tContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_t);
					setState(57);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(58);
					match(Mul);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyExprParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Global_declarationContext> global_declaration() {
			return getRuleContexts(Global_declarationContext.class);
		}
		public Global_declarationContext global_declaration(int i) {
			return getRuleContext(Global_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(64);
					function();
					}
					break;
				case 2:
					{
					setState(65);
					global_declaration();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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

	public static class Global_declarationContext extends ParserRuleContext {
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public TerminalNode Integer() { return getToken(MyExprParser.Integer, 0); }
		public Global_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_declaration; }
	}

	public final Global_declarationContext global_declaration() throws RecognitionException {
		Global_declarationContext _localctx = new Global_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type_t(0);
			setState(74);
			match(Identifier);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(75);
				match(T__1);
				setState(76);
				match(Integer);
				}
			}

			setState(79);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Type_tContext> type_t() {
			return getRuleContexts(Type_tContext.class);
		}
		public Type_tContext type_t(int i) {
			return getRuleContext(Type_tContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MyExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MyExprParser.Identifier, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(81);
				type_t(0);
				setState(82);
				match(Identifier);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(83);
					match(T__2);
					setState(84);
					type_t(0);
					setState(85);
					match(Identifier);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class FunctionContext extends ParserRuleContext {
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public Func_compound_statementContext func_compound_statement() {
			return getRuleContext(Func_compound_statementContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type_t(0);
			setState(95);
			match(Identifier);
			setState(96);
			match(Lparen);
			setState(97);
			parameter_list();
			setState(98);
			match(Rparen);
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lbrace:
				{
				setState(99);
				func_compound_statement();
				}
				break;
			case Semicolon:
				{
				setState(100);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Block_itemsContext extends ParserRuleContext {
		public TerminalNode Lbrace() { return getToken(MyExprParser.Lbrace, 0); }
		public TerminalNode Rbrace() { return getToken(MyExprParser.Rbrace, 0); }
		public List<Block_itemContext> block_item() {
			return getRuleContexts(Block_itemContext.class);
		}
		public Block_itemContext block_item(int i) {
			return getRuleContext(Block_itemContext.class,i);
		}
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Lbrace);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Lbrace) | (1L << Semicolon) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				{
				setState(104);
				block_item();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class Func_compound_statementContext extends ParserRuleContext {
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public Func_compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_compound_statement; }
	}

	public final Func_compound_statementContext func_compound_statement() throws RecognitionException {
		Func_compound_statementContext _localctx = new Func_compound_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			block_items();
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
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			block_items();
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
		enterRule(_localctx, 16, RULE_block_item);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__22:
			case T__23:
			case T__24:
			case Lparen:
			case Lbrace:
			case Semicolon:
			case Sub:
			case Mul:
			case Integer:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
		public Condition_expressionContext cond_expr;
		public ExpressionContext post_expr;
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public Declaration_exprContext declaration_expr() {
			return getRuleContext(Declaration_exprContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(MyExprParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MyExprParser.Semicolon, i);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
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
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
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
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
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
		public Condition_expressionContext cond_expr;
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
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
		}
		public Stat_for_loop_no_declrContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Stat_breakContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public Stat_breakContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Stat_retContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				return_stat();
				}
				break;
			case 2:
				_localctx = new Stat_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(121);
					expression();
					}
				}

				setState(124);
				match(Semicolon);
				}
				break;
			case 3:
				_localctx = new Stat_conditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__3);
				setState(126);
				match(Lparen);
				setState(127);
				condition_expression();
				setState(128);
				match(Rparen);
				setState(129);
				statement();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(130);
					match(T__4);
					setState(131);
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
				setState(134);
				compound_statement();
				}
				break;
			case 5:
				_localctx = new Stat_for_loop_no_declrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__5);
				setState(136);
				match(Lparen);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(137);
					((Stat_for_loop_no_declrContext)_localctx).pre_expr = expression();
					}
				}

				setState(140);
				match(Semicolon);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(141);
					((Stat_for_loop_no_declrContext)_localctx).cond_expr = condition_expression();
					}
				}

				setState(144);
				match(Semicolon);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(145);
					((Stat_for_loop_no_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(148);
				match(Rparen);
				setState(149);
				statement();
				}
				break;
			case 6:
				_localctx = new Stat_for_loop_declrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(T__5);
				setState(151);
				match(Lparen);
				setState(152);
				declaration_expr();
				setState(153);
				match(Semicolon);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(154);
					((Stat_for_loop_declrContext)_localctx).cond_expr = condition_expression();
					}
				}

				setState(157);
				match(Semicolon);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(158);
					((Stat_for_loop_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(161);
				match(Rparen);
				setState(162);
				statement();
				}
				break;
			case 7:
				_localctx = new Stat_while_loopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				match(T__6);
				setState(165);
				match(Lparen);
				setState(166);
				condition_expression();
				setState(167);
				match(Rparen);
				setState(168);
				statement();
				}
				break;
			case 8:
				_localctx = new Stat_do_loopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				match(T__7);
				setState(171);
				statement();
				setState(172);
				match(T__6);
				setState(173);
				match(Lparen);
				setState(174);
				condition_expression();
				setState(175);
				match(Rparen);
				setState(176);
				match(Semicolon);
				}
				break;
			case 9:
				_localctx = new Stat_breakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(T__8);
				setState(179);
				match(Semicolon);
				}
				break;
			case 10:
				_localctx = new Stat_continueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				match(T__9);
				setState(181);
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

	public static class Declaration_exprContext extends ParserRuleContext {
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_expr; }
	}

	public final Declaration_exprContext declaration_expr() throws RecognitionException {
		Declaration_exprContext _localctx = new Declaration_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			type_t(0);
			setState(185);
			match(Identifier);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(186);
				match(T__1);
				setState(187);
				expression();
				}
			}

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
		public Declaration_exprContext declaration_expr() {
			return getRuleContext(Declaration_exprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MyExprParser.Semicolon, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			declaration_expr();
			setState(191);
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
		enterRule(_localctx, 24, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__10);
			setState(194);
			expression();
			setState(195);
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

	public static class Condition_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expression; }
	}

	public final Condition_expressionContext condition_expression() throws RecognitionException {
		Condition_expressionContext _localctx = new Condition_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			expression();
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Assign_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				conditional();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				unary();
				setState(203);
				match(T__1);
				setState(204);
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
		enterRule(_localctx, 32, RULE_conditional);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Condition_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				logical_or(0);
				}
				break;
			case 2:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				logical_or(0);
				setState(210);
				match(T__11);
				setState(211);
				expression();
				setState(212);
				match(T__12);
				setState(213);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logical_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(218);
			logical_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operateContext(new Logical_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or);
					setState(220);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(221);
					match(T__13);
					setState(222);
					logical_and(0);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logical_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(229);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operateContext(new Logical_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and);
					setState(231);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(232);
					match(T__14);
					setState(233);
					equality(0);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_equality, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(240);
			relational(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equal_operateContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(243);
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
					setState(244);
					relational(0);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relational, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Relation_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(251);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_operateContext(new RelationalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational);
					setState(253);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(254);
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
					setState(255);
					additive(0);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(262);
			multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_operateContext(new AdditiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive);
					setState(264);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(265);
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
					setState(266);
					multiplicative(0);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(273);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_operateContext(new MultiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative);
					setState(275);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(276);
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
					setState(277);
					unary();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public Unary_noneContext(UnaryContext ctx) { copyFrom(ctx); }
	}
	public static class Unary_operateContext extends UnaryContext {
		public Token op;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode Sub() { return getToken(MyExprParser.Sub, 0); }
		public TerminalNode Mul() { return getToken(MyExprParser.Mul, 0); }
		public Unary_operateContext(UnaryContext ctx) { copyFrom(ctx); }
	}
	public static class Unary_castContext extends UnaryContext {
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Unary_castContext(UnaryContext ctx) { copyFrom(ctx); }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unary);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Unary_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				postfix();
				}
				break;
			case 2:
				_localctx = new Unary_operateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				((Unary_operateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Sub) | (1L << Mul))) != 0)) ) {
					((Unary_operateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				unary();
				}
				break;
			case 3:
				_localctx = new Unary_castContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(Lparen);
				setState(287);
				type_t(0);
				setState(288);
				match(Rparen);
				setState(289);
				unary();
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

	public static class PostfixContext extends ParserRuleContext {
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Postfix_callfuncContext extends PostfixContext {
		public TerminalNode Identifier() { return getToken(MyExprParser.Identifier, 0); }
		public TerminalNode Lparen() { return getToken(MyExprParser.Lparen, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyExprParser.Rparen, 0); }
		public Postfix_callfuncContext(PostfixContext ctx) { copyFrom(ctx); }
	}
	public static class Postfix_noneContext extends PostfixContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Postfix_noneContext(PostfixContext ctx) { copyFrom(ctx); }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postfix);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new Postfix_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				primary();
				}
				break;
			case 2:
				_localctx = new Postfix_callfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(Identifier);
				setState(295);
				match(Lparen);
				setState(296);
				expression_list();
				setState(297);
				match(Rparen);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Lparen) | (1L << Sub) | (1L << Mul) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				setState(301);
				expression();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(302);
					match(T__2);
					setState(303);
					expression();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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
		enterRule(_localctx, 52, RULE_primary);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(Integer);
				}
				break;
			case Lparen:
				_localctx = new PrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(Lparen);
				setState(313);
				expression();
				setState(314);
				match(Rparen);
				}
				break;
			case Identifier:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return type_t_sempred((Type_tContext)_localctx, predIndex);
		case 17:
			return logical_or_sempred((Logical_orContext)_localctx, predIndex);
		case 18:
			return logical_and_sempred((Logical_andContext)_localctx, predIndex);
		case 19:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 20:
			return relational_sempred((RelationalContext)_localctx, predIndex);
		case 21:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 22:
			return multiplicative_sempred((MultiplicativeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_t_sempred(Type_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_or_sempred(Logical_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_sempred(Logical_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_sempred(RelationalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_sempred(AdditiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_sempred(MultiplicativeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\5\5_\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\ny\n\n\3\13\3\13\5\13}\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0087\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u008d\n\13\3\13\3\13\5\13\u0091\n\13\3\13\3\13\5\13\u0095\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\13\3\13\5\13\u00a2\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00bf\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00da\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e2\n\23\f\23\16"+
		"\23\u00e5\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ed\n\24\f\24\16"+
		"\24\u00f0\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f8\n\25\f\25\16"+
		"\25\u00fb\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0103\n\26\f\26\16"+
		"\26\u0106\13\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u010e\n\27\f\27\16"+
		"\27\u0111\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0119\n\30\f\30\16"+
		"\30\u011c\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0126\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012e\n\32\3\33\3\33\3\33\7\33\u0133"+
		"\n\33\f\33\16\33\u0136\13\33\5\33\u0138\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0140\n\34\3\34\2\t\2$&(*,.\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2\22\23\3\2\24\27\3\2!\"\4\2\30\30"+
		"#$\4\2\31\33\"#\2\u014f\28\3\2\2\2\4F\3\2\2\2\6K\3\2\2\2\b^\3\2\2\2\n"+
		"`\3\2\2\2\fi\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24\u00b8\3\2"+
		"\2\2\26\u00ba\3\2\2\2\30\u00c0\3\2\2\2\32\u00c3\3\2\2\2\34\u00c7\3\2\2"+
		"\2\36\u00c9\3\2\2\2 \u00d0\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00e6"+
		"\3\2\2\2(\u00f1\3\2\2\2*\u00fc\3\2\2\2,\u0107\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u012d\3\2\2\2\64\u0137\3\2\2\2\66\u013f\3\2\2\289\b"+
		"\2\1\29:\7\3\2\2:?\3\2\2\2;<\f\3\2\2<>\7#\2\2=;\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BE\5\n\6\2CE\5\6\4\2DB\3\2\2\2DC"+
		"\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\2\2\3J"+
		"\5\3\2\2\2KL\5\2\2\2LO\7&\2\2MN\7\4\2\2NP\7%\2\2OM\3\2\2\2OP\3\2\2\2P"+
		"Q\3\2\2\2QR\7 \2\2R\7\3\2\2\2ST\5\2\2\2T[\7&\2\2UV\7\5\2\2VW\5\2\2\2W"+
		"X\7&\2\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2^S\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`a\5\2\2\2ab\7&\2\2bc\7\34\2"+
		"\2cd\5\b\5\2dg\7\35\2\2eh\5\16\b\2fh\7 \2\2ge\3\2\2\2gf\3\2\2\2h\13\3"+
		"\2\2\2im\7\36\2\2jl\5\22\n\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"p\3\2\2\2om\3\2\2\2pq\7\37\2\2q\r\3\2\2\2rs\5\f\7\2s\17\3\2\2\2tu\5\f"+
		"\7\2u\21\3\2\2\2vy\5\24\13\2wy\5\30\r\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2"+
		"\2z\u00b9\5\32\16\2{}\5\36\20\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u00b9\7"+
		" \2\2\177\u0080\7\6\2\2\u0080\u0081\7\34\2\2\u0081\u0082\5\34\17\2\u0082"+
		"\u0083\7\35\2\2\u0083\u0086\5\24\13\2\u0084\u0085\7\7\2\2\u0085\u0087"+
		"\5\24\13\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u00b9\3\2\2\2"+
		"\u0088\u00b9\5\20\t\2\u0089\u008a\7\b\2\2\u008a\u008c\7\34\2\2\u008b\u008d"+
		"\5\36\20\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u0090\7 \2\2\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7 \2\2\u0093\u0095\5\36\20\2"+
		"\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\7\35\2\2\u0097\u00b9\5\24\13\2\u0098\u0099\7\b\2\2\u0099\u009a\7\34\2"+
		"\2\u009a\u009b\5\26\f\2\u009b\u009d\7 \2\2\u009c\u009e\5\34\17\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7 "+
		"\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\35\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00b9"+
		"\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00a9\5\34\17"+
		"\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00b9\3\2\2\2\u00ac"+
		"\u00ad\7\n\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7"+
		"\34\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\7 \2\2"+
		"\u00b3\u00b9\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b9\7 \2\2\u00b6\u00b7"+
		"\7\f\2\2\u00b7\u00b9\7 \2\2\u00b8z\3\2\2\2\u00b8|\3\2\2\2\u00b8\177\3"+
		"\2\2\2\u00b8\u0088\3\2\2\2\u00b8\u0089\3\2\2\2\u00b8\u0098\3\2\2\2\u00b8"+
		"\u00a6\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\5\2\2\2\u00bb\u00be\7&\2\2\u00bc\u00bd"+
		"\7\4\2\2\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\27\3\2\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7 \2\2\u00c2\31\3\2"+
		"\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7 \2\2\u00c6"+
		"\33\3\2\2\2\u00c7\u00c8\5\36\20\2\u00c8\35\3\2\2\2\u00c9\u00ca\5 \21\2"+
		"\u00ca\37\3\2\2\2\u00cb\u00d1\5\"\22\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce"+
		"\7\4\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2"+
		"\u00d0\u00cc\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00da\5$\23\2\u00d3\u00d4\5"+
		"$\23\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\17\2\2"+
		"\u00d7\u00d8\5\"\22\2\u00d8\u00da\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d3"+
		"\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\b\23\1\2\u00dc\u00dd\5&\24\2\u00dd"+
		"\u00e3\3\2\2\2\u00de\u00df\f\3\2\2\u00df\u00e0\7\20\2\2\u00e0\u00e2\5"+
		"&\24\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4%\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b\24\1\2"+
		"\u00e7\u00e8\5(\25\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\f\3\2\2\u00ea\u00eb"+
		"\7\21\2\2\u00eb\u00ed\5(\25\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f1\u00f2\b\25\1\2\u00f2\u00f3\5*\26\2\u00f3\u00f9\3\2\2\2\u00f4"+
		"\u00f5\f\3\2\2\u00f5\u00f6\t\2\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f4\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\b\26\1\2\u00fd\u00fe\5,\27\2"+
		"\u00fe\u0104\3\2\2\2\u00ff\u0100\f\3\2\2\u0100\u0101\t\3\2\2\u0101\u0103"+
		"\5,\27\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105+\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\b\27\1\2"+
		"\u0108\u0109\5.\30\2\u0109\u010f\3\2\2\2\u010a\u010b\f\3\2\2\u010b\u010c"+
		"\t\4\2\2\u010c\u010e\5.\30\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110-\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0112\u0113\b\30\1\2\u0113\u0114\5\60\31\2\u0114\u011a\3\2\2\2\u0115"+
		"\u0116\f\3\2\2\u0116\u0117\t\5\2\2\u0117\u0119\5\60\31\2\u0118\u0115\3"+
		"\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"/\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0126\5\62\32\2\u011e\u011f\t\6\2"+
		"\2\u011f\u0126\5\60\31\2\u0120\u0121\7\34\2\2\u0121\u0122\5\2\2\2\u0122"+
		"\u0123\7\35\2\2\u0123\u0124\5\60\31\2\u0124\u0126\3\2\2\2\u0125\u011d"+
		"\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u0120\3\2\2\2\u0126\61\3\2\2\2\u0127"+
		"\u012e\5\66\34\2\u0128\u0129\7&\2\2\u0129\u012a\7\34\2\2\u012a\u012b\5"+
		"\64\33\2\u012b\u012c\7\35\2\2\u012c\u012e\3\2\2\2\u012d\u0127\3\2\2\2"+
		"\u012d\u0128\3\2\2\2\u012e\63\3\2\2\2\u012f\u0134\5\36\20\2\u0130\u0131"+
		"\7\5\2\2\u0131\u0133\5\36\20\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0138\3\2\2\2\u0138\65\3\2\2\2\u0139"+
		"\u0140\7%\2\2\u013a\u013b\7\34\2\2\u013b\u013c\5\36\20\2\u013c\u013d\7"+
		"\35\2\2\u013d\u0140\3\2\2\2\u013e\u0140\7&\2\2\u013f\u0139\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140\67\3\2\2\2!?DFO[^gmx|\u0086\u008c"+
		"\u0090\u0094\u009d\u00a1\u00b8\u00be\u00d0\u00d9\u00e3\u00ee\u00f9\u0104"+
		"\u010f\u011a\u0125\u012d\u0134\u0137\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}