/*Write a Java program to print an array after changing the rows 
and columns of a given two-dimensional array
*/


import java.util.Arrays;

public class Chang
{
	public static void main (String []args )
	{
		int [][]array = { {10,20,30} , {40,50,60} };
		
		for(int i = 0 ; i<array.length ; i++)
		{
			for(int j = 0 ; j<array[0].length ; j++)
			{
				array[j][i] = array[i][j];
			    System.out.print(array[j][i]);
			}
			System.out.println();  // gint exeption
		}
		
	}
}