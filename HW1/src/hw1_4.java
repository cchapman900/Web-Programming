/*
* BMCC CIS 485 - Web Programming
* Spring 2014
* Chris Chapman
* HW1
*
* hw1_4 Menu Based Application
*
*
*/


public class hw1_4 extends hw1 {

	//Code interpreted from CircleProblem example
    public static void main(String[] args)
    {
    	mainMenu();
    }
    
    public static void mainMenu(){
		int choice=0;
        do{
			choice=getMainMenuSelection();
			switch(choice)
			{
				case 1:  
					rectSubMenu();
					break;
				case 2:  
					squareSubMenu();
					break;
				case 3:  
					System.out.println("Thank you!");
					break;
				default:break;
			}
		}while(choice != 3);
        System.exit(0);
    }

    static int getMainMenuSelection()
    {
		System.out.println("\n\nMAIN MENU\n\t1.Rectangle Problem \n\t2.Square Problem\n\t3.Exit\nChoice(1-3):");
		int choice=scanner.nextInt();
		return choice;
	}
    
    public static void rectSubMenu(){
		int choice=0;
        do{
			choice=getRectSubMenuSelection();
			switch(choice)
			{
				case 1:  
					getRectDimensions();
					displayArea();
					break;
				case 2:  
					getRectDimensions();
					displayPerimeter();
					break;
				case 3:  
					getRectDimensions();
					displayAreaAndPerimeter();
					break;
				case 4:
					mainMenu();
					break;
				default:break;
			}
		}while(choice != 4);
        System.exit(0);
    }

    static int getRectSubMenuSelection()
    {
		System.out.println("\n\nRECTANGLE PROBLEM\n\t1.Rectangle Area \n\t2.Rectangle Perimeter\n\t3.Rectangle Area and Perimeter\n\t4.Main Menu\nChoice(1-4):");
		int choice=scanner.nextInt();
		return choice;
	}

    public static void squareSubMenu(){
		int choice=0;
        do{
			choice=getSquareSubMenuSelection();
			switch(choice)
			{
				case 1:  
					getSquareDimensions();
					displayArea();
					break;
				case 2:  
					getSquareDimensions();
					displayPerimeter();
					break;
				case 3:  
					getSquareDimensions();
					displayAreaAndPerimeter();
					break;
				case 4:
					mainMenu();
					break;
				default:break;
			}
		}while(choice != 4);
        System.exit(0);
    }

    static int getSquareSubMenuSelection()
    {
		System.out.println("\n\nSQUARE PROBLEM\n\t1.Square Area \n\t2.Square Perimeter\n\t3.Square Area and Perimeter\n\t4.Main Menu\nChoice(1-4):");
		int choice=scanner.nextInt();
		return choice;
	}
}
