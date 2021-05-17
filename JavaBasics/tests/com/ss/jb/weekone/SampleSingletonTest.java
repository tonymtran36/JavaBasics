package com.ss.jb.weekone;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class SampleSingletonTest {
	SampleSingleton singleton = null;
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void SingletonTest() {
		Assert.assertNull(singleton);
	}

}
