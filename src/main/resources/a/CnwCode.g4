grammar CnwCode;

main:           code+
    ;



code:           (default (LA | RA) default)
                END
    ;
val:            'val' names
   ;
var:            'var' names
   ;
names:          NAME
     |          (NAME ',')+NAME
     ;
strings:        STRING
       |        (STRING ',')+STRING
       ;
fileStrings:    FSTRING
           |    (FSTRING ',')+FSTRING
           ;
longs:           LONG
    |           (LONG ',')+LONG
    ;
ints:            INT
   |            (INT ',')+INT
   ;
floats:          FLOAT
     |          (FLOAT ',')+FLOAT
     ;
doubles:        DOUBLE
       |        (DOUBLE ',')+DOUBLE
       ;
aBoolean: default ('<=' | '=>' | '==' | '<>' | '<' | '>' | '&&' | '||') default;
default:        strings
       |        fileStrings
       |        longs
       |        ints
       |        floats
       |        doubles
       |        names
       |        BOOLEAN
       |        var
       |        val
       ;

BOOLEAN:       'true'
       |       'false'
       ;

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

INT:                [0-9]+;
LONG:               INT 'L';
DOUBLE:             INT '.' INT;
FLOAT:              INT '.' INT 'f';
NAME:               ([0-9a-zA-Z] | '_')+;//field name
STRING:             '"'(~["\\\r\n] | EscapeSequence)*'"';//字符串
FSTRING:            '@"'(~["\\\r\n]| EscapeSequence)*'"';//文件组


fragment
EscapeSequence:     '\\'  [btnfr"'\\]
              |     '\\'  ([0-3]? [0-7])? [0-7]
              |     '\\'  'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment
HexDigit:           [0-9a-fA-F]
    ;
LA:         '<-';//Left assignment
RA:         '->';//Right assignment
END:        ';';
PLUS:       '+';
REDUCE:     '-';
RIDE:       '*';
DIVIDE:     '/';
COMPARER: '<=' | '=>' | '<>' | '==' | '&&' | '||' | '<' | '>';
MOVE: '<<' | '>>' | '<<<' | '>>>';
LAMBDA: ':::';