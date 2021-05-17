package com.ss.jb.weekone;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class RecursionTest {
	Recursion recurse = new Recursion();
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void groupSumClumpTest() {
		int[] arr1 = {2, 4, 8};
		int[] arr2 = {1, 2, 4, 8, 1};
		int[] arr3 = {2, 4, 4, 8};
		
		assertEquals(true, recurse.groupSumClump(0, arr1, 10));
		assertEquals(true, recurse.groupSumClump(0, arr2, 14));
		assertEquals(false, recurse.groupSumClump(0, arr3, 14));
		
		assertNotEquals(true, recurse.groupSumClump(0, arr3, 14));
		
	}

}
