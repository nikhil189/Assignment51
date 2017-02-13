package accadglidAssignment;

public class Circle extends Figure // class to find perimeter and area of circle
{
	double radius; // variable to store radius of circle
	
	public Circle(double radius) //constructor to intialize value of radius
	{
		this.radius = radius;
	}
	
	public void findArea() // implements method findArea of Figure class to find Area of circle
	{
		dim1 = Math.PI * radius * radius; // formula to find out area of circle
		System.out.println("Area of circle is-------" + dim1 + " sq. units"); // prints area of circle
	}

	public void findPerimeter() // implements method findPerimeter of Figure class to find  perimeter of circle
	{
		dim1 = 2 * Math.PI * radius; // formula to find perimeter or circumference of circle
		System.out.println("Perimeter of circle is-------" + dim1 + " units"); // prints Perimeter if circle
	}
}
