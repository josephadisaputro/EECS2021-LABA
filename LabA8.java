public class LabA8{

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int z = 1 + ~x;
		String output = Integer.toBinaryString(z);
		//String output = Integer.toBinaryString(z);
		System.out.println(output);
	}
}

