//Write a Java program to convert an array to ArrayLis

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayToList
{
	public static void main ( String []args)
	{
		String [] array ={ " why " , " yes " , " no " , " was " , " who " };
		ArrayList<String> list = new ArrayList <String>(Arrays.asList(array));
		
		System.out.print(list);
	}
}