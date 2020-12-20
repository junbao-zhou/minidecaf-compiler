import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        self.function_name_list = []
        self.function_param_list = []
        self.function_is_defined = []
        self.condition_counter = 0
        self.loop_counter = 0
        result = ''
        self.global_var_list = []
        for declr in ctx.global_declaration():
            result += declr.accept(self)
        for fun in ctx.function():
            result += fun.accept(self)
        if not 'main' in self.function_name_list:
            raise Exception('No main function')

        return result

    def visitGlobal_declaration(self, ctx: MyExprParser.Global_declarationContext):
        if ctx.Identifier().getText() in self.global_var_list:
            raise Exception(
                f'global variable {ctx.Identifier().getText()} has been defined')
        self.global_var_list.append(ctx.Identifier().getText())
        return f"""
{ctx.Identifier().getText()} = {'' if ctx.Integer() is None else ctx.Integer().getText()}
"""

    def visitParameter_list(self, ctx: MyExprParser.Parameter_listContext):
        param_list = []
        for var in ctx.Identifier():
            if var.getText() in param_list:
                raise Exception(f'param {var.getText()} has been defined')
            param_list.append(var.getText())
        return param_list

    def visitFunction(self, ctx: MyExprParser.FunctionContext):
        self.variable_list = [ctx.parameter_list().accept(self)]
        self.total_var_num = len(self.variable_list[-1])
        self.tmp_var_num = self.total_var_num
        if ctx.Identifier().getText() in self.global_var_list:
            raise Exception(
                f'{ctx.Identifier().getText()} has been defined as global variable')
        if ctx.Identifier().getText() in self.function_name_list:
            idx = self.function_name_list.index(ctx.Identifier().getText())
            if len(self.variable_list[-1]) != self.function_param_list[idx]:
                raise Exception('function parameter unmatch')
        else:
            self.function_name_list.append(
                ctx.Identifier().getText())
            self.function_param_list.append(self.total_var_num)
            self.function_is_defined.append(False)
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
            self.function_is_defined[self.function_name_list.index(
                ctx.Identifier().getText())] = True
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
        self.variable_list.append([])
        return super().visitCompound_statement(ctx)

    def visitStat_expr(self, ctx):
        if ctx.expression() is None:
            return ""
        else:
            return f"""
{ctx.expression().accept(self)}
POP
"""

    def Loop_body(self, pre_stat, condition, main_stat, post_stat):
        return f"""
{pre_stat}
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{condition}
BEQZ BREAK_LABEL_{self.loop_counter}
{main_stat}
LABEL CONTINUE_LABEL_{self.loop_counter}
{post_stat}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""

    def visitStat_for_loop_no_declr(self, ctx):
        self.loop_counter += 1
        string = self.Loop_body(
            pre_stat='' if ctx.pre_expr is None else (
                ctx.pre_expr.accept(self) + '\n' + 'POP'),
            condition='PUSH 1' if ctx.cond_expr is None else ctx.cond_expr.accept(
                self),
            main_stat=ctx.statement().accept(self),
            post_stat='' if ctx.post_expr is None else (ctx.post_expr.accept(self) + '\n' + 'POP'))

        self.loop_counter -= 1
        return string

    def visitStat_for_loop_declr(self, ctx):
        self.loop_counter += 1
        self.variable_list.append([])
        string = self.Loop_body(
            pre_stat=ctx.declaration().accept(self),
            condition='PUSH 1' if ctx.cond_expr is None else (
                ctx.cond_expr.accept(self)),
            main_stat=ctx.statement().accept(self),
            post_stat='' if ctx.post_expr is None else (ctx.post_expr.accept(self) + '\n' + 'POP'))
        self.del_var_stack()

        self.loop_counter -= 1
        return string

    def visitStat_while_loop(self, ctx):
        self.loop_counter += 1
        string = self.Loop_body(
            pre_stat='',
            condition=ctx.expression().accept(self),
            main_stat=ctx.statement().accept(self),
            post_stat='')
        self.loop_counter -= 1
        return string

    def visitStat_break(self, ctx):
        return f"""
BR BREAK_LABEL_{self.loop_counter}
"""

    def visitStat_continue(self, ctx):
        return f"""
BR CONTINUE_LABEL_{self.loop_counter}
"""

    def visitStat_do_loop(self, ctx):
        self.loop_counter += 1
        string = self.Loop_body(
            pre_stat=ctx.statement().accept(self),
            condition=ctx.expression().accept(self),
            main_stat=ctx.statement().accept(self),
            post_stat='')
        self.loop_counter -= 1
        return string

    def del_var_stack(self):
        self.tmp_var_num -= len(self.variable_list[-1])
        del self.variable_list[-1]

    def visitDeclaration(self, ctx: MyExprParser.DeclarationContext):
        string = """\
PUSH 0""" if ctx.expression() is None else ctx.expression().accept(self)
        if ctx.Identifier().getText() in self.variable_list[-1]:
            raise Exception(
                f"indentifier {ctx.Identifier().getText()} has been declared")
        else:
            self.variable_list[-1].append(ctx.Identifier().getText())
            self.tmp_var_num += 1
            self.total_var_num = max(self.tmp_var_num, self.total_var_num)
        return f"""\
{string}
{self.find_var(ctx.Identifier().getText())}
STORE
POP
"""

    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        return f"""\
{ctx.expression().accept(self)}\
RET
"""

    def find_var(self, var: str) -> int:
        isFind = False
        for i in range(1, self.variable_list.__len__() + 1):
            if var in self.variable_list[-i]:
                isFind = True
                break
        if not isFind:
            if var in self.global_var_list:
                return f'GLOBALADDR {var}'
            raise Exception(f"Undefined variable {var}")
        previous_var_num = 0
        for j in range(i + 1, self.variable_list.__len__() + 1):
            previous_var_num += self.variable_list[-j].__len__()
        return f'FRAMEADDR {previous_var_num + self.variable_list[-i].index(var)}'

    def visitAssign(self, ctx: MyExprParser.AssignContext):
        return f"""\
{ctx.expression().accept(self)}
{self.find_var(ctx.Identifier().getText())}
STORE
"""

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
        return self.condition(
            condition=ctx.logical_or().accept(self),
            if_stat=ctx.expression().accept(self),
            else_stat=ctx.conditional().accept(self),
            cond_counter=counter)

    def visitStat_condition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return self.condition(
            condition=ctx.expression().accept(self),
            if_stat=ctx.statement()[0].accept(self),
            else_stat="" if ctx.statement().__len__() <= 1 else ctx.statement()[
                1].accept(self),
            cond_counter=counter)

    def visitOr_operate(self, ctx: MyExprParser.Or_operateContext):
        return f"""\
{ctx.logical_or().accept(self)}\
{ctx.logical_and().accept(self)}\
LOR
"""

    def visitAnd_operate(self, ctx: MyExprParser.And_operateContext):
        return f"""\
{ctx.logical_and().accept(self)}\
{ctx.equality().accept(self)}\
LAND
"""

    def visitEqual_operate(self, ctx: MyExprParser.Equal_operateContext):
        return f"""\
{ctx.equality().accept(self)}\
{ctx.relational().accept(self)}\
{"EQ"   if ctx.op.text == '=='  else
"NE" if ctx.op.text == '!=' else ''}
"""

    def visitRelation_operate(self, ctx: MyExprParser.Relation_operateContext):
        return f"""\
{ctx.relational().accept(self)}\
{ctx.additive().accept(self)}\
{"LT"   if ctx.op.text == '<'   else
"GT"    if ctx.op.text == '>'   else
"LE"    if ctx.op.text == '<='  else
"GE"    if ctx.op.text == '>='  else ''}
"""

    def visitAdd_operate(self, ctx: MyExprParser.Add_operateContext):
        return f"""\
{ctx.additive().accept(self)}\
{ctx.multiplicative().accept(self)}\
{"ADD"  if ctx.op.text == '+'   else
"SUB"   if ctx.op.text == '-'   else ''}
"""

    def visitMul_operate(self, ctx: MyExprParser.Mul_operateContext):
        return f"""\
{ctx.multiplicative().accept(self)}\
{ctx.unary().accept(self)}\
{"MUL"  if ctx.op.text == '*'   else
"DIV"   if ctx.op.text == '/'   else
"REM"   if ctx.op.text == '%'   else ''}
"""

    def visitUnary_operate(self, ctx: MyExprParser.Unary_operateContext):
        return f"""\
{ctx.unary().accept(self)}\
{"NEG"  if ctx.op.text == '-'   else
"NOT"   if ctx.op.text == '~'   else
"LNOT"  if ctx.op.text == '!'   else ''}
"""

    def visitPostfix_callfunc(self, ctx: MyExprParser.Postfix_callfuncContext):
        gen_param, param_num = ctx.expression_list().accept(self)
        if ctx.Identifier().getText() in self.function_name_list:
            if param_num == self.function_param_list[self.function_name_list.index(ctx.Identifier().getText())]:
                pop_operate = 'POP\n' * param_num
                return f"""
{gen_param}
CALL {ctx.Identifier().getText()}
{pop_operate}
STORE_REG a0
"""
        else:
            raise Exception('call function error')

    def visitExpression_list(self, ctx: MyExprParser.Expression_listContext):
        gen_param = ''
        for i in range(1, len(ctx.expression()) + 1):
            gen_param += ctx.expression()[-i].accept(self)
        return gen_param, len(ctx.expression())

    def visitPrimaryInteger(self, ctx: MyExprParser.PrimaryIntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return f"""PUSH {str(i)}
"""

    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)

    def visitPrimaryIdentifier(self, ctx):
        return f"""\
{self.find_var(ctx.Identifier().getText())}
LOAD
"""
