package com.ss.jb.two;

/**
 * Rectangle class that inherits shape interface to calculate area and display itself
 * 
 * @author Tony
 *
 */
public class Rectangle implements Shape {

	private Integer length; 
	private Integer width;
	private Integer area;
	
	public Rectangle(Integer l, Integer w) {
		length = l;
		width = w;
	}
	/**
	 * calculate the area of a rectangle - Length times Width
	 */
	@Override
	public void calculateArea() {
		area = length * width;
		
	}

	/**
	 * display the area and shape of the rectangle
	 */
	@Override
	public void display() {
		System.out.println("This is a Rectangle and its area is: " + area);
		
	}

	/**
	 * Creates rectangle object and runs the calculateArea and display functions
	 * 
	 * @param args
	 * Command Line arguments
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3, 5);
		rect.calculateArea();
		rect.display();
		 
	}
}
