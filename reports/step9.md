# 实验报告 - step9

## 实验目的

给编译器添加支持多函数的支持， 编译器可以编译拥有多个函数的程序了。

## 语法分析

在 `antlr` 的 `g4` 文件中添加如下产生式， 这些产生式给程序添加了多个函数， 并且这些函数都有参数列表， 并添加了调用函数的语句。

```
program
     : function*
function
    : type Identifier '(' parameter_list ')' (compound_statement | ';')
parameter_list
     : (type Identifier (',' type Identifier)*)?
expression_list
     : (expression (',' expression)*)?
unary
     : postfix
     | ('-'|'~'|'!') unary
postfix
    : primary
    | Identifier '(' expression_list ')'
```

可以看到调用函数的优先级和 primary 是同一级的。

## 生成 IR 中间指令

由于添加了多函数支持， 所以每个函数的栈帧要小心对待。 在进入函数节点时， 要生成一个空的 `variable_list` 用来存放函数内声明的变量。

由于每个函数都可能有多个参数， 这些参数与函数内部定义的变量是不能重名的。 对于函数参数， 我采取的办法是把所有参数装载到栈帧里， 然后把函数参数与变量同等看待。 这样虽然生成的汇编比较冗余， 但是容易实现， 不需要另外构造一个新的符号表。

根据以上思想， 我在访问函数节点时的代码如下：

```python
    def visitFunction(self, ctx: MyExprParser.FunctionContext):
        self.variable_list = [ctx.parameter_list().accept(self)]
        self.total_var_num = len(self.variable_list[-1])
        self.tmp_var_num = self.total_var_num
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
```

上面的 `load_param` 就是把函数参数装载到栈帧里。

由于函数参数与函数内变量不能重名， 所以我要修改 `antlr4` 里的产生式， 使其变为如下代码：

```
function:
	type_t Identifier '(' parameter_list ')' (
		func_compound_statement
		| ';'
	);

block_items: '{' block_item* '}';

func_compound_statement: block_items;

compound_statement: block_items;
```

这样， 普通的块语句和函数的块语句会被区别对待， 普通块语句需要新建一个栈， 用于保存块内声明的变量， 函数的块语句不需要新建一个栈。

此外， 还要注意函数可能有声明和定义语句， 遇到函数声明语句不要生成任何东西， 但是在 `function_list` 里把这个函数记录下来， 直到函数定义才生成对应的汇编。

并且， 函数在调用结束时需要把 `a0` 寄存器里的变量存到栈帧里， 所以这次实验我人为添加了一个 IR 指令， 指令名为 `STORE_REG` ， 表示把某一个寄存器里的变量存到栈帧里。 在每次函数调用结束时， 都会有如下 IR 指令：

```
STORE_REG a0
```

## 由 IR 到 risc-v

修改 `IR2asm.g4` ， 添加如下产生式， `store_reg` 表示直接对寄存器进行操作， 把某一个寄存器存到栈帧里， `call` 表示调用函数。

```
store_reg: 'STORE_REG' Identifier;
call: 'CALL' Identifier;
```

它们对应生成的汇编如下：

```python
    def visitStore_reg(self, ctx: IR2asmParser.Store_regContext):
        return f"""
    addi sp, sp, -4
    sw {ctx.Identifier().getText()}, 0(sp)
"""

    def visitCall(self, ctx: IR2asmParser.CallContext):
        return f"""
    call {ctx.Identifier().getText()}
"""
```

## 思考题

MiniDecaf 的函数调用时参数求值的顺序是未定义行为。试写出一段 MiniDecaf 代码，使得不同的参数求值顺序会导致不同的返回结果。

很简单， 只要有一个二元且不是轮换对称的函数， 输入两个变量调换顺序就可以做到。

```c
int add(int a, int b)
{
	return 2 * a + b;
}
int main()
{
	int i = 1;
	return add((i = i + 1), (i = i + 1))
}
```

上面这段代码如果从左到右求参数， 则输出 7 ， 如果从右到左求参数， 则输出 8 。