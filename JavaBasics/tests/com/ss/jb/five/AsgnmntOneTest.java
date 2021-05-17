package com.ss.jb.five;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class AsgnmntOneTest {

	@Test
	public void sortTest() {
		String[] collection = {"One", "Two", "Three", "Four", "Five", "Six"};

		Arrays.sort(collection, (s1, s2) -> (s1.length() - s2.length()));
		assertEquals("One", collection[0]);

		Arrays.sort(collection, (s1, s2) -> (s2.length() - s1.length()));
		assertEquals("Three", collection[0]);
		
		Arrays.sort(collection, (s1, s2) -> (s1.charAt(0) - s2.charAt(0)));
		assertEquals("Four", collection[0]);
		
		Arrays.sort(collection,(s1,s2) -> AsgnmntOne.reverseAlpha(s1, s2));
		assertEquals("Three", collection[0]);
	}

}
