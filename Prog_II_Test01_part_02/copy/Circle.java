package Prog_II_Test01_part_02.copy;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 

public class Circle extends Shape 
{
    private double radius; //`radius` (double): Represents the radius of the circle. 
    private static final double PI = 3.14159;
       
    //initializing attributes with valid values using constructor - by default constructor
  	public Circle()
  	{
  		//System.out.println("Circle created by default constructor.");
  		this.radius = 1;
  	}
  	
  	//initializing attributes with valid values using constructor - by parameter constructor
  	public Circle(double radius) 
  	{
  		//System.out.println("Circle created by parameter constructor.");
  		this.radius = radius;
  	}
  	   
  	//initializing attributes with valid values using constructor - by copy constructor
  	public Circle(Circle c) 
  	{
  		//System.out.println("Circle created by copy constructor.");
  		this.radius = c.radius;				
  	}
       
    @Override
    public double calculateArea() // `calculateArea()`: Overrides the `calculateArea()` method to calculate the area of the circle as π * radius^2. 
    {
        return PI * radius * radius;
    }
   
    @Override
    public void displayInfo()  // `displayInfo()`: Overrides the `displayInfo()` method to display the radius and area of the circle.  
    {
        System.out.println("Please se information for Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}
