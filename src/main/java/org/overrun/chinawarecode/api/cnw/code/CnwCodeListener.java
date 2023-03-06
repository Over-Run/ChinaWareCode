package org.overrun.chinawarecode.api.cnw.code;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CnwCodeParser}.
 */
public interface CnwCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CnwCodeParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CnwCodeParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#allCode}.
	 * @param ctx the parse tree
	 */
	void enterAllCode(CnwCodeParser.AllCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#allCode}.
	 * @param ctx the parse tree
	 */
	void exitAllCode(CnwCodeParser.AllCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(CnwCodeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(CnwCodeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(CnwCodeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(CnwCodeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(CnwCodeParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(CnwCodeParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(CnwCodeParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(CnwCodeParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#switchOr}.
	 * @param ctx the parse tree
	 */
	void enterSwitchOr(CnwCodeParser.SwitchOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#switchOr}.
	 * @param ctx the parse tree
	 */
	void exitSwitchOr(CnwCodeParser.SwitchOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#braceTo}.
	 * @param ctx the parse tree
	 */
	void enterBraceTo(CnwCodeParser.BraceToContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#braceTo}.
	 * @param ctx the parse tree
	 */
	void exitBraceTo(CnwCodeParser.BraceToContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CnwCodeParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CnwCodeParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(CnwCodeParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(CnwCodeParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(CnwCodeParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(CnwCodeParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CnwCodeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CnwCodeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CnwCodeParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CnwCodeParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#prentheses}.
	 * @param ctx the parse tree
	 */
	void enterPrentheses(CnwCodeParser.PrenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#prentheses}.
	 * @param ctx the parse tree
	 */
	void exitPrentheses(CnwCodeParser.PrenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#prenthesesOperation}.
	 * @param ctx the parse tree
	 */
	void enterPrenthesesOperation(CnwCodeParser.PrenthesesOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#prenthesesOperation}.
	 * @param ctx the parse tree
	 */
	void exitPrenthesesOperation(CnwCodeParser.PrenthesesOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(CnwCodeParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(CnwCodeParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#brace}.
	 * @param ctx the parse tree
	 */
	void enterBrace(CnwCodeParser.BraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#brace}.
	 * @param ctx the parse tree
	 */
	void exitBrace(CnwCodeParser.BraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#prenthesesBoolean}.
	 * @param ctx the parse tree
	 */
	void enterPrenthesesBoolean(CnwCodeParser.PrenthesesBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#prenthesesBoolean}.
	 * @param ctx the parse tree
	 */
	void exitPrenthesesBoolean(CnwCodeParser.PrenthesesBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#aBoolean}.
	 * @param ctx the parse tree
	 */
	void enterABoolean(CnwCodeParser.ABooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#aBoolean}.
	 * @param ctx the parse tree
	 */
	void exitABoolean(CnwCodeParser.ABooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(CnwCodeParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(CnwCodeParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CnwCodeParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CnwCodeParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(CnwCodeParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(CnwCodeParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(CnwCodeParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(CnwCodeParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#fileStrings}.
	 * @param ctx the parse tree
	 */
	void enterFileStrings(CnwCodeParser.FileStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#fileStrings}.
	 * @param ctx the parse tree
	 */
	void exitFileStrings(CnwCodeParser.FileStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#longs}.
	 * @param ctx the parse tree
	 */
	void enterLongs(CnwCodeParser.LongsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#longs}.
	 * @param ctx the parse tree
	 */
	void exitLongs(CnwCodeParser.LongsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(CnwCodeParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(CnwCodeParser.IntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#floats}.
	 * @param ctx the parse tree
	 */
	void enterFloats(CnwCodeParser.FloatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#floats}.
	 * @param ctx the parse tree
	 */
	void exitFloats(CnwCodeParser.FloatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CnwCodeParser#doubles}.
	 * @param ctx the parse tree
	 */
	void enterDoubles(CnwCodeParser.DoublesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CnwCodeParser#doubles}.
	 * @param ctx the parse tree
	 */
	void exitDoubles(CnwCodeParser.DoublesContext ctx);
}