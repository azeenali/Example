//Write a Java program to convert an integer value to absolute value

import java.util.*;
public class IntToAbsolutevalue
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer number: ");
		int number = scan.nextInt();
		System.out.print("The absolute value of number is : " + Math.abs(number));
		
	}
}