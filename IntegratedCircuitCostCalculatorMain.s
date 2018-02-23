	.text 

main:
	sw	$ra, 0($sp)
	add	$sp, $sp, -4

	addi	$v0, $0, 5 	#asking for which calculation is wanted by user, is it cost/die, dies/wafer, yield
	syscall
	add	$t0, $0, $v0

	addi	$v0, $0, 5 	#asking for first input number  
	syscall
	add	$t1, $0, $v0

	addi	$v0, $0, 5 	#asking for second input number
	syscall
	add	$t2, $0, $v0

	addi	$v0, $0, 5 	#asking for second input number
	syscall
	add	$t3, $0, $v0

	addi	$s0, $0, 1
	addi	$s1, $0, 2
	addi	$s2, $0, 3
	beq 	$t0, $s0, costPERdie
	beq	$t0, $s1, diesPERwafer
	beq	$t0, $s2, yield	



costPERdie:
	add	$a0, $0, $t1	#first input will be cost/wafer
	add	$a1, $0, $t2	#second input will be die/wafer
	add	$a2, $0, $t3	#third input will be yield
	jal	calCost
	add	$a0, $0, $v0
	j	fini
diesPERwafer:
	add	$a0, $0, $t1	#first input will be wafer area
	add	$a1, $0, $t2	#second input will be die area	
	jal	calArea
	add	$a0, $0, $v0
	j	fini
yield:
	add	$a0, $0, $t1	#first input will be defects/area
	add	$a1, $0, $t2	#second input will be die area
	jal	calYield
	add	$a0, $0, $v0
	j	fini

fini:	
	addi	$v0, $0, 1
	syscall

	addi	$sp, $sp, 4
	lw	$ra, 0($sp)
	jr	$ra








