package org.overrun.chinawarecode.api.cnw.visit;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.overrun.chinawarecode.api.cnw.CnwBaseVisitor;
import org.overrun.chinawarecode.api.cnw.CnwParser;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeBaseVisitor;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeParser;

import java.io.File;
import java.util.*;

public class CnwVisitor extends CnwCodeBaseVisitor<String> {
    public static final Map<String, Object> global = new HashMap<>();

    @Override
    public String visitMain(CnwCodeParser.MainContext ctx) {
        for (final var allCodeContext : ctx.allCode()) {
            final Map<String, Object> tMap = new HashMap<>();
            visit(allCodeContext, tMap);
        }
        return "";
    }

    public void visit(CnwCodeParser.AllCodeContext ctx, Map<String, Object> map) {
        Map<String, Object> tMap = new HashMap<>();//这个段落内的map
        if (ctx.code() != null) {
            final var code = ctx.code();
            boolean b = code.dec().LA() != null;
            default_(code.dec().last, code.dec().next, map, tMap, b);
        } else if (ctx.for_() != null) {
            final var forContext = ctx.for_();
        } else if (ctx.switch_() != null) {
            final var switchContext = ctx.switch_();
        } else {
            final var ifContext = ctx.if_();
        }
    }
    public void default_(CnwCodeParser.DefaultContext last, CnwCodeParser.DefaultContext next, Map<String, Object> map, Map<String, Object> tMap, boolean b/*用于判断la ra*/) {
        if (b) {
            Object def = null;
            if (next.aBoolean() != null) {
                if (next.aBoolean().b != null) {
                    CnwCodeParser.DefContext b1 = next.aBoolean().b;
                    def = getDef(b1, map, tMap);
                }
            }
            //la的情况
            if (last.var() != null) {
                for (final var name : last.var().names().NAME()) {

                }
            }
            if (last.def().names() != null) {

            }

        } else {

        }
    }

    public Object getDef(CnwCodeParser.DefContext def, Map<String, Object> map, Map<String, Object> tMap) {
        if (def.names() != null) {
            List<TerminalNode> name1 = def.names().NAME();
            if (name1.size() == 1) {
                String key = name1.get(0).getText();
                if (tMap.containsKey(key)) {
                    return tMap.get(key);
                } else if (map.containsKey(key)) {
                    return map.get(key);
                } else return global.getOrDefault(key, null);
            } else {
                List<Object> o = new ArrayList<>();
                for (final var name : name1) {
                    String key = name.getText();
                    if (tMap.containsKey(key)) {
                        o.add(tMap.get(key));
                    } else if (map.containsKey(key)) {
                        o.add(map.get(key));
                    } else if (global.containsKey(key)) {
                        o.add(global.get(key));
                    }
                }
                return o;
            }
        } else if (def.strings() != null) {
            List<TerminalNode> string = def.strings().STRING();
            if (string.size() == 1) {
                return string.get(0).getText();
            } else {
                return string.stream().map(ParseTree::getText).toList();
            }
        } else if (def.ints() != null) {
            List<TerminalNode> anInt = def.ints().INT();
            if (anInt.size() == 1) {
                return Integer.parseInt(anInt.get(0).getText());
            } else {
                return anInt.stream().map(ParseTree::getText).map(Integer::parseInt).toList();
            }
        } else if (def.fileStrings() != null) {
            List<TerminalNode> fstring = def.fileStrings().FSTRING();
            if (fstring.size() == 1) {
                String text = fstring.get(0).getText();
                if (!text.contains(":/")) {
                    int k = -1;
                    String substring = text.substring(0, text.indexOf("/"));
                    File file = new File(System.getProperty("user.dir"));
                    for (int i = 0; i < substring.length(); i++) {
                        if (String.valueOf(substring.charAt(i)).equals(".")) {
                            k++;
                        }
                    }
                    for (int i = 0; i < k; i++) {
                        file = file.getParentFile();
                    }
                    return new File(file, text.substring(text.indexOf("/")));
                } else {
                    String replace = text.replace("/", File.separator);
                    return new File(replace);
                }
            } else {
                List<File> files = new ArrayList<>();
                for (final var f : fstring) {
                    String text = f.getText();
                    if (!text.contains(":/")) {
                        int k = -1;
                        String substring = text.substring(0, text.indexOf("/"));
                        File file = new File(System.getProperty("user.dir"));
                        for (int i = 0; i < substring.length(); i++) {
                            if (String.valueOf(substring.charAt(i)).equals(".")) {
                                k++;
                            }
                        }
                        for (int i = 0; i < k; i++) {
                            file = file.getParentFile();
                        }
                        files.add(new File(file, text.substring(text.indexOf("/"))));
                    } else {
                        String replace = text.replace("/", File.separator);
                        files.add(new File(replace));
                    }
                }
                return files;
            }
        } else if (def.floats() != null) {
            final var aFloat = def.floats().FLOAT();
            if (aFloat.size() == 1) {
                return Float.parseFloat(aFloat.get(0).getText());
            } else {
                List<Float> floats = new ArrayList<>();
                for (final var f : aFloat) {
                    floats.add(Float.parseFloat(f.getText()));
                }
                return floats;
            }
        } else if (def.doubles() != null) {
            final var aDouble = def.doubles().DOUBLE();
            if (aDouble.size() == 1) {
                return Double.parseDouble(aDouble.get(0).getText());
            } else {
                List<Double> doubles = new ArrayList<>();
                for (final var d : aDouble) {
                    doubles.add(Double.parseDouble(d.getText()));
                }
                return doubles;
            }
        } else if (def.longs() != null) {
            final var aLong = def.longs().LONG();
            if (aLong.size() == 1) {
                return Long.parseLong(aLong.get(0).getText());
            } else {
                List<Long> longs = new ArrayList<>();
                for (final var l : aLong) {
                    longs.add(Long.parseLong(l.getText()));
                }
                return longs;
            }
        } else if (def.prenthesesBoolean() != null) {
            final var aBooleanContext = def.prenthesesBoolean().aBoolean();
            CnwCodeParser.DefContext b = aBooleanContext.b;
            if (aBooleanContext.b != null) {
                CnwCodeParser.DefContext b1 = aBooleanContext.b;
            } else {
                CnwCodeParser.DefContext pre = aBooleanContext.pre;
                CnwCodeParser.DefContext sub = aBooleanContext.sub;
            }

        }
        return null;
    }

    public void aBoolean() {

    }

    public boolean getBoolean(CnwCodeParser.DefContext pre, CnwCodeParser.DefContext sub, Map<String, Object> map, Map<String, Object> tMap) {
        String preO = null, subO=null;
        if (pre.names() != null) {
            String key = pre.names().NAME().get(0).getText();
            preO = tMap.containsKey(key) ?
                    String.valueOf(tMap.get(key)) :
                    map.containsKey(key) ?
                            String.valueOf(map.get(key)) :
                            global.containsKey(key) ?
                                    String.valueOf(global.get(key)) :
                                    "";
        }
        if (pre.names() != null) {
            
        }
    }
}
