//Write a Java program to get whole and fractional parts from a double value

import java.util.Scanner;

public class WholeFractional
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double number =  431.34;

		double frac = number %1; 
		double whole = number - frac;
		
		System.out.print("\n Orininal value : " + number);
		System.out.print("\n whole part : " + whole);
		System.out.print("\n fractional part : " + frac);
		
	}
}