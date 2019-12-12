import java.util.Scanner;

public class doublevar
{
	public static void main ( String [] args )
	{
		Scanner scan = new Scanner ( System.in );
		
		System.out.print (" Input first number : ");
		double d = scan.nextDouble();
		
		System.out.print( " Input second number : ");
		double c = scan.nextDouble();
		
		if ((  d >=0 && d <= 1 ) && ( c >=0 && c <= 1 ))
		System.out.print(true );
		
		else System.out.print( false );
		
	}
}