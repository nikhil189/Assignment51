package accadglidAssignment;

import java.util.Scanner;

public class ClsMensuration 
{
	public static void main(String ...k)
	{
		try
		{
			System.out.println("Please enter 1 for circle, 2 for Rectangle and 3 for Triangle");
			Scanner objScanner = new Scanner(System.in);
			int userinput = objScanner.nextInt(); // takes input for circle, Rectangle or Triangle
			switch(userinput)
			{
				case 1:
				{
					System.out.println("Please enter radius of Circle");
					double radius = objScanner.nextDouble(); // takes user input for radius of circle
					Circle objCircle = new Circle(radius); // creating and intializing object for circle class
					objCircle.findArea(); // prints area of circle with given radius
					objCircle.findPerimeter(); // prints Perimeter of circle with given radius
				}
				break;
				case 2:
				{
					System.out.println("Please enter length of Rectangle");
					double length = objScanner.nextDouble(); // takes user input for length of rectangle
					System.out.println("Please enter width if Rectangle");
					double width  = objScanner.nextDouble(); // takes user input for width of rectangle
					Rectangle objRectangle = new Rectangle(length, width); // creating and initializing object of rectangle class
					objRectangle.findArea(); // prints area of rectangle with given dimensions 
					objRectangle.findPerimeter(); // prints perimeter of rectangle with given dimensions
				}
				break;
				case 3 :
				{
					System.out.println("Please enter length of first side");
					double side1 = objScanner.nextDouble(); // takes user input for first side of triangle
					System.out.println("Please enter length of second side");
					double side2 = objScanner.nextDouble(); // takes user input for second  side of triangle
					System.out.println("Please enter length of third side");
					double side3 = objScanner.nextDouble(); // takes user input for third  side of triangle
					Triangle objTriangle = new Triangle(side1, side2, side3); // creating and intializing object of triangle class
					objTriangle.findArea(); // prints area of Triangle with given dimensions 
					objTriangle.findPerimeter(); // prints perimeter of Triangle with given dimensions
					
				}
				break; 
				default :
				{
					System.out.println("Sorry.... You made an invalid input.." );
					
				}
				break;	
			}
			System.out.println("Please enter Y to retry and N to exit");
			String userConfirmation = objScanner.next();
			ClsMensuration objClsMensuration = new ClsMensuration();
			objClsMensuration.exitorContinue(userConfirmation);
			objScanner.close();
		}
		catch(Exception ex)
		{
			System.out.println("Invalid input");
			ClsMensuration objClsMensurration = new ClsMensuration();
			objClsMensurration.exitorContinue("y");
		}
		
		
	}
	
	
	public void exitorContinue(String userInput) // method to again calculate Area and Perimeter on user input or exit
	{
		try
		{
			if(userInput.equalsIgnoreCase("y"))
			{
				main();
			}
			else
			{
				System.exit(0);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}
