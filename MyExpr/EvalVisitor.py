import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor

ir_dict = {'-': 'NEG', '~': 'NOT', '!': 'LNOT',
           '*': 'LOAD', '*2': 'MUL', '/2': 'DIV',
           '%2': 'REM', '<': 'LT', '>': 'GT', '<=': 'LE',
           '>=': 'GE', '==': 'EQ', '!=': 'NE', '||': 'LOR',
           '&&': 'LAND', '+2': 'ADD', '-2': 'SUB'}


class EvalVisitor(MyExprVisitor):

    def visitType_int(self, ctx: MyExprParser.Type_intContext):
        return "int"

    def visitType_ptr(self, ctx: MyExprParser.Type_ptrContext):
        return ctx.type_t().accept(self)+'*'

    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        self.function_list = {}
        self.condition_counter = 0
        self.loop_counter = 0
        result = ''
        self.global_var_list = {}
        for declr in ctx.global_declaration():
            result += declr.accept(self)
        for fun in ctx.function():
            result += fun.accept(self)
        if not 'main' in self.function_list:
            raise Exception('No main function')

        return result

    def visitGlobal_declaration(self, ctx: MyExprParser.Global_declarationContext):
        if ctx.Identifier().getText() in self.global_var_list:
            raise Exception(
                f'global variable {ctx.Identifier().getText()} has been defined')
        self.global_var_list[ctx.Identifier().getText()
                             ] = ctx.type_t().accept(self)
        return f"""
{ctx.Identifier().getText()} = {'' if ctx.Integer() is None else ctx.Integer().getText()}
"""

    def visitParameter_list(self, ctx: MyExprParser.Parameter_listContext):
        param_list = {}
        for i in range(len(ctx.Identifier())):
            if ctx.Identifier()[i].getText() in param_list:
                raise Exception(
                    f'param {ctx.Identifier()[i].getText()} has been defined')
            param_list[ctx.Identifier()[i].getText()] = \
                ctx.type_t()[i].accept(self)
        return param_list

    def visitFunction(self, ctx: MyExprParser.FunctionContext):
        self.variable_list = [ctx.parameter_list().accept(self)]
        self.total_var_num = len(self.variable_list[-1])
        self.tmp_var_num = self.total_var_num
        self.return_type = ctx.type_t().accept(self)
        if ctx.Identifier().getText() in self.global_var_list:
            raise Exception(
                f'{ctx.Identifier().getText()} has been defined as global variable')
        if ctx.Identifier().getText() in self.function_list:
            if list(self.variable_list[-1].values()) != self.function_list[ctx.Identifier().getText()][0]:
                raise Exception('function parameter unmatch')
            if self.return_type != self.function_list[ctx.Identifier().getText()][2]:
                raise Exception('function return type mismatch')
        else:
            self.function_list[ctx.Identifier().getText()] = [
                list(self.variable_list[-1].values()), False, self.return_type]
        load_param = ''
        for i in range(self.total_var_num):
            load_param += f"""
FRAMEADDR {-3-i}
LOAD
FRAMEADDR {i}
STORE
POP
"""
        if ctx.func_compound_statement() is None:
            return ''
        else:
            string = ctx.func_compound_statement().accept(self)
            self.function_list[ctx.Identifier().getText()][1] = True
        return f"""
{ctx.Identifier().getText()}
{{
PROLOGUE {self.total_var_num}
{load_param}
{string}
PUSH 0
RET
EPILOGUE {self.total_var_num}
}}
"""

    def visitBlock_items(self, ctx: MyExprParser.Block_itemsContext):
        string = ''
        for block in ctx.block_item():
            string += block.accept(self)
        self.del_var_stack()
        return string

    def visitCompound_statement(self, ctx):
        self.variable_list.append({})
        return super().visitCompound_statement(ctx)

    def visitStat_expr(self, ctx):
        if ctx.expression() is None:
            return ""
        else:
            return f"""
{ctx.expression().accept(self)[0]}
POP
"""

    def Loop_body(self, pre_expr, condition_expr, main_stat, post_expr, is_pop):
        pop_str = '\n' + 'POP'
        self.loop_counter += 1
        string = f"""
{'' if pre_expr is None else pre_expr.accept(self)[0] + (pop_str if is_pop else '')}
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{'PUSH 1' if condition_expr is None else condition_expr.accept(self)[0]}
BEQZ BREAK_LABEL_{self.loop_counter}
{main_stat.accept(self)}
LABEL CONTINUE_LABEL_{self.loop_counter}
{'' if post_expr is None else post_expr.accept(self)[0] + pop_str}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""
        self.loop_counter -= 1
        return string

    def visitStat_for_loop_declr(self, ctx: MyExprParser.Stat_for_loop_declrContext):
        self.variable_list.append({})
        string = self.Loop_body(
            ctx.declaration_expr(), ctx.cond_expr, ctx.statement(), ctx.post_expr, True)
        self.del_var_stack()
        return string

    def visitStat_for_loop_no_declr(self, ctx: MyExprParser.Stat_for_loop_no_declrContext):
        return self.Loop_body(
            ctx.pre_expr, ctx.cond_expr, ctx.statement(), ctx.post_expr, True)

    def visitStat_while_loop(self, ctx: MyExprParser.Stat_while_loopContext):
        return self.Loop_body(None, ctx.condition_expression(), ctx.statement(), None, True)

    def visitStat_do_loop(self, ctx: MyExprParser.Stat_do_loopContext):
        return self.Loop_body(ctx.statement(), ctx.condition_expression(), ctx.statement(), None, False)

    def visitStat_break(self, ctx):
        return f"""
BR BREAK_LABEL_{self.loop_counter}
"""

    def visitStat_continue(self, ctx):
        return f"""
BR CONTINUE_LABEL_{self.loop_counter}
"""

    def del_var_stack(self):
        self.tmp_var_num -= len(self.variable_list[-1])
        del self.variable_list[-1]

    def visitDeclaration_expr(self, ctx: MyExprParser.Declaration_exprContext):
        (exp_str, _, exp_type) = ("""\
PUSH 0""", None, None) if ctx.expression() is None \
            else ctx.expression().accept(self)
        var_type = ctx.type_t().accept(self)
        if exp_type != None and var_type != exp_type:
            raise Exception('declaration type unmatch')
        if ctx.Identifier().getText() in self.variable_list[-1]:
            raise Exception(
                f"indentifier {ctx.Identifier().getText()} has been declared")
        else:
            self.variable_list[-1][
                ctx.Identifier().getText()] = var_type
            self.tmp_var_num += 1
            self.total_var_num = max(self.tmp_var_num, self.total_var_num)
        return f"""\
{exp_str}
{self.find_var(ctx.Identifier().getText())[0]}
STORE
""", False, var_type

    def visitDeclaration(self, ctx: MyExprParser.DeclarationContext):
        return f"""
{ctx.declaration_expr().accept(self)[0]}
POP
"""

    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        exp_str, _, exp_type = ctx.expression().accept(self)
        if exp_type != self.return_type:
            raise Exception('return tye unmatch')
        return f"""\
{exp_str}\
RET
"""

    def visitCondition_expression(self, ctx: MyExprParser.Condition_expressionContext):
        exp_text, exp_is_lvalue, exp_type = ctx.expression().accept(self)
        if '*' in exp_type:
            raise Exception('pointer type cannot be used in condition')
        return exp_text, exp_is_lvalue, exp_type

    def find_var(self, var: str) -> int:
        isFind = False
        for i in range(1, self.variable_list.__len__() + 1):
            if var in self.variable_list[-i]:
                isFind = True
                break
        if not isFind:
            if var in self.global_var_list:
                return f'GLOBALADDR {var}', self.global_var_list[var]
            raise Exception(f"Undefined variable {var}")
        previous_var_num = 0
        for j in range(i + 1, self.variable_list.__len__() + 1):
            previous_var_num += self.variable_list[-j].__len__()
        return f'FRAMEADDR {previous_var_num + list(self.variable_list[-i]).index(var)}', self.variable_list[-i][var]

    def visitAssign(self, ctx: MyExprParser.AssignContext):
        unary_str, is_lvalue, unary_type = ctx.unary().accept(self)
        exp_text, _, exp_type = ctx.expression().accept(self)
        if not is_lvalue:
            raise Exception('assign to rvalue')
        if unary_type != exp_type:
            raise Exception('assign type unmatch')
        return f"""\
{exp_text}
{unary_str[:unary_str.rfind("LOAD")]}
STORE
""", False, unary_type

    def condition(self, condition: str, if_stat: str, else_stat: str, cond_counter: int):
        return f"""
{condition}
BEQZ else_label{cond_counter}
{if_stat}
BR end_label{cond_counter}
LABEL else_label{cond_counter}
{else_stat}
LABEL end_label{cond_counter}
"""

    def visitCondition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        exp1_str, _, exp1_type = ctx.expression().accept(self)
        exp2_str, _, exp2_type = ctx.conditional().accept(self)
        if exp1_type != exp2_type:
            raise Exception('Condition type unmatch')
        cond_exp_str, _, cond_exp_type = ctx.logical_or().accept(self)
        if '*' in cond_exp_type:
            raise Exception('pointer type cannot be used in condition')
        return self.condition(
            condition=cond_exp_str,
            if_stat=exp1_str,
            else_stat=exp2_str,
            cond_counter=counter), False, 'int'

    def visitStat_condition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return self.condition(
            condition=ctx.condition_expression().accept(self)[0],
            if_stat=ctx.statement()[0].accept(self),
            else_stat="" if ctx.statement().__len__() <= 1 else ctx.statement()[
                1].accept(self),
            cond_counter=counter)

    def two_operate(self, num1, num2, op):
        text1, _, type1 = num1.accept(self)
        text2, _, type2 = num2.accept(self)
        if type1 != type2:
            raise Exception(ir_dict[op] + ' Type not match')
        if '*' in type1 and op in ['<', '>', '<=', '>=']:
            raise Exception('pointer cannot be compared')
        return f"""\
{text1}\
{text2}\
{ir_dict[op]}
""", False, type1 if not op in ['==', '!='] else 'int'

    def visitOr_operate(self, ctx: MyExprParser.Or_operateContext):
        return self.two_operate(ctx.logical_or(), ctx.logical_and(), '||')

    def visitAnd_operate(self, ctx: MyExprParser.And_operateContext):
        return self.two_operate(ctx.logical_and(), ctx.equality(), '&&')

    def visitEqual_operate(self, ctx: MyExprParser.Equal_operateContext):
        return self.two_operate(ctx.equality(), ctx.relational(), ctx.op.text)

    def visitRelation_operate(self, ctx: MyExprParser.Relation_operateContext):
        return self.two_operate(ctx.relational(), ctx.additive(), ctx.op.text)

    def visitAdd_operate(self, ctx: MyExprParser.Add_operateContext):
        return self.two_operate(ctx.additive(), ctx.multiplicative(), ctx.op.text+'2')

    def visitMul_operate(self, ctx: MyExprParser.Mul_operateContext):
        return self.two_operate(ctx.multiplicative(), ctx.unary(), ctx.op.text+'2')

    def visitUnary_operate(self, ctx: MyExprParser.Unary_operateContext):
        unary_str, is_lvalue, type_t = ctx.unary().accept(self)
        return_type = type_t
        return_is_lvalue = False
        if ctx.op.text == '&':
            if not is_lvalue:
                raise Exception('rvalue has no address')
            else:
                unary_str = unary_str[:unary_str.rfind("LOAD")]
                return_type = type_t+'*'
        elif ctx.op.text == '*':
            if not ('*' in type_t):
                raise Exception('dosenot have address')
            else:
                return_is_lvalue = True
                return_type = type_t[:-1]
        else:
            if '*'in type_t:
                raise Exception('bad pointer unary')
        return f"""\
{unary_str}
{ir_dict[ctx.op.text] if ctx.op.text != '&' else ''}
""", return_is_lvalue, return_type

    def visitUnary_cast(self, ctx: MyExprParser.Unary_castContext):
        unary_str, is_lvalue, _ = ctx.unary().accept(self)
        return unary_str, is_lvalue, ctx.type_t().accept(self)

    def visitPostfix_callfunc(self, ctx: MyExprParser.Postfix_callfuncContext):
        gen_param, type_list = ctx.expression_list().accept(self)
        if ctx.Identifier().getText() in self.function_list:
            if type_list == self.function_list[ctx.Identifier().getText()][0]:
                pop_operate = 'POP\n' * len(type_list)
                return f"""
{gen_param}
CALL {ctx.Identifier().getText()}
{pop_operate}
STORE_REG a0
""", False, self.function_list[ctx.Identifier().getText()][2]
        else:
            raise Exception('call function error')

    def visitExpression_list(self, ctx: MyExprParser.Expression_listContext):
        gen_param_IR = ''
        type_list = []
        for i in range(1, len(ctx.expression()) + 1):
            ir, _, type_t = ctx.expression()[-i].accept(self)
            gen_param_IR += ir
            type_list.append(type_t)
        return gen_param_IR, type_list

    def visitPrimaryInteger(self, ctx: MyExprParser.PrimaryIntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return f"""\
PUSH {str(i)}
""", False, 'int'

    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)

    def visitPrimaryIdentifier(self, ctx):
        text, type_t = self.find_var(ctx.Identifier().getText())
        return f"""\
{text}
LOAD
""", True, type_t
