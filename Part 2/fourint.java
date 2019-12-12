import java.util.Scanner;

public class fourint
{
	public static void main (String [] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print( " Input first number : ");
		int a = scan.nextInt();
		
		System.out.print( " Input second number : ");
		int b = scan.nextInt();
		
		System.out.print( " Input third number : ");
		int c = scan.nextInt();
		
		System.out.print( " Input fourth number : ");
		int d = scan.nextInt();
		
		if ( (a == b) && (a == c) && (a == d) )
		System.out.println( " Numbers are equal! " );
		else System.out.println( " Numbers are not equal! ");
	}
}