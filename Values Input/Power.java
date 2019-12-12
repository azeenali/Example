//Write a Java program that reads a number and display the square, cube, and fourth power

import java.util.Scanner;

public class Power
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		 System.out.print( " Input the number : " );
		 double number = scan.nextDouble();
		 
		 System.out.println( "square : " + number * number );
		 System.out.println( " cube : " + Math.pow(number,3) );
		 System.out.println( " Fourth power : " + Math.pow(number,4) );
	}
	
}