package com.ss.jb.two;

/**
 * Use Exceptions and check if all the following numbers are valid, stop if it can't read Integer or finishes
 * @author Tony
 *
 */
public class Summation {

	/**
	 * reads in cmd line arguments and sums together, throws and exits if not an Integer
	 * @param args
	 */
	public static void main(String[] args) {

		Integer sum = 0;
		for (String arg : args) {
			try {
				sum += Integer.valueOf(arg);
			} catch (NumberFormatException | NullPointerException e) {
				System.out.println("The argument entered is not a number.");
				System.exit(1);
				
			}
		}
		System.out.println(sum);
	}
}
