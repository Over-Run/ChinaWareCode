package org.overrun.chinawarecode.api.lexer;

import java.util.Arrays;

public class CodeLexer extends Lexer {
    public CodeLexer(IToken... token) {
        this.iTokens = Arrays.stream(token).toList();
    }
}
