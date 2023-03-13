package org.overrun.chinawarecode.cnw;

public enum Token {
    NULL(-1),
    EOI(0),
    SEMI(1),
    PLUS(2),
    TIMES(3),
    LP(4),
    RP(5),
    NUM(6),
    EQ(7),
    ID(8),
    VAR(9),
    VAL(10),
    LA(11),
    RA(12),
    ;
    private final int tokenNum;
    Token(int tokenNum) {
        this.tokenNum = tokenNum;
    }

    public int getTokenNum() {
        return tokenNum;
    }
}
