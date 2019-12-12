//Write a java program to compare two strings lexicographically, ignoring case differences

import java.util.Scanner;

public class  LexicographicallyIgnoreCase
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("String 1 : ");
		String st1 = scan.nextLine();
		
		System.out.print ("String 2 : ");
		String st2 = scan.nextLine();
		
		int result = st1.compareToIgnoreCase(st2);
		
		if (result == 0)
		System.out.print(st1 +" is equal to " + st2);
		
		
	}
}



