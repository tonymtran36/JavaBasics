package com.ss.jb.four;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LineTest {
	Line l = new Line(1, 2, 3, 4);
	Line l2 = new Line(3.5, 2.8, 3.5, 9.1);
	
	@Test
	public void getSlopeTest() {
		assertEquals(1, l.getSlope(), .0001);
		assertNotEquals(10.5, l.getSlope(), .0001);
		
	}
	
	@Rule
	public ExpectedException ex = ExpectedException.none();
	@Test
	public void getSlopeExceptionTest() {
		ex.expect(ArithmeticException.class);
		l2.getSlope();
	}
	
	@Test
	public void getDistanceTest() {
		Line l = new Line(1, 2, 3, 4);
		assertEquals(2.8284, l.getDistance(), .0001);
		assertNotEquals(5, l.getDistance(),.0001);
	}
	
	@Test
	public void parallelToTest() {
		Line l = new Line(1, 2, 3, 4);
		assertEquals(true, l.parallelTo(new Line(1, 2 , 2, 3)));		
		assertEquals(false, l.parallelTo(new Line(5, 1 , 7, 2)));
	}

}
