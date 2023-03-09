package org.overrun.chinawarecode.code;

public enum Token {
    RA("->"), LA("<-"), STRING("\"");
    public final String get;
    Token(String get) {
        this.get = get;
    }
}
