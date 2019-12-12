// Write a Java method to check whether a string is a valid password

import java.util.Scanner;

public class ValidPassword
{
	
	public static boolean password(String st)
	{
	    
		int num =0;
		int lett =0;
		if (st.length()<8) return false;
		
		for (int i =0 ; i<st.length() ; i++)
		{
			char c = st.charAt(i);
			
			 if ( number(c) ) num++;
			else if (letters(c)) lett++;
			else return false ;	
		}
		if (num >=2)
		return true;
		return true;
	}
	
	
	public static boolean letters(char c)
	{
		return (c>= 'a' && c <= 'z');
	}
	
	public static boolean number(char c)
	{
		return (c>= '0' && c<= '9');
	}
	
	
	public static void main (String [] args )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1. A password must have at least eight characters.");
		System.out.println("2. A password consists of only letters and digits.");
		System.out.println("3. A password must contain at least two digits.");
		System.out.print("Input a password : ");
		String st = scan.nextLine();
		if( password(st)== true)
		   System.out.print("Password is valid: " + st);
		
		else
		System.out.print("Password is not valid: " + st);
	}
}

