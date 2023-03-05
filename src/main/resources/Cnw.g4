grammar Cnw;

all:
    expr+
    ;

expr: lambda | field | laOrRa | operations;
lambda:     (pre=expr_        LAMBDA code=expr_)
      |     (pre=expr_        LAMBDA sub=expr_ LAMBDA code=expr_)
      ;
field:      pre=expr_        end=END
    ;
laOrRa:     pre_l=expr_      (LA | RA)                                               sub_l=expr_
      ;
operations: pre=expr_        (PLUS | REDUCE | RIDE | DIVIDE)                         sub=expr_
          ;
expr_:      pre=expr_        COMPARER                                                sub=expr_ //判断
    |       pre=expr_        MOVE                                                    sub=expr_
    |       if='if' pre=expr_ code=expr_ //如果句式
    |       for='for' pre_for=expr_ code_for=expr_
    |       switch=('switch' | 'when' | 'converter') pre=expr_ '{' (sub=expr_ ':' (code=expr_ | ('{' code=expr_ '}')))+ '}'
    |       prentheses
    |       brackets
    |       brace
    |       name
    |       string
    |       fileString
    |       int
    |       float
    |       double
    |       long
    |       bool
    |       val='val'       (NAME | (NAME ',')+NAME)
    |       var='var'       (NAME | (NAME ',')+NAME)
    |       global='global'    (NAME | (NAME ',')+NAME)
    ;
move:
    ;
prentheses: '(' (expr_ | all) ')'
          ;
brackets:   '[' (expr_ | all) ']'
        ;
brace:      '{' (expr_ | all) '}'
     ;
name:       ('.' | )    NAME
    |       ('.' | )    (NAME ',')+NAME
    ;
string:     ('.' | )    STRING
      |     ('.' | )    (STRING ',')+STRING
      ;
fileString: ('.' | )    FSTRING //string
          | ('.' | )    (FSTRING ',')+FSTRING //file strings
          ;
int:        ('.' | )    INT
   |        ('.' | )    (INT ',')+INT
   ;
float:      ('.' | )    FLOAT
     |      ('.' | )    (FLOAT ',')+FLOAT
     ;
double:     ('.' | )    DOUBLE
      |     ('.' | )    (DOUBLE ',')+DOUBLE
      ;
long:       ('.' | )    LONG
    |       ('.' | )    (LONG ',')+LONG
    ;
bool:       ('.' | )    BOOL_LITERAL
    |       ('.' | )    (BOOL_LITERAL ',')+BOOL_LITERAL
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
NAME:           ([0-9a-zA-Z] | '_')+;//field name
STRING:         '"'(~["\\\r\n] | EscapeSequence)*'"';//java字符串
FSTRING:        '@"'(~["\\\r\n]| EscapeSequence)*'"';


fragment    EscapeSequence
    : '\\'  [btnfr"'\\]
    | '\\'  ([0-3]? [0-7])? [0-7]
    | '\\'  'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment    HexDigit
    :       [0-9a-fA-F]
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