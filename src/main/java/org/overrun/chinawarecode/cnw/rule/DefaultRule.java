package org.overrun.chinawarecode.cnw.rule;

import org.overrun.chinawarecode.cnw.annotation.CnwMethod;
import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.parboiled.Rule;

import java.util.HashMap;
import java.util.Map;

@CnwRegistry
public class DefaultRule {
    public static final Map<String, Object> default_o = new HashMap<>();
    @CnwMethod(name = "val")
    public static void val(String name) {
        if (name == null) {
            default_o.put(name, null);
        }
    }

    @CnwMethod(name = "var")
    public static void var(String name) {
        default_o.put(name, null);
    }
    @CnwMethod(name = "this")
    public static void this_(String name) {

    }
}
