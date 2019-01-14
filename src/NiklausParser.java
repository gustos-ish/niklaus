// $ANTLR null C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g 2019-01-13 12:17:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NiklausParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "COMMENT", "EGAL", "ID", 
		"IF", "IFELSE", "IFTRUE", "INT", "MULTOP", "PROGRAMID", "READ", "SIGNE", 
		"VAR", "WHILE", "WRITE", "WS", "'('", "')'", "','", "';'", "'else'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int ADDOP=4;
	public static final int COMMENT=5;
	public static final int EGAL=6;
	public static final int ID=7;
	public static final int IF=8;
	public static final int IFELSE=9;
	public static final int IFTRUE=10;
	public static final int INT=11;
	public static final int MULTOP=12;
	public static final int PROGRAMID=13;
	public static final int READ=14;
	public static final int SIGNE=15;
	public static final int VAR=16;
	public static final int WHILE=17;
	public static final int WRITE=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NiklausParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NiklausParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return NiklausParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:1: program : PROGRAMID ^ ';' ! ( declaration )? '{' ! ( instruction )* '}' !;
	public final NiklausParser.program_return program() throws RecognitionException {
		NiklausParser.program_return retval = new NiklausParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PROGRAMID1=null;
		Token char_literal2=null;
		Token char_literal4=null;
		Token char_literal6=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope instruction5 =null;

		Object PROGRAMID1_tree=null;
		Object char_literal2_tree=null;
		Object char_literal4_tree=null;
		Object char_literal6_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:9: ( PROGRAMID ^ ';' ! ( declaration )? '{' ! ( instruction )* '}' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:11: PROGRAMID ^ ';' ! ( declaration )? '{' ! ( instruction )* '}' !
			{
			root_0 = (Object)adaptor.nil();


			PROGRAMID1=(Token)match(input,PROGRAMID,FOLLOW_PROGRAMID_in_program38); 
			PROGRAMID1_tree = (Object)adaptor.create(PROGRAMID1);
			root_0 = (Object)adaptor.becomeRoot(PROGRAMID1_tree, root_0);

			char_literal2=(Token)match(input,23,FOLLOW_23_in_program41); 
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:28: ( declaration )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==VAR) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:28: declaration
					{
					pushFollow(FOLLOW_declaration_in_program45);
					declaration3=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration3.getTree());

					}
					break;

			}

			char_literal4=(Token)match(input,25,FOLLOW_25_in_program49); 
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:47: ( instruction )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ID && LA2_0 <= IF)||LA2_0==READ||(LA2_0 >= WHILE && LA2_0 <= WRITE)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:12:47: instruction
					{
					pushFollow(FOLLOW_instruction_in_program52);
					instruction5=instruction();
					state._fsp--;

					adaptor.addChild(root_0, instruction5.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			char_literal6=(Token)match(input,26,FOLLOW_26_in_program55); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:14:1: declaration : VAR ^ ( ID ',' !)* ID ';' !;
	public final NiklausParser.declaration_return declaration() throws RecognitionException {
		NiklausParser.declaration_return retval = new NiklausParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR7=null;
		Token ID8=null;
		Token char_literal9=null;
		Token ID10=null;
		Token char_literal11=null;

		Object VAR7_tree=null;
		Object ID8_tree=null;
		Object char_literal9_tree=null;
		Object ID10_tree=null;
		Object char_literal11_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:14:13: ( VAR ^ ( ID ',' !)* ID ';' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:14:16: VAR ^ ( ID ',' !)* ID ';' !
			{
			root_0 = (Object)adaptor.nil();


			VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration67); 
			VAR7_tree = (Object)adaptor.create(VAR7);
			root_0 = (Object)adaptor.becomeRoot(VAR7_tree, root_0);

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:14:21: ( ID ',' !)*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==22) ) {
						alt3=1;
					}

				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:14:23: ID ',' !
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration72); 
					ID8_tree = (Object)adaptor.create(ID8);
					adaptor.addChild(root_0, ID8_tree);

					char_literal9=(Token)match(input,22,FOLLOW_22_in_declaration74); 
					}
					break;

				default :
					break loop3;
				}
			}

			ID10=(Token)match(input,ID,FOLLOW_ID_in_declaration80); 
			ID10_tree = (Object)adaptor.create(ID10);
			adaptor.addChild(root_0, ID10_tree);

			char_literal11=(Token)match(input,23,FOLLOW_23_in_declaration82); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:1: instruction : ( write_exp | read_var | condition | affectation | loop );
	public final NiklausParser.instruction_return instruction() throws RecognitionException {
		NiklausParser.instruction_return retval = new NiklausParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope write_exp12 =null;
		ParserRuleReturnScope read_var13 =null;
		ParserRuleReturnScope condition14 =null;
		ParserRuleReturnScope affectation15 =null;
		ParserRuleReturnScope loop16 =null;


		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:13: ( write_exp | read_var | condition | affectation | loop )
			int alt4=5;
			switch ( input.LA(1) ) {
			case WRITE:
				{
				alt4=1;
				}
				break;
			case READ:
				{
				alt4=2;
				}
				break;
			case IF:
				{
				alt4=3;
				}
				break;
			case ID:
				{
				alt4=4;
				}
				break;
			case WHILE:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:15: write_exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_write_exp_in_instruction93);
					write_exp12=write_exp();
					state._fsp--;

					adaptor.addChild(root_0, write_exp12.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:25: read_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_var_in_instruction95);
					read_var13=read_var();
					state._fsp--;

					adaptor.addChild(root_0, read_var13.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:34: condition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condition_in_instruction97);
					condition14=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition14.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:44: affectation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_affectation_in_instruction99);
					affectation15=affectation();
					state._fsp--;

					adaptor.addChild(root_0, affectation15.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:16:56: loop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_loop_in_instruction101);
					loop16=loop();
					state._fsp--;

					adaptor.addChild(root_0, loop16.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class write_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "write_exp"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:18:1: write_exp : WRITE ^ expr ';' !;
	public final NiklausParser.write_exp_return write_exp() throws RecognitionException {
		NiklausParser.write_exp_return retval = new NiklausParser.write_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WRITE17=null;
		Token char_literal19=null;
		ParserRuleReturnScope expr18 =null;

		Object WRITE17_tree=null;
		Object char_literal19_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:18:12: ( WRITE ^ expr ';' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:18:14: WRITE ^ expr ';' !
			{
			root_0 = (Object)adaptor.nil();


			WRITE17=(Token)match(input,WRITE,FOLLOW_WRITE_in_write_exp110); 
			WRITE17_tree = (Object)adaptor.create(WRITE17);
			root_0 = (Object)adaptor.becomeRoot(WRITE17_tree, root_0);

			pushFollow(FOLLOW_expr_in_write_exp113);
			expr18=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr18.getTree());

			char_literal19=(Token)match(input,23,FOLLOW_23_in_write_exp114); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "write_exp"


	public static class read_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read_var"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:20:1: read_var : READ ^ ID ';' !;
	public final NiklausParser.read_var_return read_var() throws RecognitionException {
		NiklausParser.read_var_return retval = new NiklausParser.read_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ20=null;
		Token ID21=null;
		Token char_literal22=null;

		Object READ20_tree=null;
		Object ID21_tree=null;
		Object char_literal22_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:20:11: ( READ ^ ID ';' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:20:13: READ ^ ID ';' !
			{
			root_0 = (Object)adaptor.nil();


			READ20=(Token)match(input,READ,FOLLOW_READ_in_read_var125); 
			READ20_tree = (Object)adaptor.create(READ20);
			root_0 = (Object)adaptor.becomeRoot(READ20_tree, root_0);

			ID21=(Token)match(input,ID,FOLLOW_ID_in_read_var128); 
			ID21_tree = (Object)adaptor.create(ID21);
			adaptor.addChild(root_0, ID21_tree);

			char_literal22=(Token)match(input,23,FOLLOW_23_in_read_var129); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_var"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:22:1: condition : IF ^ comparaison iftrue ifelse ;
	public final NiklausParser.condition_return condition() throws RecognitionException {
		NiklausParser.condition_return retval = new NiklausParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF23=null;
		ParserRuleReturnScope comparaison24 =null;
		ParserRuleReturnScope iftrue25 =null;
		ParserRuleReturnScope ifelse26 =null;

		Object IF23_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:22:12: ( IF ^ comparaison iftrue ifelse )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:22:14: IF ^ comparaison iftrue ifelse
			{
			root_0 = (Object)adaptor.nil();


			IF23=(Token)match(input,IF,FOLLOW_IF_in_condition140); 
			IF23_tree = (Object)adaptor.create(IF23);
			root_0 = (Object)adaptor.becomeRoot(IF23_tree, root_0);

			pushFollow(FOLLOW_comparaison_in_condition144);
			comparaison24=comparaison();
			state._fsp--;

			adaptor.addChild(root_0, comparaison24.getTree());

			pushFollow(FOLLOW_iftrue_in_condition146);
			iftrue25=iftrue();
			state._fsp--;

			adaptor.addChild(root_0, iftrue25.getTree());

			pushFollow(FOLLOW_ifelse_in_condition148);
			ifelse26=ifelse();
			state._fsp--;

			adaptor.addChild(root_0, ifelse26.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class ifelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifelse"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:1: ifelse : 'else' '{' ( instruction )* '}' -> ^( IFELSE ( instruction )* ) ;
	public final NiklausParser.ifelse_return ifelse() throws RecognitionException {
		NiklausParser.ifelse_return retval = new NiklausParser.ifelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token char_literal28=null;
		Token char_literal30=null;
		ParserRuleReturnScope instruction29 =null;

		Object string_literal27_tree=null;
		Object char_literal28_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:9: ( 'else' '{' ( instruction )* '}' -> ^( IFELSE ( instruction )* ) )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:11: 'else' '{' ( instruction )* '}'
			{
			string_literal27=(Token)match(input,24,FOLLOW_24_in_ifelse157);  
			stream_24.add(string_literal27);

			char_literal28=(Token)match(input,25,FOLLOW_25_in_ifelse159);  
			stream_25.add(char_literal28);

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:22: ( instruction )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ID && LA5_0 <= IF)||LA5_0==READ||(LA5_0 >= WHILE && LA5_0 <= WRITE)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:22: instruction
					{
					pushFollow(FOLLOW_instruction_in_ifelse161);
					instruction29=instruction();
					state._fsp--;

					stream_instruction.add(instruction29.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			char_literal30=(Token)match(input,26,FOLLOW_26_in_ifelse164);  
			stream_26.add(char_literal30);

			// AST REWRITE
			// elements: instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 24:38: -> ^( IFELSE ( instruction )* )
			{
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:41: ^( IFELSE ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFELSE, "IFELSE"), root_1);
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:24:50: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_instruction.nextTree());
				}
				stream_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifelse"


	public static class iftrue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "iftrue"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:1: iftrue : '{' ( instruction )* '}' -> ^( IFTRUE ( instruction )* ) ;
	public final NiklausParser.iftrue_return iftrue() throws RecognitionException {
		NiklausParser.iftrue_return retval = new NiklausParser.iftrue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope instruction32 =null;

		Object char_literal31_tree=null;
		Object char_literal33_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:9: ( '{' ( instruction )* '}' -> ^( IFTRUE ( instruction )* ) )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:11: '{' ( instruction )* '}'
			{
			char_literal31=(Token)match(input,25,FOLLOW_25_in_iftrue182);  
			stream_25.add(char_literal31);

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:15: ( instruction )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= ID && LA6_0 <= IF)||LA6_0==READ||(LA6_0 >= WHILE && LA6_0 <= WRITE)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:15: instruction
					{
					pushFollow(FOLLOW_instruction_in_iftrue184);
					instruction32=instruction();
					state._fsp--;

					stream_instruction.add(instruction32.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			char_literal33=(Token)match(input,26,FOLLOW_26_in_iftrue186);  
			stream_26.add(char_literal33);

			// AST REWRITE
			// elements: instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 26:31: -> ^( IFTRUE ( instruction )* )
			{
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:34: ^( IFTRUE ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFTRUE, "IFTRUE"), root_1);
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:26:43: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_instruction.nextTree());
				}
				stream_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iftrue"


	public static class comparaison_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparaison"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:28:1: comparaison : expr SIGNE ^ expr ;
	public final NiklausParser.comparaison_return comparaison() throws RecognitionException {
		NiklausParser.comparaison_return retval = new NiklausParser.comparaison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SIGNE35=null;
		ParserRuleReturnScope expr34 =null;
		ParserRuleReturnScope expr36 =null;

		Object SIGNE35_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:28:12: ( expr SIGNE ^ expr )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:28:15: expr SIGNE ^ expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_comparaison203);
			expr34=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr34.getTree());

			SIGNE35=(Token)match(input,SIGNE,FOLLOW_SIGNE_in_comparaison205); 
			SIGNE35_tree = (Object)adaptor.create(SIGNE35);
			root_0 = (Object)adaptor.becomeRoot(SIGNE35_tree, root_0);

			pushFollow(FOLLOW_expr_in_comparaison208);
			expr36=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr36.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparaison"


	public static class loop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loop"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:30:1: loop : WHILE ^ '(' ! comparaison ')' ! '{' ! ( instruction )* '}' !;
	public final NiklausParser.loop_return loop() throws RecognitionException {
		NiklausParser.loop_return retval = new NiklausParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE37=null;
		Token char_literal38=null;
		Token char_literal40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		ParserRuleReturnScope comparaison39 =null;
		ParserRuleReturnScope instruction42 =null;

		Object WHILE37_tree=null;
		Object char_literal38_tree=null;
		Object char_literal40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:30:6: ( WHILE ^ '(' ! comparaison ')' ! '{' ! ( instruction )* '}' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:30:8: WHILE ^ '(' ! comparaison ')' ! '{' ! ( instruction )* '}' !
			{
			root_0 = (Object)adaptor.nil();


			WHILE37=(Token)match(input,WHILE,FOLLOW_WHILE_in_loop216); 
			WHILE37_tree = (Object)adaptor.create(WHILE37);
			root_0 = (Object)adaptor.becomeRoot(WHILE37_tree, root_0);

			char_literal38=(Token)match(input,20,FOLLOW_20_in_loop219); 
			pushFollow(FOLLOW_comparaison_in_loop222);
			comparaison39=comparaison();
			state._fsp--;

			adaptor.addChild(root_0, comparaison39.getTree());

			char_literal40=(Token)match(input,21,FOLLOW_21_in_loop224); 
			char_literal41=(Token)match(input,25,FOLLOW_25_in_loop227); 
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:30:42: ( instruction )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ID && LA7_0 <= IF)||LA7_0==READ||(LA7_0 >= WHILE && LA7_0 <= WRITE)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:30:42: instruction
					{
					pushFollow(FOLLOW_instruction_in_loop230);
					instruction42=instruction();
					state._fsp--;

					adaptor.addChild(root_0, instruction42.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			char_literal43=(Token)match(input,26,FOLLOW_26_in_loop233); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loop"


	public static class affectation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affectation"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:32:1: affectation : ID EGAL ^ expr ';' !;
	public final NiklausParser.affectation_return affectation() throws RecognitionException {
		NiklausParser.affectation_return retval = new NiklausParser.affectation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID44=null;
		Token EGAL45=null;
		Token char_literal47=null;
		ParserRuleReturnScope expr46 =null;

		Object ID44_tree=null;
		Object EGAL45_tree=null;
		Object char_literal47_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:32:13: ( ID EGAL ^ expr ';' !)
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:32:15: ID EGAL ^ expr ';' !
			{
			root_0 = (Object)adaptor.nil();


			ID44=(Token)match(input,ID,FOLLOW_ID_in_affectation242); 
			ID44_tree = (Object)adaptor.create(ID44);
			adaptor.addChild(root_0, ID44_tree);

			EGAL45=(Token)match(input,EGAL,FOLLOW_EGAL_in_affectation244); 
			EGAL45_tree = (Object)adaptor.create(EGAL45);
			root_0 = (Object)adaptor.becomeRoot(EGAL45_tree, root_0);

			pushFollow(FOLLOW_expr_in_affectation247);
			expr46=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr46.getTree());

			char_literal47=(Token)match(input,23,FOLLOW_23_in_affectation248); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affectation"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:34:1: expr : term ( ADDOP ^ term )* ;
	public final NiklausParser.expr_return expr() throws RecognitionException {
		NiklausParser.expr_return retval = new NiklausParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ADDOP49=null;
		ParserRuleReturnScope term48 =null;
		ParserRuleReturnScope term50 =null;

		Object ADDOP49_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:34:6: ( term ( ADDOP ^ term )* )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:34:8: term ( ADDOP ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_expr258);
			term48=term();
			state._fsp--;

			adaptor.addChild(root_0, term48.getTree());

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:34:13: ( ADDOP ^ term )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ADDOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:34:14: ADDOP ^ term
					{
					ADDOP49=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_expr261); 
					ADDOP49_tree = (Object)adaptor.create(ADDOP49);
					root_0 = (Object)adaptor.becomeRoot(ADDOP49_tree, root_0);

					pushFollow(FOLLOW_term_in_expr264);
					term50=term();
					state._fsp--;

					adaptor.addChild(root_0, term50.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:36:1: term : factor ( MULTOP ^ factor )* ;
	public final NiklausParser.term_return term() throws RecognitionException {
		NiklausParser.term_return retval = new NiklausParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTOP52=null;
		ParserRuleReturnScope factor51 =null;
		ParserRuleReturnScope factor53 =null;

		Object MULTOP52_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:36:6: ( factor ( MULTOP ^ factor )* )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:36:8: factor ( MULTOP ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term274);
			factor51=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor51.getTree());

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:36:15: ( MULTOP ^ factor )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==MULTOP) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:36:16: MULTOP ^ factor
					{
					MULTOP52=(Token)match(input,MULTOP,FOLLOW_MULTOP_in_term277); 
					MULTOP52_tree = (Object)adaptor.create(MULTOP52);
					root_0 = (Object)adaptor.becomeRoot(MULTOP52_tree, root_0);

					pushFollow(FOLLOW_factor_in_term280);
					factor53=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor53.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:1: factor : ( ID | INT | ( '(' ! expr ')' !) );
	public final NiklausParser.factor_return factor() throws RecognitionException {
		NiklausParser.factor_return retval = new NiklausParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID54=null;
		Token INT55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope expr57 =null;

		Object ID54_tree=null;
		Object INT55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;

		try {
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:8: ( ID | INT | ( '(' ! expr ')' !) )
			int alt10=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt10=1;
				}
				break;
			case INT:
				{
				alt10=2;
				}
				break;
			case 20:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:10: ID
					{
					root_0 = (Object)adaptor.nil();


					ID54=(Token)match(input,ID,FOLLOW_ID_in_factor290); 
					ID54_tree = (Object)adaptor.create(ID54);
					adaptor.addChild(root_0, ID54_tree);

					}
					break;
				case 2 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:15: INT
					{
					root_0 = (Object)adaptor.nil();


					INT55=(Token)match(input,INT,FOLLOW_INT_in_factor294); 
					INT55_tree = (Object)adaptor.create(INT55);
					adaptor.addChild(root_0, INT55_tree);

					}
					break;
				case 3 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:21: ( '(' ! expr ')' !)
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:21: ( '(' ! expr ')' !)
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:38:23: '(' ! expr ')' !
					{
					char_literal56=(Token)match(input,20,FOLLOW_20_in_factor300); 
					pushFollow(FOLLOW_expr_in_factor303);
					expr57=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr57.getTree());

					char_literal58=(Token)match(input,21,FOLLOW_21_in_factor305); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAMID_in_program38 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program41 = new BitSet(new long[]{0x0000000002010000L});
	public static final BitSet FOLLOW_declaration_in_program45 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program49 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_instruction_in_program52 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_26_in_program55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration67 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_declaration72 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_declaration74 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_declaration80 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_declaration82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_exp_in_instruction93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_var_in_instruction95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_instruction97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affectation_in_instruction99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_instruction101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_write_exp110 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_expr_in_write_exp113 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_write_exp114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_var125 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_read_var128 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_read_var129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_condition140 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_comparaison_in_condition144 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_iftrue_in_condition146 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ifelse_in_condition148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_ifelse157 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ifelse159 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_instruction_in_ifelse161 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_26_in_ifelse164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_iftrue182 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_instruction_in_iftrue184 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_26_in_iftrue186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_comparaison203 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_SIGNE_in_comparaison205 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_expr_in_comparaison208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_loop216 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_loop219 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_comparaison_in_loop222 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_loop224 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_loop227 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_instruction_in_loop230 = new BitSet(new long[]{0x0000000004064180L});
	public static final BitSet FOLLOW_26_in_loop233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_affectation242 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EGAL_in_affectation244 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_expr_in_affectation247 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_affectation248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr258 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_expr261 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_term_in_expr264 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term274 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_MULTOP_in_term277 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_factor_in_term280 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ID_in_factor290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_factor294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_factor300 = new BitSet(new long[]{0x0000000000100880L});
	public static final BitSet FOLLOW_expr_in_factor303 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_factor305 = new BitSet(new long[]{0x0000000000000002L});
}
