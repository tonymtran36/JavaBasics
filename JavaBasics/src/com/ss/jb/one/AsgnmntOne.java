package com.ss.jb.one;

/**
 * Program set for Java Week 1 - Day 1 Assignment 1
 * @author Tony
 *
 */
public class AsgnmntOne {
	/**
	 * prints an ascending star staircase followed by a series of periods.
	 */
	public static void printOne() {
		System.out.println("1)");
		
		int size = 1;
		for(int i = 0; i < 4; i++) {
			int counter = 0;
			while (counter < size) {
				System.out.print("*");
				counter++;
			}
			System.out.println("");
			size++;
		}
		
		for (int i = 0; i < 9; i++) {
			System.out.print(".");
		}
	}
	
	/**
	 * prints a series of periods followed by an ascending star staircase.
	 */
	public static void printTwo() {
		System.out.println("\n2)");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(".");
		}
		System.out.println();
		
		int size = 4;
		for(int i = 0; i < 4; i++) {
			int counter = 0;
			
			while (counter < size) {
				System.out.print("*");
				counter++;
			}
			System.out.println("");
			size--;
		}
	}
	
	/**
	 * prints an ascending star staircase centered followed by a series of periods.
	 */
	public static void printThree() {
		System.out.println("3)");

		int size = 4;
		for(int i = 0; i < size; i++) {
			
			for(int j = i; j<size+1;j++) {//5-1 4-3 2-7
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 11; i++) {
			System.out.print(".");
		}
	}
	
	/**
	 * prints a series of periods followed by an ascending star staircase centered.
	 */
	public static void printFour() {
		System.out.println("\n4)");
		
		for (int i = 0; i < 12; i++) {
			System.out.print(".");
		}
		System.out.println();
		
		int size = 4;
		for(int i = 0; i < size; i++) {
			
			for(int j = 2; j<size+i;j++) {//5-1 4-3 2-7
				System.out.print(" ");
			}
			for(int j=size*2-1-(i*2);j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		printOne();
		printTwo();
		printThree();
		printFour();
	}
}
