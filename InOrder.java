public class InOrder {
    public static void main(String[] args) {
        // Generate the first random number
        int num = (int) (Math.random() * 10);

        // Print the first number
        System.out.print(num);

        // A do-while loop to generate and print the next numbers
        do {
            // Generating the next random number
            int next_num = (int) (Math.random() * 10);

            // Checking if the next number is greater or equal to the current number
            if (next_num >= num) {
                //Printing the next number
                System.out.print(" " + next_num);

                //Updating the next num
                num = next_num;
            } else {
                //Getting out of the loop if the sequence isn't a decreasing one
                break;
            }
        } while (true);
    }
}
