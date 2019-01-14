// $ANTLR null C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g 2019-01-13 12:17:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NiklausLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public NiklausLexer() {} 
	public NiklausLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public NiklausLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g"; }

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:2:7: ( '(' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:3:7: ( ')' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:4:7: ( ',' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:4:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:5:7: ( ';' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:5:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:6:7: ( 'else' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:6:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:7:7: ( '{' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:7:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:8:7: ( '}' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:8:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:41:6: ( 'read' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:41:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:43:5: ( 'var' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:43:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:45:8: ( 'write' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:45:10: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "EGAL"
	public final void mEGAL() throws RecognitionException {
		try {
			int _type = EGAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:47:7: ( ':=' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:47:8: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EGAL"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:49:8: ( 'while' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:49:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:51:4: ( 'if' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:51:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:53:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:53:7: ( '0' .. '9' )+
			{
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:53:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:55:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:55:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:55:18: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:55:32: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:55:32: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:57:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:57:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:64:7: ( '+' | '-' | 'mod' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case '+':
				{
				alt4=1;
				}
				break;
			case '-':
				{
				alt4=2;
				}
				break;
			case 'm':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:64:9: '+'
					{
					match('+'); 
					}
					break;
				case 2 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:64:15: '-'
					{
					match('-'); 
					}
					break;
				case 3 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:64:21: 'mod'
					{
					match("mod"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULTOP"
	public final void mMULTOP() throws RecognitionException {
		try {
			int _type = MULTOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:66:8: ( '*' | '/' )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTOP"

	// $ANTLR start "PROGRAMID"
	public final void mPROGRAMID() throws RecognitionException {
		try {
			int _type = PROGRAMID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:10: ( 'program' ( ' ' )* ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* ) )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:12: 'program' ( ' ' )* ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			{
			match("program"); 

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:22: ( ' ' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:22: ' '
					{
					match(' '); 
					}
					break;

				default :
					break loop5;
				}
			}

			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:27: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:68:52: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAMID"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:70:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:70:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:70:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "SIGNE"
	public final void mSIGNE() throws RecognitionException {
		try {
			int _type = SIGNE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:8: ( '<' | '>' | '<>' | '<=' | '>=' | '=' )
			int alt8=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				switch ( input.LA(2) ) {
				case '>':
					{
					alt8=3;
					}
					break;
				case '=':
					{
					alt8=4;
					}
					break;
				default:
					alt8=1;
				}
				}
				break;
			case '>':
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2=='=') ) {
					alt8=5;
				}

				else {
					alt8=2;
				}

				}
				break;
			case '=':
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:11: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:17: '>'
					{
					match('>'); 
					}
					break;
				case 3 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:23: '<>'
					{
					match("<>"); 

					}
					break;
				case 4 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:30: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:35: '>='
					{
					match(">="); 

					}
					break;
				case 6 :
					// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:72:41: '='
					{
					match('='); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNE"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | READ | VAR | WRITE | EGAL | WHILE | IF | INT | COMMENT | WS | ADDOP | MULTOP | PROGRAMID | ID | SIGNE )
		int alt9=21;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:10: T__20
				{
				mT__20(); 

				}
				break;
			case 2 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:16: T__21
				{
				mT__21(); 

				}
				break;
			case 3 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:22: T__22
				{
				mT__22(); 

				}
				break;
			case 4 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:28: T__23
				{
				mT__23(); 

				}
				break;
			case 5 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:34: T__24
				{
				mT__24(); 

				}
				break;
			case 6 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:40: T__25
				{
				mT__25(); 

				}
				break;
			case 7 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:46: T__26
				{
				mT__26(); 

				}
				break;
			case 8 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:52: READ
				{
				mREAD(); 

				}
				break;
			case 9 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:57: VAR
				{
				mVAR(); 

				}
				break;
			case 10 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:61: WRITE
				{
				mWRITE(); 

				}
				break;
			case 11 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:67: EGAL
				{
				mEGAL(); 

				}
				break;
			case 12 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:72: WHILE
				{
				mWHILE(); 

				}
				break;
			case 13 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:78: IF
				{
				mIF(); 

				}
				break;
			case 14 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:81: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:85: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:93: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:96: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 18 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:102: MULTOP
				{
				mMULTOP(); 

				}
				break;
			case 19 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:109: PROGRAMID
				{
				mPROGRAMID(); 

				}
				break;
			case 20 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:119: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// C:\\Users\\User\\Documents\\CentraleSupelec\\3A\\KitBE_TdL\\Niklaus.g:1:122: SIGNE
				{
				mSIGNE(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\5\uffff\1\24\2\uffff\3\24\1\uffff\1\24\1\uffff\1\22\2\uffff\1\24\1\uffff"+
		"\1\24\2\uffff\5\24\1\44\1\uffff\4\24\1\51\2\24\1\uffff\1\20\1\24\1\55"+
		"\1\56\1\uffff\3\24\2\uffff\1\62\1\63\1\24\2\uffff\2\24\1\uffff\2\66";
	static final String DFA9_eofS =
		"\71\uffff";
	static final String DFA9_minS =
		"\1\11\4\uffff\1\154\2\uffff\1\145\1\141\1\150\1\uffff\1\146\1\uffff\1"+
		"\57\2\uffff\1\157\1\uffff\1\162\2\uffff\1\163\1\141\1\162\2\151\1\60\1"+
		"\uffff\1\144\1\157\1\145\1\144\1\60\1\164\1\154\1\uffff\1\60\1\147\2\60"+
		"\1\uffff\2\145\1\162\2\uffff\2\60\1\141\2\uffff\1\155\1\40\1\uffff\2\60";
	static final String DFA9_maxS =
		"\1\175\4\uffff\1\154\2\uffff\1\145\1\141\1\162\1\uffff\1\146\1\uffff\1"+
		"\57\2\uffff\1\157\1\uffff\1\162\2\uffff\1\163\1\141\1\162\2\151\1\172"+
		"\1\uffff\1\144\1\157\1\145\1\144\1\172\1\164\1\154\1\uffff\1\172\1\147"+
		"\2\172\1\uffff\2\145\1\162\2\uffff\2\172\1\141\2\uffff\1\155\1\172\1\uffff"+
		"\2\172";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\3\uffff\1\13\1\uffff\1\16\1\uffff"+
		"\1\20\1\21\1\uffff\1\22\1\uffff\1\24\1\25\6\uffff\1\17\7\uffff\1\15\4"+
		"\uffff\1\11\3\uffff\1\5\1\10\3\uffff\1\12\1\14\2\uffff\1\23\2\uffff";
	static final String DFA9_specialS =
		"\71\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\7\uffff\1\1\1\2\1\22\1\20\1\3\1\20\1"+
			"\uffff\1\16\12\15\1\13\1\4\3\25\2\uffff\32\24\4\uffff\1\24\1\uffff\4"+
			"\24\1\5\3\24\1\14\3\24\1\21\2\24\1\23\1\24\1\10\3\24\1\11\1\12\3\24\1"+
			"\6\1\uffff\1\7",
			"",
			"",
			"",
			"",
			"\1\26",
			"",
			"",
			"\1\27",
			"\1\30",
			"\1\32\11\uffff\1\31",
			"",
			"\1\33",
			"",
			"\1\34",
			"",
			"",
			"\1\35",
			"",
			"\1\36",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\52",
			"\1\53",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\54",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\64",
			"",
			"",
			"\1\65",
			"\1\66\40\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | READ | VAR | WRITE | EGAL | WHILE | IF | INT | COMMENT | WS | ADDOP | MULTOP | PROGRAMID | ID | SIGNE );";
		}
	}

}
