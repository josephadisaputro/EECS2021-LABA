public class LabA{
	public static void main (String[]args){
		int input = Integer.parseInt(args[0]);
		
		int group1 = input << 28; // RIGHT MOST
		group1 = group1 >>> 28;
		
		int group2 = input << 24; 
		group2 = group2 >>> 28;
		
		int group3 = input << 20; 
		group3 = group3 >>> 28;

		int group4 = input << 16; 
		group4 = group4 >>> 28;

		int group5 = input << 12; 
		group5 = group5 >>> 28;

		int group6 = input << 8; 
		group6 = group6 >>> 28;

		int group7 = input << 4; 
		group7 = group7 >>> 28;

		int group8 = input >>> 28; // left most

		String output8 = Integer.toHexString(group1);
		String output7 = Integer.toHexString(group2);
		String output6 = Integer.toHexString(group3);
		String output5 = Integer.toHexString(group4);
		String output4 = Integer.toHexString(group5);
		String output3 = Integer.toHexString(group6);
		String output2 = Integer.toHexString(group7);
		String output1 = Integer.toHexString(group8);
	
		System.out.println(output8);
		System.out.println(output7);
		System.out.println(output6);
		System.out.println(output5);
		System.out.println(output4);
		System.out.println(output3);
		System.out.println(output2);
		System.out.println(output1);

	}	
}
