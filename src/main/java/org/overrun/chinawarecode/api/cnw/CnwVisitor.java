package org.overrun.chinawarecode.api.cnw;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

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
	 * Visit a parse tree produced by {@link CnwParser#cnw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnw(CnwParser.CnwContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(CnwParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CnwParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CnwParser.FieldContext ctx);
}