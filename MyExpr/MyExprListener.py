# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyExprParser import MyExprParser
else:
    from MyExprParser import MyExprParser

# This class defines a complete listener for a parse tree produced by MyExprParser.
class MyExprListener(ParseTreeListener):

    # Enter a parse tree produced by MyExprParser#type_ptr.
    def enterType_ptr(self, ctx:MyExprParser.Type_ptrContext):
        pass

    # Exit a parse tree produced by MyExprParser#type_ptr.
    def exitType_ptr(self, ctx:MyExprParser.Type_ptrContext):
        pass


    # Enter a parse tree produced by MyExprParser#type_int.
    def enterType_int(self, ctx:MyExprParser.Type_intContext):
        pass

    # Exit a parse tree produced by MyExprParser#type_int.
    def exitType_int(self, ctx:MyExprParser.Type_intContext):
        pass


    # Enter a parse tree produced by MyExprParser#program.
    def enterProgram(self, ctx:MyExprParser.ProgramContext):
        pass

    # Exit a parse tree produced by MyExprParser#program.
    def exitProgram(self, ctx:MyExprParser.ProgramContext):
        pass


    # Enter a parse tree produced by MyExprParser#global_declaration.
    def enterGlobal_declaration(self, ctx:MyExprParser.Global_declarationContext):
        pass

    # Exit a parse tree produced by MyExprParser#global_declaration.
    def exitGlobal_declaration(self, ctx:MyExprParser.Global_declarationContext):
        pass


    # Enter a parse tree produced by MyExprParser#parameter_list.
    def enterParameter_list(self, ctx:MyExprParser.Parameter_listContext):
        pass

    # Exit a parse tree produced by MyExprParser#parameter_list.
    def exitParameter_list(self, ctx:MyExprParser.Parameter_listContext):
        pass


    # Enter a parse tree produced by MyExprParser#function.
    def enterFunction(self, ctx:MyExprParser.FunctionContext):
        pass

    # Exit a parse tree produced by MyExprParser#function.
    def exitFunction(self, ctx:MyExprParser.FunctionContext):
        pass


    # Enter a parse tree produced by MyExprParser#block_items.
    def enterBlock_items(self, ctx:MyExprParser.Block_itemsContext):
        pass

    # Exit a parse tree produced by MyExprParser#block_items.
    def exitBlock_items(self, ctx:MyExprParser.Block_itemsContext):
        pass


    # Enter a parse tree produced by MyExprParser#func_compound_statement.
    def enterFunc_compound_statement(self, ctx:MyExprParser.Func_compound_statementContext):
        pass

    # Exit a parse tree produced by MyExprParser#func_compound_statement.
    def exitFunc_compound_statement(self, ctx:MyExprParser.Func_compound_statementContext):
        pass


    # Enter a parse tree produced by MyExprParser#compound_statement.
    def enterCompound_statement(self, ctx:MyExprParser.Compound_statementContext):
        pass

    # Exit a parse tree produced by MyExprParser#compound_statement.
    def exitCompound_statement(self, ctx:MyExprParser.Compound_statementContext):
        pass


    # Enter a parse tree produced by MyExprParser#block_item.
    def enterBlock_item(self, ctx:MyExprParser.Block_itemContext):
        pass

    # Exit a parse tree produced by MyExprParser#block_item.
    def exitBlock_item(self, ctx:MyExprParser.Block_itemContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_ret.
    def enterStat_ret(self, ctx:MyExprParser.Stat_retContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_ret.
    def exitStat_ret(self, ctx:MyExprParser.Stat_retContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_expr.
    def enterStat_expr(self, ctx:MyExprParser.Stat_exprContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_expr.
    def exitStat_expr(self, ctx:MyExprParser.Stat_exprContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_condition.
    def enterStat_condition(self, ctx:MyExprParser.Stat_conditionContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_condition.
    def exitStat_condition(self, ctx:MyExprParser.Stat_conditionContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_compound.
    def enterStat_compound(self, ctx:MyExprParser.Stat_compoundContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_compound.
    def exitStat_compound(self, ctx:MyExprParser.Stat_compoundContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_for_loop_no_declr.
    def enterStat_for_loop_no_declr(self, ctx:MyExprParser.Stat_for_loop_no_declrContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_for_loop_no_declr.
    def exitStat_for_loop_no_declr(self, ctx:MyExprParser.Stat_for_loop_no_declrContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_for_loop_declr.
    def enterStat_for_loop_declr(self, ctx:MyExprParser.Stat_for_loop_declrContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_for_loop_declr.
    def exitStat_for_loop_declr(self, ctx:MyExprParser.Stat_for_loop_declrContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_while_loop.
    def enterStat_while_loop(self, ctx:MyExprParser.Stat_while_loopContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_while_loop.
    def exitStat_while_loop(self, ctx:MyExprParser.Stat_while_loopContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_do_loop.
    def enterStat_do_loop(self, ctx:MyExprParser.Stat_do_loopContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_do_loop.
    def exitStat_do_loop(self, ctx:MyExprParser.Stat_do_loopContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_break.
    def enterStat_break(self, ctx:MyExprParser.Stat_breakContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_break.
    def exitStat_break(self, ctx:MyExprParser.Stat_breakContext):
        pass


    # Enter a parse tree produced by MyExprParser#stat_continue.
    def enterStat_continue(self, ctx:MyExprParser.Stat_continueContext):
        pass

    # Exit a parse tree produced by MyExprParser#stat_continue.
    def exitStat_continue(self, ctx:MyExprParser.Stat_continueContext):
        pass


    # Enter a parse tree produced by MyExprParser#declaration_expr.
    def enterDeclaration_expr(self, ctx:MyExprParser.Declaration_exprContext):
        pass

    # Exit a parse tree produced by MyExprParser#declaration_expr.
    def exitDeclaration_expr(self, ctx:MyExprParser.Declaration_exprContext):
        pass


    # Enter a parse tree produced by MyExprParser#declaration.
    def enterDeclaration(self, ctx:MyExprParser.DeclarationContext):
        pass

    # Exit a parse tree produced by MyExprParser#declaration.
    def exitDeclaration(self, ctx:MyExprParser.DeclarationContext):
        pass


    # Enter a parse tree produced by MyExprParser#return_stat.
    def enterReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass

    # Exit a parse tree produced by MyExprParser#return_stat.
    def exitReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass


    # Enter a parse tree produced by MyExprParser#condition_expression.
    def enterCondition_expression(self, ctx:MyExprParser.Condition_expressionContext):
        pass

    # Exit a parse tree produced by MyExprParser#condition_expression.
    def exitCondition_expression(self, ctx:MyExprParser.Condition_expressionContext):
        pass


    # Enter a parse tree produced by MyExprParser#expression.
    def enterExpression(self, ctx:MyExprParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyExprParser#expression.
    def exitExpression(self, ctx:MyExprParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MyExprParser#assign_none.
    def enterAssign_none(self, ctx:MyExprParser.Assign_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#assign_none.
    def exitAssign_none(self, ctx:MyExprParser.Assign_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#assign.
    def enterAssign(self, ctx:MyExprParser.AssignContext):
        pass

    # Exit a parse tree produced by MyExprParser#assign.
    def exitAssign(self, ctx:MyExprParser.AssignContext):
        pass


    # Enter a parse tree produced by MyExprParser#condition_none.
    def enterCondition_none(self, ctx:MyExprParser.Condition_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#condition_none.
    def exitCondition_none(self, ctx:MyExprParser.Condition_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#condition.
    def enterCondition(self, ctx:MyExprParser.ConditionContext):
        pass

    # Exit a parse tree produced by MyExprParser#condition.
    def exitCondition(self, ctx:MyExprParser.ConditionContext):
        pass


    # Enter a parse tree produced by MyExprParser#or_operate.
    def enterOr_operate(self, ctx:MyExprParser.Or_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#or_operate.
    def exitOr_operate(self, ctx:MyExprParser.Or_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#or_none.
    def enterOr_none(self, ctx:MyExprParser.Or_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#or_none.
    def exitOr_none(self, ctx:MyExprParser.Or_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#and_none.
    def enterAnd_none(self, ctx:MyExprParser.And_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#and_none.
    def exitAnd_none(self, ctx:MyExprParser.And_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#and_operate.
    def enterAnd_operate(self, ctx:MyExprParser.And_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#and_operate.
    def exitAnd_operate(self, ctx:MyExprParser.And_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#equal_operate.
    def enterEqual_operate(self, ctx:MyExprParser.Equal_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#equal_operate.
    def exitEqual_operate(self, ctx:MyExprParser.Equal_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#equal_none.
    def enterEqual_none(self, ctx:MyExprParser.Equal_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#equal_none.
    def exitEqual_none(self, ctx:MyExprParser.Equal_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#relation_none.
    def enterRelation_none(self, ctx:MyExprParser.Relation_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#relation_none.
    def exitRelation_none(self, ctx:MyExprParser.Relation_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#relation_operate.
    def enterRelation_operate(self, ctx:MyExprParser.Relation_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#relation_operate.
    def exitRelation_operate(self, ctx:MyExprParser.Relation_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#add_none.
    def enterAdd_none(self, ctx:MyExprParser.Add_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#add_none.
    def exitAdd_none(self, ctx:MyExprParser.Add_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#add_operate.
    def enterAdd_operate(self, ctx:MyExprParser.Add_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#add_operate.
    def exitAdd_operate(self, ctx:MyExprParser.Add_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#mul_none.
    def enterMul_none(self, ctx:MyExprParser.Mul_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#mul_none.
    def exitMul_none(self, ctx:MyExprParser.Mul_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#mul_operate.
    def enterMul_operate(self, ctx:MyExprParser.Mul_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#mul_operate.
    def exitMul_operate(self, ctx:MyExprParser.Mul_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#unary_none.
    def enterUnary_none(self, ctx:MyExprParser.Unary_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#unary_none.
    def exitUnary_none(self, ctx:MyExprParser.Unary_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#unary_operate.
    def enterUnary_operate(self, ctx:MyExprParser.Unary_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#unary_operate.
    def exitUnary_operate(self, ctx:MyExprParser.Unary_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#unary_cast.
    def enterUnary_cast(self, ctx:MyExprParser.Unary_castContext):
        pass

    # Exit a parse tree produced by MyExprParser#unary_cast.
    def exitUnary_cast(self, ctx:MyExprParser.Unary_castContext):
        pass


    # Enter a parse tree produced by MyExprParser#postfix_none.
    def enterPostfix_none(self, ctx:MyExprParser.Postfix_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#postfix_none.
    def exitPostfix_none(self, ctx:MyExprParser.Postfix_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#postfix_callfunc.
    def enterPostfix_callfunc(self, ctx:MyExprParser.Postfix_callfuncContext):
        pass

    # Exit a parse tree produced by MyExprParser#postfix_callfunc.
    def exitPostfix_callfunc(self, ctx:MyExprParser.Postfix_callfuncContext):
        pass


    # Enter a parse tree produced by MyExprParser#expression_list.
    def enterExpression_list(self, ctx:MyExprParser.Expression_listContext):
        pass

    # Exit a parse tree produced by MyExprParser#expression_list.
    def exitExpression_list(self, ctx:MyExprParser.Expression_listContext):
        pass


    # Enter a parse tree produced by MyExprParser#primaryInteger.
    def enterPrimaryInteger(self, ctx:MyExprParser.PrimaryIntegerContext):
        pass

    # Exit a parse tree produced by MyExprParser#primaryInteger.
    def exitPrimaryInteger(self, ctx:MyExprParser.PrimaryIntegerContext):
        pass


    # Enter a parse tree produced by MyExprParser#primaryParen.
    def enterPrimaryParen(self, ctx:MyExprParser.PrimaryParenContext):
        pass

    # Exit a parse tree produced by MyExprParser#primaryParen.
    def exitPrimaryParen(self, ctx:MyExprParser.PrimaryParenContext):
        pass


    # Enter a parse tree produced by MyExprParser#primaryIdentifier.
    def enterPrimaryIdentifier(self, ctx:MyExprParser.PrimaryIdentifierContext):
        pass

    # Exit a parse tree produced by MyExprParser#primaryIdentifier.
    def exitPrimaryIdentifier(self, ctx:MyExprParser.PrimaryIdentifierContext):
        pass


