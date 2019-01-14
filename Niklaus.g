grammar Niklaus;

options { 
	output = AST ;
}

tokens {
	IFTRUE;
	IFELSE;
}

program :	PROGRAMID^ ';'!  declaration?  '{'! instruction* '}'! ; 

declaration :	 VAR^ ( ID ','! )* ID ';'! ; 

instruction :	write_exp|read_var|condition|affectation|loop;

write_exp 	:	WRITE^ expr';'! ;

read_var 	:	READ^ ID';'! ;

condition 	:	IF^  comparaison iftrue ifelse;

ifelse  :	'else' '{' instruction* '}'-> ^(IFELSE instruction*) ;

iftrue  :	'{' instruction*'}' -> ^(IFTRUE instruction*);

comparaison:	 expr SIGNE^ expr;

loop	:	WHILE^ '('! comparaison ')'! '{'! instruction* '}'!;

affectation :	ID EGAL^ expr';'! ;

expr	:	term (ADDOP^ term)*;

term	:	factor (MULTOP^ factor)*;

factor	:	ID | INT | ( '('! expr ')'! );


READ	: 'read';

VAR	: 'var';

WRITE 	: 'write';

EGAL 	:':=';

WHILE 	:'while';

IF	:'if';

INT :	'0'..'9'+;

COMMENT :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

ADDOP	:	'+' | '-' | 'mod' ;

MULTOP	:	'*' | '/';

PROGRAMID:	'program' ' '* (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*);

ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

SIGNE 	:	 '<' | '>' | '<>' | '<='|'>=' |'=';
