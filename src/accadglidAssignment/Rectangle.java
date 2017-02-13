package accadglidAssignment;

public class Rectangle extends Figure
{
	double length; // variable to capture user input for length of rectangle
	double width; // variable to capture user input for width of rectangle
	public Rectangle(double length, double width) // constructor to initialize values for length and width 
	{
		this.length = length;
		this.width = width;
	}
	public void findArea() // implements method findArea of Figure class to find Area of rectnagle
	{
		dim1 = length * width; // calculates Area of rectangle and stores it in dim1 property from Figure Class
		System.out.println("Area of rectangle  is-------" + dim1 + " sq. units"); // prints area of rectangle
	}

	public void findPerimeter()// implements method findPerimeter of Figure class to find  perimeter of rectangle
	{
		dim1 = 2 * (length + width); // calculates perimeter of rectangle and stores it in dim1 property from Figure Class
		System.out.println("Perimeter of rectangle  is-------" + dim1 + " units"); // prints perimeter of rectangle
	}
}
