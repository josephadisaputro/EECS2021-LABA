.text

main:

	addi	$v0, $0, 5
	syscall
	add	$t0, $0, $v0	#input by user

	addi	$t9, $0, 1	#the M 	
	addi	$t7, $0, 0	
loop:	
	mult	$t9, $t9	# MxM
	mflo	$t8		# M^2
	
	add	$t7, $t7, $t8	# M^2 + M^2 + ...
	
	slt	$s0, $t0, $t7	# if ($t0 < $t7) then $s0 is 1
	bne	$s0, $0, then	# if ($s0 != 0) then jump out
	addi	$t9, $t9, 1 	# M = M + 1
	j	loop		# loop again

then:
	addi 	$t9, $t9, -1
	mult	$t9, $t9

	add	$a0, $0, $t9
	addi	$v0, $0, 1
	syscall
	
	jr	$ra

 
	

	

