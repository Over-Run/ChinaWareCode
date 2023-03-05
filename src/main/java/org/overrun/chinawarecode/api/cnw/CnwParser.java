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
		BOOL_LITERAL=18, WS=19, COMMENT=20, LINE_COMMENT=21, LONG=22, DOUBLE=23, 
		FLOAT=24, INT=25, NAME=26, STRING=27, FSTRING=28, LA=29, RA=30, END=31, 
		PLUS=32, REDUCE=33, RIDE=34, DIVIDE=35, COMPARER=36, MOVE=37, LAMBDA=38;
	public static final int
		RULE_all = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"all", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'for'", "'switch'", "'when'", "'converter'", "'{'", "':'", 
			"'}'", "'('", "')'", "'['", "']'", "'.'", "','", "'val'", "'var'", "'global'", 
			null, null, null, null, null, null, null, null, null, null, null, "'<-'", 
			"'->'", "';'", "'+'", "'-'", "'*'", "'/'", null, null, "':::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOL_LITERAL", "WS", "COMMENT", 
			"LINE_COMMENT", "LONG", "DOUBLE", "FLOAT", "INT", "NAME", "STRING", "FSTRING", 
			"LA", "RA", "END", "PLUS", "REDUCE", "RIDE", "DIVIDE", "COMPARER", "MOVE", 
			"LAMBDA"
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
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				expr(0);
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 533179006L) != 0 );
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
		public ExprContext pre_l;
		public Token if_;
		public ExprContext code;
		public Token for_;
		public ExprContext pre_for;
		public ExprContext code_for;
		public Token switch_;
		public ExprContext sub;
		public Token val;
		public Token var;
		public Token global;
		public ExprContext sub_l;
		public Token end;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
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
		public List<TerminalNode> LAMBDA() { return getTokens(CnwParser.LAMBDA); }
		public TerminalNode LAMBDA(int i) {
			return getToken(CnwParser.LAMBDA, i);
		}
		public TerminalNode LA() { return getToken(CnwParser.LA, 0); }
		public TerminalNode RA() { return getToken(CnwParser.RA, 0); }
		public TerminalNode PLUS() { return getToken(CnwParser.PLUS, 0); }
		public TerminalNode REDUCE() { return getToken(CnwParser.REDUCE, 0); }
		public TerminalNode RIDE() { return getToken(CnwParser.RIDE, 0); }
		public TerminalNode DIVIDE() { return getToken(CnwParser.DIVIDE, 0); }
		public TerminalNode COMPARER() { return getToken(CnwParser.COMPARER, 0); }
		public TerminalNode MOVE() { return getToken(CnwParser.MOVE, 0); }
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(10);
				((ExprContext)_localctx).if_ = match(T__0);
				setState(11);
				((ExprContext)_localctx).pre = expr(0);
				setState(12);
				((ExprContext)_localctx).code = expr(30);
				}
				break;
			case 2:
				{
				setState(14);
				((ExprContext)_localctx).for_ = match(T__1);
				setState(15);
				((ExprContext)_localctx).pre_for = expr(0);
				setState(16);
				((ExprContext)_localctx).code_for = expr(29);
				}
				break;
			case 3:
				{
				setState(18);
				((ExprContext)_localctx).switch_ = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0) ) {
					((ExprContext)_localctx).switch_ = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(19);
				((ExprContext)_localctx).pre = expr(0);
				setState(20);
				match(T__5);
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(21);
					((ExprContext)_localctx).sub = expr(0);
					setState(22);
					match(T__6);
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(23);
						((ExprContext)_localctx).code = expr(0);
						}
						break;
					case 2:
						{
						{
						setState(24);
						match(T__5);
						setState(25);
						((ExprContext)_localctx).code = expr(0);
						setState(26);
						match(T__7);
						}
						}
						break;
					}
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 533179006L) != 0 );
				setState(34);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(36);
				match(T__8);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(37);
					expr(0);
					}
					break;
				case 2:
					{
					setState(38);
					all();
					}
					break;
				}
				setState(41);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(43);
				match(T__10);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(44);
					expr(0);
					}
					break;
				case 2:
					{
					setState(45);
					all();
					}
					break;
				}
				setState(48);
				match(T__11);
				}
				break;
			case 6:
				{
				setState(50);
				match(T__5);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(51);
					expr(0);
					}
					break;
				case 2:
					{
					setState(52);
					all();
					}
					break;
				}
				setState(55);
				match(T__7);
				}
				break;
			case 7:
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(57);
					match(T__12);
					}
					break;
				case NAME:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61);
				match(NAME);
				}
				break;
			case 8:
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(62);
					match(T__12);
					}
					break;
				case NAME:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(NAME);
						setState(67);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(72);
				match(NAME);
				}
				break;
			case 9:
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(73);
					match(T__12);
					}
					break;
				case STRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				match(STRING);
				}
				break;
			case 10:
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(78);
					match(T__12);
					}
					break;
				case STRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						match(STRING);
						setState(83);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(88);
				match(STRING);
				}
				break;
			case 11:
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(89);
					match(T__12);
					}
					break;
				case FSTRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				match(FSTRING);
				}
				break;
			case 12:
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(94);
					match(T__12);
					}
					break;
				case FSTRING:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						match(FSTRING);
						setState(99);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(102); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(104);
				match(FSTRING);
				}
				break;
			case 13:
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(105);
					match(T__12);
					}
					break;
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109);
				match(INT);
				}
				break;
			case 14:
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(110);
					match(T__12);
					}
					break;
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						match(INT);
						setState(115);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(120);
				match(INT);
				}
				break;
			case 15:
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(121);
					match(T__12);
					}
					break;
				case FLOAT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125);
				match(FLOAT);
				}
				break;
			case 16:
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(126);
					match(T__12);
					}
					break;
				case FLOAT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(130);
						match(FLOAT);
						setState(131);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(136);
				match(FLOAT);
				}
				break;
			case 17:
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(137);
					match(T__12);
					}
					break;
				case DOUBLE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				match(DOUBLE);
				}
				break;
			case 18:
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(142);
					match(T__12);
					}
					break;
				case DOUBLE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(146);
						match(DOUBLE);
						setState(147);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(152);
				match(DOUBLE);
				}
				break;
			case 19:
				{
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(153);
					match(T__12);
					}
					break;
				case LONG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(LONG);
				}
				break;
			case 20:
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(158);
					match(T__12);
					}
					break;
				case LONG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(LONG);
						setState(163);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(168);
				match(LONG);
				}
				break;
			case 21:
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(169);
					match(T__12);
					}
					break;
				case BOOL_LITERAL:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173);
				match(BOOL_LITERAL);
				}
				break;
			case 22:
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(174);
					match(T__12);
					}
					break;
				case BOOL_LITERAL:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(178);
						match(BOOL_LITERAL);
						setState(179);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(182); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(184);
				match(BOOL_LITERAL);
				}
				break;
			case 23:
				{
				setState(185);
				((ExprContext)_localctx).val = match(T__14);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(186);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(189); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(187);
							match(NAME);
							setState(188);
							match(T__13);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(191); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(193);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 24:
				{
				setState(196);
				((ExprContext)_localctx).var = match(T__15);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(197);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(200); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(198);
							match(NAME);
							setState(199);
							match(T__13);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(202); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(204);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 25:
				{
				setState(207);
				((ExprContext)_localctx).global = match(T__16);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(208);
					match(NAME);
					}
					break;
				case 2:
					{
					setState(211); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(209);
							match(NAME);
							setState(210);
							match(T__13);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(213); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					setState(215);
					match(NAME);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(221);
						match(LAMBDA);
						setState(222);
						((ExprContext)_localctx).code = expr(33);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(224);
						match(LAMBDA);
						setState(225);
						((ExprContext)_localctx).sub = expr(0);
						setState(226);
						match(LAMBDA);
						setState(227);
						((ExprContext)_localctx).code = expr(32);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre_l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(230);
						_la = _input.LA(1);
						if ( !(_la==LA || _la==RA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						((ExprContext)_localctx).sub_l = expr(27);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(233);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((ExprContext)_localctx).sub = expr(26);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(236);
						match(COMPARER);
						setState(237);
						((ExprContext)_localctx).sub = expr(25);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(239);
						match(MOVE);
						setState(240);
						((ExprContext)_localctx).sub = expr(24);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.pre = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(242);
						((ExprContext)_localctx).end = match(END);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			return precpred(_ctx, 32);
		case 1:
			return precpred(_ctx, 31);
		case 2:
			return precpred(_ctx, 26);
		case 3:
			return precpred(_ctx, 25);
		case 4:
			return precpred(_ctx, 24);
		case 5:
			return precpred(_ctx, 23);
		case 6:
			return precpred(_ctx, 27);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001"+
		" \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"(\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001A\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001E\b\u0001\u000b"+
		"\u0001\f\u0001F\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001L\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Q\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001U\b\u0001\u000b\u0001\f\u0001V\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001e\b\u0001"+
		"\u000b\u0001\f\u0001f\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"l\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001u\b\u0001\u000b\u0001\f\u0001v\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0081\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u0085\b\u0001\u000b\u0001\f\u0001\u0086\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u008c\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0091\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0095\b\u0001"+
		"\u000b\u0001\f\u0001\u0096\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u009c\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a1\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00a5\b\u0001\u000b\u0001\f"+
		"\u0001\u00a6\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ac\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b1\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u00b5\b\u0001\u000b\u0001\f\u0001\u00b6\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00be"+
		"\b\u0001\u000b\u0001\f\u0001\u00bf\u0001\u0001\u0003\u0001\u00c3\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00c9\b\u0001"+
		"\u000b\u0001\f\u0001\u00ca\u0001\u0001\u0003\u0001\u00ce\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00d4\b\u0001\u000b"+
		"\u0001\f\u0001\u00d5\u0001\u0001\u0003\u0001\u00d9\b\u0001\u0003\u0001"+
		"\u00db\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00f4\b\u0001\n\u0001\f\u0001\u00f7\t\u0001\u0001\u0001\u0000"+
		"\u0001\u0002\u0002\u0000\u0002\u0000\u0003\u0001\u0000\u0003\u0005\u0001"+
		"\u0000\u001d\u001e\u0001\u0000 #\u0139\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0002\u00da\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000"+
		"\u0005\u0004\u0001\u0000\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000"+
		"\u0007\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b"+
		"\u0001\u0001\u0000\u0000\u0000\t\n\u0006\u0001\uffff\uffff\u0000\n\u000b"+
		"\u0005\u0001\u0000\u0000\u000b\f\u0003\u0002\u0001\u0000\f\r\u0003\u0002"+
		"\u0001\u001e\r\u00db\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0002\u0000"+
		"\u0000\u000f\u0010\u0003\u0002\u0001\u0000\u0010\u0011\u0003\u0002\u0001"+
		"\u001d\u0011\u00db\u0001\u0000\u0000\u0000\u0012\u0013\u0007\u0000\u0000"+
		"\u0000\u0013\u0014\u0003\u0002\u0001\u0000\u0014\u001e\u0005\u0006\u0000"+
		"\u0000\u0015\u0016\u0003\u0002\u0001\u0000\u0016\u001c\u0005\u0007\u0000"+
		"\u0000\u0017\u001d\u0003\u0002\u0001\u0000\u0018\u0019\u0005\u0006\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\b\u0000\u0000"+
		"\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000"+
		"\u001c\u0018\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000"+
		"\u001e\u0015\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0005\b\u0000\u0000#\u00db\u0001\u0000\u0000\u0000$\'\u0005"+
		"\t\u0000\u0000%(\u0003\u0002\u0001\u0000&(\u0003\u0000\u0000\u0000\'%"+
		"\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0005\n\u0000\u0000*\u00db\u0001\u0000\u0000\u0000+.\u0005\u000b"+
		"\u0000\u0000,/\u0003\u0002\u0001\u0000-/\u0003\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\f\u0000\u00001\u00db\u0001\u0000\u0000\u000025\u0005\u0006\u0000"+
		"\u000036\u0003\u0002\u0001\u000046\u0003\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005"+
		"\b\u0000\u00008\u00db\u0001\u0000\u0000\u00009<\u0005\r\u0000\u0000:<"+
		"\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=\u00db\u0005\u001a\u0000\u0000>A\u0005"+
		"\r\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000BC\u0005\u001a\u0000\u0000"+
		"CE\u0005\u000e\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u00db\u0005\u001a\u0000\u0000IL\u0005\r\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u00db\u0005\u001b\u0000\u0000NQ\u0005\r\u0000"+
		"\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RS\u0005\u001b\u0000\u0000SU\u0005"+
		"\u000e\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u00db\u0005\u001b\u0000\u0000Y\\\u0005\r\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u00db\u0005\u001c\u0000\u0000^a\u0005\r\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000bc\u0005\u001c\u0000\u0000ce\u0005"+
		"\u000e\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u00db\u0005\u001c\u0000\u0000il\u0005\r\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000m\u00db\u0005\u0019\u0000\u0000nq\u0005\r\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rs\u0005\u0019\u0000\u0000su\u0005\u000e"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u00db\u0005\u0019\u0000\u0000y|\u0005\r\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u00db\u0005\u0018\u0000\u0000~\u0081\u0005\r\u0000\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0018\u0000\u0000\u0083\u0085\u0005\u000e\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u00db\u0005\u0018\u0000\u0000\u0089"+
		"\u008c\u0005\r\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u00db\u0005\u0017\u0000\u0000\u008e\u0091"+
		"\u0005\r\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0017\u0000\u0000\u0093\u0095\u0005"+
		"\u000e\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00db\u0005"+
		"\u0017\u0000\u0000\u0099\u009c\u0005\r\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00db\u0005\u0016"+
		"\u0000\u0000\u009e\u00a1\u0005\r\u0000\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0016\u0000"+
		"\u0000\u00a3\u00a5\u0005\u000e\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00db\u0005\u0016\u0000\u0000\u00a9\u00ac\u0005\r\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00db\u0005\u0012\u0000\u0000\u00ae\u00b1\u0005\r\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0012\u0000\u0000\u00b3\u00b5\u0005\u000e\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00db\u0005\u0012\u0000\u0000\u00b9"+
		"\u00c2\u0005\u000f\u0000\u0000\u00ba\u00c3\u0005\u001a\u0000\u0000\u00bb"+
		"\u00bc\u0005\u001a\u0000\u0000\u00bc\u00be\u0005\u000e\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\u001a\u0000\u0000\u00c2"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c3"+
		"\u00db\u0001\u0000\u0000\u0000\u00c4\u00cd\u0005\u0010\u0000\u0000\u00c5"+
		"\u00ce\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7"+
		"\u00c9\u0005\u000e\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0005\u001a\u0000\u0000\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ce\u00db\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d8\u0005\u0011\u0000\u0000\u00d0\u00d9\u0005\u001a\u0000\u0000\u00d1"+
		"\u00d2\u0005\u001a\u0000\u0000\u00d2\u00d4\u0005\u000e\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\u001a\u0000\u0000\u00d8"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\t\u0001\u0000\u0000\u0000\u00da\u000e"+
		"\u0001\u0000\u0000\u0000\u00da\u0012\u0001\u0000\u0000\u0000\u00da$\u0001"+
		"\u0000\u0000\u0000\u00da+\u0001\u0000\u0000\u0000\u00da2\u0001\u0000\u0000"+
		"\u0000\u00da;\u0001\u0000\u0000\u0000\u00da@\u0001\u0000\u0000\u0000\u00da"+
		"K\u0001\u0000\u0000\u0000\u00daP\u0001\u0000\u0000\u0000\u00da[\u0001"+
		"\u0000\u0000\u0000\u00da`\u0001\u0000\u0000\u0000\u00dak\u0001\u0000\u0000"+
		"\u0000\u00dap\u0001\u0000\u0000\u0000\u00da{\u0001\u0000\u0000\u0000\u00da"+
		"\u0080\u0001\u0000\u0000\u0000\u00da\u008b\u0001\u0000\u0000\u0000\u00da"+
		"\u0090\u0001\u0000\u0000\u0000\u00da\u009b\u0001\u0000\u0000\u0000\u00da"+
		"\u00a0\u0001\u0000\u0000\u0000\u00da\u00ab\u0001\u0000\u0000\u0000\u00da"+
		"\u00b0\u0001\u0000\u0000\u0000\u00da\u00b9\u0001\u0000\u0000\u0000\u00da"+
		"\u00c4\u0001\u0000\u0000\u0000\u00da\u00cf\u0001\u0000\u0000\u0000\u00db"+
		"\u00f5\u0001\u0000\u0000\u0000\u00dc\u00dd\n \u0000\u0000\u00dd\u00de"+
		"\u0005&\u0000\u0000\u00de\u00f4\u0003\u0002\u0001!\u00df\u00e0\n\u001f"+
		"\u0000\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001"+
		"\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3\u00e4\u0003\u0002\u0001 \u00e4"+
		"\u00f4\u0001\u0000\u0000\u0000\u00e5\u00e6\n\u001a\u0000\u0000\u00e6\u00e7"+
		"\u0007\u0001\u0000\u0000\u00e7\u00f4\u0003\u0002\u0001\u001b\u00e8\u00e9"+
		"\n\u0019\u0000\u0000\u00e9\u00ea\u0007\u0002\u0000\u0000\u00ea\u00f4\u0003"+
		"\u0002\u0001\u001a\u00eb\u00ec\n\u0018\u0000\u0000\u00ec\u00ed\u0005$"+
		"\u0000\u0000\u00ed\u00f4\u0003\u0002\u0001\u0019\u00ee\u00ef\n\u0017\u0000"+
		"\u0000\u00ef\u00f0\u0005%\u0000\u0000\u00f0\u00f4\u0003\u0002\u0001\u0018"+
		"\u00f1\u00f2\n\u001b\u0000\u0000\u00f2\u00f4\u0005\u001f\u0000\u0000\u00f3"+
		"\u00dc\u0001\u0000\u0000\u0000\u00f3\u00df\u0001\u0000\u0000\u0000\u00f3"+
		"\u00e5\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f3"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u0003\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\'\u0007"+
		"\u001c \'.5;@FKPV[`fkpv{\u0080\u0086\u008b\u0090\u0096\u009b\u00a0\u00a6"+
		"\u00ab\u00b0\u00b6\u00bf\u00c2\u00ca\u00cd\u00d5\u00d8\u00da\u00f3\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}