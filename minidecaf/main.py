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
from antlr4 import *
from MyExpr.MyExprLexer import MyExprLexer
from MyExpr.MyExprParser import MyExprParser
from MyExpr.EvalVisitor import EvalVisitor


def main():
    input = InputStream(sys.stdin.read())
    lexer = MyExprLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = MyExprParser(tokens)
    parser._errHandler = BailErrorStrategy()  # 设置错误处理
    tree = parser.program()  # 取得一棵以 program 为根的 AST
    visitor = EvalVisitor()
    print(tree.accept(visitor))
