grammar Cnw;

@parser::header {
import java.util.*;
}

@parser::members {
    public static final Map<String, Object> gobals = new HashMap<>();//全局函数不可覆盖
    public final Map<String, Map<String, Object>> VarOrValNameObjectMap = new HashMap<>();//存储var 和 val
    public Object temp = null;

    public static Map<String, Object> getMap(String key) {
        return VarOrValNameObjectMap.get(key);
    }
    public void initVar() {
        VarOrValNameObjectMap.put("var", new HashMap<>());
    }
    public void initVal() {
        VarOrValNameObjectMap.put("val", new HashMap<>());
    }
    public static void a(String hasV, String hasV2, String name, Object o) {
        if(VarOrValNameObjectMap.containsKey(hasV)) {
            initVar();
        }
        if(VarOrValNameObjectMap.containsKey(hasV2)) {
            initVal();
        }
        if(!VarOrValNameObjectMap.get(hasV).containsKey(name)) {
            VarOrValNameObjectMap.get(hasV2).put(name, temp);
        }
    }

    public static void b(String hasV2, String hasV, String name, Object o) {
        if(VarOrValNameObjectMap.containsKey(hasV)) {
            initVar();
        }
        if(VarOrValNameObjectMap.containsKey(hasV2)) {
            initVal();
        }
        var mapV = getMap(hasV);
        var mapV2 = getMap(hasV2);
        if(mapV.containsKey(name)) {
            mapV.put(name, mapV.get(name));
        } else if(!mapV2.containsKey(name)) {
            mapV.put(name, temp);
        } else {
            mapV2.remove(name);
            mapV.put(name, temp);
        }
    }
}

all:
    expr+
    ;

expr:
    pre=expr END
    | pre=expr (LA | RA) sub=expr END
    | 'if' expr '{' all '}' //如果句式
    | (NAME | (NAME ',')+NAME)
    | (STRING | INT | FLOAT | DOUBLE | LONG | BOOL_LITERAL)
    | expr ('+' | '-' | '*' | '/') expr
    | 'val' (NAME | (NAME ',')+NAME)
    | 'var' (NAME | (NAME ',')+NAME)
    | 'gobal' (NAME | (NAME ',')+NAME)
    | expr ('<=' | '=>' | '<>' | '==' | '&&' | '||' | '<' | '>') expr //判断
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