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
<<<<<<< HEAD
	
	//get shape dimensions from user input
	public static void getRectDimensions() {
		System.out.println("Please enter length: ");
		rectangle.length = scanner.nextDouble(); //should add a try and catch here to handle invalid inputs
		System.out.println("Please enter width: ");
		rectangle.width = scanner.nextDouble();
=======

	//Create Rectangle from user input
	public static void newRectFromConsole() {
		System.out.println("Please enter length:");
		double length = scanner.nextDouble();
		System.out.println("Please enter width");
		double width = scanner.nextDouble();
		rectangle.setLength(length);
		rectangle.setWidth(width);
	}
	
	//Create Square from user input
	public static void newSquareFromConsole() {
		System.out.println("Please enter side length:");
		double side = scanner.nextDouble();
		rectangle.setLength(side);
		rectangle.setWidth(side);
>>>>>>> 02b729dc2bcebb9edc296529460edbd74df5233f
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
	
<<<<<<< HEAD
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
=======
	
	//hw1_3 Rectangle Main Menu
	public static void rectangleMainMenu(){
		
		String choice;
		
		while (!choice.equals("4")) {
			if (choice.equals("1")){
				rectangleProblem("perimeter");
				System.out.println();
				choice = "0";
			} 
			else if (choice.equals("2")) {
				rectangleProblem("area");
				System.out.println();
				choice = "0";
			}
			else if (choice.equals("3")) {
				rectangleProblem("both");
				System.out.println();
				choice = "0";
			} 
			else {
				System.out.println(\n"RECTANGLE MENU"\n
				\n"1. Calculate Perimeter"
				\n"2. Calculate Area"
				\n"3. Calculate Area and Perimeter"
				\n"4. Exit"
				\n"Choice (1-4):");
				
				input = scanner.nextLine();
				
			}
			
		}
	}
	
	public static void mainMenu(){
		String choice;
		
		switch(choice) {
			
			case 1:
				problemSubMenu("Rectangle");
				break;
			case 2:
				problemSubMenu("Square");
				break;
			case 3:
				return;
				break;
				
		}
			
		}
	}
	
	public static void problemSubMenu(String problemType){
		
		String choice;
		
		switch (choice) {
			
			case 1: 
				runProblem(problemType, "perimeter");
				break;
			case 2: 
				runProblem(problemType, "area");
				break;
			case 3: 
				runProblem(problemType, "both");
				break;
			case 4: 
				mainMenu();
				break;
		}
		
		
	}
	
	public static void runProblem (String shape, String params)
	{
		if (shape.equals("Rectangle"){
			rectangleProblem(params);
		} 
		else if (shape.equals("Square"){
			squareProblem(params);
		}
>>>>>>> 02b729dc2bcebb9edc296529460edbd74df5233f
	}
}
