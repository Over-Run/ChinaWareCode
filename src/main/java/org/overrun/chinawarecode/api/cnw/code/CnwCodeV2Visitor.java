package org.overrun.chinawarecode.api.cnw.code;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CnwCodeV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CnwCodeV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CnwCodeV2Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(CnwCodeV2Parser.IntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong(CnwCodeV2Parser.LongContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#longs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongs(CnwCodeV2Parser.LongsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(CnwCodeV2Parser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#doubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubles(CnwCodeV2Parser.DoublesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(CnwCodeV2Parser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#floats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloats(CnwCodeV2Parser.FloatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CnwCodeV2Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(CnwCodeV2Parser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CnwCodeV2Parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(CnwCodeV2Parser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#fstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstring(CnwCodeV2Parser.FstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#fstrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstrings(CnwCodeV2Parser.FstringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(CnwCodeV2Parser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#booleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleans(CnwCodeV2Parser.BooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(CnwCodeV2Parser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CnwCodeV2Parser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#booleanBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBlock(CnwCodeV2Parser.BooleanBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#booleanRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanRight(CnwCodeV2Parser.BooleanRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#booleanBrace0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBrace0(CnwCodeV2Parser.BooleanBrace0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#vvg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVvg(CnwCodeV2Parser.VvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#brace0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace0(CnwCodeV2Parser.Brace0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#brace1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace1(CnwCodeV2Parser.Brace1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#brace2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace2(CnwCodeV2Parser.Brace2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(CnwCodeV2Parser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#codeRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeRight(CnwCodeV2Parser.CodeRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#codeRights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeRights(CnwCodeV2Parser.CodeRightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#arrayC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayC(CnwCodeV2Parser.ArrayCContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(CnwCodeV2Parser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#boolc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolc(CnwCodeV2Parser.BoolcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#fiw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiw(CnwCodeV2Parser.FiwContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(CnwCodeV2Parser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CnwCodeV2Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#switchC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchC(CnwCodeV2Parser.SwitchCContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#fiwsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiwsBlock(CnwCodeV2Parser.FiwsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#codeFIWS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeFIWS(CnwCodeV2Parser.CodeFIWSContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#allCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllCode(CnwCodeV2Parser.AllCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CnwCodeV2Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CnwCodeV2Parser.MainContext ctx);
}