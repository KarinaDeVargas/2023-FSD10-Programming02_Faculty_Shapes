package Prog_II_Test01_part_02.copy;
//-------------------------------
//Assignment: Test 1 - July 4th 2023
//Written by: Karina de Vargas Pereira
//JAC ID: 2300594
//------------------------------- 

import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args) 
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5.0, 3.0); //Create a `Rectangle` object with a length of 5.0 and width of 3.0. 
        shapes[1] = new Circle(2.5); //Create a `Circle` object with a radius of 2.5
       
        Scanner kb = new Scanner(System.in);
        System.out.println("Please, enter the shape you want to create (rectangle/circle):"); //Ask user witch shape he wants to make , base of his need take the values and calculate the area. 
        String shapeChoice = kb.nextLine(); 
       
        if (shapeChoice.equalsIgnoreCase("rectangle")) 
        {
            System.out.println("Please, enter the length of the rectangle:");
            double length = kb.nextDouble();
            System.out.println("Please, enter the width of the rectangle:");
            double width = kb.nextDouble();
            shapes[0] = new Rectangle(length, width);
            
        } 
        else if (shapeChoice.equalsIgnoreCase("circle")) 
        {
            System.out.println("Please, enter the radius of the circle:");
            double radius = kb.nextDouble();
            shapes[1] = new Circle(radius);
        }
       
        if (shapeChoice.equalsIgnoreCase("circle")) 
        {
        	Circle.displayInfo(); // running out of time to fix this ..... O_o 
            System.out.println();
        }
        
    
    kb.close();
    
    }
}
