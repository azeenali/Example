//Write a Java method to count all vowels in a string.

import java.util.*;

public class VowelsInString
{
	public static int vowels(String st)
	{
		int result=0;
		for(int i=0 ; i<st.length() ; i++)
		{
			if(st.charAt(i) == 'a' || st.charAt(i) == 'e'|| st.charAt(i) ==  'u'|| st.charAt(i) ==  'o'|| st.charAt(i) ==  'i')
			result++;
			
		}
		return result;
	}
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Input the String : ");
		String st = scan.nextLine();
		
		System.out.print("Number of Vowels in the string : " + vowels(st));
		
		
	}
}