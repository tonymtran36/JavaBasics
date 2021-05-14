package com.ss.jb.four;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {
	Line l = new Line(1, 2, 3, 4);
	@Test
	public void getSlopeTest() {
		
		assertEquals(2.8284, l.getSlope(), .0001);
		
	}
	
	@Test
	public void getDistanceTest() {
		Line l = new Line(1, 2, 3, 4);
		assertEquals(2.8284, l.getDistance());
		assertEquals(2.8284, l.getDistance());
	}
	
	@Test
	public void parallelToTest() {
		Line l = new Line(1, 2, 3, 4);
		assertEquals(true, l.parallelTo(new Line(1, 2 , 4, 5)));		
		assertEquals(false, l.parallelTo(new Line(1, 2 , 4, 5)));
	}

}
