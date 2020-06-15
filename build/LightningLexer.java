// Generated from Lightning.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LightningLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ComentarioDeUmaLinha=18, BOOLEANO=19, INTEIRO=20, CADEIA=21, CARACTER=22, 
		REAL=23, SE=24, SenaoSe=25, BooleanoLiteral=26, PontoVirgula=27, CadeiaLiteral=28, 
		CaracterLiteral=29, ID=30, InteiroLiteral=31, RealLiteral=32, SEP=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"ComentarioDeUmaLinha", "BOOLEANO", "INTEIRO", "CADEIA", "CARACTER", 
			"REAL", "SE", "SenaoSe", "BooleanoLiteral", "PontoVirgula", "CadeiaLiteral", 
			"CaracterLiteral", "ID", "InteiroLiteral", "RealLiteral", "SEP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", null, "'booleano'", 
			"'inteiro'", "'cadeia'", "'caracter'", "'real'", "'se'", "'senaose'", 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ComentarioDeUmaLinha", "BOOLEANO", 
			"INTEIRO", "CADEIA", "CARACTER", "REAL", "SE", "SenaoSe", "BooleanoLiteral", 
			"PontoVirgula", "CadeiaLiteral", "CaracterLiteral", "ID", "InteiroLiteral", 
			"RealLiteral", "SEP"
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


	public LightningLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lightning.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23p\n\23"+
		"\f\23\16\23s\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b1\n\33\3\34\3\34\3\35"+
		"\3\35\7\35\u00b7\n\35\f\35\16\35\u00ba\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\7\37\u00c4\n\37\f\37\16\37\u00c7\13\37\3 \5 \u00ca\n "+
		"\3 \6 \u00cd\n \r \16 \u00ce\3!\5!\u00d2\n!\3!\6!\u00d5\n!\r!\16!\u00d6"+
		"\3!\3!\6!\u00db\n!\r!\16!\u00dc\3\"\6\"\u00e0\n\"\r\"\16\"\u00e1\3\"\3"+
		"\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#\3\2\n\4\2\f\f\17\17\6\2\f\f\17\17$$^^\4\2C\\c|\5\2\62"+
		";C\\c|\3\2//\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\2\u00ee\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2"+
		"\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35c\3\2\2\2\37e\3\2\2"+
		"\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'v\3\2\2\2)\177\3\2\2\2+\u0087\3\2\2"+
		"\2-\u008e\3\2\2\2/\u0097\3\2\2\2\61\u009c\3\2\2\2\63\u009f\3\2\2\2\65"+
		"\u00b0\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00bd\3\2\2\2=\u00c1\3"+
		"\2\2\2?\u00c9\3\2\2\2A\u00d1\3\2\2\2C\u00df\3\2\2\2EF\7.\2\2F\4\3\2\2"+
		"\2GH\7?\2\2H\6\3\2\2\2IJ\7,\2\2J\b\3\2\2\2KL\7\61\2\2L\n\3\2\2\2MN\7\'"+
		"\2\2N\f\3\2\2\2OP\7-\2\2P\16\3\2\2\2QR\7/\2\2R\20\3\2\2\2ST\7?\2\2TU\7"+
		"?\2\2U\22\3\2\2\2VW\7#\2\2WX\7?\2\2X\24\3\2\2\2YZ\7>\2\2Z\26\3\2\2\2["+
		"\\\7@\2\2\\\30\3\2\2\2]^\7>\2\2^_\7?\2\2_\32\3\2\2\2`a\7@\2\2ab\7?\2\2"+
		"b\34\3\2\2\2cd\7}\2\2d\36\3\2\2\2ef\7\177\2\2f \3\2\2\2gh\7*\2\2h\"\3"+
		"\2\2\2ij\7+\2\2j$\3\2\2\2kl\7\61\2\2lm\7\61\2\2mq\3\2\2\2np\n\2\2\2on"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\b\23\2\2"+
		"u&\3\2\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2\2|}\7p"+
		"\2\2}~\7q\2\2~(\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7k\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7q\2\2\u0086*\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7f\2\2\u008a\u008b\7g\2\2\u008b\u008c\7k\2\2\u008c\u008d\7c\2\2"+
		"\u008d,\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2"+
		"\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7t\2\2\u0096.\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\60\3\2\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7g\2\2\u009e\62\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\64\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00b1\7g\2\2\u00ab\u00ac\7h\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b1"+
		"\7g\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\66\3\2\2\2\u00b2"+
		"\u00b3\7=\2\2\u00b38\3\2\2\2\u00b4\u00b8\7$\2\2\u00b5\u00b7\n\3\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\n\3\2\2\u00bf\u00c0\7)\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c5\t\4\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6>\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\t\6\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\t\7\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"@\3\2\2\2\u00d0\u00d2\t\6\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00d5\t\7\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\t\b\2\2\u00d9\u00db\t\7\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddB\3\2\2\2\u00de\u00e0"+
		"\t\t\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\"\3\2\u00e4D\3\2\2\2"+
		"\r\2q\u00b0\u00b8\u00c5\u00c9\u00ce\u00d1\u00d6\u00dc\u00e1\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}