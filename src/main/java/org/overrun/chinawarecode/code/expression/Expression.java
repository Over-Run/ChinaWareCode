package org.overrun.chinawarecode.code.expression;

public interface Expression {
    int main = 0;
    boolean context(String context);
    void interpret();
}
