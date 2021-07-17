// Name : Lina Khaled
// Number: 93
package lina94task4;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class Lina94Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the time please: ");
            String time = input.next();
            String [] number = time.split(":");
		int firstPart = Integer.parseInt(number[0]);
		int secondPart = Integer.parseInt(number[1]);
		convertToWord(firstPart, secondPart);
	}
	// Convert Time to words.
	static void convertToWord(int first, int second)
	{
		String nums[] = { "zero", "one", "two", "three", "four",
							"five", "six", "seven", "eight", "nine",
							"ten", "eleven", "twelve", "thirteen",
							"fourteen", "fifteen", "sixteen", "seventeen",
							"eighteen", "nineteen", "twenty", "twenty one",
							"twenty two", "twenty three", "twenty four",
							"twenty five", "twenty six", "twenty seven",
							"twenty eight", "twenty nine",
						};
	
		if (second == 0)
			System.out.println(nums[first] + " o' clock ");
	
		else if (second == 1)
			System.out.println("one minute past " + nums[first]);
	
		else if (second == 59)
			System.out.println("one minute to " + nums[(first % 12) + 1]);
	
		else if (second == 15)
			System.out.println("quarter past " + nums[first]);
	
		else if (second == 30)
			System.out.println("half past " + nums[first]);
	
		else if (second == 45)
			System.out.println("quarter to " + nums[(first % 12) + 1]);
	
		else if (second <= 30)
			System.out.println( nums[second] + " minutes past " + nums[first]);
	
		else if (second > 30)
			System.out.println( nums[60 - second] + " minutes to " + nums[(first % 12) + 1]);
	}
	
}
