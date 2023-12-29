import java.util.Random;
public class OneOfEachStats {
    public static void main(String[] args) {
        int experiments = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random();
        
        //Relevent variables for aggregating
        int two_children = 0;
        int three_children = 0;
        int four_or_more = 0;
        int total_experiments = 0;
        

        for (int i = 0; i < experiments; i++) {
            int its_a_boy = 0;
            int its_a_girl = 0;
            int total_children = 0;
            while ((its_a_boy < 1) || (its_a_girl < 1)) {
                double which_gender = generator.nextDouble();

                if (which_gender < 0.5) {
                    its_a_boy++;
                } else {
                    its_a_girl++;
                }
            }
            //Getting the number of total children
            total_children = its_a_boy + its_a_girl;

            if (total_children == 2) {
                two_children++;
            } else if (total_children == 3) {
                three_children++;
            } else if (total_children >= 4) {
                four_or_more++;
            }

            total_experiments = total_experiments + total_children;
        }


        // Display results
        double averageChildren = total_experiments / experiments;
        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + two_children);
        System.out.println("Number of families with 3 children: " + three_children);
        System.out.println("Number of families with 4 or more children: " + four_or_more);

        // Most common number of children
        if ((two_children > three_children) && (two_children > four_or_more)) {
            System.out.println("The most common number of children is 2.");
        } else if ((three_children > two_children) && (three_children > four_or_more)) {
            System.out.println("The most common number of children is 3.");
        } else if ((four_or_more > two_children) && (four_or_more > three_children)) {
            System.out.println("The most common number of children is 4 or more.");
        } else if ((three_children > two_children) && (three_children == four_or_more)) {
            System.out.println("The most common number of children is 3.");
        } else if ((two_children > four_or_more) && (three_children == two_children)) {
            System.out.println("The most common number of children is 2.");
        } else if ((two_children == four_or_more) && (three_children == two_children)) {
            System.out.println("The most common number of children is 2.");
        System.out.println();
       } 
    }
}
        