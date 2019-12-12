/** Write a Java program to replace every element
*   with the next greatest element (from right side) in an given array of integers.
 **/


import java.util.Arrays;


public class Replace 
{
	static int [] greatest ( int arr[] )  
	{
		int max = arr[ arr.length-1 ];
		arr[ arr.length-1] = 0 ; 
		
		for ( int i = arr.length -2 ; i >= 0 ; i--)
		{
			int temp = arr[i];
			arr[i] = max ;
			if(max < temp)
			   max = temp;
		}
		return arr; 
	}
	
	
	public static void main (String [] args )
	{
		int [] num = { 5 , 3 , 8 , 1 , 9};
		int [] array;
		
		System.out.println(" The array : " + Arrays.toString (num) );
		array = greatest(num);
		System.out.print( " The new Array : " + Arrays.toString(array) );
	}
}
