# 实验报告 - step4

## 实验目的

给编译器添加比较大小和相等的二元操作：`<`、`<=`、`>=`, `>`, `==`, `!=`

## 语法分析

在 `antlr` 的 `g4` 文件中添加如下产生式， 这些产生式描述了比较大小的语句和逻辑判断语句。

```
expression: logical_or;

logical_or:
	logical_and						# or_none
	| logical_or '||' logical_and	# or_operate;

logical_and:
	equality					# and_none
	| logical_and '&&' equality	# and_operate;

equality:
	relational									# equal_none
	| equality op = ('==' | '!=') relational	# equal_operate;

relational:
	additive												# relation_none
	| relational op = ('<' | '>' | '<=' | '>=') additive	# relation_operate;
```

可以看到这样的写法是十分巧妙的， 能够正确表达出 C 语言的运算符优先级特性， 并且代码精简， 不冗杂。

## 生成 IR 中间指令

用 `antlr` 生成 visitor ， 然后把 visitor 的代码修改为如下。 以下代码在访问或运算、 与运算、 逻辑运算、 比较大小运算的节点时会生成相应的 IR 指令。

```python
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
```

## 由 IR 到 risc-v

修改 `IR2asm.g4` ， 添加如下产生式， 这些产生式匹配 IR 指令中的逻辑运算和比较大小运算。

```
lor: 'LOR';
land: 'LAND';
eq: 'EQ';
ne: 'NE';
lt: 'LT';
gt: 'GT';
le: 'LE';
ge: 'GE';
```

用 `antlr` 生成 visitor 后， 修改 visitor为如下， 这些代码在访问相应的逻辑运算和比较大小运算的节点时会生成对应的 `risc-v` 指令。

```python
    def visitLor(self, ctx: IR2asmParser.LorContext):
        return """\
    or t1, t1, t2
    snez	t1,t1\
"""

    def visitLand(self, ctx: IR2asmParser.LandContext):
        return """\
    snez t1, t1
    snez t2, t2
    and t1, t1, t2\
"""

    def visitEq(self, ctx: IR2asmParser.EqContext):
        return """\
    sub t1, t1, t2
    seqz    t1, t1\
"""

    def visitNe(self, ctx: IR2asmParser.NeContext):
        return """\
    sub t1, t1, t2
    snez    t1, t1\
"""

    def visitLt(self, ctx: IR2asmParser.LtContext):
        return """\
    slt t1, t1, t2\
"""

    def visitGt(self, ctx: IR2asmParser.GtContext):
        return """\
    sgt t1, t1, t2\
"""

    def visitLe(self, ctx: IR2asmParser.LeContext):
        return """\
    sgt t1, t1, t2
    xori    t1, t1, 1\
"""

    def visitGe(self, ctx: IR2asmParser.GeContext):
        return """\
    slt t1, t1, t2
    xori    t1, t1, 1\
"""

    def visitLnot(self, ctx: IR2asmParser.LnotContext):
        return """\
    seqz t1, t1\
"""

```


## 思考题

1. 在表达式计算时，对于某一步运算，是否一定要先计算出所有的操作数的结果才能进行运算？

	不一定。 逻辑表达式就可以不计算出所有的操作数。 逻辑表达式有短路求值的功能， 比如 `x >= 6 || y <= 9` ，当 `x >= 6` 为真时就不需要求出后面的表达式的值了。

2. 在 MiniDecaf 中，我们对于短路求值未做要求，但在包括 C 语言的大多数流行的语言中，短路求值都是被支持的。为何这一特性广受欢迎？你认为短路求值这一特性会给程序员带来怎样的好处？

	短路求值类似于语法糖， 可以给帮助程序员精简代码， 把更复杂的逻辑判断放在一条语句里实现。 短路求值一般用于逻辑表达式前后耦合的情况， 比如 `if(obj != NULL && obj.param == 0)` 这一条表达式， 如果没有短路求值， 当 `obj == NULL` 时就会发生错误， 这个时候就不得不把一个 `if` 分成两个 `if` 来写。 如果有短路求值这个表达式就能被正确执行。 

	并且短路求值可以提高程序性能， 在非必要时减少被执行的指令数目， 降低程序复杂度。