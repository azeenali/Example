//Write a Java program to sum values of an array


import java.util.Arrays ;


public class SumArr
{
	public static void main (String [] args)
	{
		int [] array = { 23 ,4 , 23 , 24 ,45 , 1};
		int sum = 0;
		for(int i =0 ; i < 6 ; i++)
		sum = sum + array[i];
		
		System.out.print( " sum values of an array : " + sum );
	}
}