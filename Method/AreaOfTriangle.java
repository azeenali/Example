//Write Java methods to calculate the area of a triangle.

import java.util.*;
 
public class AreaOfTriangle
{
	public static double area (double a , double b , double c)
	{
		double s =  (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
	public static void main (String [] args )
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Side-1: ");
		double num1 = scan.nextInt();
		
		System.out.print("Input Side-2: ");
		double num2 = scan.nextInt();
		
		System.out.print("Input Side-3: ");
		double num3 = scan.nextInt();
		
		System.out.print("The area of the triangle is : " + area(num1,num2,num3) );
	}
	
}


