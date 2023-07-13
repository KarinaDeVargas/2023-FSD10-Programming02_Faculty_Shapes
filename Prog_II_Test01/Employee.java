package Prog_II_Test01;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 
public class Employee 
{
	
	//Creating the attributes for the object "Employee" 
	protected int employeeID; // Represents the employee's ID number.
	protected String employeeName; // Represents the employee's name.	
	
	//initializing attributes with valid values using constructor - by default constructor
		public Employee()
		{
			System.out.println("Employee created by default constructor.");
			employeeID = 1001;
			employeeName = "John";
		}
		
		//initializing attributes with valid values using constructor - by parameter constructor
		public Employee(String n, int id)
		{
			System.out.println("Employee created by parameter constructor.");
			employeeID = id;
			employeeName = n;
		}
		
		//initializing attributes with valid values using constructor - by copy constructor
		public Employee(Employee e) 
		{
			System.out.println("Employee created by copy constructor.");
			employeeID = e.employeeID;
			employeeName = e.employeeName;			
		}
	  
	
		public String getEmployeeName()
		{
			return this.employeeName;
		}

		public void setEmployeeName(String employeeName)
		{
			this.employeeName = employeeName;
		}
		
		public int getEmployeeID()
		{
			return this.employeeID;
		}
		
		public void setEmployeeID(int employeeID)
		{
			this.employeeID = employeeID;
		}

		public double calculateSalary()  // This method to calculate salary will be used by the subclasses Faculty and Staff 
		{
	       	return 0; // Since Employee class hasn't any salary as an attribute
		}
		
		/*@Override
		public String toString() {
			return "Employee ID is " + employeeID + ", and the employee name is " + employeeName + ".";
		}*/
		
	
}
