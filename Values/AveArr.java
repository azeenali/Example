//Write a Java program to calculate the average value of array elements

public class AveArr 
{
	public static void main (String [] args)
	{
		int sum = 0;
		double average ;
		int [] values = {20 , 3 , 6 , 11 , 8 };
		for ( int i = 0 ; i < values.length ; i++)
			sum = sum + values [i];
		average = sum / values.length ; 
		
		System.out.print (" The average of the array : " + average );
		
	}
}