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
		RULE_type_t = 0, RULE_program = 1, RULE_global_declaration = 2, RULE_parameter_list = 3, 
		RULE_function = 4, RULE_block_items = 5, RULE_func_compound_statement = 6, 
		RULE_compound_statement = 7, RULE_block_item = 8, RULE_statement = 9, 
		RULE_declaration = 10, RULE_return_stat = 11, RULE_expression = 12, RULE_assignment = 13, 
		RULE_conditional = 14, RULE_logical_or = 15, RULE_logical_and = 16, RULE_equality = 17, 
		RULE_relational = 18, RULE_additive = 19, RULE_multiplicative = 20, RULE_unary = 21, 
		RULE_postfix = 22, RULE_expression_list = 23, RULE_primary = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"type_t", "program", "global_declaration", "parameter_list", "function", 
			"block_items", "func_compound_statement", "compound_statement", "block_item", 
			"statement", "declaration", "return_stat", "expression", "assignment", 
			"conditional", "logical_or", "logical_and", "equality", "relational", 
			"additive", "multiplicative", "unary", "postfix", "expression_list", 
			"primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'='", "','", "'if'", "'else'", "'for'", "'while'", "'do'", 
			"'break'", "'continue'", "'return'", "'?'", "':'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'%'", "'~'", "'!'", "'('", "')'", 
			"'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'"
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

	public static class Type_tContext extends ParserRuleContext {
		public Type_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_t; }
	}

	public final Type_tContext type_t() throws RecognitionException {
		Type_tContext _localctx = new Type_tContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
					function();
					}
					break;
				case 2:
					{
					setState(53);
					global_declaration();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
			setState(61);
			type_t();
			setState(62);
			match(Identifier);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(63);
				match(T__1);
				setState(64);
				match(Integer);
				}
			}

			setState(67);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(69);
				type_t();
				setState(70);
				match(Identifier);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(71);
					match(T__2);
					setState(72);
					type_t();
					setState(73);
					match(Identifier);
					}
					}
					setState(79);
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
			setState(82);
			type_t();
			setState(83);
			match(Identifier);
			setState(84);
			match(Lparen);
			setState(85);
			parameter_list();
			setState(86);
			match(Rparen);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lbrace:
				{
				setState(87);
				func_compound_statement();
				}
				break;
			case Semicolon:
				{
				setState(88);
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
			setState(91);
			match(Lbrace);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Lbrace) | (1L << Semicolon) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				{
				setState(92);
				block_item();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(100);
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
			setState(102);
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
			setState(106);
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
			case Lparen:
			case Lbrace:
			case Semicolon:
			case Sub:
			case Integer:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Stat_retContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				return_stat();
				}
				break;
			case 2:
				_localctx = new Stat_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(109);
					expression();
					}
				}

				setState(112);
				match(Semicolon);
				}
				break;
			case 3:
				_localctx = new Stat_conditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__3);
				setState(114);
				match(Lparen);
				setState(115);
				expression();
				setState(116);
				match(Rparen);
				setState(117);
				statement();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(118);
					match(T__4);
					setState(119);
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
				setState(122);
				compound_statement();
				}
				break;
			case 5:
				_localctx = new Stat_for_loop_no_declrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(T__5);
				setState(124);
				match(Lparen);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(125);
					((Stat_for_loop_no_declrContext)_localctx).pre_expr = expression();
					}
				}

				setState(128);
				match(Semicolon);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(129);
					((Stat_for_loop_no_declrContext)_localctx).cond_expr = expression();
					}
				}

				setState(132);
				match(Semicolon);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(133);
					((Stat_for_loop_no_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(136);
				match(Rparen);
				setState(137);
				statement();
				}
				break;
			case 6:
				_localctx = new Stat_for_loop_declrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__5);
				setState(139);
				match(Lparen);
				setState(140);
				declaration();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(141);
					((Stat_for_loop_declrContext)_localctx).cond_expr = expression();
					}
				}

				setState(144);
				match(Semicolon);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
					{
					setState(145);
					((Stat_for_loop_declrContext)_localctx).post_expr = expression();
					}
				}

				setState(148);
				match(Rparen);
				setState(149);
				statement();
				}
				break;
			case 7:
				_localctx = new Stat_while_loopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(T__6);
				setState(152);
				match(Lparen);
				setState(153);
				expression();
				setState(154);
				match(Rparen);
				setState(155);
				statement();
				}
				break;
			case 8:
				_localctx = new Stat_do_loopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				match(T__7);
				setState(158);
				statement();
				setState(159);
				match(T__6);
				setState(160);
				match(Lparen);
				setState(161);
				expression();
				setState(162);
				match(Rparen);
				setState(163);
				match(Semicolon);
				}
				break;
			case 9:
				_localctx = new Stat_breakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				match(T__8);
				setState(166);
				match(Semicolon);
				}
				break;
			case 10:
				_localctx = new Stat_continueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				match(T__9);
				setState(168);
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
		public Type_tContext type_t() {
			return getRuleContext(Type_tContext.class,0);
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
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type_t();
			setState(172);
			match(Identifier);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(173);
				match(T__1);
				setState(174);
				expression();
				}
			}

			setState(177);
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
		enterRule(_localctx, 22, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__10);
			setState(180);
			expression();
			setState(181);
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Assign_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				conditional();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(Identifier);
				setState(187);
				match(T__1);
				setState(188);
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
		enterRule(_localctx, 28, RULE_conditional);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Condition_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				logical_or(0);
				}
				break;
			case 2:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				logical_or(0);
				setState(193);
				match(T__11);
				setState(194);
				expression();
				setState(195);
				match(T__12);
				setState(196);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logical_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(201);
			logical_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operateContext(new Logical_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					match(T__13);
					setState(205);
					logical_and(0);
					}
					} 
				}
				setState(210);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logical_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operateContext(new Logical_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and);
					setState(214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(215);
					match(T__14);
					setState(216);
					equality(0);
					}
					} 
				}
				setState(221);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_equality, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(223);
			relational(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equal_operateContext(new EqualityContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(226);
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
					setState(227);
					relational(0);
					}
					} 
				}
				setState(232);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_relational, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Relation_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(234);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_operateContext(new RelationalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational);
					setState(236);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(237);
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
					setState(238);
					additive(0);
					}
					} 
				}
				setState(243);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(245);
			multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_operateContext(new AdditiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive);
					setState(247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(248);
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
					setState(249);
					multiplicative(0);
					}
					} 
				}
				setState(254);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_noneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(256);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_operateContext(new MultiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative);
					setState(258);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(259);
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
					setState(260);
					unary();
					}
					} 
				}
				setState(265);
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
		public Unary_operateContext(UnaryContext ctx) { copyFrom(ctx); }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lparen:
			case Integer:
			case Identifier:
				_localctx = new Unary_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				postfix();
				}
				break;
			case T__22:
			case T__23:
			case Sub:
				_localctx = new Unary_operateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
				setState(268);
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
		enterRule(_localctx, 44, RULE_postfix);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Postfix_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				primary();
				}
				break;
			case 2:
				_localctx = new Postfix_callfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(Identifier);
				setState(273);
				match(Lparen);
				setState(274);
				expression_list();
				setState(275);
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
		enterRule(_localctx, 46, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Lparen) | (1L << Sub) | (1L << Integer) | (1L << Identifier))) != 0)) {
				{
				setState(279);
				expression();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(280);
					match(T__2);
					setState(281);
					expression();
					}
					}
					setState(286);
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
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(Integer);
				}
				break;
			case Lparen:
				_localctx = new PrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(Lparen);
				setState(291);
				expression();
				setState(292);
				match(Rparen);
				}
				break;
			case Identifier:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
		case 15:
			return logical_or_sempred((Logical_orContext)_localctx, predIndex);
		case 16:
			return logical_and_sempred((Logical_andContext)_localctx, predIndex);
		case 17:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 18:
			return relational_sempred((RelationalContext)_localctx, predIndex);
		case 19:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4D\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\7\7`\n\7\f\7\16"+
		"\7c\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nm\n\n\3\13\3\13\5\13q\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0081\n\13\3\13\3\13\5\13\u0085\n\13\3\13\3\13\5\13\u0089\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\13\3\13\5\13\u0095\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00b2\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00c0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u00e7\n\23\f\23\16\23\u00ea\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u00f2\n\24\f\24\16\24\u00f5\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0108\n\26\f\26\16\26\u010b\13\26\3\27\3"+
		"\27\3\27\5\27\u0110\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0118\n\30"+
		"\3\31\3\31\3\31\7\31\u011d\n\31\f\31\16\31\u0120\13\31\5\31\u0122\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012a\n\32\3\32\2\b \"$&(*\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3\2\22\23\3\2\24"+
		"\27\3\2 !\4\2\30\30\"#\4\2\31\32!!\2\u0139\2\64\3\2\2\2\4:\3\2\2\2\6?"+
		"\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f]\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22l"+
		"\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3\2\2\2\30\u00b5\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00bf\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\"\u00d5\3\2\2"+
		"\2$\u00e0\3\2\2\2&\u00eb\3\2\2\2(\u00f6\3\2\2\2*\u0101\3\2\2\2,\u010f"+
		"\3\2\2\2.\u0117\3\2\2\2\60\u0121\3\2\2\2\62\u0129\3\2\2\2\64\65\7\3\2"+
		"\2\65\3\3\2\2\2\669\5\n\6\2\679\5\6\4\28\66\3\2\2\28\67\3\2\2\29<\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\2\2\3>\5\3\2\2\2?@\5"+
		"\2\2\2@C\7%\2\2AB\7\4\2\2BD\7$\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\37"+
		"\2\2F\7\3\2\2\2GH\5\2\2\2HO\7%\2\2IJ\7\5\2\2JK\5\2\2\2KL\7%\2\2LN\3\2"+
		"\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RG\3\2"+
		"\2\2RS\3\2\2\2S\t\3\2\2\2TU\5\2\2\2UV\7%\2\2VW\7\33\2\2WX\5\b\5\2X[\7"+
		"\34\2\2Y\\\5\16\b\2Z\\\7\37\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2]a\7\35"+
		"\2\2^`\5\22\n\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2de\7\36\2\2e\r\3\2\2\2fg\5\f\7\2g\17\3\2\2\2hi\5\f\7\2i\21\3\2\2"+
		"\2jm\5\24\13\2km\5\26\f\2lj\3\2\2\2lk\3\2\2\2m\23\3\2\2\2n\u00ac\5\30"+
		"\r\2oq\5\32\16\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r\u00ac\7\37\2\2st\7\6\2"+
		"\2tu\7\33\2\2uv\5\32\16\2vw\7\34\2\2wz\5\24\13\2xy\7\7\2\2y{\5\24\13\2"+
		"zx\3\2\2\2z{\3\2\2\2{\u00ac\3\2\2\2|\u00ac\5\20\t\2}~\7\b\2\2~\u0080\7"+
		"\33\2\2\177\u0081\5\32\16\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\7\37\2\2\u0083\u0085\5\32\16\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\37\2\2"+
		"\u0087\u0089\5\32\16\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\7\34\2\2\u008b\u00ac\5\24\13\2\u008c\u008d\7\b\2"+
		"\2\u008d\u008e\7\33\2\2\u008e\u0090\5\26\f\2\u008f\u0091\5\32\16\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\37"+
		"\2\2\u0093\u0095\5\32\16\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\34\2\2\u0097\u0098\5\24\13\2\u0098\u00ac"+
		"\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\7\33\2\2\u009b\u009c\5\32\16"+
		"\2\u009c\u009d\7\34\2\2\u009d\u009e\5\24\13\2\u009e\u00ac\3\2\2\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\7"+
		"\33\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7\37\2"+
		"\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00ac\7\37\2\2\u00a9"+
		"\u00aa\7\f\2\2\u00aa\u00ac\7\37\2\2\u00abn\3\2\2\2\u00abp\3\2\2\2\u00ab"+
		"s\3\2\2\2\u00ab|\3\2\2\2\u00ab}\3\2\2\2\u00ab\u008c\3\2\2\2\u00ab\u0099"+
		"\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00b1\7%\2\2\u00af\u00b0\7\4\2\2"+
		"\u00b0\u00b2\5\32\16\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\7\37\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\r\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00b8\7\37\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\5\34"+
		"\17\2\u00ba\33\3\2\2\2\u00bb\u00c0\5\36\20\2\u00bc\u00bd\7%\2\2\u00bd"+
		"\u00be\7\4\2\2\u00be\u00c0\5\32\16\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3"+
		"\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c9\5 \21\2\u00c2\u00c3\5 \21\2\u00c3"+
		"\u00c4\7\16\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7"+
		"\5\36\20\2\u00c7\u00c9\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2"+
		"\u00c9\37\3\2\2\2\u00ca\u00cb\b\21\1\2\u00cb\u00cc\5\"\22\2\u00cc\u00d2"+
		"\3\2\2\2\u00cd\u00ce\f\3\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d1\5\"\22\2"+
		"\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\22\1\2\u00d6"+
		"\u00d7\5$\23\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\f\3\2\2\u00d9\u00da\7\21"+
		"\2\2\u00da\u00dc\5$\23\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00e1\b\23\1\2\u00e1\u00e2\5&\24\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4"+
		"\f\3\2\2\u00e4\u00e5\t\2\2\2\u00e5\u00e7\5&\24\2\u00e6\u00e3\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9%\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\b\24\1\2\u00ec\u00ed\5(\25\2\u00ed\u00f3"+
		"\3\2\2\2\u00ee\u00ef\f\3\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f2\5(\25\2\u00f1"+
		"\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\'\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\25\1\2\u00f7\u00f8"+
		"\5*\26\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\f\3\2\2\u00fa\u00fb\t\4\2\2\u00fb"+
		"\u00fd\5*\26\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff)\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102"+
		"\b\26\1\2\u0102\u0103\5,\27\2\u0103\u0109\3\2\2\2\u0104\u0105\f\3\2\2"+
		"\u0105\u0106\t\5\2\2\u0106\u0108\5,\27\2\u0107\u0104\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a+\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u0110\5.\30\2\u010d\u010e\t\6\2\2\u010e\u0110\5,"+
		"\27\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110-\3\2\2\2\u0111\u0118"+
		"\5\62\32\2\u0112\u0113\7%\2\2\u0113\u0114\7\33\2\2\u0114\u0115\5\60\31"+
		"\2\u0115\u0116\7\34\2\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117"+
		"\u0112\3\2\2\2\u0118/\3\2\2\2\u0119\u011e\5\32\16\2\u011a\u011b\7\5\2"+
		"\2\u011b\u011d\5\32\16\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0119\3\2\2\2\u0121\u0122\3\2\2\2\u0122\61\3\2\2\2\u0123\u012a"+
		"\7$\2\2\u0124\u0125\7\33\2\2\u0125\u0126\5\32\16\2\u0126\u0127\7\34\2"+
		"\2\u0127\u012a\3\2\2\2\u0128\u012a\7%\2\2\u0129\u0123\3\2\2\2\u0129\u0124"+
		"\3\2\2\2\u0129\u0128\3\2\2\2\u012a\63\3\2\2\2 8:COR[alpz\u0080\u0084\u0088"+
		"\u0090\u0094\u00ab\u00b1\u00bf\u00c8\u00d2\u00dd\u00e8\u00f3\u00fe\u0109"+
		"\u010f\u0117\u011e\u0121\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}