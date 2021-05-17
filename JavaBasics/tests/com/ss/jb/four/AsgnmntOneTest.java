package com.ss.jb.four;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsgnmntOneTest {

	@Test
	public void test() {
		AsgnmntOne singleton = AsgnmntOne.instance;
		assertEquals(null, singleton.getInstance());

	}

}
