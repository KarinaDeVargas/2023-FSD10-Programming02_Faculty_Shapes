package Prog_II_Test01_part_02.copy;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 
public class Rectangle extends Shape
{
	private double length; //`length` (double): Represents the length of the rectangle. 
	private double width; //`width` (double): Represents the width of the rectangle. 
	   
	//initializing attributes with valid values using constructor - by default constructor
	public Rectangle()
	{
		//System.out.println("Rectangle created by default constructor.");
		this.length = 1;
	    this.width = 1;
	}
	
	//initializing attributes with valid values using constructor - by parameter constructor
	public Rectangle(double length, double width) 
	{
		//System.out.println("Rectangle created by parameter constructor.");
		this.length = length;
	    this.width = width;
	}
	   
	//initializing attributes with valid values using constructor - by copy constructor
	public Rectangle(Rectangle r) 
	{
		//System.out.println("Rectangle created by copy constructor.");
		this.length = r.length;
	    this.width = r.width;					
	}
	
	@Override
	public double calculateArea() // Overrides the `calculateArea()` method to calculate the area of the rectangle as the product of length and width. 
	{
		return length * width;
	}
	   
	@Override
	public void displayInfo() // Overrides the `displayInfo()` method to display the length, width, and area of the rectangle. 
	{
		System.out.println("Please se information for Rectangle");
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}
	
}
