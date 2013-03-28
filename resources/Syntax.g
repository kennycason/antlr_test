grammar Syntax;

@parser::header { package antlr.gen; }
@lexer::header { package antlr.gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

valid : EXPRESSION+;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

EXPRESSION : INCREMENT | DECREMENT | ASSIGN | COMPARE | LOOP;

WS : ( '\t' | ' ' | NL | '\u000C' )+; // -> skip

NL : '\r' | '\n';

ATOM : NUMBER | SYMBOL;

fragment DIGIT : [0-9];

TWO_DIGIT : DIGIT DIGIT;

ALPHA_DIGIT : ('one'|'two'|'three'|'four'|'five'|'six'|'seven'|'eight'|'nine'|'ten'
|'eleven'|'twelve'|'thirteen'|'fourteen'|'fifteen'|'sixteen'|'seventeen'|'eighteen'|'nineteen'|'twenty');

NUMBER : ('+'|'-'|'neg'|'pos'|'negative'|'positive')? WS* (DIGIT+ | ALPHA_DIGIT+);

SYMBOL : '@' [a-zA-Z_]+ ([a-zA-Z_] | [0-9])*;

INCREMENT : POST_INCREMENT | PRE_INCREMENT;

DECREMENT : POST_DECREMENT | PRE_DECREMENT;

POST_INCREMENT : ATOM WS* '++';

POST_DECREMENT : ATOM WS* '--';

PRE_INCREMENT : '++' WS* ATOM;

PRE_DECREMENT : '--' WS* ATOM;

ASSIGN : SYMBOL WS* '=' WS* ATOM;

COMPARE : ATOM WS* ('<'|'<='|'>'|'>='|'!='|'==') WS* ATOM | '!' WS* ATOM;

fragment BLOCK : WS* (EXPRESSION WS*)* 'end';

LOOP : IF | WHILE | DO;

IF : 'if' WS* COMPARE+ BLOCK;

WHILE : 'while' WS* COMPARE+ BLOCK;

DO : 'do' WS* (EXPRESSION WS*)* 'while' WS* COMPARE+;
