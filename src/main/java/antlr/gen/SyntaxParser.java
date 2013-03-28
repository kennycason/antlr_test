// Generated from /home/destructo/simple_syntax/resources/Syntax.g by ANTLR 4.0
 package antlr.gen; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXPRESSION=1, WS=2, NL=3, ATOM=4, TWO_DIGIT=5, ALPHA_DIGIT=6, NUMBER=7, 
		SYMBOL=8, INCREMENT=9, DECREMENT=10, POST_INCREMENT=11, POST_DECREMENT=12, 
		PRE_INCREMENT=13, PRE_DECREMENT=14, ASSIGN=15, COMPARE=16, LOOP=17, IF=18, 
		WHILE=19, DO=20;
	public static final String[] tokenNames = {
		"<INVALID>", "EXPRESSION", "WS", "NL", "ATOM", "TWO_DIGIT", "ALPHA_DIGIT", 
		"NUMBER", "SYMBOL", "INCREMENT", "DECREMENT", "POST_INCREMENT", "POST_DECREMENT", 
		"PRE_INCREMENT", "PRE_DECREMENT", "ASSIGN", "COMPARE", "LOOP", "IF", "WHILE", 
		"DO"
	};
	public static final int
		RULE_valid = 0;
	public static final String[] ruleNames = {
		"valid"
	};

	@Override
	public String getGrammarFileName() { return "Syntax.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ValidContext extends ParserRuleContext {
		public TerminalNode EXPRESSION(int i) {
			return getToken(SyntaxParser.EXPRESSION, i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(SyntaxParser.EXPRESSION); }
		public ValidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterValid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitValid(this);
		}
	}

	public final ValidContext valid() throws RecognitionException {
		ValidContext _localctx = new ValidContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_valid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2); match(EXPRESSION);
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPRESSION );
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
		"\2\3\26\n\4\2\t\2\3\2\6\2\6\n\2\r\2\16\2\7\3\2\2\3\2\2\2\t\2\5\3\2\2\2"+
		"\4\6\7\3\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2"+
		"\2\3\7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}