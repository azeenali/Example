/**Write a Java program to print all the LEADERS in the array Note: 
* An element is leader if it is greater than all the elements to its right side
*/

import java.util.Arrays;

public class Leader
{
	public static void main (String [] args )
	{
		int [] array = { 50 , 7 , 1 , 43 , 12 ,8 };
		
		
		for (int i = 0 ; i < array.length ; i++ )
		{
			int j;
			for( j = i+1 ; j < array.length ; j++)
			{
			  if ( array[i] <= array[j])
			     break ;
			}
	                                       
			  if ( j ==  array.length) 
                   System.out.println(" The leader is :" + array[i]); 			  
			
			 
		}
		 
	}
}