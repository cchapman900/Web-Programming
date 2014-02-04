/*
* BMCC CIS 485 - Web Programming
* Spring 2014
* Chris Chapman
* HW1
* 
* hw1 SuperClass
*/

import java.util.Scanner;

public class hw1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static Rectangle rectangle = new Rectangle();
	
	//get shape dimensions from user input
	public static void getRectDimensions() {
		System.out.println("Please enter length: ");
		rectangle.length = scanner.nextDouble(); //should add a try and catch here to handle invalid inputs
		System.out.println("Please enter width: ");
		rectangle.width = scanner.nextDouble();
	}

	public static void getSquareDimensions() {
		System.out.println("Please enter side length: ");
		rectangle.length = scanner.nextDouble();
		rectangle.width = rectangle.length;
	}
	
	//Display methods
	public static void displayArea() {
		System.out.format("Area: %.2f%n",rectangle.getArea());
	}

	public static void displayPerimeter() {
		System.out.format("Perimeter: %.2f%n",rectangle.getPerimeter());
	}
	
	public static void displayAreaAndPerimeter(){
		displayArea();
		displayPerimeter();
	}
	
	//hw1_1 Rectangle Problem
	//Get the dimensions of a Rectangle and display the Area and Perimeter
	public static void rectangleProblem() {
		getRectDimensions();
		displayAreaAndPerimeter();
	}
	
	//hw1_2 Square Problem
	//Get the dimensions of a Square and display the Area and Perimeter
	public static void squareProblem() {
		getSquareDimensions();
		displayAreaAndPerimeter();
	}
}
