public class LabA4{

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);



		int LogicalLeftShift = x << 1; // logical left shift
		int LogicalRightShift = x >>> 1; // logical right shift
		int ArithmeticRightShift = x >> 1; // arithmetic right shift
		String output = Integer.toBinaryString(x);
		String output1 = Integer.toBinaryString(LogicalLeftShift);
		String output2 = Integer.toBinaryString(LogicalRightShift);
		String output3 = Integer.toBinaryString(ArithmeticRightShift);
		System.out.println("Original = " + output);
		System.out.println("LogicalLeftShift = " + output1);
		System.out.println("LogicalRightShift = " + output2);
		System.out.println("ArithmeticRightShift = " + output3);
	}
}
