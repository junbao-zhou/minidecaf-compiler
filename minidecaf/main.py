"""实例：真·main"""


# def main():
#     print("""\
# 			.text
# 			.globl	main
# 	main:
# 			li		a0,123
# 			ret\
# 	""")

import sys
import re
from antlr4 import *
from MyExpr.MyExprLexer import MyExprLexer
from MyExpr.MyExprParser import MyExprParser
from MyExpr.EvalVisitor import EvalVisitor


def IR2asm(input: str):
    output = re.sub(
        r"PUSH ([0-9]+)",
        lambda m: (m.group(0).replace(
            "PUSH", "addi sp, sp, -4  \n\tli t1 , ")) + "\n\tsw t1, 0(sp)",
        input
    )

    output = output.replace(
        "RET", "\tlw a0, 0(sp)  \n\taddi sp, sp, 4  \n\tjr ra")
    return output


def main():
    infile = sys.argv[1]
    file_test = open(infile, 'r').read()
    input = InputStream(file_test)
    lexer = MyExprLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = MyExprParser(tokens)
    parser._errHandler = BailErrorStrategy()  # 设置错误处理
    tree = parser.program()  # 取得一棵以 program 为根的 AST
    visitor = EvalVisitor()
    print(IR2asm(tree.accept(visitor)))
