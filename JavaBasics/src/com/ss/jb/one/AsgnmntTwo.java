package com.ss.jb.one;

import java.util.Scanner;

/**
 * Lets a user guess a number between 1 to 100
 * @author Tony
 *
 */
public class AsgnmntTwo {

	/**
	 * generates a random number within the parameters
	 * @param min
	 * the minimum range value
	 * @param max
	 * the maximum range value
	 * @return
	 * the randomly generated integer number
	 */
	public static int generateRandomNum(int min, int max) {
		return (int)((Math.random() * (max-min)) + min);
		
	}
	/**
	 * Prompts the user for a numerical guess and guessing within the range
	 * @param args
	 * command line arguments
	 */
	public static void main(String[] args) {
		int randomNum = generateRandomNum(1,100);
		System.out.println("Please Guess a number between 1 to 100");
		
		Scanner scan = new Scanner(System.in);		
		int attempts = 0;

		while (attempts < 5) {
			if (!scan.hasNextInt()) { break;}
			int guess = scan.nextInt();
			if ( guess<1 || guess>100) { break;}
			
			if ( (guess >= randomNum - 10) && (guess <= randomNum + 10) ) {
				System.out.println("The answer is " + randomNum);
				break;
			}
			else {
				System.out.println("Try Again");
				attempts++;
			}
		}
		if (attempts == 5) {
			System.out.println("Sorry, the answer was " + randomNum);

		}
		scan.close();
	}
}
