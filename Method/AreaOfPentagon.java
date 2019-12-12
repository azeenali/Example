//Write a Java method to create the area of a pentagon.

import java.util.*;

public class AreaOfPentagon
{
	public static double area(double d)
	{
		double a = ((d*d) * Math.sqrt (25+10 * Math.sqrt(5) ))/4;
		return a;
	}
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of sides: ");
		int num1 = scan.nextInt();
		
		System.out.print("Input the side: ");
		double num2= scan.nextDouble();
		
		System.out.print("The area of the pentagon is : " + area (num2));
		
		
		
	}
}



