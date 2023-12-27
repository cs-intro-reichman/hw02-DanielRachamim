public class DamkaBoard {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int index_line = 1;
        System.out.println();

        while(index_line <= input) {
            int x = 1;
            // Printing the damka board using a while loop
            while (x <= input) {
                if ((index_line % 2 == 0)) {
                    //Starting the row with a space if the line is even
                    System.out.print(" *"); 
                } else {
                    System.out.print("* ");
                }
                x = x+1;   
            }  
            System.out.println();
            index_line = index_line + 1;    
        }
    }
}
        