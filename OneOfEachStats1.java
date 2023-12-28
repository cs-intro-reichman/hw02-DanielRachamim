/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        int experiments = Integer.parseInt(args[0]);
        int two_children = 0;
        int three_children = 0;
        int four_or_more = 0;
        double total_children = 0;
        int most_common = 0;
        int maximum_frequency = 0;

        for (int i = 0; i < experiments; i++) {
            boolean its_a_boy = false;
            boolean its_a_girl = false;
            int sum = 0;

            while (!(its_a_boy && its_a_girl)) {
                boolean Girl = Math.random() < 0.5;

                if (Girl) {
                    its_a_girl = true;
                } else {
                    its_a_boy = true;
                }
                sum++;
            }

            total_children += sum;

            if (sum == 2) {
                two_children++;
            } else if (sum == 3) {
                three_children++;
            } else if (sum >= 4) {
                four_or_more++;
            }

            // Updating the most common number of children
            if (sum > maximum_frequency) {
                most_common = sum;
                maximum_frequency = sum;
            } else if (sum == most_common) {
                maximum_frequency++;
            }
        }

        // Display results
        double averageChildren = total_children / experiments;
        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + two_children);
        System.out.println("Number of families with 3 children: " + three_children);
        System.out.println("Number of families with 4 or more children: " + four_or_more);
        if (most_common > 4) {
            System.out.println("The most common number of children is 4 or more");
        } else {
            System.out.println("The most common number of children is " + most_common);
        }
    }
}
        //if (two_children == three_children){
        //	most_common = two_children;
        //} else if (three_children == four_or_more){ 
        //	most_common = three_children;
        //} else if (two_children == four_or_more){
        //	most_common = two_children;
        //}     
        //System.out.println("The most common number of children is " + most_common);
