grammar Cnw;

all:
    expr+
    ;

expr:
        pre=expr END
    |   'if' expr '{' all '}' //如果句式
    |   'for' expr '{' all '}'
    |   pre=expr (LA | RA) sub=expr
    |   (',' | ) (NAME | (NAME ',')+NAME)
    |   (',' | ) ((STRING | INT | FLOAT | DOUBLE | LONG | BOOL_LITERAL) | ((STRING | INT | FLOAT | DOUBLE | LONG | BOOL_LITERAL) ',')+ (STRING | INT | FLOAT | DOUBLE | LONG | BOOL_LITERAL))
    |   expr ('+' | '-' | '*' | '/') expr
    |   'val' (NAME | (NAME ',')+NAME)
    |   'var' (NAME | (NAME ',')+NAME)
    |   'gobal' (NAME | (NAME ',')+NAME)
    |   expr ('<=' | '=>' | '<>' | '==' | '&&' | '||' | '<' | '>') expr //判断
    ;

BOOLEAN: BOOL_LITERAL;
BOOL_LITERAL:       'true'
            |       'false'
            ;

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

LONG:           [0-9]+ 'L';
DOUBLE:         [0-9]+ '.' [0-9]+;
FLOAT:          [0-9]+ '.' [0-9]+ 'f';
INT:            [0-9]+;
NAME:           [0-9a-zA-Z]+;//field name
STRING:         '"'(~["\\\r\n] | EscapeSequence)*'"';//java字符串


fragment EscapeSequence
    : '\\'  [btnfr"'\\]
    | '\\'  ([0-3]? [0-7])? [0-7]
    | '\\'  'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
LA: '<-';//Left assignment
RA: '->';//Right assignment
END: ';';