package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CnwParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, COMMENT=5, LINE_COMMENT=6, LONG=7, DOUBLE=8, 
		FLOAT=9, INT=10, NAME=11, STRING=12, LA=13, RA=14;
	public static final int
		RULE_cnw = 0, RULE_val = 1, RULE_var = 2, RULE_field = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"cnw", "val", "var", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'val'", "';'", "'var'", null, null, null, null, null, null, null, 
			null, null, "'<-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", "LONG", "DOUBLE", 
			"FLOAT", "INT", "NAME", "STRING", "LA", "RA"
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


	    public static final Map<String, Map<String, Object>> VarOrValNameObjectMap = new HashMap<>();
	    public static Object temp = null;
	    public static void a(String hasV, String hasV2, String name, Object o) {
	        if(!VarOrValNameObjectMap.get(hasV).containsKey(name)) {
	            VarOrValNameObjectMap.get(hasV2).put(name, temp);
	        }
	    }

	    public static void b(String hasV2, String hasV, String name, Object o) {
	        if(!VarOrValNameObjectMap.get(hasV2).containsKey(name)) {
	            VarOrValNameObjectMap.get(hasV).put(name, temp);
	        } else {
	            VarOrValNameObjectMap.remove(hasV2);
	            VarOrValNameObjectMap.get(hasV).put(name, temp);
	        }
	    }

	public CnwParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CnwContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public CnwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterCnw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitCnw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor ) return ((CnwVisitor<? extends T>)visitor).visitCnw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CnwContext cnw() throws RecognitionException {
		CnwContext _localctx = new CnwContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cnw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case LONG:
				case DOUBLE:
				case FLOAT:
				case INT:
				case STRING:
					{
					setState(8);
					var();
					}
					break;
				case T__0:
					{
					setState(9);
					val();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 6026L) != 0 );
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
		public Token name;
		public TerminalNode LA() { return getToken(CnwParser.LA, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CnwParser.NAME, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor ) return ((CnwVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			((ValContext)_localctx).name = match(NAME);
			setState(16);
			match(LA);
			setState(17);
			field();
			 b("var", "val", (((ValContext)_localctx).name!=null?((ValContext)_localctx).name.getText():null), temp); 
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public Token name;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode RA() { return getToken(CnwParser.RA, 0); }
		public TerminalNode NAME() { return getToken(CnwParser.NAME, 0); }
		public TerminalNode LA() { return getToken(CnwParser.LA, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor ) return ((CnwVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(21);
				match(T__2);
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(22);
					((VarContext)_localctx).name = match(NAME);
					 a("val", "var", (((VarContext)_localctx).name!=null?((VarContext)_localctx).name.getText():null), null); 
					}
					break;
				case 2:
					{
					{
					setState(24);
					((VarContext)_localctx).name = match(NAME);
					setState(25);
					match(LA);
					setState(26);
					field();
					 a("val", "var", (((VarContext)_localctx).name!=null?((VarContext)_localctx).name.getText():null), temp); 
					}
					}
					break;
				}
				}
				}
				break;
			case LONG:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				{
				{
				setState(31);
				field();
				setState(32);
				match(RA);
				setState(33);
				match(T__2);
				setState(34);
				match(NAME);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public Token str;
		public Token int_;
		public Token float_;
		public Token double_;
		public Token long_;
		public TerminalNode STRING() { return getToken(CnwParser.STRING, 0); }
		public TerminalNode INT() { return getToken(CnwParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CnwParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CnwParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(CnwParser.LONG, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor ) return ((CnwVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((FieldContext)_localctx).str = match(STRING);
				 temp = (((FieldContext)_localctx).str!=null?((FieldContext)_localctx).str.getText():null).substring((((FieldContext)_localctx).str!=null?((FieldContext)_localctx).str.getText():null).indexOf("\""), (((FieldContext)_localctx).str!=null?((FieldContext)_localctx).str.getText():null).lastIndexOf("\"")); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((FieldContext)_localctx).int_ = match(INT);
				 temp = Integer.parseInt((((FieldContext)_localctx).int_!=null?((FieldContext)_localctx).int_.getText():null)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((FieldContext)_localctx).float_ = match(FLOAT);
				 temp = Float.parseFloat((((FieldContext)_localctx).float_!=null?((FieldContext)_localctx).float_.getText():null)); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((FieldContext)_localctx).double_ = match(DOUBLE);
				 temp = Double.parseDouble((((FieldContext)_localctx).double_!=null?((FieldContext)_localctx).double_.getText():null)); 
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				((FieldContext)_localctx).long_ = match(LONG);
				 temp = Long.parseLong((((FieldContext)_localctx).long_!=null?((FieldContext)_localctx).long_.getText():null)); 
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
		"\u0004\u0001\u000e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u000b\b\u0000\u000b\u0000\f\u0000\f\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u001e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u00008\u0000\n"+
		"\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004$\u0001"+
		"\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b\u000b\u0003\u0004"+
		"\u0002\u0000\t\u000b\u0003\u0002\u0001\u0000\n\b\u0001\u0000\u0000\u0000"+
		"\n\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0010\u0005\u000b\u0000"+
		"\u0000\u0010\u0011\u0005\r\u0000\u0000\u0011\u0012\u0003\u0006\u0003\u0000"+
		"\u0012\u0013\u0006\u0001\uffff\uffff\u0000\u0013\u0014\u0005\u0002\u0000"+
		"\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u001d\u0005\u0003\u0000"+
		"\u0000\u0016\u0017\u0005\u000b\u0000\u0000\u0017\u001e\u0006\u0002\uffff"+
		"\uffff\u0000\u0018\u0019\u0005\u000b\u0000\u0000\u0019\u001a\u0005\r\u0000"+
		"\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0006\u0002\uffff"+
		"\uffff\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0016\u0001\u0000"+
		"\u0000\u0000\u001d\u0018\u0001\u0000\u0000\u0000\u001e%\u0001\u0000\u0000"+
		"\u0000\u001f \u0003\u0006\u0003\u0000 !\u0005\u000e\u0000\u0000!\"\u0005"+
		"\u0003\u0000\u0000\"#\u0005\u000b\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$\u0015\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'\u0005\u0001\u0000\u0000"+
		"\u0000()\u0005\f\u0000\u0000)3\u0006\u0003\uffff\uffff\u0000*+\u0005\n"+
		"\u0000\u0000+3\u0006\u0003\uffff\uffff\u0000,-\u0005\t\u0000\u0000-3\u0006"+
		"\u0003\uffff\uffff\u0000./\u0005\b\u0000\u0000/3\u0006\u0003\uffff\uffff"+
		"\u000001\u0005\u0007\u0000\u000013\u0006\u0003\uffff\uffff\u00002(\u0001"+
		"\u0000\u0000\u00002*\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u0000"+
		"2.\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u00003\u0007\u0001\u0000"+
		"\u0000\u0000\u0005\n\f\u001d$2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}