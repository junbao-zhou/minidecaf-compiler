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


    # Enter a parse tree produced by IR2asmParser#global_var.
    def enterGlobal_var(self, ctx:IR2asmParser.Global_varContext):
        pass

    # Exit a parse tree produced by IR2asmParser#global_var.
    def exitGlobal_var(self, ctx:IR2asmParser.Global_varContext):
        pass


    # Enter a parse tree produced by IR2asmParser#func.
    def enterFunc(self, ctx:IR2asmParser.FuncContext):
        pass

    # Exit a parse tree produced by IR2asmParser#func.
    def exitFunc(self, ctx:IR2asmParser.FuncContext):
        pass


    # Enter a parse tree produced by IR2asmParser#instruction.
    def enterInstruction(self, ctx:IR2asmParser.InstructionContext):
        pass

    # Exit a parse tree produced by IR2asmParser#instruction.
    def exitInstruction(self, ctx:IR2asmParser.InstructionContext):
        pass


    # Enter a parse tree produced by IR2asmParser#globaladdr.
    def enterGlobaladdr(self, ctx:IR2asmParser.GlobaladdrContext):
        pass

    # Exit a parse tree produced by IR2asmParser#globaladdr.
    def exitGlobaladdr(self, ctx:IR2asmParser.GlobaladdrContext):
        pass


    # Enter a parse tree produced by IR2asmParser#store_reg.
    def enterStore_reg(self, ctx:IR2asmParser.Store_regContext):
        pass

    # Exit a parse tree produced by IR2asmParser#store_reg.
    def exitStore_reg(self, ctx:IR2asmParser.Store_regContext):
        pass


    # Enter a parse tree produced by IR2asmParser#call.
    def enterCall(self, ctx:IR2asmParser.CallContext):
        pass

    # Exit a parse tree produced by IR2asmParser#call.
    def exitCall(self, ctx:IR2asmParser.CallContext):
        pass


    # Enter a parse tree produced by IR2asmParser#label.
    def enterLabel(self, ctx:IR2asmParser.LabelContext):
        pass

    # Exit a parse tree produced by IR2asmParser#label.
    def exitLabel(self, ctx:IR2asmParser.LabelContext):
        pass


    # Enter a parse tree produced by IR2asmParser#br.
    def enterBr(self, ctx:IR2asmParser.BrContext):
        pass

    # Exit a parse tree produced by IR2asmParser#br.
    def exitBr(self, ctx:IR2asmParser.BrContext):
        pass


    # Enter a parse tree produced by IR2asmParser#beqz.
    def enterBeqz(self, ctx:IR2asmParser.BeqzContext):
        pass

    # Exit a parse tree produced by IR2asmParser#beqz.
    def exitBeqz(self, ctx:IR2asmParser.BeqzContext):
        pass


    # Enter a parse tree produced by IR2asmParser#bnez.
    def enterBnez(self, ctx:IR2asmParser.BnezContext):
        pass

    # Exit a parse tree produced by IR2asmParser#bnez.
    def exitBnez(self, ctx:IR2asmParser.BnezContext):
        pass


    # Enter a parse tree produced by IR2asmParser#prologue.
    def enterPrologue(self, ctx:IR2asmParser.PrologueContext):
        pass

    # Exit a parse tree produced by IR2asmParser#prologue.
    def exitPrologue(self, ctx:IR2asmParser.PrologueContext):
        pass


    # Enter a parse tree produced by IR2asmParser#epilogue.
    def enterEpilogue(self, ctx:IR2asmParser.EpilogueContext):
        pass

    # Exit a parse tree produced by IR2asmParser#epilogue.
    def exitEpilogue(self, ctx:IR2asmParser.EpilogueContext):
        pass


    # Enter a parse tree produced by IR2asmParser#frameaddr.
    def enterFrameaddr(self, ctx:IR2asmParser.FrameaddrContext):
        pass

    # Exit a parse tree produced by IR2asmParser#frameaddr.
    def exitFrameaddr(self, ctx:IR2asmParser.FrameaddrContext):
        pass


    # Enter a parse tree produced by IR2asmParser#load.
    def enterLoad(self, ctx:IR2asmParser.LoadContext):
        pass

    # Exit a parse tree produced by IR2asmParser#load.
    def exitLoad(self, ctx:IR2asmParser.LoadContext):
        pass


    # Enter a parse tree produced by IR2asmParser#store.
    def enterStore(self, ctx:IR2asmParser.StoreContext):
        pass

    # Exit a parse tree produced by IR2asmParser#store.
    def exitStore(self, ctx:IR2asmParser.StoreContext):
        pass


    # Enter a parse tree produced by IR2asmParser#pop.
    def enterPop(self, ctx:IR2asmParser.PopContext):
        pass

    # Exit a parse tree produced by IR2asmParser#pop.
    def exitPop(self, ctx:IR2asmParser.PopContext):
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


    # Enter a parse tree produced by IR2asmParser#two_op.
    def enterTwo_op(self, ctx:IR2asmParser.Two_opContext):
        pass

    # Exit a parse tree produced by IR2asmParser#two_op.
    def exitTwo_op(self, ctx:IR2asmParser.Two_opContext):
        pass


    # Enter a parse tree produced by IR2asmParser#one_op.
    def enterOne_op(self, ctx:IR2asmParser.One_opContext):
        pass

    # Exit a parse tree produced by IR2asmParser#one_op.
    def exitOne_op(self, ctx:IR2asmParser.One_opContext):
        pass


    # Enter a parse tree produced by IR2asmParser#lor.
    def enterLor(self, ctx:IR2asmParser.LorContext):
        pass

    # Exit a parse tree produced by IR2asmParser#lor.
    def exitLor(self, ctx:IR2asmParser.LorContext):
        pass


    # Enter a parse tree produced by IR2asmParser#land.
    def enterLand(self, ctx:IR2asmParser.LandContext):
        pass

    # Exit a parse tree produced by IR2asmParser#land.
    def exitLand(self, ctx:IR2asmParser.LandContext):
        pass


    # Enter a parse tree produced by IR2asmParser#eq.
    def enterEq(self, ctx:IR2asmParser.EqContext):
        pass

    # Exit a parse tree produced by IR2asmParser#eq.
    def exitEq(self, ctx:IR2asmParser.EqContext):
        pass


    # Enter a parse tree produced by IR2asmParser#ne.
    def enterNe(self, ctx:IR2asmParser.NeContext):
        pass

    # Exit a parse tree produced by IR2asmParser#ne.
    def exitNe(self, ctx:IR2asmParser.NeContext):
        pass


    # Enter a parse tree produced by IR2asmParser#lt.
    def enterLt(self, ctx:IR2asmParser.LtContext):
        pass

    # Exit a parse tree produced by IR2asmParser#lt.
    def exitLt(self, ctx:IR2asmParser.LtContext):
        pass


    # Enter a parse tree produced by IR2asmParser#gt.
    def enterGt(self, ctx:IR2asmParser.GtContext):
        pass

    # Exit a parse tree produced by IR2asmParser#gt.
    def exitGt(self, ctx:IR2asmParser.GtContext):
        pass


    # Enter a parse tree produced by IR2asmParser#le.
    def enterLe(self, ctx:IR2asmParser.LeContext):
        pass

    # Exit a parse tree produced by IR2asmParser#le.
    def exitLe(self, ctx:IR2asmParser.LeContext):
        pass


    # Enter a parse tree produced by IR2asmParser#ge.
    def enterGe(self, ctx:IR2asmParser.GeContext):
        pass

    # Exit a parse tree produced by IR2asmParser#ge.
    def exitGe(self, ctx:IR2asmParser.GeContext):
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


    # Enter a parse tree produced by IR2asmParser#neg.
    def enterNeg(self, ctx:IR2asmParser.NegContext):
        pass

    # Exit a parse tree produced by IR2asmParser#neg.
    def exitNeg(self, ctx:IR2asmParser.NegContext):
        pass


    # Enter a parse tree produced by IR2asmParser#bitwise.
    def enterBitwise(self, ctx:IR2asmParser.BitwiseContext):
        pass

    # Exit a parse tree produced by IR2asmParser#bitwise.
    def exitBitwise(self, ctx:IR2asmParser.BitwiseContext):
        pass


    # Enter a parse tree produced by IR2asmParser#lnot.
    def enterLnot(self, ctx:IR2asmParser.LnotContext):
        pass

    # Exit a parse tree produced by IR2asmParser#lnot.
    def exitLnot(self, ctx:IR2asmParser.LnotContext):
        pass


