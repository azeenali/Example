/**Write a Java program to accept two integers
* and return true if the either one is 15 or if their sum or difference is
*/

import java.util.*;

public class TwoInt
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Input the second number : ");
		int num2 = scan.nextInt();
		
		if (num1 == 15 || num2 == 15)
		System.out.println("The result is : true ");
		
		else if ( (num1+num2) == 15 || Math.abs(num1-num2) == 15 ) 
		System.out.println("The result is : true ");
		
	}
}