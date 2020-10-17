# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .IR2asmParser import IR2asmParser
else:
    from IR2asmParser import IR2asmParser

# This class defines a complete listener for a parse tree produced by IR2asmParser.
class IR2asmListener(ParseTreeListener):

    # Enter a parse tree produced by IR2asmParser#program.
    def enterProgram(self, ctx:IR2asmParser.ProgramContext):
        pass

    # Exit a parse tree produced by IR2asmParser#program.
    def exitProgram(self, ctx:IR2asmParser.ProgramContext):
        pass


    # Enter a parse tree produced by IR2asmParser#main_fun.
    def enterMain_fun(self, ctx:IR2asmParser.Main_funContext):
        pass

    # Exit a parse tree produced by IR2asmParser#main_fun.
    def exitMain_fun(self, ctx:IR2asmParser.Main_funContext):
        pass


    # Enter a parse tree produced by IR2asmParser#instruction.
    def enterInstruction(self, ctx:IR2asmParser.InstructionContext):
        pass

    # Exit a parse tree produced by IR2asmParser#instruction.
    def exitInstruction(self, ctx:IR2asmParser.InstructionContext):
        pass


    # Enter a parse tree produced by IR2asmParser#push.
    def enterPush(self, ctx:IR2asmParser.PushContext):
        pass

    # Exit a parse tree produced by IR2asmParser#push.
    def exitPush(self, ctx:IR2asmParser.PushContext):
        pass


    # Enter a parse tree produced by IR2asmParser#ret.
    def enterRet(self, ctx:IR2asmParser.RetContext):
        pass

    # Exit a parse tree produced by IR2asmParser#ret.
    def exitRet(self, ctx:IR2asmParser.RetContext):
        pass


    # Enter a parse tree produced by IR2asmParser#lnot.
    def enterLnot(self, ctx:IR2asmParser.LnotContext):
        pass

    # Exit a parse tree produced by IR2asmParser#lnot.
    def exitLnot(self, ctx:IR2asmParser.LnotContext):
        pass


    # Enter a parse tree produced by IR2asmParser#bitwise.
    def enterBitwise(self, ctx:IR2asmParser.BitwiseContext):
        pass

    # Exit a parse tree produced by IR2asmParser#bitwise.
    def exitBitwise(self, ctx:IR2asmParser.BitwiseContext):
        pass


    # Enter a parse tree produced by IR2asmParser#neg.
    def enterNeg(self, ctx:IR2asmParser.NegContext):
        pass

    # Exit a parse tree produced by IR2asmParser#neg.
    def exitNeg(self, ctx:IR2asmParser.NegContext):
        pass


    # Enter a parse tree produced by IR2asmParser#add.
    def enterAdd(self, ctx:IR2asmParser.AddContext):
        pass

    # Exit a parse tree produced by IR2asmParser#add.
    def exitAdd(self, ctx:IR2asmParser.AddContext):
        pass


    # Enter a parse tree produced by IR2asmParser#sub.
    def enterSub(self, ctx:IR2asmParser.SubContext):
        pass

    # Exit a parse tree produced by IR2asmParser#sub.
    def exitSub(self, ctx:IR2asmParser.SubContext):
        pass


    # Enter a parse tree produced by IR2asmParser#mul.
    def enterMul(self, ctx:IR2asmParser.MulContext):
        pass

    # Exit a parse tree produced by IR2asmParser#mul.
    def exitMul(self, ctx:IR2asmParser.MulContext):
        pass


    # Enter a parse tree produced by IR2asmParser#div.
    def enterDiv(self, ctx:IR2asmParser.DivContext):
        pass

    # Exit a parse tree produced by IR2asmParser#div.
    def exitDiv(self, ctx:IR2asmParser.DivContext):
        pass


    # Enter a parse tree produced by IR2asmParser#rem.
    def enterRem(self, ctx:IR2asmParser.RemContext):
        pass

    # Exit a parse tree produced by IR2asmParser#rem.
    def exitRem(self, ctx:IR2asmParser.RemContext):
        pass


