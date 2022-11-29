package com.java.linecomparison;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class LineComparison 
{
	/*
	 * Declring variable
	 */
	static double lengthOfLineFirst, lengthOfLineSecond, lengthOfLine;
	static int x1, x2, y1, y2, value;
	/*
	 * logic for finding coridinates using scanner object
	 */
	 void  coordinates() 
	 {
		 	/*
			 * Taking user input using Scanner object
			 */
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter x1 co-ordinate : ");
	        int x1 = input.nextInt();
	        System.out.println("Enter x2 co-ordinate : ");
	        int x2 = input.nextInt();
	        System.out.println("Enter y1 co-ordinate : ");
	        int y1 = input.nextInt();
	        System.out.println("Enter y2 co-ordinate : ");
	        int y2 = input.nextInt();

	        lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));        
	 }
	 	void getLength() 
	 	{
			coordinates();
			lengthOfLineFirst = lengthOfLine;
			System.out.println("Enter Values Again for Second Line: ");
			coordinates();
			lengthOfLineSecond = lengthOfLine;
			System.out.println("Length of Line1: " + lengthOfLineFirst);
			System.out.println("Length of Line2: " + lengthOfLineSecond);
		}
		/*
		 * logic for checking conditions using if-else statements
		 */
	 	void compareLines()
		{
			
			if(lengthOfLineFirst == lengthOfLineSecond)
				System.out.println("both lines are Equal.");
			
			else if(lengthOfLineFirst > lengthOfLineSecond)
				System.out.println("Line1 is greater than Line2.");
			
			else
				System.out.println("Line1 is smaller than Line2.");
		}

	 	
}
