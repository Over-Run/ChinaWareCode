package org.overrun.chinawarecode.code.expression.def;

import org.overrun.chinawarecode.code.Token;
import org.overrun.chinawarecode.code.expression.Expression;

import java.util.Map;

public class StringExpression implements Expression {
    private final String context;
    public StringExpression(String context, Token token) {
        this.context = context.substring(context.indexOf(token.get) + 1, context.lastIndexOf(token.get));
    }

    @Override
    public boolean context(Token token) {
        return true;
    }

    @Override
    public void interpret(Map<String, Object> map) {

    }

    public String getContext() {
        return context;
    }
}
