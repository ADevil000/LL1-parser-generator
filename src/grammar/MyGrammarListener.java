// Generated from MyGrammar.g4 by ANTLR 4.9.2
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#grammarStructure}.
	 * @param ctx the parse tree
	 */
	void enterGrammarStructure(MyGrammarParser.GrammarStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#grammarStructure}.
	 * @param ctx the parse tree
	 */
	void exitGrammarStructure(MyGrammarParser.GrammarStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(MyGrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(MyGrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 */
	void enterLexerRules(MyGrammarParser.LexerRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 */
	void exitLexerRules(MyGrammarParser.LexerRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(MyGrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(MyGrammarParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parserRules}.
	 * @param ctx the parse tree
	 */
	void enterParserRules(MyGrammarParser.ParserRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parserRules}.
	 * @param ctx the parse tree
	 */
	void exitParserRules(MyGrammarParser.ParserRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MyGrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MyGrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(MyGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(MyGrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#returnVal}.
	 * @param ctx the parse tree
	 */
	void enterReturnVal(MyGrammarParser.ReturnValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#returnVal}.
	 * @param ctx the parse tree
	 */
	void exitReturnVal(MyGrammarParser.ReturnValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myRule}.
	 * @param ctx the parse tree
	 */
	void enterMyRule(MyGrammarParser.MyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myRule}.
	 * @param ctx the parse tree
	 */
	void exitMyRule(MyGrammarParser.MyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parts}.
	 * @param ctx the parse tree
	 */
	void enterParts(MyGrammarParser.PartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parts}.
	 * @param ctx the parse tree
	 */
	void exitParts(MyGrammarParser.PartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(MyGrammarParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(MyGrammarParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inputArgs}.
	 * @param ctx the parse tree
	 */
	void enterInputArgs(MyGrammarParser.InputArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inputArgs}.
	 * @param ctx the parse tree
	 */
	void exitInputArgs(MyGrammarParser.InputArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inputArg}.
	 * @param ctx the parse tree
	 */
	void enterInputArg(MyGrammarParser.InputArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inputArg}.
	 * @param ctx the parse tree
	 */
	void exitInputArg(MyGrammarParser.InputArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inputArgName}.
	 * @param ctx the parse tree
	 */
	void enterInputArgName(MyGrammarParser.InputArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inputArgName}.
	 * @param ctx the parse tree
	 */
	void exitInputArgName(MyGrammarParser.InputArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MyGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MyGrammarParser.CodeContext ctx);
}