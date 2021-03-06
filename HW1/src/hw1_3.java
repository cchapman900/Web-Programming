/*
* BMCC CIS 485 - Web Programming
* Spring 2014
* Chris Chapman
* HW1
*
* hw1_3 Rectangle Main Menu
*
* Continuously calculates the area, perimeter
* or both values of a rectangle until the user exits.
*
*/

public class hw1_3 extends hw1 {
	
	//Code interpreted from CircleProblem example
    public static void main(String[] args)
    {
		int choice=0;
        do{
			choice=MainMenu();
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
					System.out.println("Thank you!");
					break;
				default:break;
			}
		}while(choice != 4);
        System.exit(0);
    }

    static int MainMenu()
    {
		System.out.println("\n\nRECTANGLE MAIN MENU\n\t1.Rectangle Area \n\t2.Rectangle Perimeter\n\t3.Rectangle Area and Perimeter\n\t4.Exit\nChoice(1-4):");
		int choice=scanner.nextInt();
		return choice;
	}

}
