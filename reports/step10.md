# 实验报告 - step10

## 实验目的

给编译器添加全局变量的支持。

## 语法分析

在 `antlr` 的 `g4` 文件中添加如下产生式， 这些产生式描述了全局变量。

```
program: (function | global_declaration)* EOF;

global_declaration: type_t Identifier ('=' Integer)? ';';
```

其中 `global_declaration` 的作用是与普通的 `declaration` 区分开， 因为两者的行为是不一样的。 `global_declaration` 生成的汇编直接把常量写进标识符里， `declaration` 定义的变量则需要在栈帧上操作。

## 生成 IR 中间指令

我自己定义了一条 IR 指令， `Identifier = Integer` ， 表示全局变量的声明。

本次实验需要开辟一个全局变量列表， `global_variable_list` 这个列表用于存放全局变量， 并判断有无变量名冲突。

全局变量符号表的代码如下：

```python
self.global_var_list = []
for declr in ctx.global_declaration():
    result += declr.accept(self)
```

在访问全局变量时， 需要使用 `GLOBALADDR` 指令， 而局部变量有可能覆盖全局变量， 所以我定义了一个寻找变量的函数：

```python
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
```

寻找变量的逻辑如下： 从最上层栈依次往下找， 如果局部变量栈里没有的话就找全局变量符号表， 如果是全局变量的话生成 `GLOBALADDR` 指令， 如果是局部变量的话生成 `FRAMEADDR` 指令。

## 由 IR 到 risc-v

修改 `IR2asm.g4` ， 添加如下产生式， `store_reg` 表示直接对寄存器进行操作， 把某一个寄存器存到栈帧里， `call` 表示调用函数。

```
globaladdr: 'GLOBALADDR' Identifier;
program: (func | global_var)*;
global_var: Identifier '=' (Integer)?;
```

它们对应生成的汇编如下：

```python
    def visitGlobal_var(self, ctx: IR2asmParser.Global_varContext):
        if ctx.Integer() is None:
            return f"""
    .comm {ctx.Identifier().getText()},4,4
"""
        else:
            return f"""
    .data
    .globl {ctx.Identifier().getText()}
{ctx.Identifier().getText()}:
    .word {ctx.Integer().getText()}
"""
    def visitGlobaladdr(self, ctx: IR2asmParser.GlobaladdrContext):
        return f"""
    addi sp, sp, -4
    la t1, {ctx.Identifier().getText()}
    sw t1, 0(sp)
"""
```

## 思考题

请给出将全局变量 a 的值读到寄存器 t0 所需的 riscv 指令序列。

```
la t0, a
lw t0, 0(t0)
```