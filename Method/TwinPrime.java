//Write a Java method to find all twin prime numbers less than 100.

public class TwinPrime
{
	
	public static boolean prime (int n)
	{
		for (int i = 2 ; i < n ; i++)
		{
			if (n % i == 0) return false;			
		}
		
		return true;
	}
	
	public static void main (String [] args)
	{
		for(int i = 3 ; i < 100 ; i++)
		{
			if (prime(i))
			{
				int a = i+2;
				System.out.print ( "(" + i + "," + a + ")" );
			}
		
		}
	}
}
