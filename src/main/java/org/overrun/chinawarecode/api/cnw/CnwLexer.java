package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CnwLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, COMMENT=5, LINE_COMMENT=6, LONG=7, DOUBLE=8, 
		FLOAT=9, INT=10, NAME=11, STRING=12, LA=13, RA=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "COMMENT", "LINE_COMMENT", "LONG", "DOUBLE", 
			"FLOAT", "INT", "NAME", "STRING", "EscapeSequence", "HexDigit", "LA", 
			"RA"
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


	public CnwLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cnw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003.\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00047\b"+
		"\u0004\n\u0004\f\u0004:\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0004\u0007T\b\u0007\u000b\u0007\f\u0007U\u0001\u0007\u0001"+
		"\u0007\u0004\u0007Z\b\u0007\u000b\u0007\f\u0007[\u0001\b\u0004\b_\b\b"+
		"\u000b\b\f\b`\u0001\b\u0001\b\u0004\be\b\b\u000b\b\f\bf\u0001\b\u0001"+
		"\b\u0001\t\u0004\tl\b\t\u000b\t\f\tm\u0001\n\u0004\nq\b\n\u000b\n\f\n"+
		"r\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bx\b\u000b\n\u000b\f\u000b"+
		"{\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0083\b\f\u0001\f\u0003\f\u0086\b\f\u0001\f\u0001\f\u0001\f\u0004\f"+
		"\u008b\b\f\u000b\f\f\f\u008c\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0094\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u00018\u0000\u0010\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u001d\r\u001f\u000e\u0001"+
		"\u0000\t\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0001\u000009\u0003"+
		"\u000009AZaz\u0004\u0000\n\n\r\r\"\"\\\\\b\u0000\"\"\'\'\\\\bbffnnrrt"+
		"t\u0001\u000003\u0001\u000007\u0003\u000009AFaf\u00ab\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000"+
		"\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007"+
		",\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000"+
		"\u0011^\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000\u0000\u0015p"+
		"\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019\u0093\u0001"+
		"\u0000\u0000\u0000\u001b\u0095\u0001\u0000\u0000\u0000\u001d\u0097\u0001"+
		"\u0000\u0000\u0000\u001f\u009a\u0001\u0000\u0000\u0000!\"\u0005v\u0000"+
		"\u0000\"#\u0005a\u0000\u0000#$\u0005l\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005;\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005v\u0000"+
		"\u0000()\u0005a\u0000\u0000)*\u0005r\u0000\u0000*\u0006\u0001\u0000\u0000"+
		"\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0006\u0003\u0000\u00001\b\u0001\u0000\u0000\u0000"+
		"23\u0005/\u0000\u000034\u0005*\u0000\u000048\u0001\u0000\u0000\u00005"+
		"7\t\u0000\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;<\u0005*\u0000\u0000<=\u0005/\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0006\u0004\u0000\u0000?\n\u0001\u0000\u0000"+
		"\u0000@A\u0005/\u0000\u0000AB\u0005/\u0000\u0000BF\u0001\u0000\u0000\u0000"+
		"CE\b\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0006\u0005\u0000\u0000J\f\u0001\u0000"+
		"\u0000\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0005L\u0000\u0000Q\u000e\u0001\u0000\u0000"+
		"\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WY\u0005.\u0000\u0000XZ\u0007\u0002\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]_\u0007\u0002"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0005.\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0005f\u0000\u0000i\u0012\u0001\u0000"+
		"\u0000\u0000jl\u0007\u0002\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u0014\u0001\u0000\u0000\u0000oq\u0007\u0003\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s\u0016\u0001\u0000\u0000\u0000ty\u0005\"\u0000\u0000"+
		"ux\b\u0004\u0000\u0000vx\u0003\u0019\f\u0000wu\u0001\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0005\"\u0000\u0000}\u0018\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\\\u0000\u0000\u007f\u0094\u0007\u0005\u0000\u0000\u0080\u0085\u0005"+
		"\\\u0000\u0000\u0081\u0083\u0007\u0006\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0007\u0007\u0000\u0000\u0085\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0094\u0007\u0007\u0000\u0000\u0088\u008a\u0005\\\u0000"+
		"\u0000\u0089\u008b\u0005u\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0003\u001b\r\u0000\u008f\u0090\u0003\u001b\r\u0000\u0090"+
		"\u0091\u0003\u001b\r\u0000\u0091\u0092\u0003\u001b\r\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093~\u0001\u0000\u0000\u0000\u0093\u0080\u0001"+
		"\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0094\u001a\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0007\b\u0000\u0000\u0096\u001c\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005<\u0000\u0000\u0098\u0099\u0005-\u0000\u0000"+
		"\u0099\u001e\u0001\u0000\u0000\u0000\u009a\u009b\u0005-\u0000\u0000\u009b"+
		"\u009c\u0005>\u0000\u0000\u009c \u0001\u0000\u0000\u0000\u0011\u0000."+
		"8FNU[`fmrwy\u0082\u0085\u008c\u0093\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}