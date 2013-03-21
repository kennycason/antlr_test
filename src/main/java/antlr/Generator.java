package antlr;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.Tool;

public class Generator {

	private static final String INPUT = pwd() + "resources/Syntax.g";
	
	private static final String OUTPUT = pwd() + "src/main/java/antlr/gen/";
	
	public static void main(String[] args) {
		Tool.main(new String[] {"-o", OUTPUT, INPUT});
	}

	private static String pwd() {
		File directory = new File (".");
		try {
			return directory.getCanonicalPath() + "/";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
