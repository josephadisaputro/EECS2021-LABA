.globl calCost
.globl calArea
.globl calYield
.data
integer: 	.word	1, 2, 3, 4
spacing:	.asciiz	" ", "\n"
.text

calCost:
	mult	$a1, $a2
	mflo	$t0
	div	$a0, $t0
	mflo	$v0

	jr	$ra

calArea:
	div 	$a0, $a1
	mflo	$v0
	
	jr	$ra
calYield: 
	addi	$s1, $0, 4
	lw	$t0, integer($s0)
	div	$a1, $t0
	mflo	$t1
	mult	$a0, $t1
	mflo	$t9
	mult	$t9, $t9
	mflo	$t9
	addi	$t9, $t9, 1
	lw	$t8, integer($0)
	div 	$t8, $t9
	mflo	$v0

	jr	$ra
