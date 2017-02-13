package accadglidAssignment;

public class Triangle extends Figure
{
	// variables to store values of sides of triangle
	double side1; 
	double side2;
	double side3;
	public Triangle(double side1,double side2,double side3)// constructor to initialize values for side1, side2 and side3
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public void findArea()// implements method findArea of Figure class to find Area of triangle
	{
		double semiper = (side1 + side2 + side3)/2; // calculates semi perimeter of triangle
		double temp = semiper * (semiper - side1) * (semiper - side2) * (semiper-side3); // calculating base for Heron's formula to find Area of Triangle
		dim1 = Math.pow(temp,0.5); // Heron's formula to calculate ara of triangle
		System.out.println("Area of Triangle is-----" + dim1 + " sq. units" ); // prints area of triangle
	}

	public void findPerimeter()// implements method findPerimeter of Figure class to find  perimeter of triangle
	{
		dim1 = side1 + side2 + side3; // calculates perimeter of triangle
		System.out.println("Perimeter of Triangle is-----" + dim1 + " units" ); // prints perimeter of triangle
	}
}
