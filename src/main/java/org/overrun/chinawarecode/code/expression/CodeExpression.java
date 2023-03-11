package org.overrun.chinawarecode.code.expression;

import org.overrun.chinawarecode.code.Token;
import org.overrun.chinawarecode.code.expression.def.TempExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class CodeExpression implements Expression{
    private final Map<String, Object> map = newInstance();
    private final List<TempExpression> expr = new ArrayList<>();
    public CodeExpression(String context) {
        if (context.contains(Token.LA.get)) {
            String[] split = context.split(Token.LA.get);
            for (var s : split) {
                if (s.contains(Token.RA.get)) {
                    String[] split1 = s.split(Token.RA.get);
                    for (var s1: split1) {
                        expr.add(new TempExpression(s1));
                        expr.add(new TempExpression(Token.RA));
                    }
                } else {
                    expr.add(new TempExpression(s));
                    expr.add(new TempExpression(Token.LA));
                }
            }
        }
    }
    @Override
    public boolean context(Token token) {
        return true;
    }

    @Override
    public void interpret(Map<String, Object> map) {

    }
}
