/**
 * 
 */
package slideDeckTasks;

import java.util.Scanner;

/**
 * 
 */
public class Exercise2_LongName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare String
		
		String applicantsName;
		int longName;
		
		// Prompt user for input
		
		System.out.println("What is your name?");
		
		// Instantiate the Scanner Object
		
		Scanner scanner = new Scanner(System.in);
		
		// Get applicant's name
		
		applicantsName = scanner.nextLine();
		
		// Prompt for what they deem a long name
		
		System.out.println("How many characters do you deem to be in a long name?");
		
		// Number of characters they deem to be in a long name
		
		longName = scanner.nextInt();
		scanner.nextLine(); //clear the scanner - doesn't move it to the next line
		
		// If statement
		
		if (applicantsName.length() > longName) {
			System.out.println("So you think you have a long name!");
		}
		if (applicantsName.length() <= longName) {
			System.out.println("You have a short name");
		}
		scanner.close();
			
	}

}
