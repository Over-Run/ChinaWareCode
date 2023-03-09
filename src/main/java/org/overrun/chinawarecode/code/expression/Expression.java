package org.overrun.chinawarecode.code.expression;

import org.overrun.chinawarecode.code.Token;

import java.util.HashMap;
import java.util.Map;

public interface Expression {
    int main = 0;
    boolean context(Token token);
    default Map<String, Object> newInstance() {
        return new HashMap<>();
    }
    void interpret(Map<String, Object> map);
}
