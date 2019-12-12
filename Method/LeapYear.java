/*Write a Java method to check whether a year (integer) 
*entered by the user is a leap year or not
*/

import java.util.*;

public class LeapYear
{
	
	
	public static boolean leap(int num)
	{
		
		boolean a ;
		if ((num%4 == 0) || (num % 400 == 0))
		a = true ;
		else a = false ;
		
		return   a;
		
		
	}
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a year : ");
		int num = scan.nextInt();
		System.out.print(leap(num));
		
	}
}

