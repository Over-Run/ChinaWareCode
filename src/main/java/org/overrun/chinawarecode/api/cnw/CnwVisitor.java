package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CnwParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CnwVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CnwParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(CnwParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CnwParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CnwParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CnwParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(CnwParser.SwitchContext ctx);
}