package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CnwParser}.
 */
public interface CnwListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CnwParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(CnwParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(CnwParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CnwParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CnwParser.ExprContext ctx);
}