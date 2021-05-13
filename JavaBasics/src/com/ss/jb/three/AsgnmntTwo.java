package com.ss.jb.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Write a Java program to append text to an existing file.
 * 
 * @author Tony
 *
 */
public class AsgnmntTwo {
	
	//Java Basics Week 1 Day 3 Assignment 2 - Original contents of SampleA2.txt

	public void nioFileWriter(String append) {
		try {
			Files.write(Paths.get("resources/SampleA2.txt"), append.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		AsgnmntTwo fileAppender = new AsgnmntTwo();
		
		for (int i = 0; i < 3; i++) {
			String append = " This has been appended " + (i+1) + " times.";
			fileAppender.nioFileWriter(append);
		}

	}
}
