public class Perfect {
    public static void main(String[] args) {
        
        // Parse the command-line argument as an integer
        int num = Integer.parseInt(args[0]);
		int sum = 1; 

        // The string below will represent the divisors string.
        // We are starting with 1 cause every number is divisible by 1
        
        String str = "1";

        // Find divisors and add them to the sum, while skipping the trivial divisor 1 
        for (int i = 2; i <= num / 2; i++) { 
            if (num % i == 0) {
                sum += i;
                str += " + " + i;
            }
        }

        // Check if the sum of divisors equals the original number
        if (sum == num) {
            System.out.println(num + " is a perfect number since " + num + " = " + str);
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}








//public class Perfect {
//	public static void main (String[] args) {
//		int num = Integer.parseInt(args[0]);
//		string str = string(num) + "is a perfect number since " + string(num) + " = 1"
//		System.out.println(str);
//		for (int i = 1; i <= num; i++) {
//            while (num % i == 0) {
//            	str.concat(" + " + string(i));
//            	System.out.println(str);
//           	if ()
	//}
//}
