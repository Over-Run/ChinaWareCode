grammar CnwCode;

@parser::header {
import java.util.*;
}
@parser::members {
    public static Object temp = null;
}

main:           (allCode)+
    ;
allCode:        code
       |        if
       |        for
       |        switch
       ;
if:             'if' default braceTo
  ;


for:            'for' dec braceTo
   ;
switch:         ('switch' | 'when') default switchBlock
      ;
switchBlock:    '{' (switchOr+ | ) '}'
           ;
switchOr:       (def ':' allCode)
        |       (def ':' braceTo)
        ;
braceTo:        '{' (allCode | ) '}'
       ;
dec:            last=default (LA | RA) next=default;
code:           dec END//基础赋值语句
    ;
val:            'val' names
   ;
var:            'var' names
   ;
operation:      def ('+' | '-' | '*' | '/') def
         ;
prentheses:     '(' code ')'
          ;
prenthesesOperation:     '(' operation ')'
                   ;

brackets:       '[' code ']'
        ;
brace:          '{' code '}'
     ;
prenthesesBoolean:     '(' aBoolean ')'
          ;
aBoolean:       (pre=def ('<=' | '=>' | '==' | '<>' | '<' | '>' | '&&' | '||') sub=def) | b=def;
default:        def
       |        aBoolean
       |        operation
       |        var
       |        val
       ;//对变量的拓展
def:            strings
   |            fileStrings
   |            longs
   |            ints
   |            floats
   |            doubles
   |            names
   |            BOOLEAN
   |            prenthesesBoolean
   |            prenthesesOperation
   ;//最基础的运算
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

//基础判断组和个体,用size判断
names:          NAME
     |          (NAME ',')+NAME
     ;
strings:        STRING {}
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