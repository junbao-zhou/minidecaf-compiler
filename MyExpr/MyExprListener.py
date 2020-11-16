# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyExprParser import MyExprParser
else:
    from MyExprParser import MyExprParser

# This class defines a complete listener for a parse tree produced by MyExprParser.
class MyExprListener(ParseTreeListener):

    # Enter a parse tree produced by MyExprParser#int_type.
    def enterInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass

    # Exit a parse tree produced by MyExprParser#int_type.
    def exitInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass


    # Enter a parse tree produced by MyExprParser#program.
    def enterProgram(self, ctx:MyExprParser.ProgramContext):
        pass

    # Exit a parse tree produced by MyExprParser#program.
    def exitProgram(self, ctx:MyExprParser.ProgramContext):
        pass


    # Enter a parse tree produced by MyExprParser#main_fun.
    def enterMain_fun(self, ctx:MyExprParser.Main_funContext):
        pass

    # Exit a parse tree produced by MyExprParser#main_fun.
    def exitMain_fun(self, ctx:MyExprParser.Main_funContext):
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


    # Enter a parse tree produced by MyExprParser#parameter.
    def enterParameter(self, ctx:MyExprParser.ParameterContext):
        pass

    # Exit a parse tree produced by MyExprParser#parameter.
    def exitParameter(self, ctx:MyExprParser.ParameterContext):
        pass


