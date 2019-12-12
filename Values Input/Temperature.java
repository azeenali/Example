//Write a Java program to convert temperature from Fahrenheit to Celsius degree

import java.util.Scanner;

public class Temperature
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print (" Input a degree in Fahrenheit : ");
		float Fahrenheit ;
		Fahrenheit = scan.nextFloat() ;
		
		float Celisius = ( ( Fahrenheit - 32 ) *5) / 9 ;
		
		System.out.print ( Fahrenheit  + " degree Fahrenheit is equal to  " + Celisius + " in Celisius ");
	}
}