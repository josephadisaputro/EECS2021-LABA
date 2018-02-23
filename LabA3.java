public class LabA3{

	public static void main(String[] args){
		int input1 = Integer.parseInt(args[0]);
		int input2 = Integer.parseInt(args[1]);
		String output1 = Integer.toBinaryString(input1);
		String output2 = Integer.toBinaryString(input2);
		int z = input1 & input2;
		int z1 = input1 | input2;
		int z2 = input1 ^ input2;
		int z3 = ~input1;
		String and = Integer.toBinaryString(z);
		String or = Integer.toBinaryString(z1);
		String xor = Integer.toBinaryString(z2);
		String not = Integer.toBinaryString(z3);


		System.out.println(and + ", " + or + ", " + xor + ", " + not);
	}
}

