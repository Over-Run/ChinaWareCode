package org.overrun.chinawarecode.code.expression.def;

import org.overrun.chinawarecode.code.Token;
import org.overrun.chinawarecode.code.expression.Expression;

import java.util.Map;

public class TempExpression implements Expression {
    private final String context;
    private Expression expression;
    public TempExpression(Token token) {
        this.context = token.get;
    }
    public TempExpression(String context) {
        this.context = context;
    }


    @Override
    public boolean context(Token token) {
        if (context.contains(token.get)) {
            switch (token) {
                case STRING:
                    expression = new StringExpression(context, token);
                    break;
            }
        }
        return true;
    }

    @Override
    public void interpret(Map<String, Object> map) {

    }

    public String getContext() {
        return context;
    }
}
