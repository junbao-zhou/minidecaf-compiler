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
import argparse
from antlr4 import *
from MyExpr.MyExprLexer import MyExprLexer
from MyExpr.MyExprParser import MyExprParser
from MyExpr.EvalVisitor import EvalVisitor

from IR2asm.IR2asmLexer import IR2asmLexer
from IR2asm.IR2asmParser import IR2asmParser
from IR2asm.IR2asmEvalVisitor import IR2asmEvalVisitor

parser = argparse.ArgumentParser(
    description='Minidecaf Compiler by Bowman Chow')
parser.add_argument('file', help='input file path')
args = parser.parse_args()


def main():
    infile = args.file
    file_string = open(infile, 'r').read()
    input = InputStream(file_string)
    lexer = MyExprLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = MyExprParser(tokens)
    parser._errHandler = BailErrorStrategy()  # 设置错误处理
    tree = parser.program()  # 取得一棵以 program 为根的 AST
    visitor = EvalVisitor()
    IRcode = tree.accept(visitor)
    # print(IRcode)

    input = InputStream(IRcode)
    lexer = IR2asmLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = IR2asmParser(tokens)
    parser._errHandler = BailErrorStrategy()  # 设置错误处理
    tree = parser.program()  # 取得一棵以 program 为根的 AST
    visitor = IR2asmEvalVisitor()
    asm = tree.accept(visitor)
    print(asm)
