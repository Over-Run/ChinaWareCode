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
public class CnwCodeV2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, COMMENT=21, LINE_COMMENT=22, BOOLEAN=23, INT=24, 
		LONG=25, DOUBLE=26, FLOAT=27, NAME=28, STRING=29, FSTRING=30, BOOLEAN_CHARACTER=31;
	public static final int
		RULE_int = 0, RULE_ints = 1, RULE_long = 2, RULE_longs = 3, RULE_double = 4, 
		RULE_doubles = 5, RULE_float = 6, RULE_floats = 7, RULE_name = 8, RULE_names = 9, 
		RULE_string = 10, RULE_strings = 11, RULE_fstring = 12, RULE_fstrings = 13, 
		RULE_boolean = 14, RULE_booleans = 15, RULE_method = 16, RULE_def = 17, 
		RULE_booleanBlock = 18, RULE_booleanRight = 19, RULE_booleanBrace0 = 20, 
		RULE_vvg = 21, RULE_brace0 = 22, RULE_brace1 = 23, RULE_brace2 = 24, RULE_code = 25, 
		RULE_codeRight = 26, RULE_codeRights = 27, RULE_arrayC = 28, RULE_c = 29, 
		RULE_boolc = 30, RULE_fiw = 31, RULE_switch = 32, RULE_switchBlock = 33, 
		RULE_switchC = 34, RULE_fiwsBlock = 35, RULE_codeFIWS = 36, RULE_allCode = 37, 
		RULE_main = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"int", "ints", "long", "longs", "double", "doubles", "float", "floats", 
			"name", "names", "string", "strings", "fstring", "fstrings", "boolean", 
			"booleans", "method", "def", "booleanBlock", "booleanRight", "booleanBrace0", 
			"vvg", "brace0", "brace1", "brace2", "code", "codeRight", "codeRights", 
			"arrayC", "c", "boolc", "fiw", "switch", "switchBlock", "switchC", "fiwsBlock", 
			"codeFIWS", "allCode", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'var'", "'val'", "'global'", "'['", 
			"']'", "'{'", "'}'", "'<-'", "'->'", "'for'", "'if'", "'while'", "'switch'", 
			"':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
			"BOOLEAN", "INT", "LONG", "DOUBLE", "FLOAT", "NAME", "STRING", "FSTRING", 
			"BOOLEAN_CHARACTER"
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

	public CnwCodeV2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CnwCodeV2Parser.INT, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(INT);
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
		public List<TerminalNode> INT() { return getTokens(CnwCodeV2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CnwCodeV2Parser.INT, i);
		}
		public IntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntsContext ints() throws RecognitionException {
		IntsContext _localctx = new IntsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					match(INT);
					setState(81);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(86);
			match(INT);
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
	public static class LongContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(CnwCodeV2Parser.LONG, 0); }
		public LongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongContext long_() throws RecognitionException {
		LongContext _localctx = new LongContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LONG);
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
		public List<TerminalNode> LONG() { return getTokens(CnwCodeV2Parser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CnwCodeV2Parser.LONG, i);
		}
		public LongsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterLongs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitLongs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitLongs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongsContext longs() throws RecognitionException {
		LongsContext _localctx = new LongsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_longs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					match(LONG);
					setState(91);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(94); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(96);
			match(LONG);
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
	public static class DoubleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(CnwCodeV2Parser.DOUBLE, 0); }
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DOUBLE);
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
		public List<TerminalNode> DOUBLE() { return getTokens(CnwCodeV2Parser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CnwCodeV2Parser.DOUBLE, i);
		}
		public DoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterDoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitDoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitDoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublesContext doubles() throws RecognitionException {
		DoublesContext _localctx = new DoublesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doubles);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(100);
					match(DOUBLE);
					setState(101);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(106);
			match(DOUBLE);
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
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CnwCodeV2Parser.FLOAT, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FLOAT);
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
		public List<TerminalNode> FLOAT() { return getTokens(CnwCodeV2Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CnwCodeV2Parser.FLOAT, i);
		}
		public FloatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFloats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFloats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFloats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatsContext floats() throws RecognitionException {
		FloatsContext _localctx = new FloatsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					match(FLOAT);
					setState(111);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(116);
			match(FLOAT);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CnwCodeV2Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NAME);
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
		public List<TerminalNode> NAME() { return getTokens(CnwCodeV2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CnwCodeV2Parser.NAME, i);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(120);
					match(NAME);
					setState(121);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(126);
			match(NAME);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CnwCodeV2Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(STRING);
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
		public List<TerminalNode> STRING() { return getTokens(CnwCodeV2Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CnwCodeV2Parser.STRING, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_strings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
					match(STRING);
					setState(131);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(136);
			match(STRING);
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
	public static class FstringContext extends ParserRuleContext {
		public TerminalNode FSTRING() { return getToken(CnwCodeV2Parser.FSTRING, 0); }
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(FSTRING);
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
	public static class FstringsContext extends ParserRuleContext {
		public List<TerminalNode> FSTRING() { return getTokens(CnwCodeV2Parser.FSTRING); }
		public TerminalNode FSTRING(int i) {
			return getToken(CnwCodeV2Parser.FSTRING, i);
		}
		public FstringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFstrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFstrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFstrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringsContext fstrings() throws RecognitionException {
		FstringsContext _localctx = new FstringsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fstrings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(140);
					match(FSTRING);
					setState(141);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(146);
			match(FSTRING);
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
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CnwCodeV2Parser.BOOLEAN, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(BOOLEAN);
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
	public static class BooleansContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN() { return getTokens(CnwCodeV2Parser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(CnwCodeV2Parser.BOOLEAN, i);
		}
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleans);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					match(BOOLEAN);
					setState(151);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(156);
			match(BOOLEAN);
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
	public static class MethodContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CnwCodeV2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CnwCodeV2Parser.NAME, i);
		}
		public Brace0Context brace0() {
			return getRuleContext(Brace0Context.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					match(NAME);
					setState(159);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(164);
			match(NAME);
			setState(165);
			brace0();
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
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public IntsContext ints() {
			return getRuleContext(IntsContext.class,0);
		}
		public LongContext long_() {
			return getRuleContext(LongContext.class,0);
		}
		public LongsContext longs() {
			return getRuleContext(LongsContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public DoublesContext doubles() {
			return getRuleContext(DoublesContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public FloatsContext floats() {
			return getRuleContext(FloatsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public FstringContext fstring() {
			return getRuleContext(FstringContext.class,0);
		}
		public FstringsContext fstrings() {
			return getRuleContext(FstringsContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_def);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				int_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				ints();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				long_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				longs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				double_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				doubles();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				float_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				floats();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				names();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(177);
				string();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(178);
				strings();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(179);
				fstring();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(180);
				fstrings();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(181);
				boolean_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(182);
				booleans();
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
	public static class BooleanBlockContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<BooleanBrace0Context> booleanBrace0() {
			return getRuleContexts(BooleanBrace0Context.class);
		}
		public BooleanBrace0Context booleanBrace0(int i) {
			return getRuleContext(BooleanBrace0Context.class,i);
		}
		public TerminalNode BOOLEAN_CHARACTER() { return getToken(CnwCodeV2Parser.BOOLEAN_CHARACTER, 0); }
		public List<BooleanRightContext> booleanRight() {
			return getRuleContexts(BooleanRightContext.class);
		}
		public BooleanRightContext booleanRight(int i) {
			return getRuleContext(BooleanRightContext.class,i);
		}
		public BooleanBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBooleanBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBooleanBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBooleanBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanBlockContext booleanBlock() throws RecognitionException {
		BooleanBlockContext _localctx = new BooleanBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(185);
				def();
				}
				break;
			case T__2:
				{
				setState(186);
				booleanBrace0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(189);
				match(BOOLEAN_CHARACTER);
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_CHARACTER:
				{
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					booleanRight();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOLEAN_CHARACTER );
				}
				break;
			case T__2:
				{
				setState(198);
				booleanBrace0();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanRightContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_CHARACTER() { return getToken(CnwCodeV2Parser.BOOLEAN_CHARACTER, 0); }
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public BooleanRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBooleanRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBooleanRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBooleanRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanRightContext booleanRight() throws RecognitionException {
		BooleanRightContext _localctx = new BooleanRightContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BOOLEAN_CHARACTER);
			setState(202);
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
	public static class BooleanBrace0Context extends ParserRuleContext {
		public BooleanBlockContext booleanBlock() {
			return getRuleContext(BooleanBlockContext.class,0);
		}
		public BooleanBrace0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanBrace0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBooleanBrace0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBooleanBrace0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBooleanBrace0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanBrace0Context booleanBrace0() throws RecognitionException {
		BooleanBrace0Context _localctx = new BooleanBrace0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanBrace0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__2);
			setState(205);
			booleanBlock();
			setState(206);
			match(T__3);
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
	public static class VvgContext extends ParserRuleContext {
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vvg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterVvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitVvg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitVvg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VvgContext vvg() throws RecognitionException {
		VvgContext _localctx = new VvgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vvg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(209);
				names();
				}
				break;
			case 2:
				{
				setState(210);
				name();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brace0Context extends ParserRuleContext {
		public Brace0Context brace0() {
			return getRuleContext(Brace0Context.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Brace0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBrace0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBrace0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBrace0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brace0Context brace0() throws RecognitionException {
		Brace0Context _localctx = new Brace0Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_brace0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__2);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(214);
				brace0();
				}
				break;
			case 2:
				{
				setState(215);
				code();
				}
				break;
			case 3:
				{
				setState(216);
				def();
				}
				break;
			case 4:
				{
				}
				break;
			}
			setState(220);
			match(T__3);
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
	public static class Brace1Context extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Brace1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBrace1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBrace1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBrace1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brace1Context brace1() throws RecognitionException {
		Brace1Context _localctx = new Brace1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_brace1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__7);
			setState(223);
			def();
			setState(224);
			match(T__8);
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
	public static class Brace2Context extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Brace2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBrace2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBrace2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBrace2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brace2Context brace2() throws RecognitionException {
		Brace2Context _localctx = new Brace2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_brace2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__9);
			setState(227);
			main();
			setState(228);
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
	public static class CodeContext extends ParserRuleContext {
		public ArrayCContext arrayC() {
			return getRuleContext(ArrayCContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CodeRightContext codeRight() {
			return getRuleContext(CodeRightContext.class,0);
		}
		public CodeRightsContext codeRights() {
			return getRuleContext(CodeRightsContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(230);
				arrayC();
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(231);
				c();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(234);
				codeRight();
				}
				break;
			case 2:
				{
				setState(235);
				codeRights();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeRightContext extends ParserRuleContext {
		public ArrayCContext arrayC() {
			return getRuleContext(ArrayCContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CodeRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterCodeRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitCodeRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitCodeRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeRightContext codeRight() throws RecognitionException {
		CodeRightContext _localctx = new CodeRightContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_codeRight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(239);
				arrayC();
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(240);
				c();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeRightsContext extends ParserRuleContext {
		public List<CodeRightContext> codeRight() {
			return getRuleContexts(CodeRightContext.class);
		}
		public CodeRightContext codeRight(int i) {
			return getRuleContext(CodeRightContext.class,i);
		}
		public CodeRightsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeRights; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterCodeRights(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitCodeRights(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitCodeRights(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeRightsContext codeRights() throws RecognitionException {
		CodeRightsContext _localctx = new CodeRightsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_codeRights);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				codeRight();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==T__12 );
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
	public static class ArrayCContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public ArrayCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterArrayC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitArrayC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitArrayC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCContext arrayC() throws RecognitionException {
		ArrayCContext _localctx = new ArrayCContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__1);
			setState(249);
			c();
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
	public static class CContext extends ParserRuleContext {
		public VvgContext vvg() {
			return getRuleContext(VvgContext.class,0);
		}
		public BoolcContext boolc() {
			return getRuleContext(BoolcContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_c);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				vvg();
				}
				break;
			case T__2:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				boolc();
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
	public static class BoolcContext extends ParserRuleContext {
		public BooleanBlockContext booleanBlock() {
			return getRuleContext(BooleanBlockContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Brace0Context brace0() {
			return getRuleContext(Brace0Context.class,0);
		}
		public BoolcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterBoolc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitBoolc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitBoolc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolcContext boolc() throws RecognitionException {
		BoolcContext _localctx = new BoolcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_boolc);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				booleanBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				brace0();
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
	public static class FiwContext extends ParserRuleContext {
		public CodeFIWSContext codeFIWS() {
			return getRuleContext(CodeFIWSContext.class,0);
		}
		public FiwsBlockContext fiwsBlock() {
			return getRuleContext(FiwsBlockContext.class,0);
		}
		public FiwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFiw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFiw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFiw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiwContext fiw() throws RecognitionException {
		FiwContext _localctx = new FiwContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fiw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			codeFIWS();
			setState(262);
			fiwsBlock();
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
		public CContext c() {
			return getRuleContext(CContext.class,0);
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
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__16);
			setState(265);
			c();
			setState(266);
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
		public SwitchCContext switchC() {
			return getRuleContext(SwitchCContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__9);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(269);
				switchC();
				}
				break;
			case T__10:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
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
	public static class SwitchCContext extends ParserRuleContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public FiwsBlockContext fiwsBlock() {
			return getRuleContext(FiwsBlockContext.class,0);
		}
		public SwitchCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterSwitchC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitSwitchC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitSwitchC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCContext switchC() throws RecognitionException {
		SwitchCContext _localctx = new SwitchCContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			c();
			setState(276);
			match(T__17);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(277);
				fiwsBlock();
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case BOOLEAN:
			case INT:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case NAME:
			case STRING:
			case FSTRING:
				{
				setState(278);
				c();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FiwsBlockContext extends ParserRuleContext {
		public Brace2Context brace2() {
			return getRuleContext(Brace2Context.class,0);
		}
		public FiwsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiwsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterFiwsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitFiwsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitFiwsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiwsBlockContext fiwsBlock() throws RecognitionException {
		FiwsBlockContext _localctx = new FiwsBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fiwsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			brace2();
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
	public static class CodeFIWSContext extends ParserRuleContext {
		public CodeRightContext codeRight() {
			return getRuleContext(CodeRightContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public VvgContext vvg() {
			return getRuleContext(VvgContext.class,0);
		}
		public Brace0Context brace0() {
			return getRuleContext(Brace0Context.class,0);
		}
		public BooleanBlockContext booleanBlock() {
			return getRuleContext(BooleanBlockContext.class,0);
		}
		public CodeFIWSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeFIWS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterCodeFIWS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitCodeFIWS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitCodeFIWS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeFIWSContext codeFIWS() throws RecognitionException {
		CodeFIWSContext _localctx = new CodeFIWSContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_codeFIWS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(283);
				def();
				}
				break;
			case 2:
				{
				setState(284);
				vvg();
				}
				break;
			case 3:
				{
				setState(285);
				brace0();
				}
				break;
			case 4:
				{
				setState(286);
				booleanBlock();
				}
				break;
			}
			setState(289);
			codeRight();
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
		public VvgContext vvg() {
			return getRuleContext(VvgContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public AllCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterAllCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitAllCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitAllCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllCodeContext allCode() throws RecognitionException {
		AllCodeContext _localctx = new AllCodeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_allCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(291);
				code();
				}
				break;
			case 2:
				{
				setState(292);
				vvg();
				}
				break;
			case 3:
				{
				setState(293);
				method();
				}
				break;
			}
			setState(296);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public List<AllCodeContext> allCode() {
			return getRuleContexts(AllCodeContext.class);
		}
		public AllCodeContext allCode(int i) {
			return getRuleContext(AllCodeContext.class,i);
		}
		public List<FiwContext> fiw() {
			return getRuleContexts(FiwContext.class);
		}
		public FiwContext fiw(int i) {
			return getRuleContext(FiwContext.class,i);
		}
		public List<SwitchContext> switch_() {
			return getRuleContexts(SwitchContext.class);
		}
		public SwitchContext switch_(int i) {
			return getRuleContext(SwitchContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwCodeV2Listener) ((CnwCodeV2Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwCodeV2Visitor ) return ((CnwCodeV2Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_main);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
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
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(301);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__4:
					case T__5:
					case T__6:
					case BOOLEAN:
					case INT:
					case LONG:
					case DOUBLE:
					case FLOAT:
					case NAME:
					case STRING:
					case FSTRING:
						{
						setState(298);
						allCode();
						}
						break;
					case T__13:
					case T__14:
					case T__15:
						{
						setState(299);
						fiw();
						}
						break;
					case T__16:
						{
						setState(300);
						switch_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2139341036L) != 0 );
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001S\b\u0001\u000b\u0001"+
		"\f\u0001T\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003]\b\u0003\u000b\u0003\f\u0003^\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005g\b"+
		"\u0005\u000b\u0005\f\u0005h\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0004\u0007q\b\u0007\u000b\u0007\f\u0007"+
		"r\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t{\b\t"+
		"\u000b\t\f\t|\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0085\b\u000b\u000b\u000b\f\u000b\u0086\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u008f\b\r\u000b\r\f\r\u0090"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0099\b\u000f\u000b\u000f\f\u000f\u009a\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00a1\b\u0010\u000b\u0010\f\u0010"+
		"\u00a2\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00b8\b\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00bc\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c0\b\u0012"+
		"\u0001\u0012\u0004\u0012\u00c3\b\u0012\u000b\u0012\f\u0012\u00c4\u0001"+
		"\u0012\u0003\u0012\u00c8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00d4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00db\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00e9\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00ed\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00f2\b\u001a\u0001\u001b\u0004\u001b\u00f5\b\u001b"+
		"\u000b\u001b\f\u001b\u00f6\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u00fe\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0103\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0110\b!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0118\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0003$\u0120\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0003%\u0127\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0004&\u012e"+
		"\b&\u000b&\f&\u012f\u0001&\u0003&\u0133\b&\u0001&\u0000\u0000\'\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0003\u0001\u0000\u0005\u0007\u0001"+
		"\u0000\f\r\u0001\u0000\u000e\u0010\u013f\u0000N\u0001\u0000\u0000\u0000"+
		"\u0002R\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006\\"+
		"\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000"+
		"\u0000\fl\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010"+
		"v\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0080\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u008a\u0001"+
		"\u0000\u0000\u0000\u001a\u008e\u0001\u0000\u0000\u0000\u001c\u0094\u0001"+
		"\u0000\u0000\u0000\u001e\u0098\u0001\u0000\u0000\u0000 \u00a0\u0001\u0000"+
		"\u0000\u0000\"\u00b7\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000\u0000"+
		"\u0000&\u00c9\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000\u0000*"+
		"\u00d0\u0001\u0000\u0000\u0000,\u00d5\u0001\u0000\u0000\u0000.\u00de\u0001"+
		"\u0000\u0000\u00000\u00e2\u0001\u0000\u0000\u00002\u00e8\u0001\u0000\u0000"+
		"\u00004\u00ee\u0001\u0000\u0000\u00006\u00f4\u0001\u0000\u0000\u00008"+
		"\u00f8\u0001\u0000\u0000\u0000:\u00fd\u0001\u0000\u0000\u0000<\u0102\u0001"+
		"\u0000\u0000\u0000>\u0104\u0001\u0000\u0000\u0000@\u0108\u0001\u0000\u0000"+
		"\u0000B\u010c\u0001\u0000\u0000\u0000D\u0113\u0001\u0000\u0000\u0000F"+
		"\u0119\u0001\u0000\u0000\u0000H\u011f\u0001\u0000\u0000\u0000J\u0126\u0001"+
		"\u0000\u0000\u0000L\u0132\u0001\u0000\u0000\u0000NO\u0005\u0018\u0000"+
		"\u0000O\u0001\u0001\u0000\u0000\u0000PQ\u0005\u0018\u0000\u0000QS\u0005"+
		"\u0001\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0018\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0019\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0005\u0019\u0000"+
		"\u0000[]\u0005\u0001\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0019\u0000\u0000a\u0007\u0001\u0000\u0000"+
		"\u0000bc\u0005\u001a\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005\u001a"+
		"\u0000\u0000eg\u0005\u0001\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0005\u001a\u0000\u0000k\u000b\u0001\u0000"+
		"\u0000\u0000lm\u0005\u001b\u0000\u0000m\r\u0001\u0000\u0000\u0000no\u0005"+
		"\u001b\u0000\u0000oq\u0005\u0001\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0005\u001b\u0000\u0000u\u000f\u0001"+
		"\u0000\u0000\u0000vw\u0005\u001c\u0000\u0000w\u0011\u0001\u0000\u0000"+
		"\u0000xy\u0005\u001c\u0000\u0000y{\u0005\u0001\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\u001c\u0000"+
		"\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001d\u0000"+
		"\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001d\u0000"+
		"\u0000\u0083\u0085\u0005\u0001\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u001d\u0000\u0000\u0089\u0017\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u001e\u0000\u0000\u008b\u0019\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008f\u0005\u0001\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001e\u0000"+
		"\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0017\u0000"+
		"\u0000\u0095\u001d\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0017\u0000"+
		"\u0000\u0097\u0099\u0005\u0001\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u001f\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u001c\u0000\u0000\u009f\u00a1\u0005\u0002\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u001c\u0000"+
		"\u0000\u00a5\u00a6\u0003,\u0016\u0000\u00a6!\u0001\u0000\u0000\u0000\u00a7"+
		"\u00b8\u0003\u0000\u0000\u0000\u00a8\u00b8\u0003\u0002\u0001\u0000\u00a9"+
		"\u00b8\u0003\u0004\u0002\u0000\u00aa\u00b8\u0003\u0006\u0003\u0000\u00ab"+
		"\u00b8\u0003\b\u0004\u0000\u00ac\u00b8\u0003\n\u0005\u0000\u00ad\u00b8"+
		"\u0003\f\u0006\u0000\u00ae\u00b8\u0003\u000e\u0007\u0000\u00af\u00b8\u0003"+
		"\u0010\b\u0000\u00b0\u00b8\u0003\u0012\t\u0000\u00b1\u00b8\u0003\u0014"+
		"\n\u0000\u00b2\u00b8\u0003\u0016\u000b\u0000\u00b3\u00b8\u0003\u0018\f"+
		"\u0000\u00b4\u00b8\u0003\u001a\r\u0000\u00b5\u00b8\u0003\u001c\u000e\u0000"+
		"\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7\u00a7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00a8\u0001\u0000\u0000\u0000\u00b7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00aa\u0001\u0000\u0000\u0000\u00b7\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ac\u0001\u0000\u0000\u0000\u00b7\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8#\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0003\"\u0011\u0000\u00ba\u00bc\u0003(\u0014\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0005\u001f\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c7\u0001\u0000\u0000\u0000\u00c1\u00c3"+
		"\u0003&\u0013\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003"+
		"(\u0014\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8%\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001f\u0000"+
		"\u0000\u00ca\u00cb\u0003\"\u0011\u0000\u00cb\'\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce\u0003$\u0012\u0000\u00ce"+
		"\u00cf\u0005\u0004\u0000\u0000\u00cf)\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0007\u0000\u0000\u0000\u00d1\u00d4\u0003\u0012\t\u0000\u00d2\u00d4\u0003"+
		"\u0010\b\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4+\u0001\u0000\u0000\u0000\u00d5\u00da\u0005\u0003\u0000"+
		"\u0000\u00d6\u00db\u0003,\u0016\u0000\u00d7\u00db\u00032\u0019\u0000\u00d8"+
		"\u00db\u0003\"\u0011\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d6"+
		"\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd-\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0003\""+
		"\u0011\u0000\u00e0\u00e1\u0005\t\u0000\u0000\u00e1/\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0003L&\u0000\u00e4"+
		"\u00e5\u0005\u000b\u0000\u0000\u00e51\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u00038\u001c\u0000\u00e7\u00e9\u0003:\u001d\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u00034\u001a\u0000\u00eb\u00ed\u00036\u001b\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed3\u0001\u0000\u0000\u0000\u00ee\u00f1\u0007\u0001\u0000\u0000\u00ef"+
		"\u00f2\u00038\u001c\u0000\u00f0\u00f2\u0003:\u001d\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f25\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u00034\u001a\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f77\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u00fa\u0003:\u001d\u0000\u00fa"+
		"9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003*\u0015\u0000\u00fc\u00fe\u0003"+
		"<\u001e\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe;\u0001\u0000\u0000\u0000\u00ff\u0103\u0003$\u0012\u0000"+
		"\u0100\u0103\u0003\"\u0011\u0000\u0101\u0103\u0003,\u0016\u0000\u0102"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0101\u0001\u0000\u0000\u0000\u0103=\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0007\u0002\u0000\u0000\u0105\u0106\u0003H$\u0000\u0106\u0107\u0003F"+
		"#\u0000\u0107?\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0011\u0000\u0000"+
		"\u0109\u010a\u0003:\u001d\u0000\u010a\u010b\u0003B!\u0000\u010bA\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0005\n\u0000\u0000\u010d\u0110\u0003D"+
		"\"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\u000b\u0000\u0000\u0112C\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0003:\u001d\u0000\u0114\u0117\u0005\u0012\u0000\u0000\u0115"+
		"\u0118\u0003F#\u0000\u0116\u0118\u0003:\u001d\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118E\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u00030\u0018\u0000\u011aG\u0001\u0000\u0000\u0000"+
		"\u011b\u0120\u0003\"\u0011\u0000\u011c\u0120\u0003*\u0015\u0000\u011d"+
		"\u0120\u0003,\u0016\u0000\u011e\u0120\u0003$\u0012\u0000\u011f\u011b\u0001"+
		"\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u00034\u001a\u0000\u0122I\u0001\u0000\u0000"+
		"\u0000\u0123\u0127\u00032\u0019\u0000\u0124\u0127\u0003*\u0015\u0000\u0125"+
		"\u0127\u0003 \u0010\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0013\u0000\u0000\u0129K\u0001"+
		"\u0000\u0000\u0000\u012a\u012e\u0003J%\u0000\u012b\u012e\u0003>\u001f"+
		"\u0000\u012c\u012e\u0003@ \u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u0133\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133M\u0001\u0000\u0000\u0000\u001dT^"+
		"hr|\u0086\u0090\u009a\u00a2\u00b7\u00bb\u00bf\u00c4\u00c7\u00d3\u00da"+
		"\u00e8\u00ec\u00f1\u00f6\u00fd\u0102\u010f\u0117\u011f\u0126\u012d\u012f"+
		"\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}