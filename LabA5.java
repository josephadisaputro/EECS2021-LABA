public class LabA5{

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);

		int z = x << 21; //make bit #10 the MSb
		z = z >>> 31; // make bit #10 the LSb
		
		// or

		int mask = 1024;
		int y = x & mask;
		y = y >> 10;

		String output = Integer.toBinaryString(z);
		String output1 = Integer.toBinaryString(y);

		System.out.println(output);
		System.out.println(output1);
	}
}

