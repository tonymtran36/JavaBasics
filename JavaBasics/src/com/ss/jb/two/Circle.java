package com.ss.jb.two;

/**
  * Circle class that inherits shape interface to calculate area(rounded to the nearest Integer) and display itself
 * @author Tony
 *
 */
public class Circle implements Shape{

	private Integer radius;
	private Integer area;
	
	public Circle(Integer r) {
		radius = r;
	}
	/**
	 * calculate the area of a circle - PI * R ^ 2
	 */
	@Override
	public void calculateArea() {
		area = (int) (Math.PI * Math.pow(radius, 2));
	}

	/**
	 * display that its a circle and its area
	 */
	@Override
	public void display() {
		System.out.println("This is a circle and its area is: " + area);
		
	}
	
	/**
	 * Creates circle object and runs the calculateArea and display functions
	 * 
	 * @param args
	 * Command Line arguments
	 */
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.calculateArea();
		circle.display();
	}
}
