package org.overrun.chinawarecode.api.cnw.visit;

import org.overrun.chinawarecode.api.cnw.CnwBaseVisitor;
import org.overrun.chinawarecode.api.cnw.CnwParser;

import java.util.HashMap;
import java.util.Map;

public class CnwVisitor extends CnwBaseVisitor<String> {
    public static final Map<String, Object> global = new HashMap<>();
    @Override
    public String visitExpr(CnwParser.ExprContext ctx) {
        Map<String, Object> map = new HashMap<>();
        visit(ctx, map);
        return "";
    }

    public void visit(CnwParser.ExprContext ctx, Map<String, Object> map) {
        final Map<String, Object> a = new HashMap<>(map);
        if (ctx.for_ != null) {
            if (ctx.pre_for.pre_l != null) {
                ctx.pre_for.pre_l.
            }
        } else if (ctx.switch_ != null) {

        } else if (ctx.if_ != null) {

        }
        a.clear();//最后的时候清除map并等待gc回收
    }

}
