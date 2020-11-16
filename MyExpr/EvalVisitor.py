import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        return ctx.main_fun().accept(self)

    def visitMain_fun(self, ctx: MyExprParser.Main_funContext):
        self.variable_list = []
        self.condition_counter = 0
        self.total_var_num = 0
        self.loop_counter = 0
        string = ctx.compound_statement().accept(self)
        return f"""\
main{{
PROLOGUE {self.total_var_num}
{string}
PUSH 0
RET
EPILOGUE {self.total_var_num}
}}
"""

    def visitCompound_statement(self, ctx):
        self.variable_list.append([])
        string = ''
        for i in ctx.block_item():
            string += i.accept(self)
        tmp_var_num = 0
        for i in self.variable_list:
            tmp_var_num += i.__len__()
        self.total_var_num = max(self.total_var_num, tmp_var_num)
        del self.variable_list[-1]
        return string

    def visitStat_expr(self, ctx):
        if ctx.expression() is None:
            return ""
        else:
            return f"""\
{ctx.expression().accept(self)}
POP
"""

    def visitStat_condition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return f"""\
{ctx.expression().accept(self)}
BEQZ else_label{counter}
{ctx.statement()[0].accept(self)}
BR end_label{counter}
LABEL else_label{counter}
{"" if ctx.statement().__len__() <= 1 else ctx.statement()[1].accept(self)}
LABEL end_label{counter}
"""

    def visitStat_for_loop_no_declr(self, ctx):
        self.loop_counter += 1
        nl = '\n'

        string = f"""
{'' if ctx.pre_expr is None else (ctx.pre_expr.accept(self) + nl + 'POP')}
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{'PUSH 1' if ctx.cond_expr is None else ctx.cond_expr.accept(self)}
BEQZ BREAK_LABEL_{self.loop_counter}
{ctx.statement().accept(self)}
LABEL CONTINUE_LABEL_{self.loop_counter}
{'' if ctx.post_expr is None else (ctx.post_expr.accept(self)+ nl + 'POP')}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""

        self.loop_counter -= 1
        return string

    def visitStat_for_loop_declr(self, ctx):
        self.loop_counter += 1
        nl = '\n'

        self.variable_list.append([])

        string = f"""
{ctx.declaration().accept(self)}
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{'PUSH 1' if ctx.cond_expr is None else (ctx.cond_expr.accept(self))}
BEQZ BREAK_LABEL_{self.loop_counter}
{ctx.statement().accept(self)}
LABEL CONTINUE_LABEL_{self.loop_counter}
{'' if ctx.post_expr is None else (ctx.post_expr.accept(self) + nl + 'POP')}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""
        tmp_var_num = 0
        for i in self.variable_list:
            tmp_var_num += i.__len__()
        self.total_var_num = max(self.total_var_num, tmp_var_num)
        del self.variable_list[-1]

        self.loop_counter -= 1
        return string

    def visitStat_while_loop(self, ctx):
        self.loop_counter += 1
        string = f"""
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{ctx.expression().accept(self)}
BEQZ BREAK_LABEL_{self.loop_counter}
{ctx.statement().accept(self)}
LABEL CONTINUE_LABEL_{self.loop_counter}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""
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
        string = f"""
{ctx.statement().accept(self)}
LABEL BEGINLOOP_LABEL_{self.loop_counter}
{ctx.expression().accept(self)}
BEQZ BREAK_LABEL_{self.loop_counter}
{ctx.statement().accept(self)}
LABEL CONTINUE_LABEL_{self.loop_counter}
BR BEGINLOOP_LABEL_{self.loop_counter}
LABEL BREAK_LABEL_{self.loop_counter}
"""
        self.loop_counter -= 1
        return string

    def visitDeclaration(self, ctx: MyExprParser.DeclarationContext):
        if ctx.expression() is None:
            string = """\
PUSH 0"""
        else:
            string = ctx.expression().accept(self)
        if ctx.Identifier().getText() in self.variable_list[-1]:
            raise Exception(
                f"indentifier {ctx.Identifier().getText()} has been declared")
        else:
            self.variable_list[-1].append(ctx.Identifier().getText())
        previous_var_num = 0
        for i in self.variable_list[:-1]:
            previous_var_num += i.__len__()
        return f"""\
{string}
FRAMEADDR {previous_var_num + self.variable_list[-1].index(ctx.Identifier().getText())}
STORE
POP
"""

    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        return f"""\
{ctx.expression().accept(self)}\
RET
"""

    def visitAssign(self, ctx: MyExprParser.AssignContext):
        isFind = False
        for i in range(1, self.variable_list.__len__() + 1):
            if ctx.Identifier().getText() in self.variable_list[-i]:
                isFind = True
                break
        if not isFind:
            raise Exception(f"Undefined variable {ctx.Identifier().getText()}")
        previous_var_num = 0
        for j in range(i + 1, self.variable_list.__len__() + 1):
            previous_var_num += self.variable_list[-j].__len__()
        return f"""\
{ctx.expression().accept(self)}
FRAMEADDR {previous_var_num + self.variable_list[-i].index(ctx.Identifier().getText())}
STORE
"""

    def visitCondition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return f"""\
{ctx.logical_or().accept(self)}
BEQZ else_label{counter}
{ctx.expression().accept(self)}
BR end_label{counter}
LABEL else_label{counter}
{ctx.conditional().accept(self)}
LABEL end_label{counter}
"""

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

    def visitPrimaryInteger(self, ctx: MyExprParser.PrimaryIntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return f"""PUSH {str(i)}
"""

    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)

    def visitPrimaryIdentifier(self, ctx):
        isFind = False
        for i in range(1, self.variable_list.__len__() + 1):
            if ctx.Identifier().getText() in self.variable_list[-i]:
                isFind = True
                break
        if not isFind:
            raise Exception(f"Undefined variable {ctx.Identifier().getText()}")
        previous_var_num = 0
        for j in range(i + 1, self.variable_list.__len__() + 1):
            previous_var_num += self.variable_list[-j].__len__()
        return f"""\
FRAMEADDR {previous_var_num + self.variable_list[-i].index(ctx.Identifier().getText())}
LOAD
"""
