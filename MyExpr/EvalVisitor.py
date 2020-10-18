import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        return ctx.main_fun().accept(self)

    def visitMain_fun(self, ctx: MyExprParser.Main_funContext):
        string = """
main{
"""
        for i in ctx.statement():
            string += i.accept(self)
        string += "}"
        return string

    def visitStatement(self, ctx: MyExprParser.StatementContext):
        return self.visitChildren(ctx)

    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        return f"""\
{ctx.expression().accept(self)}\
RET
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
