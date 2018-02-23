public class LabA6{

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);

		int z = x << 21; //make bit #10 the MSb
		z = z >>> 31; // make bit #10 the LSb

		String answer = "";
		int change1 = 0;

		if(z == 0){
			change1 = x | 1024;
			//answer = Integer.toBinaryString(change1);
			//System.out.println(answer);
		}

		int z1 = x << 20; //make bit #10 the MSb
		z1 = z1 >>> 31; // make bit #10 the LSb
		int THE1024 = 1024;
		int thenew1024 = THE1024 << 1;
		
		if(z1 == 1){
			change1 = change1 | thenew1024;
			//answer = Integer.toBinaryString(change1);
		}
		answer = Integer.toBinaryString(change1);
		System.out.println(answer);
	}

}

