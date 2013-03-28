grammar Syntax;

@parser::header { package antlr.gen; }
@lexer::header { package antlr.gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

valid : SYNTAX+;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

SYNTAX : INCREMENT | DECREMENT | SET;

WS : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+; // -> skip

fragment DIGIT : [0-9];

TWO_DIGIT : DIGIT DIGIT;

ALPHA_DIGIT : ('one'|'two'|'three'|'four'|'five'|'six'|'seven'|'eight'|'nine'|'ten'
|'eleven'|'twelve'|'thirteen'|'fourteen'|'fifteen'|'sixteen'|'seventeen'|'eighteen'|'nineteen'|'twenty');

NUMBER : DIGIT+ | ALPHA_DIGIT+;

VAR : '@' [a-zA-Z]+;

INCREMENT : VAR WS* '++';

DECREMENT : VAR WS* '--';

SET : VAR WS* '=' WS* (NUMBER | VAR);
