package org.overrun.chinawarecode.code.expression;

import java.util.ArrayList;
import java.util.List;

public class CodeExpression implements Expression{
    private final List<Expression> expr = new ArrayList<>();
    @Override
    public boolean context(String context) {
        String[] split = context.split("<-");
        for (var s : split) {
            String[] split1 = s.split("->");
        }
        return false;
    }

    @Override
    public void interpret() {

    }
}
