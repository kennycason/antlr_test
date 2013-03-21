package antlr;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import antlr.gen.SyntaxLexer;
import antlr.gen.SyntaxParser;

public class SyntaxTest {

	@Test
	public void basicTest() {
		assertTrue(valid("14"));
		assertTrue(valid("twenty"));
	}

	public boolean valid(String query) {
		CharStream stream = new ANTLRInputStream(query);
		SyntaxLexer lex = new SyntaxLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lex);

		SyntaxParser parser = new SyntaxParser(tokens);
		parser.setErrorHandler(new BailErrorStrategy());
		try {
			parser.valid();
		} catch (Exception e) {
			System.out.println(query + ": FALSE");
			return false;
		}
		System.out.println(query + ": TRUE");
		return true;
	}

}
