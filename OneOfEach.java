public class OneOfEach {
    public static void main(String[] args) {
        boolean its_a_boy = false;
        boolean its_a_girl = false;
        int sum = 0;

        // Simulate the process until at least one boy and one girl are born
        while (!(its_a_boy && its_a_girl)) {
            //Simulates the birth of a boy or a girl 
            boolean Girl = Math.random() < 0.5;

            // Update the flags based on the gender of the newborn
            if (Girl) {
                its_a_girl = true;
            } else {
                its_a_boy = true;
            }

            if (Girl) {
                System.out.print("g");
            } else {
                System.out.print("b");
            }
            sum++;
            System.out.print(" ");

        }

        // Output the result
        System.out.println("\nYou made it... and you now have " + sum + " children.");
    }
}