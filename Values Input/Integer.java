//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer


import java.util.Scanner;


public class Integer 
{
	public static void main (String [] args )
	{
		Scanner scan = new Scanner (System.in);
		 
		int number , result ; 
		int sum = 0 ;
		System.out.print( " Input an integer between 0 and 1000 : ");
		number = scan.nextInt();
		if (number >= 0 && number <= 1000 )
		{
			while ( number != 0)
			{			
			  result = number % 10 ;
			  number = number / 10 ;
			  sum = sum + result ;
			}
		System.out.println (" The sum of all digits in " + number + " is : " + sum );
		}
	}
}