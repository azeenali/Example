//Write a Java method to count all words in a string.

import java.util.*;

public class WordsInString
{
	
	public static int words(String st)
	{
		 int	sum =0;
		for (int i=0 ; i<st.length() ; i++)
		{
		   if (st.charAt(i) ==' ')
		   sum =sum+1;
		}
		sum= sum+1;
		return sum;
	}
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the string : ");
		String st = scan.nextLine();
	   
		System.out.print("Number of words in the string : " + words(st));
		
	}
}
