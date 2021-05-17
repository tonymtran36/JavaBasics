package com.ss.jb.five;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AsgnmntThreeTest {

	@Test
	public void test() {
		AsgnmntThree obj  = new AsgnmntThree();
		ArrayList<String> list = new ArrayList<String>();
		list.add("store");
		list.add("a00");
		list.add("avacado");
		list.add("apple");
		list.add("app");

		ArrayList<String> listFiltered = obj.aToString(list);
		assertEquals("a00", listFiltered.get(0));
		assertEquals("app", listFiltered.get(1));
	}

}
