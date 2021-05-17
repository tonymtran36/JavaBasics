package com.ss.jb.five;

import java.util.Arrays;

public class AsgnmntOne {
	
	public static int reverseAlpha(String s1, String s2) {
		return s2.charAt(0) - s1.charAt(0);
	}
	
	public static void main(String[] args) {
		String[] collection = {"One", "Two", "Three", "Four", "Five", "Six"};
		
		System.out.println("Printing Strings in ascending length");
		Arrays.sort(collection, (s1, s2) -> (s1.length() - s2.length()));
		for (String s: collection) System.out.println(s);
		
		System.out.println("\nPrinting Strings in descending length");
		Arrays.sort(collection, (s1, s2) -> (s2.length() - s1.length()));
		for (String s: collection) System.out.println(s);
		
		System.out.println("\nPrinting Strings in alphabetically");
		Arrays.sort(collection, (s1, s2) -> (s1.charAt(0) - s2.charAt(0)));
		for (String s: collection) System.out.println(s);
		
		
		System.out.println("\nPrinting Strings in reverse alphabet");
		Arrays.sort(collection,(s1,s2) -> AsgnmntOne.reverseAlpha(s1, s2));
		for (String s: collection) System.out.println(s);
		

	}
}
