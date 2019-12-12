//Write a Java method (takes a number n as input) to displays an n-by-n matrix

import java.util.*;

public class NMatrix
{
	static void matrix (int n)
	{
		int min = 1;
		int max = 10;
		for (int i =0 ; i<n ; i++)
		{
			for (int j =0 ; j<n ; j++)
			{
				System.out.print((int)Math.random() * (max-min)+ min + " "); // alle sind 0 why??
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print ("Input a number: ");
		int number = scan.nextInt();
		matrix(number);
	}
}