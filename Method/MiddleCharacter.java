//Write a Java method to display the middle character of a string.


import java.util.*;

public class MiddleCharacter
{
	public static void Middle(String st)
	{ 
	  
	  int x =0 , y=0 ;
		if (st.length()%2 == 0)
		{
			x = st.length()/2;
			y = st.length()/2 + 1;
			System.out.print("The middle character in the string: " + st.charAt(x) + " " + st.charAt(y) );
			
		}
		
	   else if ( st.length()%2 != 0)
		{		   
		   x =st.length()/2;
		   
		   System.out.print("The middle character in the string: " + st.charAt(x));
		}
		
	}
	
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Input a string : ");
		String st = scan.nextLine();
		Middle(st);
		
	}
}

