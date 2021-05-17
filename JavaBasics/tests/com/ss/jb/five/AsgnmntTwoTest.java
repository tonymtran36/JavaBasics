package com.ss.jb.five;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AsgnmntTwoTest {

	@Test
	public void test() {
		AsgnmntTwo obj  = new AsgnmntTwo();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(44);
		assertEquals("o1,o3,e44", obj.toStringComma(list).toString());
	}

}
