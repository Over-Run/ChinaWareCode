grammar CnwCodeV2;
//跳过注释
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

//基础类型
BOOLEAN: 'true'| 'false';
INT:                [0-9]+;//整形
LONG:               INT 'L';//长整形
DOUBLE:             INT '.' INT;//双精数
FLOAT:              INT '.' INT 'f';//浮点数   单精数
NAME:               ([0-9a-zA-Z] | '_')+;//类 方法 字段->名
STRING:             '"'(~["\\\r\n] | EscapeSequence)*'"';//字符串
FSTRING:            '@"'(~["\\\r\n]| EscapeSequence)*'"';//文件组

//拓展基础类型
int: INT;
ints: (INT ',')+INT;
long: LONG;
longs: (LONG ',')+LONG;
double: DOUBLE;
doubles: (DOUBLE ',')+DOUBLE;
float: FLOAT;
floats: (FLOAT ',')+FLOAT;
name: NAME;
names: (NAME ',')+NAME;
string: STRING;
strings: (STRING ',')+STRING;
fstring: FSTRING;
fstrings: (FSTRING ',')+FSTRING;
boolean: BOOLEAN;
booleans: (BOOLEAN ',')+BOOLEAN ;
method: (NAME '.')+NAME brace0;
def: int        | ints
   | long       | longs
   | double     | doubles
   | float      | floats
   | name       | names
   | string     | strings
   | fstring    | fstrings
   | boolean    | booleans
   ;
booleanBlock: (def | booleanBrace0) (BOOLEAN_CHARACTER | ) (booleanRight+ | booleanBrace0) ;
booleanRight:BOOLEAN_CHARACTER def;
booleanBrace0: '(' booleanBlock ')';
vvg: ('var' | 'val' | 'global') (names | name);//var val and global
brace0: '(' (brace0 | code | def | ) ')';
brace1: '[' def ']';
brace2: '{' main '}';
//代码区
code: (arrayC | c) (codeRight | codeRights);
codeRight: ('<-' | '->') ((arrayC | c));
codeRights: codeRight+;
arrayC: '.' c;
c: vvg | boolc;
boolc: booleanBlock | def | brace0;

fiw: ('for' | 'if' | 'while') codeFIWS fiwsBlock ;
switch: 'switch' c switchBlock;
switchBlock: '{' (switchC | ) '}';
switchC: c ':' (fiwsBlock | c);

fiwsBlock: brace2;
codeFIWS: (def | vvg | brace0 | booleanBlock) codeRight;

//主程序
allCode: (code | vvg | method) ';';
main: (allCode | fiw | switch)+ | ;
//fragment
fragment
EscapeSequence:     '\\'  [btnfr"'\\]
              |     '\\'  ([0-3]? [0-7])? [0-7]
              |     '\\'  'u'+ HexDigit HexDigit HexDigit HexDigit
              ;
fragment
HexDigit:           [0-9a-fA-F]
        ;

BOOLEAN_CHARACTER: '<=' | '=>' | '==' | '<>' | '&&' | '||';


