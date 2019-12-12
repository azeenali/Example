//Write a Java method to compute the sum of the digits in an integer

import java.util.*;

public class DigitsInInteger
{
	public static int digits( int num)
	{
		int result =0;
		while (num>0)
		{
			result= result + num%10;
			num = num/10;
			
		}
		return result;
	                
		
	}
	
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Input an integer : ");
		int num = scan.nextInt();
		System.out.print("The sum is : " + digits(num));
		
		
	}
}