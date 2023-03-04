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

cnw: (var | val | gobal)+;

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

val
    : 'val' name=NAME '<-' field {  b("var", "val", $name.text, temp); } ';'
    ;

gobal
    : 'gobal' name = NAME field {   if(!gobals.containsKey($name.text)) { gobals.put($name.text, temp) } } ';'
    ;

var
    : (('var' (name=NAME {  a("val", "var", $name.text, null); }
            | (name=NAME '<-' field {   a("val", "var", $name.text, temp); })
        )
    )
    | (field '->' 'var' NAME)) ';'
    ;
field
    : str=STRING {  temp = $str.text.substring($str.text.indexOf("\""), $str.text.lastIndexOf("\"")); }
    | int_=INT {    temp = Integer.parseInt($int_.text); }
    | float_=FLOAT {    temp = Float.parseFloat($float_.text); }
    | double_=DOUBLE {  temp = Double.parseDouble($double_.text); }
    | long_=LONG {  temp = Long.parseLong($long_.text); }
    ;
LONG: [0-9]+ 'L';
DOUBLE: [0-9]+ '.' [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+ 'f';
INT: [0-9]+;
NAME: [0-9a-zA-Z]+;//field name
STRING: '"'(~["\\\r\n] | EscapeSequence)*'"';//java字符串
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
LA: '<-';//Left assignment
RA: '->';//Right assignment