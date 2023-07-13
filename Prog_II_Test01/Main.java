package Prog_II_Test01;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Faculty faculty01 = new Faculty("Peter Bischoff", 1001, 5000.0);
	    double annualSalary = faculty01.calculateSalary();
	    System.out.println("Faculty Member: " + faculty01.getEmployeeName());
	    System.out.println("Faculty Member ID: " + faculty01.getEmployeeID());
	    System.out.println("Faculty Monthly Salary: $" + faculty01.getMonthlySalary());
	    System.out.println("Faculty Annual Salary: $" + annualSalary);	    
	    
	    System.out.println();
	    Staff staff01 = new Staff("Jane Smith", 1002, 15.0, 160);
	    double monthlySalary = staff01.calculateSalary();
	    System.out.println("Staff Member: " + staff01.getEmployeeName());
	    System.out.println("Staff Member ID: " + staff01.getEmployeeID());
	    System.out.println("Staff Hourly Rate: $" + staff01.getHourlyRate());
	    System.out.println("Staff Hours Worked: " + staff01.getHoursWorked());
	    System.out.println("Staff Monthly Salary: $" + monthlySalary);	
	
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Information displayed using 'toSting()' as showed in class.");
		System.out.println(faculty01);
		System.out.println(staff01);
		}
}
