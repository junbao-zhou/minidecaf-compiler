# 实验报告 - step2

## 实验目的

给编译器增加三个单目运算符 `- ~ !` 。 使编译器能正确编译带有单目运算符的程序。

## 构造单目运算的语法分析

由于我使用的是 `python + antlr4` 的语法分析工具， 故构造语法分析十分方便， 在 `g4` 文件中加入下面几行代码就行。 

```
expression: unary;
unary:
	primary							# unary_none
	| op = ('-' | '~' | '!') unary	# unary_operate;
primary:
	Integer
```

注意到 `unary` 有两种不同的产生式， 为了在 visitor 模式中正确区分这两种情况， 需要在每个产生式后面添加 `label` ，只有在 visitor 进入 unary_operate 时才进行处理。

## 生成 IR

使用 `antlr4` 生产 visitor 的代码后， 在 visitor 中添加如下代码。

```python
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
```

上述代码实现的功能是： 在 visit 语法分析树的 `unary_operate` 节点时， 根据当前的 `op` 字段生成 IR 中间码， 如果 `op == -` 生产 `NEG` ，如果 `op == ~` 生成 `NOT` ， 如果 `op == !` 生成 `LNOT` 。

在 visit `primary` 节点时， 对数字范围进行判断， 如果数值范围超限则报错。

## 完善从 IR 到 risc-v 的实现

在实验一中我从 IR 中间码编译到 risc-v 使用的是简单的字符串替换， 然而随着 IR 指令的增加， 我不可能维护一个庞大的字符串替换程序， 所以我对 IR 到 risc-v 的实现做修改， 使用 antlr4 生成从 IR 编译到 risc-v 的程序。

编写 IR2asm.g4 文件， 构造 IR 语法分析。
```
// IR2asm.g4

instruction: push | ret | one_op;
push: 'PUSH' Integer;
ret: 'RET';

one_op: neg | bitwise | lnot;

neg: 'NEG';
bitwise: 'NOT';
lnot: 'LNOT';
```
上面的 one_op 表示一元运算符， 意味着对运算栈的操作不改变运算栈大小。

使用 `antlr` 生成 visitor 代码后， 在 visitor 中添加如下代码

```python
    def visitOne_op(self, ctx: IR2asmParser.One_opContext):
        return f"""
    lw t1, 0(sp) 
{self.visitChildren(ctx)}
    sw t1, 0(sp)
"""

    def visitLnot(self, ctx: IR2asmParser.LnotContext):
        return """\
    seqz t1, t1\
"""

    def visitBitwise(self, ctx: IR2asmParser.BitwiseContext):
        return """\
    not t1, t1\
"""

    def visitNeg(self, ctx: IR2asmParser.NegContext):
        return """\
    neg t1, t1\
"""
```

当访问 `one_op` 节点时， 先生成 `lw` 和 `sw` 指令， 然后再与 `lnot`  `bitwise` `neg` 等节点生成的指令进行拼接， 这种写法精简了代码， 减少了代码冗余， 加强了可扩展性。

## 思考题

请设计一个表达式，只使用`- ~ !`这三个单目运算符和 $[0, 2^{31} - 1]$ 范围内的非负整数，使得运算过程中发生越界。

下面的代码产生的 a 就是越界的。

```
a = 0x7fffffff;
a = ~a;
a = -a;
```

0x7fffffff 表示 32 位整数中最大的正整数， 取反后是 0x80000000 ， 表示 $-2^31$ ， 这是 32 位整数中最小的数， 取负数变为 $2^31$ ， 这时已经发生越界了。