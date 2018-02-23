public class LabA2{

	public static void main(String[] args){
		int input = Integer.parseInt(args[0]);
		String output = Integer.toBinaryString(input);
		System.out.println(output);
		String output2 = Integer.toHexString(input);
		System.out.println(output2);
		int after = Integer.reverse(input);
		String output3 = Integer.toHexString(after);
		System.out.println(output3);

	}
}

