package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CnwParser}.
 */
public interface CnwListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CnwParser#cnw}.
	 * @param ctx the parse tree
	 */
	void enterCnw(CnwParser.CnwContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#cnw}.
	 * @param ctx the parse tree
	 */
	void exitCnw(CnwParser.CnwContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(CnwParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(CnwParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CnwParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CnwParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CnwParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CnwParser.FieldContext ctx);
}