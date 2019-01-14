import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class NiklausMain {
	
	private static String work_dir_ = "C:/Users/User/Documents/CentraleSupelec/3A/KitBE_TdL";
	
	public static void main(String[] args) throws IOException, RecognitionException {
		// TODO Auto-generated method stub
		
		String niklausFileName = "fact";
		String niklausProgramFile = work_dir_ + "/ProgrammesNiklaus/" + niklausFileName + ".niklaus";
		
		// Creation of a lexer object
		NiklausLexer lexer = new NiklausLexer(new ANTLRFileStream(niklausProgramFile));

		// Creation of a parser object
		NiklausParser parser = new NiklausParser(new CommonTokenStream(lexer));

		// Get the AST tree
		NiklausParser.program_return r = parser.program();
		Tree t = (Tree)r.getTree();
		
		// Generate the compiled file
		NiklausCodeHandler code_handler = new NiklausCodeHandler();
		code_handler.handleProgramCodeTree(t, work_dir_, niklausProgramFile, niklausFileName);
	}
	
}