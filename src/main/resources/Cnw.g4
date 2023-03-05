grammar Cnw;

all:
    expr+
    ;

expr:   pre=expr END
    |   if //如果句式
    |   for
    |   pre=expr (LA | RA) sub=expr
    |   pre=expr (PLUS | REDUCE | RIDE | DIVIDE) sub=expr
    |   '(' expr ')'
    |   '[' expr ']'
    |   '{' expr '}'
    |   ('.' | )    NAME // name
    |   ('.' | )    (NAME ',')+NAME //names
    |   ('.' | )    STRING //string
    |   ('.' | )    (STRING ',')+STRING //file strings
    |   ('.' | )    FSTRING //string
    |   ('.' | )    (FSTRING ',')+FSTRING //file strings
    |   ('.' | )    INT
    |   ('.' | )    (INT ',')+INT
    |   ('.' | )    FLOAT
    |   ('.' | )    (FLOAT ',')+FLOAT
    |   ('.' | )    DOUBLE
    |   ('.' | )    (DOUBLE ',')+DOUBLE
    |   ('.' | )    LONG
    |   ('.' | )    (LONG ',')+LONG
    |   ('.' | )    BOOL_LITERAL
    |   ('.' | )    (BOOL_LITERAL ',')+BOOL_LITERAL
    |   'val'       (NAME | (NAME ',')+NAME)
    |   'var'       (NAME | (NAME ',')+NAME)
    |   'gobal'     (NAME | (NAME ',')+NAME)
    |   expr ('<=' | '=>' | '<>' | '==' | '&&' | '||' | '<' | '>') expr //判断
    ;

if:
  'if' expr '{' all '}'
  ;
for:
   'for' expr '{' all '}'
   ;

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
FSTRING:        '@"'(~["\\\r\n]| EscapeSequence)*'"';


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
PLUS: '+';
REDUCE: '-';
RIDE: '*';
DIVIDE: '/';