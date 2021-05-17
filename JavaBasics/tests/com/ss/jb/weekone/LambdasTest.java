package com.ss.jb.weekone;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class LambdasTest {

	@Test
	public void isOddtest() {
		assertEquals(true, Lambdas.check(Lambdas.isOdd(), 4));
		assertEquals(false, Lambdas.check(Lambdas.isOdd(), 3));
	}

	@Test
	public void isPrimetest() {
		assertEquals(true, Lambdas.check(Lambdas.isPrime(), 5));
		assertEquals(false, Lambdas.check(Lambdas.isPrime(), 12));
	}
	
	@Test
	public void isPalindrometest() {
		assertEquals(true, Lambdas.check(Lambdas.isPalindrome(), 898));
		assertEquals(false, Lambdas.check(Lambdas.isPalindrome(), 998));
	}
}
