//Write a Java program to sort a numeric array and a string array

import java.util.Arrays ;


public class SortArrays
{
	public static void main (String []args)
	{
		int []inarray = {12 , 2 , 4 , 67 , 3} ;
		String [] starray = {" also " , " yes ", " no " , " why ", " what "};
		
		
		Arrays.sort(inarray);
		Arrays.sort(starray);
		
		System.out.println( " Sorted numeric array : "  + Arrays.toString ( inarray) );
		System.out.println( " Sorted string array : " + Arrays.toString ( starray ) );
	}
}