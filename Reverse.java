public class Reverse {
	public static void main (String[] args){
		String input = args[0];
		int length = input.length();
		int mid = length/2;
		//Print the reversed string
		for (int i = length-1; i >= 0 ;i--) {
			System.out.print(input.charAt(i));
		} 
		System.out.println();
		//Print the middle character
		if (length % 2 == 0) {
			System.out.println("The middle character is " + input.charAt(mid-1));
		}
		else {System.out.println("The middle character is " + input.charAt(mid));}
	}

}