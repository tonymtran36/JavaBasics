package com.ss.jb.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Get a list of all file/directory names (including in subdirectories) under a given directory.
 * 
 * @author Tony
 *
 */
public class AsgnmntOne {

	public void printFilesAndDir(File directory) {
		
		try {
			String[] filenames = directory.list();
			for (String filename : filenames) {
				System.out.println(filename);
				if (new File(directory + "\\" + filename).isDirectory()) {
					System.out.print("\t");
					printFilesAndDir(new File(directory + "\\" + filename));
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	//C:\Users\Tony\git
	//resources
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a relative pathname: ");
		String pathname = scan.next();

		AsgnmntOne printer = new AsgnmntOne();
		printer.printFilesAndDir(new File(pathname));
		scan.close();
	}

}
