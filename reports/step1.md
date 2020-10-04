# 实验报告 - step1

无83 &ensp; 周君宝 &ensp; 2018011106

## Part1  词法分析、语法分析、目标代码生成

### 实验目的

阅读 `minilexer` 和 `miniparser` 的代码实现，理解词法分析和语法分析的流程。

学会使用 `minilexer` 和 `minipaser` ，通过控制输入得到自己想要的 `token` 流和语法树。

### 1. 修改 `lex` 输入使 `minilexer` 报错

把 `minilexer.py` 的输入修改为如下：

```cpp
int main() {
	int i = 9;
	return i;
}
```

输出报错：

```bash
token kind   text
-----------  ------------------- 
Int          int
Identifier   main
Lparen       (
Rparen       )
Lbrace       {
Int          int
Identifier   i
Traceback (most recent call last):
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/minilexer.py", line 101, in <module>
	dumpLexerTokens(default())
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/minilexer.py", line 96, in dumpLexerTokens
	for tok in lexer.lex():
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/minilexer.py", line 45, in lex
	raise Exception(f"lex error at input position {self.pos}")
Exception: lex error at input position 31
```

原因是 `minilexer.py` 中未定义 `=` 的 `token` ，导致出现错误。

### 2. 修改 `lex` 输入使 `miniparser` 报错

把 `minilexer.py` 中的输入修改为如下：

```cpp
int main() {
	int i;
	return i;
}
```

`minilexer.py` 的输出如下

```bash
token kind   text
-----------  -------------------
Int          int
Identifier   main
Lparen       (
Rparen       )
Lbrace       {
Int          int
Identifier   i
Semicolon    ;
Return       return
Identifier   i
Semicolon    ;
Rbrace       }
```

`miniparser` 的输出如下：

```bash
Traceback (most recent call last):
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/miniparser.py", line 70, in <module>
    print(default().parse("program"))
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/miniparser.py", line 44, in parse
    children.append(self.parse(child))
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/miniparser.py", line 44, in parse
    children.append(self.parse(child))
  File "d:/MyData/Programming/Compile/minidecaf-tutorial-code/step1/miniparser.py", line 41, in parse
    raise Exception(f"syntax error, {child} expected but {tok.kind.name} found")
Exception: syntax error, Return expected but Int found
```

`lexer` 不会报错的原因是 `minilexer` 中定义了 `Identifier` ，所以 `int i` 和 `return i` 都不会出错。

`parser` 出错的原因是 `miniparser` 中只定义了 `statement` 只定义了 `Return expression Semicolon` 一条语句，没有递归定义。所以 `main` 函数里只能有一条返回语句。

### 3. 函数返回值寄存器

在 rsic-v 中，一共有 2 个寄存器用于储存函数返回值，分别是寄存器 `x10 / a0` 和 `x11 / a1`。


## Part2 构建词法语法分析工具

我选用的实现方式是 `python` + `antlr4`。