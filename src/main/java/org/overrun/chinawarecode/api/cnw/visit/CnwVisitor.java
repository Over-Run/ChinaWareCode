package org.overrun.chinawarecode.api.cnw.visit;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.overrun.chinawarecode.api.cnw.CnwBaseVisitor;
import org.overrun.chinawarecode.api.cnw.CnwParser;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeBaseVisitor;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeParser;

import java.io.File;
import java.util.*;

import static org.overrun.chinawarecode.api.cnw.code.CnwCodeParser.temp;

public class CnwVisitor extends CnwCodeBaseVisitor<String> {
    public static final Map<String, Object> global = new HashMap<>();

    @Override
    public String visitStrings(CnwCodeParser.StringsContext ctx) {
        List<TerminalNode> string = ctx.STRING();
        if (string.size() == 1) {
            temp = string.get(0).getText();
        } else {
            temp = string.stream().map(ParseTree::getText).toList();
        }
        return "load string success";
    }

    @Override
    public String visitInts(CnwCodeParser.IntsContext ctx) {
        List<TerminalNode> anInt = ctx.INT();
        if (anInt.size() == 1) {
            temp = Integer.parseInt(anInt.get(0).getText());
        } else {
            temp = anInt.stream().map(ParseTree::getText).map(Integer::parseInt).toList();
        }
        return "load int success";
    }

    @Override
    public String visitFloats(CnwCodeParser.FloatsContext ctx) {
        List<TerminalNode> aFloat = ctx.FLOAT();
        if (aFloat.size() == 1) {
            temp = Float.parseFloat(aFloat.get(0).getText());
        } else {
            temp = aFloat.stream().map(ParseTree::getText).map(Float::parseFloat).toList();
        }
        return "load floats success";
    }

    @Override
    public String visitDoubles(CnwCodeParser.DoublesContext ctx) {
        List<TerminalNode> aDouble = ctx.DOUBLE();
        if (aDouble.size() == 1) {
            temp = Double.parseDouble(aDouble.get(0).getText());
        } else {
            temp = aDouble.stream().map(ParseTree::getText).map(Double::parseDouble).toList();
        }
        return "load doubles success";
    }

    @Override
    public String visitLongs(CnwCodeParser.LongsContext ctx) {
        List<TerminalNode> aLong = ctx.LONG();
        if (aLong.size() == 1) {
            temp = Long.parseLong(aLong.get(0).getText());
        } else {
            temp = aLong.stream().map(ParseTree::getText).map(Long::parseLong).toList();
        }
        return "load longs success";
    }

    @Override
    public String visitFileStrings(CnwCodeParser.FileStringsContext ctx) {
        List<TerminalNode> fstring = ctx.FSTRING();
        if (fstring.size() == 1) {

            temp = getFStringValue(fstring.get(0).getText());
        } else {
            temp = fstring.stream().map(ParseTree::getText).map(this::getFStringValue).toList();
        }
        return super.visitFileStrings(ctx);
    }

    public File getFStringValue(String text) {
        File file;
        if (text.contains(":/")) {
            return new File(text.replace("/", File.separator));
        } else {
            file = new File(System.getProperty("user.dir"));
            if (text.charAt(0) != '.' || text.charAt(0) != '/') {
                return new File(file, text.replace("/", File.separator));
            } else {
                String replace = text.substring(text.indexOf('/') + 1).replace("/", File.separator);
                if (text.indexOf('/') == 0) {
                    return new File(file, replace);
                } else {
                    int k = -1;
                    String t = text.substring(0, text.indexOf('/'));
                    for (int i = 0; i < t.length(); i++) if (t.charAt(i) == '.') k++;
                    for (int i = 0; i < k; i++) {
                        file = file.getParentFile();
                    }
                    return new File(file, replace);
                }
            }
        }
    }

    @Override
    public String visitMain(CnwCodeParser.MainContext ctx) {
        for (final var allCodeContext : ctx.allCode()) {
            final Map<String, Object> tMap = new HashMap<>();
        }
        return "";
    }
}
