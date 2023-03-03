package org.overrun.chinawarecode.cnw.rule;

import org.overrun.chinawarecode.cnw.annotation.CnwMethod;
import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.parboiled.Rule;

import java.util.HashMap;
import java.util.Map;

import static org.overrun.chinawarecode.cnw.rewriterule.ReRule.*;
import static org.parboiled.BaseParser.ANY;

import java.lang.String;

@CnwRegistry
public class DefaultRule {
    public static final Map<String, Object> default_o = new HashMap<>();
    public static void val(String name) {
        if (name == null) {
            default_o.put(name, null);
        }
    }


    public static void var(String name) {
        default_o.put(name, null);
    }

    public static Rule var() {
        return Sequence("var", Name(), "<-", Method());
    }

    public static Rule Method() {
        return FirstOf(String(), Integer(), Float());
    }

    public static Rule Name() {
        return ZeroOrMore(Sequence(TestNot(AnyOf("\r\n\"\\")), ANY));
    }

    public static Rule String() {
        return Sequence('"', Name(), '"');
    }

    public static Rule Integer() {
        return ZeroOrMore(CharRange('0', '9'));
    }

    public static Rule Float() {
        return Sequence(
                FirstOf(
                        Sequence(
                                CharRange('0', '9'),
                                '.',
                                OneOrMore(
                                        CharRange('0', '9')
                                )
                        ),
                        CharRange('0', '9')
                ),
                FirstOf('f', 'F')
        );
    }
    @CnwMethod(name = "main")
    public static Rule Main() {
        return Method();
    }
}
