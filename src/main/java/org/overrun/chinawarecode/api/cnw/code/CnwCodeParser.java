package org.overrun.chinawarecode.api.cnw.code;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CnwCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, BOOLEAN=23, WS=24, COMMENT=25, 
		LINE_COMMENT=26, INT=27, LONG=28, DOUBLE=29, FLOAT=30, NAME=31, STRING=32, 
		FSTRING=33, LA=34, RA=35, END=36, PLUS=37, REDUCE=38, RIDE=39, DIVIDE=40, 
		COMPARER=41, MOVE=42, LAMBDA=43;
	public static final int
		RULE_main = 0, RULE_allCode = 1, RULE_if = 2, RULE_for = 3, RULE_switch = 4, 
		RULE_switchBlock = 5, RULE_switchOr = 6, RULE_braceTo = 7, RULE_dec = 8, 
		RULE_code = 9, RULE_val = 10, RULE_var = 11, RULE_operation = 12, RULE_prentheses = 13, 
		RULE_prenthesesOperation = 14, RULE_brackets = 15, RULE_brace = 16, RULE_prenthesesBoolean = 17, 
		RULE_aBoolean = 18, RULE_default = 19, RULE_def = 20, RULE_names = 21, 
		RULE_strings = 22, RULE_fileStrings = 23, RULE_longs = 24, RULE_ints = 25, 
		RULE_floats = 26, RULE_doubles = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "allCode", "if", "for", "switch", "switchBlock", "switchOr", 
			"braceTo", "dec", "code", "val", "var", "operation", "prentheses", "prenthesesOperation", 
			"brackets", "brace", "prenthesesBoolean", "aBoolean", "default", "def", 
			"names", "strings", "fileStrings", "longs", "ints", "floats", "doubles"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'for'", "'switch'", "'when'", "'{'", "'}'", "':'", "'val'", 
			"'var'", "'('", "')'", "'['", "']'", "'<='", "'=>'", "'=='", "'<>'", 
			"'<'", "'>'", "'&&'", "'||'", "','", null, null, null, null, null, null, 
			null, null, null, null, null, "'<-'", "'->'", "';'", "'+'", "'-'", "'*'", 
			"'/'", null, null, "':::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
			"WS", "COMMENT", "LINE_COMMENT", "INT", "LONG", "DOUBLE", "FLOAT", "NAME", 
			"STRING", "FSTRING", "LA", "RA", "END", "PLUS", "REDUCE", "RIDE", "DIVIDE", 
			"COMPARER", "MOVE", "LAMBDA"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CnwCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public List<AllCodeContext> allCode() {
			return getRuleContexts(AllCodeContext.class);
		}
		public AllCodeContext allCode(int i) {
			return getRuleContext(AllCodeContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				allCode();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 17054041886L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllCodeContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public AllCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterAllCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitAllCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitAllCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllCodeContext allCode() throws RecognitionException {
		AllCodeContext _localctx = new AllCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_allCode);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				code();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				if_();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				for_();
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				switch_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public DefaultContext default_() {
			return getRuleContext(DefaultContext.class,0);
		}
		public BraceToContext braceTo() {
			return getRuleContext(BraceToContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(68);
			default_();
			setState(69);
			braceTo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public BraceToContext braceTo() {
			return getRuleContext(BraceToContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__1);
			setState(72);
			dec();
			setState(73);
			braceTo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public DefaultContext default_() {
			return getRuleContext(DefaultContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			default_();
			setState(77);
			switchBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchOrContext> switchOr() {
			return getRuleContexts(SwitchOrContext.class);
		}
		public SwitchOrContext switchOr(int i) {
			return getRuleContext(SwitchOrContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					switchOr();
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 17054041088L) != 0 );
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchOrContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public AllCodeContext allCode() {
			return getRuleContext(AllCodeContext.class,0);
		}
		public BraceToContext braceTo() {
			return getRuleContext(BraceToContext.class,0);
		}
		public SwitchOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterSwitchOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitSwitchOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitSwitchOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchOrContext switchOr() throws RecognitionException {
		SwitchOrContext _localctx = new SwitchOrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switchOr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(90);
				def();
				setState(91);
				match(T__6);
				setState(92);
				allCode();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(94);
				def();
				setState(95);
				match(T__6);
				setState(96);
				braceTo();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BraceToContext extends ParserRuleContext {
		public AllCodeContext allCode() {
			return getRuleContext(AllCodeContext.class,0);
		}
		public BraceToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterBraceTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitBraceTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitBraceTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceToContext braceTo() throws RecognitionException {
		BraceToContext _localctx = new BraceToContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_braceTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__4);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(101);
				allCode();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public DefaultContext last;
		public DefaultContext next;
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public TerminalNode LA() { return getToken(CnwCodeParser.LA, 0); }
		public TerminalNode RA() { return getToken(CnwCodeParser.RA, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((DecContext)_localctx).last = default_();
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==LA || _la==RA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			((DecContext)_localctx).next = default_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode END() { return getToken(CnwCodeParser.END, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			dec();
			setState(112);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__7);
			setState(115);
			names();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			names();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CnwCodeParser.PLUS, 0); }
		public TerminalNode REDUCE() { return getToken(CnwCodeParser.REDUCE, 0); }
		public TerminalNode RIDE() { return getToken(CnwCodeParser.RIDE, 0); }
		public TerminalNode DIVIDE() { return getToken(CnwCodeParser.DIVIDE, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			def();
			setState(121);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrenthesesContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public PrenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterPrentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitPrentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitPrentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrenthesesContext prentheses() throws RecognitionException {
		PrenthesesContext _localctx = new PrenthesesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);
			setState(125);
			code();
			setState(126);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrenthesesOperationContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrenthesesOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prenthesesOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterPrenthesesOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitPrenthesesOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitPrenthesesOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrenthesesOperationContext prenthesesOperation() throws RecognitionException {
		PrenthesesOperationContext _localctx = new PrenthesesOperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prenthesesOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			operation();
			setState(130);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__11);
			setState(133);
			code();
			setState(134);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BraceContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public BraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceContext brace() throws RecognitionException {
		BraceContext _localctx = new BraceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__4);
			setState(137);
			code();
			setState(138);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrenthesesBooleanContext extends ParserRuleContext {
		public ABooleanContext aBoolean() {
			return getRuleContext(ABooleanContext.class,0);
		}
		public PrenthesesBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prenthesesBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterPrenthesesBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitPrenthesesBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitPrenthesesBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrenthesesBooleanContext prenthesesBoolean() throws RecognitionException {
		PrenthesesBooleanContext _localctx = new PrenthesesBooleanContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prenthesesBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			aBoolean();
			setState(142);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ABooleanContext extends ParserRuleContext {
		public DefContext pre;
		public DefContext sub;
		public DefContext b;
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ABooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterABoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitABoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitABoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ABooleanContext aBoolean() throws RecognitionException {
		ABooleanContext _localctx = new ABooleanContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aBoolean);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(144);
				((ABooleanContext)_localctx).pre = def();
				setState(145);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4177920L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				((ABooleanContext)_localctx).sub = def();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((ABooleanContext)_localctx).b = def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public ABooleanContext aBoolean() {
			return getRuleContext(ABooleanContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_default);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				aBoolean();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				var();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				val();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public FileStringsContext fileStrings() {
			return getRuleContext(FileStringsContext.class,0);
		}
		public LongsContext longs() {
			return getRuleContext(LongsContext.class,0);
		}
		public IntsContext ints() {
			return getRuleContext(IntsContext.class,0);
		}
		public FloatsContext floats() {
			return getRuleContext(FloatsContext.class,0);
		}
		public DoublesContext doubles() {
			return getRuleContext(DoublesContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(CnwCodeParser.BOOLEAN, 0); }
		public PrenthesesBooleanContext prenthesesBoolean() {
			return getRuleContext(PrenthesesBooleanContext.class,0);
		}
		public PrenthesesOperationContext prenthesesOperation() {
			return getRuleContext(PrenthesesOperationContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_def);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				strings();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				fileStrings();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				longs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				ints();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				floats();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				doubles();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				names();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				match(BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				prenthesesBoolean();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				prenthesesOperation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamesContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CnwCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CnwCodeParser.NAME, i);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_names);
		try {
			int _alt;
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						match(NAME);
						setState(172);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(175); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(177);
				match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(CnwCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CnwCodeParser.STRING, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_strings);
		try {
			int _alt;
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(181);
						match(STRING);
						setState(182);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(187);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FileStringsContext extends ParserRuleContext {
		public List<TerminalNode> FSTRING() { return getTokens(CnwCodeParser.FSTRING); }
		public TerminalNode FSTRING(int i) {
			return getToken(CnwCodeParser.FSTRING, i);
		}
		public FileStringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterFileStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitFileStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitFileStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileStringsContext fileStrings() throws RecognitionException {
		FileStringsContext _localctx = new FileStringsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fileStrings);
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(FSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(191);
						match(FSTRING);
						setState(192);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(195); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(197);
				match(FSTRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LongsContext extends ParserRuleContext {
		public List<TerminalNode> LONG() { return getTokens(CnwCodeParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CnwCodeParser.LONG, i);
		}
		public LongsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterLongs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitLongs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitLongs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongsContext longs() throws RecognitionException {
		LongsContext _localctx = new LongsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_longs);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(LONG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(201);
						match(LONG);
						setState(202);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(207);
				match(LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(CnwCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CnwCodeParser.INT, i);
		}
		public IntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntsContext ints() throws RecognitionException {
		IntsContext _localctx = new IntsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ints);
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(211);
						match(INT);
						setState(212);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(217);
				match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatsContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(CnwCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CnwCodeParser.FLOAT, i);
		}
		public FloatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterFloats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitFloats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitFloats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatsContext floats() throws RecognitionException {
		FloatsContext _localctx = new FloatsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floats);
		try {
			int _alt;
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						match(FLOAT);
						setState(222);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(225); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(227);
				match(FLOAT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoublesContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE() { return getTokens(CnwCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CnwCodeParser.DOUBLE, i);
		}
		public DoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).enterDoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeListener) ((CnwCodeListener)listener).exitDoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeVisitor ) return ((CnwCodeVisitor<? extends T>)visitor).visitDoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublesContext doubles() throws RecognitionException {
		DoublesContext _localctx = new DoublesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doubles);
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(DOUBLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(231);
						match(DOUBLE);
						setState(232);
						match(T__21);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(235); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(237);
				match(DOUBLE);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0004\u0005R\b\u0005\u000b\u0005\f\u0005S\u0001\u0005\u0003\u0005"+
		"W\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"c\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0096\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u009d\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00a9\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u00ae\b\u0015\u000b\u0015\f\u0015\u00af"+
		"\u0001\u0015\u0003\u0015\u00b3\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u00b8\b\u0016\u000b\u0016\f\u0016\u00b9\u0001\u0016\u0003"+
		"\u0016\u00bd\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u00c2"+
		"\b\u0017\u000b\u0017\f\u0017\u00c3\u0001\u0017\u0003\u0017\u00c7\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u00cc\b\u0018\u000b\u0018"+
		"\f\u0018\u00cd\u0001\u0018\u0003\u0018\u00d1\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u00d6\b\u0019\u000b\u0019\f\u0019\u00d7"+
		"\u0001\u0019\u0003\u0019\u00db\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u00e0\b\u001a\u000b\u001a\f\u001a\u00e1\u0001\u001a\u0003"+
		"\u001a\u00e5\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u00ea"+
		"\b\u001b\u000b\u001b\f\u001b\u00eb\u0001\u001b\u0003\u001b\u00ef\b\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0004\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\"#\u0001\u0000%(\u0001\u0000\u000e\u0015"+
		"\u00f8\u00009\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004"+
		"C\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000e"+
		"d\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012o\u0001"+
		"\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000"+
		"\u0000\u0018x\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c"+
		"\u0080\u0001\u0000\u0000\u0000\u001e\u0084\u0001\u0000\u0000\u0000 \u0088"+
		"\u0001\u0000\u0000\u0000\"\u008c\u0001\u0000\u0000\u0000$\u0095\u0001"+
		"\u0000\u0000\u0000&\u009c\u0001\u0000\u0000\u0000(\u00a8\u0001\u0000\u0000"+
		"\u0000*\u00b2\u0001\u0000\u0000\u0000,\u00bc\u0001\u0000\u0000\u0000."+
		"\u00c6\u0001\u0000\u0000\u00000\u00d0\u0001\u0000\u0000\u00002\u00da\u0001"+
		"\u0000\u0000\u00004\u00e4\u0001\u0000\u0000\u00006\u00ee\u0001\u0000\u0000"+
		"\u00008:\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0001"+
		"\u0001\u0000\u0000\u0000=B\u0003\u0012\t\u0000>B\u0003\u0004\u0002\u0000"+
		"?B\u0003\u0006\u0003\u0000@B\u0003\b\u0004\u0000A=\u0001\u0000\u0000\u0000"+
		"A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0003"+
		"&\u0013\u0000EF\u0003\u000e\u0007\u0000F\u0005\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0002\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0003\u000e\u0007\u0000"+
		"J\u0007\u0001\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000LM\u0003&\u0013"+
		"\u0000MN\u0003\n\u0005\u0000N\t\u0001\u0000\u0000\u0000OV\u0005\u0005"+
		"\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000"+
		"\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0003(\u0014\u0000[\\\u0005\u0007"+
		"\u0000\u0000\\]\u0003\u0002\u0001\u0000]c\u0001\u0000\u0000\u0000^_\u0003"+
		"(\u0014\u0000_`\u0005\u0007\u0000\u0000`a\u0003\u000e\u0007\u0000ac\u0001"+
		"\u0000\u0000\u0000bZ\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"c\r\u0001\u0000\u0000\u0000dg\u0005\u0005\u0000\u0000eh\u0003\u0002\u0001"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0006\u0000\u0000j\u000f"+
		"\u0001\u0000\u0000\u0000kl\u0003&\u0013\u0000lm\u0007\u0001\u0000\u0000"+
		"mn\u0003&\u0013\u0000n\u0011\u0001\u0000\u0000\u0000op\u0003\u0010\b\u0000"+
		"pq\u0005$\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0005\b\u0000\u0000"+
		"st\u0003*\u0015\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0005\t\u0000\u0000"+
		"vw\u0003*\u0015\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0003(\u0014\u0000"+
		"yz\u0007\u0002\u0000\u0000z{\u0003(\u0014\u0000{\u0019\u0001\u0000\u0000"+
		"\u0000|}\u0005\n\u0000\u0000}~\u0003\u0012\t\u0000~\u007f\u0005\u000b"+
		"\u0000\u0000\u007f\u001b\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n\u0000"+
		"\u0000\u0081\u0082\u0003\u0018\f\u0000\u0082\u0083\u0005\u000b\u0000\u0000"+
		"\u0083\u001d\u0001\u0000\u0000\u0000\u0084\u0085\u0005\f\u0000\u0000\u0085"+
		"\u0086\u0003\u0012\t\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u001f"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u008a"+
		"\u0003\u0012\t\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b!\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e\u0003$"+
		"\u0012\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f#\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003(\u0014\u0000\u0091\u0092\u0007\u0003\u0000\u0000"+
		"\u0092\u0093\u0003(\u0014\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0003(\u0014\u0000\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096%\u0001\u0000\u0000\u0000\u0097\u009d\u0003"+
		"(\u0014\u0000\u0098\u009d\u0003$\u0012\u0000\u0099\u009d\u0003\u0018\f"+
		"\u0000\u009a\u009d\u0003\u0016\u000b\u0000\u009b\u009d\u0003\u0014\n\u0000"+
		"\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\'\u0001\u0000\u0000\u0000\u009e"+
		"\u00a9\u0003,\u0016\u0000\u009f\u00a9\u0003.\u0017\u0000\u00a0\u00a9\u0003"+
		"0\u0018\u0000\u00a1\u00a9\u00032\u0019\u0000\u00a2\u00a9\u00034\u001a"+
		"\u0000\u00a3\u00a9\u00036\u001b\u0000\u00a4\u00a9\u0003*\u0015\u0000\u00a5"+
		"\u00a9\u0005\u0017\u0000\u0000\u00a6\u00a9\u0003\"\u0011\u0000\u00a7\u00a9"+
		"\u0003\u001c\u000e\u0000\u00a8\u009e\u0001\u0000\u0000\u0000\u00a8\u009f"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9)\u0001\u0000\u0000\u0000\u00aa\u00b3\u0005"+
		"\u001f\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac\u00ae\u0005"+
		"\u0016\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005"+
		"\u001f\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b3+\u0001\u0000\u0000\u0000\u00b4\u00bd\u0005 \u0000"+
		"\u0000\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00b8\u0005\u0016\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005 \u0000\u0000\u00bc"+
		"\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bd"+
		"-\u0001\u0000\u0000\u0000\u00be\u00c7\u0005!\u0000\u0000\u00bf\u00c0\u0005"+
		"!\u0000\u0000\u00c0\u00c2\u0005\u0016\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0005!\u0000\u0000\u00c6\u00be\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7/\u0001\u0000\u0000\u0000"+
		"\u00c8\u00d1\u0005\u001c\u0000\u0000\u00c9\u00ca\u0005\u001c\u0000\u0000"+
		"\u00ca\u00cc\u0005\u0016\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0005\u001c\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d11\u0001\u0000\u0000\u0000\u00d2"+
		"\u00db\u0005\u001b\u0000\u0000\u00d3\u00d4\u0005\u001b\u0000\u0000\u00d4"+
		"\u00d6\u0005\u0016\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0005\u001b\u0000\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00da"+
		"\u00d5\u0001\u0000\u0000\u0000\u00db3\u0001\u0000\u0000\u0000\u00dc\u00e5"+
		"\u0005\u001e\u0000\u0000\u00dd\u00de\u0005\u001e\u0000\u0000\u00de\u00e0"+
		"\u0005\u0016\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0005\u001e\u0000\u0000\u00e4\u00dc\u0001\u0000\u0000\u0000\u00e4\u00df"+
		"\u0001\u0000\u0000\u0000\u00e55\u0001\u0000\u0000\u0000\u00e6\u00ef\u0005"+
		"\u001d\u0000\u0000\u00e7\u00e8\u0005\u001d\u0000\u0000\u00e8\u00ea\u0005"+
		"\u0016\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005"+
		"\u001d\u0000\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ee\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ef7\u0001\u0000\u0000\u0000\u0017;ASVbg\u0095\u009c"+
		"\u00a8\u00af\u00b2\u00b9\u00bc\u00c3\u00c6\u00cd\u00d0\u00d7\u00da\u00e1"+
		"\u00e4\u00eb\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}