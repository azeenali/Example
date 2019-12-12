//Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class AveOfThreeNumber
{
	
	public static int average(int a , int b , int c)
	{
		return (a+b+c)/3;
	}
	
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Input a first Number : ");
		int num1 = scan.nextInt();
		
		System.out.print(" Input a second Number : ");
		int num2 = scan.nextInt();
		
		System.out.print(" Input a third Number : ");
		int num3 = scan.nextInt();
		
		System.out.print("The average value is : " + average(num1,num2,num3));
		
		
	}
}
