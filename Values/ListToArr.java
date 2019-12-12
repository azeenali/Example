//Write a Java program to convert an ArrayList to an array


import java.util.List;
import java.util.ArrayList;

public class ListToArr
{
	public static void main ( String [] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(); //not working??
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		
		Object [] array = list.toArray();
		//for (Intger  element : array)
		//System.out.print(element + " ");
		for ( int i = 0 ; i < array.length ; i++ )
			System.out.print(array[i] + " ");
		
	}
}