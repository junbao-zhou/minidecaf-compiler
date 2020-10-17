from IR2asm.IR2asmParser import IR2asmParser
from IR2asm.IR2asmEvalVisitor import IR2asmEvalVisitor
from IR2asm.IR2asmLexer import IR2asmLexer
from antlr4 import *


string = """
main{
PUSH 0
RET
}
"""


def test():
    input = InputStream(string)
    lexer = IR2asmLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = IR2asmParser(tokens)
    parser._errHandler = BailErrorStrategy()  # 设置错误处理
    tree = parser.program()  # 取得一棵以 program 为根的 AST
    visitor = IR2asmEvalVisitor()
    IRcode = tree.accept(visitor)
    print(IRcode)
