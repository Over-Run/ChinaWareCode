package org.overrun.chinawarecode.api.cnw.code;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CnwCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CnwCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CnwCodeParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#allCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllCode(CnwCodeParser.AllCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CnwCodeParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CnwCodeParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(CnwCodeParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CnwCodeParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#switchOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchOr(CnwCodeParser.SwitchOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#braceTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceTo(CnwCodeParser.BraceToContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CnwCodeParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(CnwCodeParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(CnwCodeParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CnwCodeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(CnwCodeParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#prentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrentheses(CnwCodeParser.PrenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#prenthesesOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrenthesesOperation(CnwCodeParser.PrenthesesOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(CnwCodeParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace(CnwCodeParser.BraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#prenthesesBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrenthesesBoolean(CnwCodeParser.PrenthesesBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#aBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitABoolean(CnwCodeParser.ABooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(CnwCodeParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CnwCodeParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(CnwCodeParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(CnwCodeParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#fileStrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStrings(CnwCodeParser.FileStringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#longs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongs(CnwCodeParser.LongsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(CnwCodeParser.IntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#floats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloats(CnwCodeParser.FloatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeParser#doubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubles(CnwCodeParser.DoublesContext ctx);
}