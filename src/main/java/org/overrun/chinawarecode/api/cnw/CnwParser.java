package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, BOOL_LITERAL=26, WS=27, COMMENT=28, LINE_COMMENT=29, LONG=30, 
		DOUBLE=31, FLOAT=32, INT=33, NAME=34, STRING=35, FSTRING=36, LA=37, RA=38, 
		END=39, PLUS=40, REDUCE=41, RIDE=42, DIVIDE=43;
	public static final int
		RULE_all = 0, RULE_expr = 1, RULE_if = 2, RULE_for = 3, RULE_switch = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"all", "expr", "if", "for", "switch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<='", "'=>'", "'<>'", "'=='", "'&&'", "'||'", "'<'", "'>'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "'val'", "'var'", "'global'", 
			"'if'", "'for'", "'switch'", "'when'", "'converter'", "':'", null, null, 
			null, null, null, null, null, null, null, null, null, "'<-'", "'->'", 
			"';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOL_LITERAL", "WS", "COMMENT", "LINE_COMMENT", "LONG", 
			"DOUBLE", "FLOAT", "INT", "NAME", "STRING", "FSTRING", "LA", "RA", "END", 
			"PLUS", "REDUCE", "RIDE", "DIVIDE"
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

	public CnwParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor) return ((CnwVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				expr(0);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 136465787392L) != 0 );
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext pre;
		public ExprContext sub;
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(CnwParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CnwParser.NAME, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CnwParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CnwParser.STRING, i);
		}
		public List<TerminalNode> FSTRING() { return getTokens(CnwParser.FSTRING); }
		public TerminalNode FSTRING(int i) {
			return getToken(CnwParser.FSTRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(CnwParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CnwParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(CnwParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CnwParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CnwParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CnwParser.DOUBLE, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CnwParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CnwParser.LONG, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(CnwParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(CnwParser.BOOL_LITERAL, i);
		}
		public TerminalNode LA() { return getToken(CnwParser.LA, 0); }
		public TerminalNode RA() { return getToken(CnwParser.RA, 0); }
		public TerminalNode PLUS() { return getToken(CnwParser.PLUS, 0); }
		public TerminalNode REDUCE() { return getToken(CnwParser.REDUCE, 0); }
		public TerminalNode RIDE() { return getToken(CnwParser.RIDE, 0); }
		public TerminalNode DIVIDE() { return getToken(CnwParser.DIVIDE, 0); }
		public TerminalNode END() { return getToken(CnwParser.END, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor) return ((CnwVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(16);
				if_();
				}
				break;
			case 2:
				{
				setState(17);
				for_();
				}
				break;
			case 3:
				{
				setState(18);
				switch_();
				}
				break;
			case 4:
				{
				setState(19);
				match(T__8);
				setState(20);
				expr(0);
				setState(21);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(23);
				match(T__10);
				setState(24);
				expr(0);
				setState(25);
				match(T__11);
				}
				break;
			case 6:
				{
				setState(27);
				match(T__12);
				setState(28);
				expr(0);
				setState(29);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(31);
					match(T__14);
					}
					break;
				case NAME:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35);
				match(NAME);
				}
				break;
			case 8:
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(36);
					match(T__14);
					}
					break;
				case NAME:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						match(NAME);
						setState(41);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(44); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(46);
				match(NAME);
				}
				break;
			case 9:
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(47);
					match(T__14);
					}
					break;
				case STRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(51);
				match(STRING);
				}
				break;
			case 10:
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(52);
					match(T__14);
					}
					break;
				case STRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(56);
						match(STRING);
						setState(57);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(62);
				match(STRING);
				}
				break;
			case 11:
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(63);
					match(T__14);
					}
					break;
				case FSTRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67);
				match(FSTRING);
				}
				break;
			case 12:
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(68);
					match(T__14);
					}
					break;
				case FSTRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(72);
						match(FSTRING);
						setState(73);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(78);
				match(FSTRING);
				}
				break;
			case 13:
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(79);
					match(T__14);
					}
					break;
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83);
				match(INT);
				}
				break;
			case 14:
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(84);
					match(T__14);
					}
					break;
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						match(INT);
						setState(89);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(94);
				match(INT);
				}
				break;
			case 15:
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(95);
					match(T__14);
					}
					break;
				case FLOAT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99);
				match(FLOAT);
				}
				break;
			case 16:
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(100);
					match(T__14);
					}
					break;
				case FLOAT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
						match(FLOAT);
						setState(105);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(108); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(110);
				match(FLOAT);
				}
				break;
			case 17:
				{
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(111);
					match(T__14);
					}
					break;
				case DOUBLE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115);
				match(DOUBLE);
				}
				break;
			case 18:
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(116);
					match(T__14);
					}
					break;
				case DOUBLE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						match(DOUBLE);
						setState(121);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(126);
				match(DOUBLE);
				}
				break;
			case 19:
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(127);
					match(T__14);
					}
					break;
				case LONG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				match(LONG);
				}
				break;
			case 20:
				{
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(132);
					match(T__14);
					}
					break;
				case LONG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						match(LONG);
						setState(137);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(142);
				match(LONG);
				}
				break;
			case 21:
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(143);
					match(T__14);
					}
					break;
				case BOOL_LITERAL:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147);
				match(BOOL_LITERAL);
				}
				break;
			case 22:
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(148);
					match(T__14);
					}
					break;
				case BOOL_LITERAL:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						match(BOOL_LITERAL);
						setState(153);
						match(T__15);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(156); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(158);
				match(BOOL_LITERAL);
				}
				break;
			case 23:
				{
				setState(159);
				match(T__16);
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(160);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(163); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(161);
							match(NAME);
							setState(162);
							match(T__15);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(165); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(167);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 24:
				{
				setState(170);
				match(T__17);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(171);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(174); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(172);
							match(NAME);
							setState(173);
							match(T__15);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(176); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(178);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 25:
				{
				setState(181);
				match(T__18);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(182);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(185); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(183);
							match(NAME);
							setState(184);
							match(T__15);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(187); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(189);
					match(NAME);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==LA || _la==RA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						((ExprContext)_localctx).sub = expr(26);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(198);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						((ExprContext)_localctx).sub = expr(25);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(201);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						((ExprContext)_localctx).sub = expr(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(204);
						match(END);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor) return ((CnwVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__19);
			setState(211);
			expr(0);
			setState(212);
			match(T__12);
			setState(213);
			all();
			setState(214);
			match(T__13);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor) return ((CnwVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__20);
			setState(217);
			expr(0);
			setState(218);
			match(T__12);
			setState(219);
			all();
			setState(220);
			match(T__13);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CnwListener ) ((CnwListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CnwVisitor) return ((CnwVisitor<? extends T>)visitor).visitSwitch(this);
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
			setState(222);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			expr(0);
			setState(224);
			match(T__12);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				expr(0);
				setState(226);
				match(T__24);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(227);
					expr(0);
					}
					break;
				case 2:
					{
					{
					setState(228);
					match(T__12);
					setState(229);
					expr(0);
					setState(230);
					match(T__13);
					}
					}
					break;
				}
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 136465787392L) != 0 );
			setState(238);
			match(T__13);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 29);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001\f\u0001,\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00017\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001;\b\u0001"+
		"\u000b\u0001\f\u0001<\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"B\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001K\b\u0001\u000b\u0001\f\u0001L\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001R\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"[\b\u0001\u000b\u0001\f\u0001\\\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001k\b\u0001\u000b\u0001\f\u0001l\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001{\b\u0001\u000b\u0001\f\u0001|\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0082\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0087\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u008b\b\u0001\u000b"+
		"\u0001\f\u0001\u008c\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0092"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0097\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u009b\b\u0001\u000b\u0001\f\u0001"+
		"\u009c\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u00a4\b\u0001\u000b\u0001\f\u0001\u00a5\u0001\u0001\u0003\u0001"+
		"\u00a9\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u00af\b\u0001\u000b\u0001\f\u0001\u00b0\u0001\u0001\u0003\u0001\u00b4"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00ba"+
		"\b\u0001\u000b\u0001\f\u0001\u00bb\u0001\u0001\u0003\u0001\u00bf\b\u0001"+
		"\u0003\u0001\u00c1\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u00ce\b\u0001\n\u0001\f\u0001\u00d1\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e9\b\u0004\u0004"+
		"\u0004\u00eb\b\u0004\u000b\u0004\f\u0004\u00ec\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0000\u0001\u0002\u0005\u0000\u0002\u0004\u0006\b\u0000\u0004"+
		"\u0001\u0000%&\u0001\u0000(+\u0001\u0000\u0001\b\u0001\u0000\u0016\u0018"+
		"\u0128\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u00c0\u0001\u0000\u0000"+
		"\u0000\u0004\u00d2\u0001\u0000\u0000\u0000\u0006\u00d8\u0001\u0000\u0000"+
		"\u0000\b\u00de\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b"+
		"\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u00c1\u0003\u0004"+
		"\u0002\u0000\u0011\u00c1\u0003\u0006\u0003\u0000\u0012\u00c1\u0003\b\u0004"+
		"\u0000\u0013\u0014\u0005\t\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000"+
		"\u0015\u0016\u0005\n\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\u000b\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019"+
		"\u001a\u0005\f\u0000\u0000\u001a\u00c1\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\r\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005"+
		"\u000e\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000\u001f\"\u0005\u000f"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u00c1\u0005\"\u0000"+
		"\u0000$\'\u0005\u000f\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000()\u0005"+
		"\"\u0000\u0000)+\u0005\u0010\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u00c1\u0005\"\u0000\u0000/2\u0005\u000f\u0000"+
		"\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u00003\u00c1\u0005#\u0000\u000047\u0005"+
		"\u000f\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"65\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000089\u0005#\u0000\u0000"+
		"9;\u0005\u0010\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\u00c1\u0005#\u0000\u0000?B\u0005\u000f\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\u00c1\u0005$\u0000\u0000DG\u0005\u000f\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0005$\u0000\u0000IK\u0005\u0010"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u00c1\u0005$\u0000\u0000OR\u0005\u000f\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000S\u00c1\u0005!\u0000\u0000TW\u0005\u000f\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XY\u0005!\u0000\u0000Y[\u0005\u0010\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u00c1\u0005"+
		"!\u0000\u0000_b\u0005\u000f\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c\u00c1\u0005 \u0000\u0000dg\u0005\u000f\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hi\u0005 \u0000\u0000ik\u0005\u0010\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u00c1\u0005 \u0000\u0000"+
		"or\u0005\u000f\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u00c1\u0005"+
		"\u001f\u0000\u0000tw\u0005\u000f\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000"+
		"\u0000xy\u0005\u001f\u0000\u0000y{\u0005\u0010\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u00c1\u0005\u001f\u0000"+
		"\u0000\u007f\u0082\u0005\u000f\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u00c1\u0005\u001e\u0000"+
		"\u0000\u0084\u0087\u0005\u000f\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001e\u0000"+
		"\u0000\u0089\u008b\u0005\u0010\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u00c1\u0005\u001e\u0000\u0000\u008f\u0092\u0005\u000f\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u00c1\u0005\u001a\u0000\u0000\u0094\u0097\u0005\u000f\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\u001a\u0000\u0000\u0099\u009b\u0005\u0010\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00c1\u0005\u001a\u0000"+
		"\u0000\u009f\u00a8\u0005\u0011\u0000\u0000\u00a0\u00a9\u0005\"\u0000\u0000"+
		"\u00a1\u00a2\u0005\"\u0000\u0000\u00a2\u00a4\u0005\u0010\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\"\u0000\u0000\u00a8\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a9\u00c1"+
		"\u0001\u0000\u0000\u0000\u00aa\u00b3\u0005\u0012\u0000\u0000\u00ab\u00b4"+
		"\u0005\"\u0000\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u00af\u0005"+
		"\u0010\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"\"\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b4\u00c1\u0001\u0000\u0000\u0000\u00b5\u00be\u0005\u0013"+
		"\u0000\u0000\u00b6\u00bf\u0005\"\u0000\u0000\u00b7\u00b8\u0005\"\u0000"+
		"\u0000\u00b8\u00ba\u0005\u0010\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0005\"\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000"+
		"\u00be\u00b9\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u000f\u0001\u0000\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000"+
		"\u00c0\u0012\u0001\u0000\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000"+
		"\u00c0\u0017\u0001\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000"+
		"\u00c0!\u0001\u0000\u0000\u0000\u00c0&\u0001\u0000\u0000\u0000\u00c01"+
		"\u0001\u0000\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c0A\u0001\u0000"+
		"\u0000\u0000\u00c0F\u0001\u0000\u0000\u0000\u00c0Q\u0001\u0000\u0000\u0000"+
		"\u00c0V\u0001\u0000\u0000\u0000\u00c0a\u0001\u0000\u0000\u0000\u00c0f"+
		"\u0001\u0000\u0000\u0000\u00c0q\u0001\u0000\u0000\u0000\u00c0v\u0001\u0000"+
		"\u0000\u0000\u00c0\u0081\u0001\u0000\u0000\u0000\u00c0\u0086\u0001\u0000"+
		"\u0000\u0000\u00c0\u0091\u0001\u0000\u0000\u0000\u00c0\u0096\u0001\u0000"+
		"\u0000\u0000\u00c0\u009f\u0001\u0000\u0000\u0000\u00c0\u00aa\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\n\u0019\u0000\u0000\u00c3\u00c4\u0007\u0000\u0000"+
		"\u0000\u00c4\u00ce\u0003\u0002\u0001\u001a\u00c5\u00c6\n\u0018\u0000\u0000"+
		"\u00c6\u00c7\u0007\u0001\u0000\u0000\u00c7\u00ce\u0003\u0002\u0001\u0019"+
		"\u00c8\u00c9\n\u0017\u0000\u0000\u00c9\u00ca\u0007\u0002\u0000\u0000\u00ca"+
		"\u00ce\u0003\u0002\u0001\u0018\u00cb\u00cc\n\u001d\u0000\u0000\u00cc\u00ce"+
		"\u0005\'\u0000\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u0003\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0014\u0000\u0000\u00d3\u00d4\u0003\u0002\u0001\u0000\u00d4\u00d5\u0005"+
		"\r\u0000\u0000\u00d5\u00d6\u0003\u0000\u0000\u0000\u00d6\u00d7\u0005\u000e"+
		"\u0000\u0000\u00d7\u0005\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0015"+
		"\u0000\u0000\u00d9\u00da\u0003\u0002\u0001\u0000\u00da\u00db\u0005\r\u0000"+
		"\u0000\u00db\u00dc\u0003\u0000\u0000\u0000\u00dc\u00dd\u0005\u000e\u0000"+
		"\u0000\u00dd\u0007\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0003\u0000"+
		"\u0000\u00df\u00e0\u0003\u0002\u0001\u0000\u00e0\u00ea\u0005\r\u0000\u0000"+
		"\u00e1\u00e2\u0003\u0002\u0001\u0000\u00e2\u00e8\u0005\u0019\u0000\u0000"+
		"\u00e3\u00e9\u0003\u0002\u0001\u0000\u00e4\u00e5\u0005\r\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0002\u0001\u0000\u00e6\u00e7\u0005\u000e\u0000\u0000\u00e7"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e1\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000\u00ef"+
		"\t\u0001\u0000\u0000\u0000$\r!&,16<AFLQV\\aflqv|\u0081\u0086\u008c\u0091"+
		"\u0096\u009c\u00a5\u00a8\u00b0\u00b3\u00bb\u00be\u00c0\u00cd\u00cf\u00e8"+
		"\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}