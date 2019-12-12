//Write a Java program to convert Roman number to an integer number.
import java.lang.*;


public class RomanToInt
{
	public static void main (String [] args)
	{
		int sum =0;
		String str ="MCIIV";
		
		for(int i=0 ; i< str.length() ; i++ )
		{
			char ch = str.charAt(i);
			if (ch == 'I')
				sum = sum + 1;
			
			else if(ch =='V')
			sum = sum +  5;
			
			else if(ch =='X')
			sum = sum + 10;
			
			else if(ch =='L')
			sum = sum + 50;
			
			else if(ch =='C')
			sum = sum + 100;
			
			else if(ch =='D')
			sum = sum + 500;
			
			else if(ch =='M')
			sum = sum + 1000;
		}
		
		System.out.println (" Roman Number : " + str);
		System.out.println(" Equaivalent Integer : "+ sum);
		
		
		
	}
}