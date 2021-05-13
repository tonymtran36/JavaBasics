package com.ss.jb.three;

import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that counts the number of times a particular character, such as 'e', appears in a file. 
 * The character can be specified at the command line.
 * 
 * @author Tony
 *
 */
public class AsgnmntThree {

	public static void main(String[] args) {
		Character charMatch = args[0].charAt(0);		
		Integer count = 0;
		
		try (FileReader reader = new FileReader("resources/SampleCNNA3.txt")) {
			int temp = reader.read();
			while ((temp = reader.read()) != -1 ) {
				if (charMatch == temp) {
					count++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The character " + charMatch + " reoccurs: " +  count + " times.");
	}
}
