//Write a Java program to find the maximum and minimum value of an array


import java.util.Arrays;


public class MaxMin
{
	public static void main (String [] args)
	{
		int [] array = {14 , 7 , 22 , 13 , 65 , 33};
		Arrays.sort(array);
		
		int max = array[0] ;
        int	min = array[array.length-1];
		
		
		/*for ( int i = 0 ; i < array.length ; i++)
		{
		  if ( array[i] > array [i+1])
		  {
		    max = array[i];
		    min = array[i+1];
		  }   هاي الطريقة عطتني خطا؟ 
		  else 
		  {
			  max = array[i+1];
			  min = array[i];
		  }
		}*/
		
		System.out.println( " The maximum value of array elements : " + max );
		System.out.println( " The minimum value of array elements : " + min );
	}
}