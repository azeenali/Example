//Write a java program to compare two strings lexicographically.

import java.util.Scanner;

public class Lexicographically
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print("String 1 : ");
		String st1 = scan.nextLine();
		
		System.out.print("String 2 : ");
		String st2 = scan.nextLine();
		
		int result = st1.compareTo(st2);
		
		if (result < 0)
		System.out.print(st1 + "is less than " + st2);
		
		if (result == 0)
		System.out.print(st1 + "is equal to " + st2);
		
		if (result > 0)
		System.out.print(st1 + "is greater than " + st2);
		
	}
}



