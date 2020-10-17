# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .IR2asmParser import IR2asmParser
else:
    from IR2asmParser import IR2asmParser

# This class defines a complete generic visitor for a parse tree produced by IR2asmParser.

class IR2asmVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by IR2asmParser#program.
    def visitProgram(self, ctx:IR2asmParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#main_fun.
    def visitMain_fun(self, ctx:IR2asmParser.Main_funContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#instruction.
    def visitInstruction(self, ctx:IR2asmParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#push.
    def visitPush(self, ctx:IR2asmParser.PushContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#ret.
    def visitRet(self, ctx:IR2asmParser.RetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#lnot.
    def visitLnot(self, ctx:IR2asmParser.LnotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#bitwise.
    def visitBitwise(self, ctx:IR2asmParser.BitwiseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#neg.
    def visitNeg(self, ctx:IR2asmParser.NegContext):
        return self.visitChildren(ctx)



del IR2asmParser