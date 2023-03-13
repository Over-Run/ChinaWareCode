package org.overrun.chinawarecode.api;

import static org.parboiled.BaseParser.EOI;

public class Loader {
    private static String text = """
            for a <- b {
                val c <- it;
            }
            """;
    private static StringBuilder temp = new StringBuilder();
    private static int mode = 0;
    /**
     * @since 读取代码
     */
    public static void load(String text) {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case ';' : temp.append(" ").append(Token.END);
                case '{' : temp.append(" ").append(Token.LB);
                case '}' : temp.append(" ").append(Token.RB);
                case '[' : temp.append(" ").append(Token.LS)
            }
        }
    }



}
