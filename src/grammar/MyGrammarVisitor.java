// Generated from MyGrammar.g4 by ANTLR 4.9.2
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#grammarStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarStructure(MyGrammarParser.GrammarStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(MyGrammarParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRules(MyGrammarParser.LexerRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(MyGrammarParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parserRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserRules(MyGrammarParser.ParserRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MyGrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MyGrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#returnVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVal(MyGrammarParser.ReturnValContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#myRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyRule(MyGrammarParser.MyRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParts(MyGrammarParser.PartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(MyGrammarParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#inputArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgs(MyGrammarParser.InputArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#inputArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArg(MyGrammarParser.InputArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#inputArgName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgName(MyGrammarParser.InputArgNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(MyGrammarParser.CodeContext ctx);
}