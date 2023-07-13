package Prog_II_Test01;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 

public class Staff extends Employee
{
	 protected double hourlyRate;
	 protected int hoursWorked;

	 	//initializing attributes with valid values using constructor - by default constructor
		public Staff()
		{
			System.out.println("Staff created by default constructor.");
			hourlyRate = 17.50;
			hoursWorked = 33;
		}
				
		//initializing attributes with valid values using constructor - by parameter constructor
		public Staff(String n, int id, double hr, int hw)
		{
			super(n, id);
			System.out.println("Staff created by parameter constructor.");
			hourlyRate = hr;
			hoursWorked = hw;
		}
			
		//initializing attributes with valid values using constructor - by copy constructor
		public Staff(Staff s) 
		{
			System.out.println("Staff created by copy constructor.");
			setEmployeeID(s.getEmployeeID());
			setEmployeeName(s.getEmployeeName());				
			hourlyRate = s.hourlyRate;
			hoursWorked = s.hoursWorked;						
		}

		public double getHourlyRate() 
	    {
			return hourlyRate;
	    }
		public void setHourlyRate(double hourlyRate) 
	    {
	        this.hourlyRate = hourlyRate;
	    }

	    public int getHoursWorked() 
	    {
	        return hoursWorked;
	    }

	    public void setHoursWorked(int hoursWorked) 
	    {
	        this.hoursWorked = hoursWorked;
	    }

	    @Override
	    public double calculateSalary() // Overrides the `calculateSalary()` method to calculate the monthly salary of the staff member, which is the product of the hourly rate and the number of hours worked. 
	    {
	        return hourlyRate * hoursWorked;
	    }

		@Override
		public String toString() {
			return "Staff member ID is " + getEmployeeID() 
			+ ", and Staff member name is " + getEmployeeName() 
			+ ", and Staff member hourly rate is " + hourlyRate + "$"
			+ ", and Staff member hours worked is " + hoursWorked;
		}
	    
}
