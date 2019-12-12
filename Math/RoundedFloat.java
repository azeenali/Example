/** Write a Java program to accept a float value of number 
*   and return a rounded float value
*/

import java.util.*;

public class RoundedFloat
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Input a float number : ");
		float number = scan.nextFloat();
		float x = (float)Math.floor(number);
		System.out.print("The rounded value is : " + x);
		
	}
}