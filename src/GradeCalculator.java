import java.util.Scanner;
import java.util.ArrayList;


public class GradeCalculator {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		
		System.out.println("Ready to take scores.\n");
 		
		while( input.hasNext() ) {
		
			System.out.println("Enter numbers between 0-100 for each score.\n"
				         + "Use a negative number to stop and calculate.\n");
		
			if(input.hasNextInt() ) {
				int num = input.nextInt();
				if(num <= 100 && num >=0 ) {
					scoreList.add(num);
					System.out.println("Score added!\n");
				} else if( num > 100) {
					System.out.printf("%s is higher than 100.\n", num );
				}
				else {
					//calculate here
					int totalSum = 0;
					int totalCount = 0;
					
					for ( int add : scoreList ) {
						totalSum += add;
						totalCount ++;
					}
					
					int percentage = totalSum / totalCount;
					
					System.out.println("made it here!");
					
					System.out.printf("Here are the calculations!\n"
							+ "The total of all the scores is: %s\n"
							+ "The number of scores calculated is; %s"
							+ "And the average of all the scores is: %s\n"
							, totalSum, totalCount, percentage );
					if(percentage > 90) {
						System.out.println("Excellent Work!");
					}
					else if( percentage >80) {
						System.out.println("Good Job!");		
					}
					else if( percentage > 70) {
						System.out.println("Keep it up!");
					}
					else {
						System.out.println("Let's work hard to get those grades up!");
					}
					
				}
				
			}
			else {
				String nope = input.nextLine();
				System.out.printf("%s is not a number.\n", nope );
			}

		}
	}

}

/*
 * Inside of a Java class main method, initialize any variables and objects you
 * need (i.e. a scanner, some counters for a total running sum, and a number
 * tracking the # of scores inputted 
 * 
 * Make a loop that repeatedly asks the user
 * for a number and won't stop until the user answers using a negative number
 * 
 * Add some error checking for when a user inputs a number over 100 - we should
 * skip that input and start the loop over to ask again 
 * 
 * Calculate the average of
 * all scores collected during the loop 
 * 
 * Display the average grade and
 * corresponding message 
 * 
 * If over 90: "Excellent Work!" If over 80: "Good Job!"
 * If over 70: "Keep it up!" anything else:
 * "Let's work hard to get those grades up!"
 */