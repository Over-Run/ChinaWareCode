package org.overrun.chinawarecode.cnw;

import java.util.Scanner;

import static org.overrun.chinawarecode.cnw.Token.*;

public class CnwLexer {
    private Token lookAhead = NULL;  // 当前的标签
    public String text = "";  // 当前分析子字符串
    public int leng = 0;
    public int lineno = 0;
    private String input_buffer = "";
    private String current = "";

    private boolean isId(char c) {
        return Character.isAlphabetic(c) ||
                c == '_' || c == '$';
    }
    private boolean isNum(char c) {
        return Character.isDigit(c);
    }
    private boolean isKeyWord(String c) {
        return c.equals("int");
    }

    private Token lex() {

        while (true) {
            while (current.equals("")) {
                Scanner s = new Scanner(System.in);

                while (true) {
                    String line = s.nextLine();
                    //System.out.print(line);
                    if (line.equals("end")) {
                        break;
                    }
                    input_buffer += line;
                }
                s.close();

                if (input_buffer.length() == 0) {
                    current = "";
                    return EOI;
                }

                current = input_buffer;
                ++lineno;//当前的行号
                current = current.trim();
            }//while (current != "")
            for (int i = 0; i < current.length(); ) {
                leng = 0;
                text = current.substring(0, 1);
                switch (current.charAt(i)) {
                    case ';': current = current.substring(1); return SEMI;
                    case '+': current = current.substring(1); return PLUS;
                    case '*': current = current.substring(1);return TIMES;
                    case '(': current = current.substring(1);return LP;
                    case ')': current = current.substring(1);return RP;
                    case '=': current = current.substring(1);return EQ;
                    case '\n':
                    case '\t':
                    case ' ': current = current.substring(1); break;
                    default:
                        if(isNum(current.charAt(i))){
                            while (isNum(current.charAt(i))) {
                                i++;
                                leng++;

                            }
                            text = current.substring(0, leng);
                            current = current.substring(leng);
                            return switch (text) {
                                case "var" -> VAR;
                                case "val" -> VAL;
                                default -> NUM;
                            };
                        }
                        else if (isId(current.charAt(i)))
                        {
                            while (isId(current.charAt(i))) {
                                i++;
                                leng++;
                            }
                            text = current.substring(0, leng);
                            current = current.substring(leng);
                            return switch (text) {
                                case "var" -> VAR;
                                case "val" -> VAL;
                                default -> ID;
                            };

                        }

                        else
                        {
                            System.out.println("Ignoring illegal input: " + current.charAt(i));
                        }

                        break;
                } //switch (current.charAt(i))
            }//  for (int i = 0; i < current.length(); i++)
        }//while (true)
    }//lex()

    public boolean match(Token token) {
        if (lookAhead.getTokenNum() == -1) {
            lookAhead = lex();
        }
        return token == lookAhead;
    }

    public void advance() {
        lookAhead = lex();
    }


    public void runLexer() {
        while (!match(EOI)) {
            System.out.println("Token: " + token() + " ,Symbol: " + text);
            advance();
        }
    }

    private String token() {
        return switch (lookAhead) {
            case EOI -> "EOI";
            case PLUS -> "PLUS";
            case TIMES -> "TIMES";
            case NUM -> "NUM";
            case SEMI -> "SEMI";
            case LP -> "LP";
            case RP -> "RP";
            case EQ -> "EQ";
            case ID -> "ID";
            case VAR -> "VAR";
            case VAL -> "VAL";
            case LA -> "<-";
            case RA -> "->";
            default -> "";
        };
    }

}
