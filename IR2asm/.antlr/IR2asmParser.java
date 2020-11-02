// Generated from /diskd/MyData/Programming/Compile/minidecaf-2018011106/IR2asm/IR2asm.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IR2asmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		Integer=32, Whitespace=33, Identifier=34;
	public static final int
		RULE_program = 0, RULE_main_fun = 1, RULE_instruction = 2, RULE_label = 3, 
		RULE_br = 4, RULE_beqz = 5, RULE_bnez = 6, RULE_prologue = 7, RULE_epilogue = 8, 
		RULE_frameaddr = 9, RULE_load = 10, RULE_store = 11, RULE_pop = 12, RULE_push = 13, 
		RULE_ret = 14, RULE_two_op = 15, RULE_one_op = 16, RULE_lor = 17, RULE_land = 18, 
		RULE_eq = 19, RULE_ne = 20, RULE_lt = 21, RULE_gt = 22, RULE_le = 23, 
		RULE_ge = 24, RULE_add = 25, RULE_sub = 26, RULE_mul = 27, RULE_div = 28, 
		RULE_rem = 29, RULE_neg = 30, RULE_bitwise = 31, RULE_lnot = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_fun", "instruction", "label", "br", "beqz", "bnez", 
			"prologue", "epilogue", "frameaddr", "load", "store", "pop", "push", 
			"ret", "two_op", "one_op", "lor", "land", "eq", "ne", "lt", "gt", "le", 
			"ge", "add", "sub", "mul", "div", "rem", "neg", "bitwise", "lnot"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'{'", "'}'", "'LABEL'", "'BR'", "'BEQZ'", "'BNEZ'", 
			"'PROLOGUE'", "'EPILOGUE'", "'FRAMEADDR'", "'LOAD'", "'STORE'", "'POP'", 
			"'PUSH'", "'RET'", "'LOR'", "'LAND'", "'EQ'", "'NE'", "'LT'", "'GT'", 
			"'LE'", "'GE'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'REM'", "'NEG'", 
			"'NOT'", "'LNOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Integer", "Whitespace", 
			"Identifier"
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
	public String getGrammarFileName() { return "IR2asm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IR2asmParser(TokenStream input) {
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
			setState(66);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
			setState(68);
			match(T__0);
			setState(69);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(70);
				instruction();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__2);
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

	public static class InstructionContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BrContext br() {
			return getRuleContext(BrContext.class,0);
		}
		public BeqzContext beqz() {
			return getRuleContext(BeqzContext.class,0);
		}
		public BnezContext bnez() {
			return getRuleContext(BnezContext.class,0);
		}
		public PrologueContext prologue() {
			return getRuleContext(PrologueContext.class,0);
		}
		public EpilogueContext epilogue() {
			return getRuleContext(EpilogueContext.class,0);
		}
		public FrameaddrContext frameaddr() {
			return getRuleContext(FrameaddrContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public Two_opContext two_op() {
			return getRuleContext(Two_opContext.class,0);
		}
		public One_opContext one_op() {
			return getRuleContext(One_opContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				label();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				br();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				beqz();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				bnez();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				prologue();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				epilogue();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				frameaddr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				load();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				store();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				pop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				push();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				ret();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				two_op();
				}
				break;
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				one_op();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IR2asmParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
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

	public static class BrContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IR2asmParser.Identifier, 0); }
		public BrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_br; }
	}

	public final BrContext br() throws RecognitionException {
		BrContext _localctx = new BrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_br);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__4);
			setState(98);
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

	public static class BeqzContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IR2asmParser.Identifier, 0); }
		public BeqzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beqz; }
	}

	public final BeqzContext beqz() throws RecognitionException {
		BeqzContext _localctx = new BeqzContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_beqz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
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

	public static class BnezContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IR2asmParser.Identifier, 0); }
		public BnezContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bnez; }
	}

	public final BnezContext bnez() throws RecognitionException {
		BnezContext _localctx = new BnezContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bnez);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__6);
			setState(104);
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

	public static class PrologueContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(IR2asmParser.Integer, 0); }
		public PrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue; }
	}

	public final PrologueContext prologue() throws RecognitionException {
		PrologueContext _localctx = new PrologueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prologue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			match(Integer);
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

	public static class EpilogueContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(IR2asmParser.Integer, 0); }
		public EpilogueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilogue; }
	}

	public final EpilogueContext epilogue() throws RecognitionException {
		EpilogueContext _localctx = new EpilogueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_epilogue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__8);
			setState(110);
			match(Integer);
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

	public static class FrameaddrContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(IR2asmParser.Integer, 0); }
		public FrameaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameaddr; }
	}

	public final FrameaddrContext frameaddr() throws RecognitionException {
		FrameaddrContext _localctx = new FrameaddrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_frameaddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__9);
			setState(113);
			match(Integer);
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

	public static class LoadContext extends ParserRuleContext {
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__10);
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

	public static class StoreContext extends ParserRuleContext {
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__11);
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

	public static class PopContext extends ParserRuleContext {
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__12);
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

	public static class PushContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(IR2asmParser.Integer, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__13);
			setState(122);
			match(Integer);
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

	public static class RetContext extends ParserRuleContext {
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__14);
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

	public static class Two_opContext extends ParserRuleContext {
		public LorContext lor() {
			return getRuleContext(LorContext.class,0);
		}
		public LandContext land() {
			return getRuleContext(LandContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public NeContext ne() {
			return getRuleContext(NeContext.class,0);
		}
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public GeContext ge() {
			return getRuleContext(GeContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public RemContext rem() {
			return getRuleContext(RemContext.class,0);
		}
		public Two_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_two_op; }
	}

	public final Two_opContext two_op() throws RecognitionException {
		Two_opContext _localctx = new Two_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_two_op);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				lor();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				land();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				eq();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				ne();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				lt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				gt();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				le();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				ge();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				add();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				sub();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				mul();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 12);
				{
				setState(137);
				div();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 13);
				{
				setState(138);
				rem();
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

	public static class One_opContext extends ParserRuleContext {
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public LnotContext lnot() {
			return getRuleContext(LnotContext.class,0);
		}
		public One_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_op; }
	}

	public final One_opContext one_op() throws RecognitionException {
		One_opContext _localctx = new One_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_one_op);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				neg();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				bitwise();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				lnot();
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

	public static class LorContext extends ParserRuleContext {
		public LorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lor; }
	}

	public final LorContext lor() throws RecognitionException {
		LorContext _localctx = new LorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__15);
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

	public static class LandContext extends ParserRuleContext {
		public LandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_land; }
	}

	public final LandContext land() throws RecognitionException {
		LandContext _localctx = new LandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_land);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__16);
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

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__17);
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

	public static class NeContext extends ParserRuleContext {
		public NeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ne; }
	}

	public final NeContext ne() throws RecognitionException {
		NeContext _localctx = new NeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__18);
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

	public static class LtContext extends ParserRuleContext {
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__19);
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

	public static class GtContext extends ParserRuleContext {
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__20);
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

	public static class LeContext extends ParserRuleContext {
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__21);
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

	public static class GeContext extends ParserRuleContext {
		public GeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ge; }
	}

	public final GeContext ge() throws RecognitionException {
		GeContext _localctx = new GeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__22);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__23);
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__24);
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

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__25);
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

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__26);
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

	public static class RemContext extends ParserRuleContext {
		public RemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rem; }
	}

	public final RemContext rem() throws RecognitionException {
		RemContext _localctx = new RemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__27);
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

	public static class NegContext extends ParserRuleContext {
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__28);
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

	public static class BitwiseContext extends ParserRuleContext {
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bitwise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__29);
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

	public static class LnotContext extends ParserRuleContext {
		public LnotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lnot; }
	}

	public final LnotContext lnot() throws RecognitionException {
		LnotContext _localctx = new LnotContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lnot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__30);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008e\n\21"+
		"\3\22\3\22\3\22\5\22\u0093\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2\u00af\2D\3\2\2\2\4"+
		"F\3\2\2\2\6^\3\2\2\2\b`\3\2\2\2\nc\3\2\2\2\ff\3\2\2\2\16i\3\2\2\2\20l"+
		"\3\2\2\2\22o\3\2\2\2\24r\3\2\2\2\26u\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34"+
		"{\3\2\2\2\36~\3\2\2\2 \u008d\3\2\2\2\"\u0092\3\2\2\2$\u0094\3\2\2\2&\u0096"+
		"\3\2\2\2(\u0098\3\2\2\2*\u009a\3\2\2\2,\u009c\3\2\2\2.\u009e\3\2\2\2\60"+
		"\u00a0\3\2\2\2\62\u00a2\3\2\2\2\64\u00a4\3\2\2\2\66\u00a6\3\2\2\28\u00a8"+
		"\3\2\2\2:\u00aa\3\2\2\2<\u00ac\3\2\2\2>\u00ae\3\2\2\2@\u00b0\3\2\2\2B"+
		"\u00b2\3\2\2\2DE\5\4\3\2E\3\3\2\2\2FG\7\3\2\2GK\7\4\2\2HJ\5\6\4\2IH\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\5\2\2O\5"+
		"\3\2\2\2P_\5\b\5\2Q_\5\n\6\2R_\5\f\7\2S_\5\16\b\2T_\5\20\t\2U_\5\22\n"+
		"\2V_\5\24\13\2W_\5\26\f\2X_\5\30\r\2Y_\5\32\16\2Z_\5\34\17\2[_\5\36\20"+
		"\2\\_\5 \21\2]_\5\"\22\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^S\3\2\2\2^T\3\2"+
		"\2\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2"+
		"\2\2^\\\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`a\7\6\2\2ab\7$\2\2b\t\3\2\2\2cd\7"+
		"\7\2\2de\7$\2\2e\13\3\2\2\2fg\7\b\2\2gh\7$\2\2h\r\3\2\2\2ij\7\t\2\2jk"+
		"\7$\2\2k\17\3\2\2\2lm\7\n\2\2mn\7\"\2\2n\21\3\2\2\2op\7\13\2\2pq\7\"\2"+
		"\2q\23\3\2\2\2rs\7\f\2\2st\7\"\2\2t\25\3\2\2\2uv\7\r\2\2v\27\3\2\2\2w"+
		"x\7\16\2\2x\31\3\2\2\2yz\7\17\2\2z\33\3\2\2\2{|\7\20\2\2|}\7\"\2\2}\35"+
		"\3\2\2\2~\177\7\21\2\2\177\37\3\2\2\2\u0080\u008e\5$\23\2\u0081\u008e"+
		"\5&\24\2\u0082\u008e\5(\25\2\u0083\u008e\5*\26\2\u0084\u008e\5,\27\2\u0085"+
		"\u008e\5.\30\2\u0086\u008e\5\60\31\2\u0087\u008e\5\62\32\2\u0088\u008e"+
		"\5\64\33\2\u0089\u008e\5\66\34\2\u008a\u008e\58\35\2\u008b\u008e\5:\36"+
		"\2\u008c\u008e\5<\37\2\u008d\u0080\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0082"+
		"\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d"+
		"\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2"+
		"\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"!\3\2\2\2\u008f\u0093\5> \2\u0090\u0093\5@!\2\u0091\u0093\5B\"\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093#\3\2\2\2"+
		"\u0094\u0095\7\22\2\2\u0095%\3\2\2\2\u0096\u0097\7\23\2\2\u0097\'\3\2"+
		"\2\2\u0098\u0099\7\24\2\2\u0099)\3\2\2\2\u009a\u009b\7\25\2\2\u009b+\3"+
		"\2\2\2\u009c\u009d\7\26\2\2\u009d-\3\2\2\2\u009e\u009f\7\27\2\2\u009f"+
		"/\3\2\2\2\u00a0\u00a1\7\30\2\2\u00a1\61\3\2\2\2\u00a2\u00a3\7\31\2\2\u00a3"+
		"\63\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5\65\3\2\2\2\u00a6\u00a7\7\33\2\2"+
		"\u00a7\67\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a99\3\2\2\2\u00aa\u00ab\7\35"+
		"\2\2\u00ab;\3\2\2\2\u00ac\u00ad\7\36\2\2\u00ad=\3\2\2\2\u00ae\u00af\7"+
		"\37\2\2\u00af?\3\2\2\2\u00b0\u00b1\7 \2\2\u00b1A\3\2\2\2\u00b2\u00b3\7"+
		"!\2\2\u00b3C\3\2\2\2\6K^\u008d\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}