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
		SYNTAX=1, WS=2, TWO_DIGIT=3, ALPHA_DIGIT=4, NUMBER=5, VAR=6, INCREMENT=7, 
		DECREMENT=8, SET=9;
	public static final String[] tokenNames = {
		"<INVALID>", "SYNTAX", "WS", "TWO_DIGIT", "ALPHA_DIGIT", "NUMBER", "VAR", 
		"INCREMENT", "DECREMENT", "SET"
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
		public List<TerminalNode> SYNTAX() { return getTokens(SyntaxParser.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(SyntaxParser.SYNTAX, i);
		}
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
				setState(2); match(SYNTAX);
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SYNTAX );
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
		"\2\3\13\n\4\2\t\2\3\2\6\2\6\n\2\r\2\16\2\7\3\2\2\3\2\2\2\t\2\5\3\2\2\2"+
		"\4\6\7\3\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2"+
		"\2\3\7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}