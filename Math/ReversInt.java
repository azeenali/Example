//Write a Java program to reverse an integer number

public class ReversInt
{
	public static void main (String [] args)
	{
		int mod;
		int number = 3728;
		while(number !=0)
		{	
			mod = number%10;
			number = number/10;
			System.out.print(mod);	
		}
		
		
	}
}