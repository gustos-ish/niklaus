import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector; 
import java.util.logging.Logger;
import java.util.logging.Level;

import org.antlr.runtime.tree.Tree;


/**
 * A Class to handle the AST Tree of a Niklaus Program
 * @author User
 *
 */
public class NiklausCodeHandler {
	
	private static PrintWriter writer = null;
	private static String tab = "				";
	private static int counter = 0;
	private static String workDir = "";
	private static String assemblyFileName = null;
	private static String libFileName = null;
	private static boolean displayAssemblyCodeOnConsole = true;
	private static List<String> vectorVariables =new Vector<String>();
	private static Logger LOGGER = Logger.getLogger(NiklausCodeHandler.class.getName());
	private static boolean importAssemblyCodeLib = false;
	
	/**
	 * Sets LOGGER Level
	 * WARNING LEVEL WILL BE USED TO DISPLAY MESSAGES
	 * INFO LEVEL FOR DEBUGGING (SINCE THERE IS NO DEBUG LEVEL IN THE PACKAGE USED)
	 */
	public static void setLOGGER() {
		LOGGER.setLevel(Level.WARNING);
	}
	
	/**
	 * Add assembly code to compiled file
	 * @throws IOException if any error ocurred
	 */
	public static void addAssemblyCodeLib() throws IOException{
		LOGGER.info("ADDING FUNCTIONS FROM LIB TO COMPILED FILE : START");
		FileReader libFileReader = new FileReader(libFileName);
		BufferedReader br = new BufferedReader(libFileReader);

		String s = br.readLine();
		while(s != null) {
			write(s);
			s = br.readLine();
		}
		br.close();
		LOGGER.info("ADDING FUNCTIONS FROM LIB TO COMPILED FILE : END");
	}
	
	/**
     * Method prepare the name of the assembly file
     * If the directory where the assembly file must be saved 
     * does not exist, it will be created.
     * 
     * @param program_name String
     * @return String
     */
	static String getAssemblyFileName(String program_name){
		LOGGER.info("GENERATING ASSEMBLY FILE NAME : START");
		String str_dir_ouput_java = workDir + "/output_java/";
		File dir_output_java = new File(str_dir_ouput_java);
		String assemblyFileName = str_dir_ouput_java + program_name + ".arm";
		
		if (!dir_output_java.exists()){
		    System.out.println("Creating directory : " + dir_output_java.getName());
		    boolean result = false;
		    try{
		    	dir_output_java.mkdir();
		        result = true;    	
		    } 
		    catch(SecurityException se){
		    	throw new SecurityException("Error Creating directory " + dir_output_java.getName());
		    }        
		    if(result) {    
		    	LOGGER.info("DIR " + dir_output_java.getName() +  " created"); 
		    }
		}
		LOGGER.info("GENERATING ASSEMBLY FILE NAME : END");
        return assemblyFileName;
	}
	
	/**
     * Helper to write in the assembly file and display the written text
     * on the console
     * @param str_to_write String 
     */
	static void write(String str_to_write){
		LOGGER.info("WRITING ASSEMBLY CODE : START");
		if(displayAssemblyCodeOnConsole){
			System.out.println(str_to_write);
		}
		writer.println(str_to_write);
		LOGGER.info("WRITING ASSEMBLY CODE : END");
	}
	
	/**
	 * Method to check if a given variable in the code have been declared
	 * at the beginning of the program
	 * @param variableName String
	 * @throws IOException if any error occurred
	 */
	static void checkDeclaredVariable(String variableName) throws IOException{
		LOGGER.info("CHECKING IF VARIABLE IS DECLARED : START");
		if(!vectorVariables.contains(variableName)){
			IOException e = new IOException();
			throw new IOException("VARIABLE : " + variableName + " IS NOT DECLARED ", e);
		}
		LOGGER.info("CHECKING IF VARIABLE IS DECLARED : END");
	}

	/**
	 * Add the declared variables to vector_variables and check if there are no duplicates
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleDeclaration(Tree t) throws IOException{
		LOGGER.info("HANDLING DECLARATION AST TREE : START");
		int nb_nodes = t.getChildCount();
		// System.out.println("---- HANDLING DECLARATION START ---- ");
		for(int i = 0; i < nb_nodes; i++)
		{
			Tree subt = t.getChild(i);
			
			switch(subt.getType()) {
			case NiklausLexer.ID:
				if(!vectorVariables.contains(subt.getText())){
					vectorVariables.add(subt.getText());	
				}
				else{
					throw new IOException("VARIABLE " + subt.getText() + " IS DECLARED MORE THAN ONCE");
				}
				
			   break;		

			default:
				String errorMessage = "NODE " + i + " : " + subt + ", TOKEN " + subt.getType() 
				+ " ERROR, IMPOSSIBLE TO HAVE THAT LEXEME AFTER VAR ...";
				throw new IOException(errorMessage);
			}
		}
		LOGGER.info("HANDLING DECLARATION AST TREE : END");
	}

	/**
	 * Generates assembly code of a factor AST Tree
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleFactor(Tree t) throws IOException{
		LOGGER.info("HANDLING FACTOR AST TREE : START");
		switch (t.getType()) {
		case NiklausLexer.ID:
			LOGGER.info("CASE FACTOR IS A VARIABLE");
			String variable_name = t.getText(); 
			checkDeclaredVariable(variable_name);
			write(tab + "ldr r0, mem_" + variable_name);
			break;
			
		case NiklausLexer.INT:
			LOGGER.info("CASE FACTOR IS AN INT");
			write(tab + "mov r0, #" + t.getText());
			break;
			
		case NiklausLexer.ADDOP:
			LOGGER.info("CASE FACTOR IS AN ADDOP");
			handleExpression(t);
			break;
		
		case NiklausLexer.MULTOP:
			LOGGER.info("CASE FACTOR IS A MULTOP");
			handleExpression(t);
			break;

		default:
			throw new IOException("INVALID FACTOR");
			
		}
		LOGGER.info("HANDLING FACTOR AST TREE : END");
	}
	
	/**
	 * Generate the assembly code of a term
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleTerm(Tree t) throws IOException{
		LOGGER.info("HANDLING TERM AST TREE : START");
		if(t.getType() == NiklausLexer.MULTOP){
			LOGGER.info("CASE TERM IS A MULTOP");
			if(t.getChildCount() != 2){
				throw new IOException("INVALID MULTIPLICATION OPERATION, IT DOES NOT HAVE ENOUGH FACTORS");
			}
			Tree first_factor = t.getChild(0);
			Tree second_factor = t.getChild(1);
			handleFactor(first_factor);
			write(tab + "push r0");
			handleFactor(second_factor);
			write(tab + "pop r1");
			write(tab + "str r1, 0xAAAA");
			write(tab + "str r0, 0xAAAB");
			switch (t.getText()) {
			case "*":
				write(tab + "ldr r0, 0xAAAC");
				break;
				
			case "/":
				write(tab + "ldr r0, 0xAAAD");
				break;

			default:
				break;
			}
		}
		else{
			LOGGER.info("CASE TERM IS AN INT OR A VARIABLE FACTOR");
			handleFactor(t);
		}
		LOGGER.info("HANDLING TERM AST TREE : END");
	}

	/**
	 * Generates the compiled code depending of the given AST tree of an expression
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleExpression(Tree t) throws IOException{
		LOGGER.info("HANDLING EXPRESSION AST TREE : START");
		if(t.getType() == NiklausLexer.ADDOP){
			handleTerm(t.getChild(0));
			write(tab + "push r0");
			handleTerm(t.getChild(1));
			write(tab + "pop r1");
			switch (t.getText()) {
			case "+":
				write(tab + "add r0, r1, r0");
				break;
			
			case "-":
				write(tab + "sub r0, r1, r0");
				break;
			
			case "mod":
				write(tab + "str r1, 0xAAAA");
				write(tab + "str r0, 0xAAAB");
				write(tab + "ldr r0, 0xAAAE");
				break;
			default:
				throw new IOException("INVALID EXPRESSION : " + t.getText());
			}

		}
		else{
			handleTerm(t);
		}
		
				
		
		// TODO: Add code for operations +, -, %, *, /
		LOGGER.info("HANDLING EXPRESSION AST TREE : END");
	}

	/**
	 * Method to handle affectation instructions 
	 * @param t Tree
	 * @throws IOException if any error occurred 
	 */
	static void handleAffectation(Tree t) throws IOException{
		LOGGER.info("HANDLING AFFECTATION AST TREE : START");
		Tree nameVariable = t.getChild(0);
		checkDeclaredVariable(nameVariable.getText());
		Tree sub_t = t.getChild(1);
		switch(sub_t.getType()){
			
		case NiklausLexer.ID:
			LOGGER.info("CASE AFFECTATION OF A VALUE STOCKED IN A VARIABLE");
			checkDeclaredVariable(sub_t.getText());
			write(tab + "ldr r0, mem_" + sub_t.getText());
			write(tab + "str r0, mem_" + nameVariable.getText());
			break;
		
		case NiklausLexer.INT:
			LOGGER.info("CASE AFFECTATION OF AN INT VALUE");
			write(tab + "mov r0, #" + sub_t.getText());
			write(tab + "str r0, mem_" + nameVariable.getText());
			break;
		
		case NiklausLexer.ADDOP:
			LOGGER.info("CASE AFFECTATION OF A VALUE FROM ADDOP");
			if(sub_t.getChildCount() != 2){
				throw new IOException("EXPRESSION TO AFFECT NOT RECOGNIZED");
			}
			handleExpression(sub_t);
			write(tab + "str r0, mem_" + nameVariable.getText());
			break;
		
		case NiklausLexer.MULTOP:
			LOGGER.info("CASE AFFECTATION OF A VALUE FROM MULTOP");
			if(sub_t.getChildCount() != 2){
				throw new IOException("EXPRESSION TO AFFECT NOT RECOGNIZED");
			}
			handleExpression(sub_t);
			write(tab + "str r0, mem_" + nameVariable.getText());
			break;
			
		}
		LOGGER.info("HANDLING AFFECTATION AST TREE : END");
		
	}
	
	/**
	 * Generates assembly code for write instruction
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleWrite(Tree t) throws IOException{
		LOGGER.info("HANDLING WRITE INSTRUCTION : START");
		if(t.getChildCount() != 1){
			throw new IOException("INVALID WRITE INSTRUCTION");
		}
		Tree expressionToWrite = t.getChild(0);
		handleExpression(expressionToWrite);
		write(tab + "mov r7, #instr_write_" + counter);
		write(tab + "b printInt");
		write("@instr_write_" + counter);
		write(tab + "mov r0, #0");	 // To avoid compilation error, to avoid having two "@..." instructions following each other
		counter ++;
		importAssemblyCodeLib = true;
		LOGGER.info("HANDLING WRITE INSTRUCTION : END");
	}
	
	/**
	 * Generates assembly code for read instruction
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleRead(Tree t) throws IOException{
		LOGGER.info("HANDLING READ INSTRUCTION : START");
		if(t.getChildCount() != 1){
			throw new IOException("INVALID READ INSTRUCTION");
		}
		String varToRead = t.getChild(0).getText();
		checkDeclaredVariable(varToRead);
		// handleExpression(expressionToRead);
		write(tab + "mov r7, #instr_read_" + counter);
		write(tab + "b readInt");
		write("@instr_read_" + counter);
		write(tab + "str r0, mem_" + varToRead);
		// write(tab + "mov r0, #0");	 // To avoid compilation error, to avoid having two "@..." instructions following each other
		counter ++;
		importAssemblyCodeLib = true;
		LOGGER.info("HANDLING READ INSTRUCTION : END");
	}

	/**
	 * Generates assembly code for Comparison instruction
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleComparison(Tree t) throws IOException{
		LOGGER.info("HANDLING COMPARISON INSTRUCTION : START");
		String comparisonOp = t.getText();
		if(t.getChildCount() != 2){
			throw new IOException("INVALID COMPARISON, DOES NOT CONTAIN 2 OPERANDS");
		}
		
		if(comparisonOp.equals("=")   ||
			comparisonOp.equals("<>") ||
			comparisonOp.equals("<")  ||
			comparisonOp.equals(">=")){
			Tree firstOp = t.getChild(0);
			Tree secondOp = t.getChild(1);
			handleExpression(firstOp);
			write(tab + "push r0");
			handleExpression(secondOp);
		}
		else if(comparisonOp.equals(">") || comparisonOp.equals("<=")){
				Tree firstOp = t.getChild(1);
				Tree secondOp = t.getChild(0);
				handleExpression(firstOp);
				write(tab + "push r0");
				handleExpression(secondOp);
			}
		else{
			throw new IOException("INVALID COMPARISON OP : " + comparisonOp);
		}
		
		write(tab + "pop r1");
		write(tab + "cmp r1, r0");
		LOGGER.info("HANDLING COMPARISON INSTRUCTION : END");
	}
	
	/**
	 * Generates assembly code corresponding to the else instructions
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleElse(Tree t) throws IOException{
		LOGGER.info("HANDLING ELSE CASE : START");
		handleInstructionsIter(t);
		LOGGER.info("HANDLING ELSE CASE : END");
	}
	
	/**
	 * Generates assembly code corresponding to the iftrue instructions
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleIfTrue(Tree t) throws IOException{
		LOGGER.info("HANDLING IFTRUE CASE : START");
		handleInstructionsIter(t);
		LOGGER.info("HANDLING IFTRUE CASE : END");
	}
	
	/**
	 * Generates assembly code for If instruction
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleIf(Tree t) throws IOException{
		LOGGER.info("HANDLING IF INSTRUCTION : START");
		if(t.getChildCount() != 3){
			throw new IOException("INVALID IF INSTRUCTION");
		}
		Tree compCondition = t.getChild(0);
		Tree ifInstruction = t.getChild(1);
		Tree elseInstruction = t.getChild(2);
		String comparisonOp = compCondition.getText();
		String strCounter = "" + counter;
		counter ++;
		
		handleComparison(compCondition);		
		if(comparisonOp.equals("=")){
			write(tab + "beq if_true_" + strCounter);
			handleInstruction(elseInstruction);
			write(tab + "b end_test_" + strCounter);
			write("@if_true_" + strCounter);
			handleInstruction(ifInstruction);
		}
		else if(comparisonOp.equals("<>")){
			write(tab + "beq if_true_" + strCounter);
			handleInstruction(ifInstruction);
			write(tab + "b end_test_" + strCounter);
			write("@if_true_" + strCounter);
			handleInstruction(elseInstruction);
		}
		else if(comparisonOp.equals("<") || comparisonOp.equals(">")){
			write(tab + "blt if_true_" + strCounter);
			handleInstruction(elseInstruction);
			write(tab + "b end_test_" + strCounter);
			write("@if_true_" + strCounter);
			handleInstruction(ifInstruction);
		}
		else if(comparisonOp.equals("<=") || comparisonOp.equals(">=")){
			write(tab + "blt if_true_" + strCounter);
			handleInstruction(ifInstruction);
			write(tab + "b end_test_" + strCounter);
			write("@if_true_" + strCounter);
			handleInstruction(elseInstruction);
		}

		write("@end_test_" + strCounter);
		write(tab + "mov r0, #0");
		LOGGER.info("HANDLING IF INSTRUCTION : END");
	}

	/**
	 * Generates assembly code for While instruction
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleWhile(Tree t) throws IOException{
		LOGGER.info("HANDLING WHILE INSTRUCTION : START");
		Tree compCondition = t.getChild(0);
		String comparisonOp = compCondition.getText();
		String strCounter = "" + counter;
		counter ++;
		
		write("@loop_start_" + strCounter);
		handleComparison(compCondition);
		
		if(comparisonOp.equals("=")){
			write(tab + "beq if_true_" + strCounter);
			write(tab + "b loop_end" + strCounter);
			write("@if_true_" + strCounter);
			int nb_nodes = t.getChildCount();
			for(int i = 1; i < nb_nodes; i++){
				Tree subt = t.getChild(i);
				handleInstruction(subt);
			}
			
		}
		else if(comparisonOp.equals("<>")){
			write(tab + "beq loop_end" + strCounter);
			int nb_nodes = t.getChildCount();
			for(int i = 1; i < nb_nodes; i++){
				Tree subt = t.getChild(i);
				handleInstruction(subt);
			}
		}
		else if(comparisonOp.equals("<") || comparisonOp.equals(">")){
			write(tab + "blt if_true_" + strCounter);
			write(tab + "b loop_end" + strCounter);
			write("@if_true_" + strCounter);
			int nb_nodes = t.getChildCount();
			for(int i = 1; i < nb_nodes; i++){
				Tree subt = t.getChild(i);
				handleInstruction(subt);
			}
		}
		else if(comparisonOp.equals("<=") || comparisonOp.equals(">=")){
			write(tab + "blt loop_end" + strCounter);
			int nb_nodes = t.getChildCount();
			for(int i = 1; i < nb_nodes; i++){
				Tree subt = t.getChild(i);
				handleInstruction(subt);
			}
		}
		
		write(tab + "b loop_start_" + strCounter);
		write("@loop_end" + strCounter);
		write(tab + "mov r0, #0");
		LOGGER.info("HANDLING WHILE INSTRUCTION : END");
	}
	
	/**
	 * Method to Handle instruction 
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleInstruction(Tree t) throws IOException{
		LOGGER.info("HANDLING INSTRUCTION : START");
		switch(t.getType()){
		
		case NiklausLexer.VAR:
			LOGGER.info("CASE DECLARATION INSTRUCTION");
			handleDeclaration(t);
			break;
		
		case NiklausLexer.EGAL:
			LOGGER.info("CASE AFFECTATION INSTRUCTION");
			handleAffectation(t);
			break;
			
		case NiklausLexer.WRITE:
			LOGGER.info("CASE WRITE INSTRUCTION");
			handleWrite(t);
			break;
		
		case NiklausLexer.READ:
			LOGGER.info("CASE READ INSTRUCTION");
			handleRead(t);
			break;
		
		case NiklausLexer.IF:
			LOGGER.info("CASE IF INSTRUCTION");
			handleIf(t);
			break;
		
		case NiklausLexer.IFTRUE:
			LOGGER.info("CASE IFTRUE INSTRUCTION");
			handleIfTrue(t);
			break;
		
		case NiklausLexer.IFELSE:
			LOGGER.info("CASE IFELSE INSTRUCTION");
			handleElse(t);
			break;
			
		case NiklausLexer.WHILE:
			LOGGER.info("CASE WHILE INSTRUCTION");
			handleWhile(t);
			break;
		}
		LOGGER.info("HANDLING INSTRUCTION : END");
	}

	/**
	 * Method to handle a Niklaus program block tree and write the assembly corresponding file
	 * @param t Tree
	 * @throws IOException if any error occurred
	 */
	static void handleInstructionsIter(Tree t) throws IOException{
		LOGGER.info("HANDLING INSTRUCTIONS ITER : START");
		int nb_nodes = t.getChildCount();
		for(int i = 0; i < nb_nodes; i++){
			Tree subt = t.getChild(i);
			handleInstruction(subt);
		}
		LOGGER.info("HANDLING INSTRUCTIONS ITER : END");
	}

	/**
     * Method to handle a Niklaus program ast tree and write the assembly corresponding file
	 * @param programAstTree Tree
	 * @param work_dir_ String
	 * @param niklausProgramFile String
	 * @param niklausFileName String
	 * @throws IOException if any error ocurred
	 */
	public void handleProgramCodeTree(Tree programAstTree, String work_dir_, String niklausProgramFile, String niklausFileName) throws IOException {
		// TODO Auto-generated method stub
		setLOGGER();
		LOGGER.warning("COMPILING NIKLAUS PROGRAME FILE : START");
		LOGGER.warning("FILE TO COMPILE : " + niklausFileName + ".niklaus");
		workDir = work_dir_;
		String programName = programAstTree.getText().replaceFirst("program ", "");
		vectorVariables.add(programName.replace('-', '_'));
		assemblyFileName = getAssemblyFileName(niklausFileName);
		libFileName = workDir + "/lib.arm";
		writer = new PrintWriter(assemblyFileName);
		String stackAdress = "end_program_" + programName.replace('-', '_');
		LOGGER.info("COMPILED FILE TO GENERATE : " + assemblyFileName);
		
		try {
			write(tab + "mov r6, #" + stackAdress);
			handleInstructionsIter(programAstTree);
			write("@fin b fin");
			if(importAssemblyCodeLib){
				addAssemblyCodeLib();
			}
			int nb_variables = vectorVariables.size();
			for(int i = 0; i < nb_variables; i++){
				String strVarMem = "mem_" + vectorVariables.get(i);
				write("@" + strVarMem + " rmw 1");
			}
			write("@" + stackAdress + " rmw 1");
			writer.close();
			LOGGER.warning("FILE COMPILED : " + assemblyFileName);
			LOGGER.warning("COMPILING NIKLAUS PROGRAME FILE : END");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.warning("ERROR COMPILING");
	        LOGGER.warning("COMPILING NIKLAUS PROGRAME FILE : END");
	        }	
	}
}
	
	
