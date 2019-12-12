// Write a Java program to concatenate a given string to the end of another string

import java.util.Scanner;

public class ConcatenateString
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("String 1 : ");
		String st1 = scan.nextLine();
		
		System.out.print("String 2 : ");
		String st2 = scan.nextLine();
		
		System.out.print("The concatenated string : " + st1 + " " + st2);
		
	}
}

