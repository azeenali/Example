//Write a Java program to convert a float value to absolute value

import java.util.*;
public class FloatToAbsolutevalue
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an float number: ");
		float number = scan.nextFloat();
		System.out.print("The absolute value of number is : %f " + Math.abs(number));
		
	}
}