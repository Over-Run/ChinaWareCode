package org.overrun.chinawarecode.api;

public enum Token {
    NULL(-1),
    EOI(0),
    END(1),     //=SEMI
    FOR(2),
    WHILE(3),
    IF(4),
    VAR(5),
    VAL(6),
    ID(7),
    LA(8),
    RA(9),
    PLUS(10),   // +
    REDUCE(11), // -
    RIDE(12),   // *
    DIVIDE(13), // /
    LP(14),     // (
    RP(15),     // )
    LS(16),     // [
    RS(17),     // ]
    LB(18),     // {
    RB(19)      // }
    ;
    private final int num;
    Token(int num) {
        this.num = num;
    }

    public int num() {
        return num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
