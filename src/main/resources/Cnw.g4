grammar Cnw;

cnw: STRING;

STRING:'"'NAME'"';
NAME: (~["\\\r\n] | EscapeSequence)*;
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;