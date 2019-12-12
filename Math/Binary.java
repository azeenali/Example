/**Write a Java program to find the length of the longest sequence of zeros 
* in binary representation of an integer.
*/

import java.util.Scanner;


public class Binary
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Input a Decimal Number : ");
		int number = scan.nextInt();
		System.out.print(" Binary number is : " );
		String st = " ";
		int bin=0;
		while (number!=0)
		{
			bin = number%2;
			number = number/2;
			st =  bin + st;
			
		}
		
		System.out.print( st+ " ");	
		
	}
}