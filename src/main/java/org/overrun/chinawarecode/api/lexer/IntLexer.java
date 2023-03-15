package org.overrun.chinawarecode.api.lexer;

import org.overrun.chinawarecode.api.Token;

public class IntLexer extends Lexer {
    public IntLexer(String text) {
        int i = Integer.parseInt(text);
        iTokens.add(new IToken(Token.INT, i));
    }
    public int getInt() {
        return (int) iTokens.get(0).o();
    }
}
