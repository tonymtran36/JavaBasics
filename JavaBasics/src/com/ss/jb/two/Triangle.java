package com.ss.jb.two;

/**
 * Triangle class that inherits shape interface to calculate area and display itself
 * 
 * @author Tony
 *
 */
public class Triangle implements Shape{

	private Integer base;
	private Integer height;
	private Double area;
	
	public Triangle(Integer b, Integer h) {
		base = b;
		height = h;
	}
	/**
	 * calculate area of a triangle - 1/2b*h
	 */
	@Override
	public void calculateArea() {
		area = .5 * base * height;
	}

	/**
	 * display the name of the shape, triangle with the area
	 */
	@Override
	public void display() {
		System.out.println("This is a triangle and its area is: " + area);
		
	}

	/**
	 * Creates Triangle object and runs the calculateArea and display functions\
	 * 
	 * @param args
	 * Command Line Arguments
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle(5, 5);
		triangle.calculateArea();
		triangle.display();
	}
}
