/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int experiments = Integer.parseInt(args[0]);
		int two_children = 0;
		int three_children = 0;
		int four_or_more = 0;
		double total_children = 0;
		int most_common = 0;
		int maximum_frequency = 0;
		
        for(int i = 0; i <= experiments; i++){
        	boolean its_a_boy = false;
        	boolean its_a_girl = false;
        	int sum = 0;
       
	        while (!(its_a_boy && its_a_girl)) {
	            //Simulates the birth of a boy or a girl 
	            boolean Girl = Math.random() < 0.5;

	            // Update the flags based on the gender of the newborn
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
            }
        }

        // Display results
        double averageChildren = total_children / experiments;
        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + two_children);
        System.out.println("Number of families with 3 children: " + three_children);
        System.out.println("Number of families with 4 or more children: " + four_or_more);
        System.out.println("The most common number of children is " + most_common);
    }

}