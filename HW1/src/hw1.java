/*
 * BMCC CIS 485 - Web Programming
 * Spring 2014
 * Chris Chapman
 * HW1
 * 
 * hw1 SuperClass
 * 
 */

import java.util.Scanner;


public class hw1 {
	
	//Scanner to collect user input
	static Scanner scanner = new Scanner(System.in);
	
	//Main Rectangle to perform calculations on
	static Rectangle rectangle = new Rectangle();

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
	}

	//hw1_1 Rectangle Problem default (display both Area and Perimeter)
	public static void rectangleProblem(){

		//calculate both Area and Perimeter by default
		displayAreaAndOrPerimeter("both");
		
	}

	//hw1_1 Rectangle Problem (display Area and/or Perimeter)
	public static void rectangleProblem(String areaOrPerimeter){
		
		//Instantiate Rectangle from user input
		newRectFromConsole(); 

		displayAreaAndOrPerimeter(areaOrPerimeter);
		
	}

	//hw1_2 Square Problem (display both Area and Perimeter)
	public static void squareProblem(){
		
		//calculate both Area and Perimeter by default
		squareProblem("both"); 
		
	}

	//hw1_2 Square Problem (display Area and/or Perimeter)
	public static void squareProblem(String areaOrPerimeter){
		
		//Instantiate Square from user input
		newSquareFromConsole(); 

		displayAreaAndOrPerimeter(areaOrPerimeter);
		
	}
	
	//Utility function to display Area and/or Perimeter
	public static void displayAreaAndOrPerimeter (String areaOrPerimeter){

		//display Area and/or Perimeter
		if(areaOrPerimeter != "perimeter") rectangle.displayArea();
		if(areaOrPerimeter != "area") rectangle.displayPerimeter();
	}
	
	
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
	}
}
