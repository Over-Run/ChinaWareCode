package org.overrun.chinawarecode.v3;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.support.StringVar;
import org.parboiled.support.Var;

import java.util.HashMap;
import java.util.Map;

public class CnwParser extends BaseParser<Object> {
    public static final Map<String, Object> global = new HashMap<>();
    public Rule main() {
        Map<String,Object> map = new HashMap<>();
        return FirstOf(var(map), val(map));
    }

    public Rule val(Map<String, Object> map) {
        Var<String> name = new Var<>();
        return FirstOf(Sequence("val", name(),LRA() , string(), end()), Sequence(string(),LRA() , "val", name(), end()));
    }

    public Rule var(Map<String, Object> map) {
        return FirstOf(Sequence("var", name(),LRA() , string(), end()), Sequence(string(),LRA() , "var", name(), end()));
    }

    public Rule end() {
        return OneOrMore(';');
    }
    Rule LRA() {
        return FirstOf("<-", "->");
    }

    Rule name() {
        return OneOrMore(
                FirstOf(
                        CharRange('a', 'z'),
                        CharRange('A', 'Z'),
                        '_',
                        CharRange('0', '9'),
                        '$'
                )
        );
    }

    public Rule string() {
        return Sequence(
                '"',
                ZeroOrMore(
                        FirstOf(
                                Escape(),
                                Sequence(TestNot(AnyOf("\r\n\"\\")), ANY)
                        )
                ).suppressSubnodes(),
                '"'
        );
    }

    Rule Escape() {
        return Sequence('\\', FirstOf(AnyOf("btnfr\"\'\\"), OctalEscape(), UnicodeEscape()));
    }

    Rule OctalEscape() {
        return FirstOf(
                Sequence(CharRange('0', '3'), CharRange('0', '7'), CharRange('0', '7')),
                Sequence(CharRange('0', '7'), CharRange('0', '7')),
                CharRange('0', '7')
        );
    }

    Rule UnicodeEscape() {
        return Sequence(OneOrMore('u'), HexDigit(), HexDigit(), HexDigit(), HexDigit());
    }

    Rule HexDigit() {
        return FirstOf(CharRange('a', 'f'), CharRange('A', 'F'), CharRange('0', '9'));
    }
}
