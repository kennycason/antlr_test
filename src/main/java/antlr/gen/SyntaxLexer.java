// Generated from /home/kenny/simple_syntax/resources/Syntax.g by ANTLR 4.0
 package antlr.gen; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SYNTAX=1, WS=2, TWO_DIGIT=3, ALPHA_DIGITS=4, NUMBER=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SYNTAX", "WS", "TWO_DIGIT", "ALPHA_DIGITS", "NUMBER"
	};
	public static final String[] ruleNames = {
		"SYNTAX", "WS", "DIGIT", "TWO_DIGIT", "ALPHA_DIGITS", "NUMBER"
	};


	public SyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Syntax.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\7\u0098\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6"+
		"\2\21\n\2\r\2\16\2\22\3\3\6\3\26\n\3\r\3\16\3\27\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\7\6\7\u0092\n\7\r\7\16\7\u0093"+
		"\3\7\5\7\u0097\n\7\2\b\3\3\1\5\4\1\7\2\1\t\5\1\13\6\1\r\7\1\3\2\4\5\13"+
		"\f\16\17\"\"\3\62;\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\3\20\3\2\2\2\5\25\3\2\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13"+
		"\u008e\3\2\2\2\r\u0096\3\2\2\2\17\21\5\r\7\2\20\17\3\2\2\2\21\22\3\2\2"+
		"\2\22\20\3\2\2\2\22\23\3\2\2\2\23\4\3\2\2\2\24\26\t\2\2\2\25\24\3\2\2"+
		"\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\6\3\2\2\2\31\32\t\3\2"+
		"\2\32\b\3\2\2\2\33\34\5\7\4\2\34\35\5\7\4\2\35\n\3\2\2\2\36\37\7q\2\2"+
		"\37 \7p\2\2 \u008f\7g\2\2!\"\7v\2\2\"#\7y\2\2#\u008f\7q\2\2$%\7v\2\2%"+
		"&\7j\2\2&\'\7t\2\2\'(\7g\2\2(\u008f\7g\2\2)*\7h\2\2*+\7q\2\2+,\7w\2\2"+
		",\u008f\7t\2\2-.\7h\2\2./\7k\2\2/\60\7x\2\2\60\u008f\7g\2\2\61\62\7u\2"+
		"\2\62\63\7k\2\2\63\u008f\7z\2\2\64\65\7u\2\2\65\66\7g\2\2\66\67\7x\2\2"+
		"\678\7g\2\28\u008f\7p\2\29:\7g\2\2:;\7k\2\2;<\7i\2\2<=\7j\2\2=\u008f\7"+
		"v\2\2>?\7p\2\2?@\7k\2\2@A\7p\2\2A\u008f\7g\2\2BC\7v\2\2CD\7g\2\2D\u008f"+
		"\7p\2\2EF\7g\2\2FG\7n\2\2GH\7g\2\2HI\7x\2\2IJ\7g\2\2J\u008f\7p\2\2KL\7"+
		"v\2\2LM\7y\2\2MN\7g\2\2NO\7n\2\2OP\7x\2\2P\u008f\7g\2\2QR\7v\2\2RS\7j"+
		"\2\2ST\7k\2\2TU\7t\2\2UV\7v\2\2VW\7g\2\2WX\7g\2\2X\u008f\7p\2\2YZ\7h\2"+
		"\2Z[\7q\2\2[\\\7w\2\2\\]\7t\2\2]^\7v\2\2^_\7g\2\2_`\7g\2\2`\u008f\7p\2"+
		"\2ab\7h\2\2bc\7k\2\2cd\7h\2\2de\7v\2\2ef\7g\2\2fg\7g\2\2g\u008f\7p\2\2"+
		"hi\7u\2\2ij\7k\2\2jk\7z\2\2kl\7v\2\2lm\7g\2\2mn\7g\2\2n\u008f\7p\2\2o"+
		"p\7u\2\2pq\7g\2\2qr\7x\2\2rs\7g\2\2st\7p\2\2tu\7v\2\2uv\7g\2\2vw\7g\2"+
		"\2w\u008f\7p\2\2xy\7g\2\2yz\7k\2\2z{\7i\2\2{|\7j\2\2|}\7v\2\2}~\7g\2\2"+
		"~\177\7g\2\2\177\u008f\7p\2\2\u0080\u0081\7p\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7p\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2"+
		"\u0086\u0087\7g\2\2\u0087\u008f\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7y\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008f\7{\2\2\u008e\36\3\2\2\2\u008e!\3\2\2\2\u008e$\3\2\2\2\u008e)\3"+
		"\2\2\2\u008e-\3\2\2\2\u008e\61\3\2\2\2\u008e\64\3\2\2\2\u008e9\3\2\2\2"+
		"\u008e>\3\2\2\2\u008eB\3\2\2\2\u008eE\3\2\2\2\u008eK\3\2\2\2\u008eQ\3"+
		"\2\2\2\u008eY\3\2\2\2\u008ea\3\2\2\2\u008eh\3\2\2\2\u008eo\3\2\2\2\u008e"+
		"x\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0088\3\2\2\2\u008f\f\3\2\2\2\u0090"+
		"\u0092\5\7\4\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\5\13\6\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\16\3\2\2\2\b\2\22\27\u008e\u0093"+
		"\u0096";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}