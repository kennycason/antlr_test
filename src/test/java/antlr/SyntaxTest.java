package antlr;

import static org.junit.Assert.assertFalse;
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
//		assertTrue(valid("10"));
//		assertTrue(valid("-10"));
//		assertTrue(valid("neg eight"));
//		assertTrue(valid("pos 10"));	
		
		assertTrue(valid("@var++"));
		assertTrue(valid("@var--"));
		assertTrue(valid("@var  ++"));
		assertTrue(valid("@var --"));
		assertTrue(valid("++@var"));
		assertTrue(valid("--@var"));
		assertTrue(valid("++  @var"));
		assertTrue(valid("-- @var"));
		
		assertTrue(valid("@var = 10"));
		assertTrue(valid("@var = ten"));
		assertTrue(valid("@var = ten"));
		assertTrue(valid("@var=10"));
		assertTrue(valid("@var=ten"));
		assertTrue(valid("@var = @var4"));
		assertFalse(valid("@var = var2"));
		assertTrue(valid("@var3 < 10"));
		assertTrue(valid("@var <=@var2"));
		assertTrue(valid("@_var3 == 10"));
		
		assertTrue(valid("if @var == @var3\n\t@var2 = 10\nend"));
		assertTrue(valid("if @var < 10\nend"));
		assertTrue(valid("if @var == @var3\n\t@var2 = 10\n\t@var3++\nend"));
		assertTrue(valid("while @var < 10\nend"));
		assertTrue(valid("do\n\t@var++\nwhile @var < 10"));
		assertTrue(valid("if @var < 10\n\tif @var > 0\n\t\t@var = 100\n\tend\nend"));
		// assertTrue(valid("if @var\nend"));
		assertTrue(valid("if !@var\nend"));
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
