//Write a Java program that reads a number in inches, converts it to meters

import java.util.Scanner;

public class Inch
{
	public static void main (String [] args)
	{
	Scanner scan = new Scanner (System.in);
	System.out.print (" Input a value for inch : ");
	double inch = scan.nextDouble();
	
	double meter = inch * 0.0254 ;
	
	System.out.print( inch + " inch is " + meter + " meters");
	}
}