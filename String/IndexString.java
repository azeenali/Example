//Write a Java program to get the character at the given index within the String.

import java.util.Scanner;

public class IndexString
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print ("Original String : ");
		String st = scan.nextLine();
		
		for(int n =0 ; n < st.length() ; n++)
		{
			if (st.charAt(n) == 'J')
			System.out.println("The character at position   " + n + "  is " +'J' );
			
			if (st.charAt(n) == 'i')
			System.out.print("The character at position   " + n + " is " + 'i' );
			
			
		}
		
		
	}
}