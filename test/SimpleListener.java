// Generated from Simple.g4 by ANTLR 4.5.2

    import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SimpleParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SimpleParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SimpleParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SimpleParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(SimpleParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(SimpleParser.RepeatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SimpleParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SimpleParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SimpleParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SimpleParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SimpleParser.VarContext ctx);
}