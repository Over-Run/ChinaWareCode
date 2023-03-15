package org.overrun.chinawarecode.api.lexer;

import org.overrun.chinawarecode.api.Token;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    protected List<IToken> iTokens = new ArrayList<>();
    protected List<Lexer> lexers = new ArrayList<>();
}
