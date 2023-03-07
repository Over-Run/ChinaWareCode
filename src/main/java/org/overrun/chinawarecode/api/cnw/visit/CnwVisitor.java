package org.overrun.chinawarecode.api.cnw.visit;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeV2BaseVisitor;
import org.overrun.chinawarecode.api.cnw.code.CnwCodeV2Parser;

import java.io.File;
import java.util.*;

public class CnwVisitor extends CnwCodeV2BaseVisitor<String> {
    public Object temp = null;
    public static final Map<String, Object> global = new HashMap<>();

    //基本实现
    @Override
    public String visitAllCode(CnwCodeV2Parser.AllCodeContext ctx) {
        return super.visitAllCode(ctx);
    }
    //基本实现
    @Override
    public String visitFiw(CnwCodeV2Parser.FiwContext ctx) {
        return super.visitFiw(ctx);
    }
    //基本实现
    @Override
    public String visitSwitch(CnwCodeV2Parser.SwitchContext ctx) {
        return super.visitSwitch(ctx);
    }
}
