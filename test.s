
    j main

    .text
    .globl main
add:

    addi sp, sp, -16
    sw ra, 12(sp)
    sw fp, 8(sp)
    addi fp, sp, 16

    # FRAMEADDR -3
    addi sp, sp, -4
    addi t1, fp, 0
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # STORE
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)

    addi sp, sp, 4

    # FRAMEADDR -4
    addi sp, sp, -4
    addi t1, fp, 4
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    # FRAMEADDR 1
    addi sp, sp, -4
    addi t1, fp, -16
    sw t1, 0(sp)

    # STORE
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)

    addi sp, sp, 4

    addi sp, sp, -4 
    li t1 , 2
    sw t1, 0(sp)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    lw t1, 4(sp)
    lw t2, 0(sp)
    mul t1, t1, t2
    addi sp, sp, 4
    sw t1, 0(sp)

    # FRAMEADDR 1
    addi sp, sp, -4
    addi t1, fp, -16
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    lw t1, 4(sp)
    lw t2, 0(sp)
    add t1, t1, t2
    addi sp, sp, 4
    sw t1, 0(sp)

    j add_epilogue

    addi sp, sp, -4 
    li t1 , 0
    sw t1, 0(sp)

    j add_epilogue

    add_epilogue:
    lw a0, 0(sp)
    addi sp, sp, 4
    lw fp, 8(sp)
    lw ra, 12(sp)
    addi sp, sp, 16
    jr ra

    .text
    .globl main
main:

    addi sp, sp, -12
    sw ra, 8(sp)
    sw fp, 4(sp)
    addi fp, sp, 12

    addi sp, sp, -4 
    li t1 , 1
    sw t1, 0(sp)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # STORE
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)

    addi sp, sp, 4

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    addi sp, sp, -4 
    li t1 , 1
    sw t1, 0(sp)

    lw t1, 4(sp)
    lw t2, 0(sp)
    add t1, t1, t2
    addi sp, sp, 4
    sw t1, 0(sp)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # STORE
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # LOAD
    lw t1, 0(sp)
    lw t1, 0(t1)
    sw t1, 0(sp)

    addi sp, sp, -4 
    li t1 , 1
    sw t1, 0(sp)

    lw t1, 4(sp)
    lw t2, 0(sp)
    add t1, t1, t2
    addi sp, sp, 4
    sw t1, 0(sp)

    # FRAMEADDR 0
    addi sp, sp, -4
    addi t1, fp, -12
    sw t1, 0(sp)

    # STORE
    lw t1, 4(sp)
    lw t2, 0(sp)
    addi sp, sp, 4
    sw t1, 0(t2)

    call add

    addi sp, sp, 4

    addi sp, sp, 4

    addi sp, sp, -4
    sw a0, 0(sp)

    j main_epilogue

    addi sp, sp, -4 
    li t1 , 0
    sw t1, 0(sp)

    j main_epilogue

    main_epilogue:
    lw a0, 0(sp)
    addi sp, sp, 4
    lw fp, 4(sp)
    lw ra, 8(sp)
    addi sp, sp, 12
    jr ra

