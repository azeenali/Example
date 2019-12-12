//Write a Java program to test the equality of two arrays


public class Equality
{
	public static void main (String [] args)
	{
		int [] arr1 = { 3 , 5 , 1 , 6 , 8 };
		int [] arr2 = { 3 , 5 , 1 , 6 , 8 };
		boolean equal = true ;
		if ( arr1.length == arr2.length)
		{
		  for ( int i = 0 ; i < arr1.length ; i++ )
			  if (arr1[i] == arr2[i])
			  equal = true ;
		
			System.out.print(" two arrays are equality " );
		}
		else{
			equal = false ;
		   System.out.print(" two arrays are not  equality " );
		}
		
	
	}
}