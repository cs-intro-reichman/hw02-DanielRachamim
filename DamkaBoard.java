public class DamkaBoard {
    public static void main(String[] args) {
        // Parse the command-line argument as an integer
        int n = Integer.parseInt(args[0]);

        // Print the damka board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for even positions, and ' ' for odd positions
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();  // Move to the next line for the next row
        }
    }
}