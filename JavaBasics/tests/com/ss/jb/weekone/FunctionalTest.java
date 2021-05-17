package com.ss.jb.weekone;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {
	Functional function = new Functional();
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void rightDigitTest() {

		Integer[] arr1 = {1, 22, 93};
		Integer [] ans = {1, 2, 3};
		Assert.assertArrayEquals(ans, function.rightDigit(arr1));
		
		Integer[] arr2 = {16, 8, 866, 8 , 1};
		Integer [] ans2 = {6, 8, 6, 8, 1};
		Assert.assertArrayEquals(ans2, function.rightDigit(arr2));
		
		Integer[] arr3 = {10, 0};
		Integer [] ans3 = {0, 0};
		Assert.assertArrayEquals(ans3, function.rightDigit(arr3));
	}
	
	@Test
	public void doublingTest() {
		Integer[] arr1 = {1, 2, 3};
		Integer [] ans = {2, 4, 6};
		Assert.assertArrayEquals(ans, function.doubling(arr1));
		
		Integer[] arr2 = {6, 8, 6, 8, -1};
		Integer [] ans2 = {12, 16, 12, 16, -2};
		Assert.assertArrayEquals(ans2, function.doubling(arr2));
		
		Integer[] arr3 = {};
		Integer [] ans3 = {};
		Assert.assertArrayEquals(ans3, function.doubling(arr3));
	}
	
	@Test
	public void noXTest() {
		String[] arr1 = {"ax", "bb", "cx"};
		String [] ans = {"a", "bb", "c"};
		Assert.assertArrayEquals(ans, function.noX(arr1));
		
		String[] arr2 = {"xxax", "xbxbx", "xxcx"};
		String [] ans2 = {"a", "bb", "c"};
		Assert.assertArrayEquals(ans2, function.noX(arr2));
		
		String[] arr3 = {"x"};
		String [] ans3 = {""};
		Assert.assertArrayEquals(ans3, function.noX(arr3));
	}

}
