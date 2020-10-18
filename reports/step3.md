# 实验报告 - step3

## 实验目的

给编译器增加五个双目运算符 `+ - * / %` 以及括号 ( ) 。 

## 构造语法分析

在语法分析的 g4 文件中添加以下几个产生式， 这些产生式描述了 `+ - * / %` 五种运算。

```
additive:
	multiplicative								# add_none
	| additive op = ('+' | '-') multiplicative	# add_operate;

multiplicative:
	unary											# mul_none
	| multiplicative op = ('*' | '/' | '%') unary	# mul_operate;

unary:
	primary							# unary_none
	| op = ('-' | '~' | '!') unary	# unary_operate;

primary:
	Integer					# primaryInteger
	| '(' expression ')'	# primaryParen;
```

## 生成 IR 指令

使用 `antlr` 生成 visitor 后在 visitor 中修改如下代码：

```python
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
    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)
```
以上代码在访问加法节点和访问乘法节点时会根据运算符生成相应的 IR 指令。 在访问括号节点时会生直接访问下一级的 `expression` 节点。

## 由 IR 指令生成 risc-v

在 `IR2asm.g4` 中添加如下代码， 以下代码添加了双目运算符，双目运算符包含了 `+ - * / %`。

```
instruction: push | ret | two_op | one_op;

two_op:
	add
	| sub
	| mul
	| div
	| rem;

add: 'ADD';
sub: 'SUB';
mul: 'MUL';
div: 'DIV';
rem: 'REM';
```

使用 `antlr` 生成 visitor ， 然后在 visitor 中修改如下代码。 由代码可以看出， 在访问双目运算符节点时， 生成对应的 `lw` 和 `sw` 指令， 然后交给下一级的节点， 由下一级节点生成对应操作的指令。

```python
    def visitTwo_op(self, ctx: IR2asmParser.Two_opContext):
        return f"""
    lw t1, 4(sp)
    lw t2, 0(sp)
{self.visitChildren(ctx)}
    addi sp, sp, 4
    sw t1, 0(sp)
"""

    def visitAdd(self, ctx: IR2asmParser.AddContext):
        return """\
    add t1, t1, t2\
"""

    def visitSub(self, ctx: IR2asmParser.SubContext):
        return """\
    sub t1, t1, t2\
"""

    def visitMul(self, ctx: IR2asmParser.MulContext):
        return """\
    mul t1, t1, t2\
"""

    def visitDiv(self, ctx: IR2asmParser.DivContext):
        return """\
    div t1, t1, t2\
"""

    def visitRem(self, ctx: IR2asmParser.RemContext):
        return """\
    rem t1, t1, t2\
"""
```

## 思考题

1. 给出将寄存器 t0 中的数值压入栈中所需的 riscv 汇编指令序列；给出将栈顶的数值弹出到寄存器 t0 中所需的 riscv 汇编指令序列。

    aaa

    ```mips
    # 压栈
    addi	sp	sp	-4
    sw	t0	0(sp)
    ```

	```mips
	# 出栈
	lw	t0	0(sp)
	addi	sp	sp	4
	```

2. 语义规范中规定“除以零、模零都是未定义行为”，但是即使除法的右操作数不是 0，仍然可能存在未定义行为。请问这时除法的左操作数和右操作数分别是什么？请将这时除法的左操作数和右操作数填入下面的代码中，分别在你的电脑（请标明你的电脑的架构，比如 x86-64 或 ARM）中和 RISCV-32 的 qemu 模拟器中编译运行下面的代码，并给出运行结果。（编译时请不要开启任何编译优化）

	```c
	#include <stdio.h>

	int main() {
	  int a = -2147483648;
	  int b = -1;
	  printf("%d\n", a / b);
	  return 0;
	}
	```

	左操作数是最小的负整数， 右操作数是 -1 。 这时除法给出的结果是发生数值越界的， 这就是未定义行为。


	我的机器环境为：x86_64, Ubuntu 系统。 在我的机器上的运行结果：
	```bash
	[1]    92559 floating point exception (core dumped)
	```

	使用 qemu 执行的结果：
	```bash
	-2147483648
	```