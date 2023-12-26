public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		//For statement which prints the divisors of the given command line argument using the modulo operator %
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
	}
}
