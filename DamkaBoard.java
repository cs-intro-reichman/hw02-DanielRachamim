public class DamkaBoard {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        // Parse the command-line argument as an integer
        int numberOfStars = Integer.parseInt(args[0]);

        // Check if the argument is a positive integer
        if (numberOfStars <= 0) {
            System.out.println("Please provide a positive integer as the command-line argument.");
            return;
        }

        // Print the damka board with the specified number of '*' characters per row
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                // Print '*' for each position
                System.out.print("* ");

                // For every second row, print a leading space
                if (j == numberOfStars - 1 && i % 2 == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}