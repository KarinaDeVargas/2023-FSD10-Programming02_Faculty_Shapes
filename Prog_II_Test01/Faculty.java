package Prog_II_Test01;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 

public class Faculty extends Employee
{
	protected double monthlySalary; //Represents the monthly salary of the faculty member. 
		
		//initializing attributes with valid values using constructor - by default constructor
		public Faculty()
		{
			System.out.println("Faculty created by default constructor.");
			monthlySalary = 4000;
		}
			
		//initializing attributes with valid values using constructor - by parameter constructor
		public Faculty(String n, int id, double ms)
		{
			super(n, id);
			System.out.println("Faculty created by parameter constructor.");
			monthlySalary = ms;
		}
		
		//initializing attributes with valid values using constructor - by copy constructor
		public Faculty(Faculty f) 
		{
			System.out.println("Faculty created by copy constructor.");
			setEmployeeID(f.getEmployeeID());
			setEmployeeName(f.getEmployeeName());				
			monthlySalary = f.monthlySalary;						
		}
		  
		public double getMonthlySalary()
		{
			return this.monthlySalary;
		}

		public void setMonthlySalary(double monthlySalary)
		{
			this.monthlySalary = monthlySalary;
		}

		@Override
		public double calculateSalary() //Overrides the `calculateSalary()` method to calculate the annual salary of the faculty member, which is the monthly salary multiplied by 12.
		{       
			return monthlySalary * 12;
		}
				
		@Override
		public String toString()  //Create a `Faculty` object with an ID, name, and a monthly salary of $5000. Calculate and display the annual salary of the faculty member. 
		{
			return "Faculty member ID is " + getEmployeeID() 
					+ ", and faculty member name is " + getEmployeeName() 
					+ ", and faculty member monthly salary is " + monthlySalary + "$";
		}
	
}
