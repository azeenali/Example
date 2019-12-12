//Write a Java program to break an integer into a sequence of individual digits


import java.util.Scanner;

public class Breaks
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println( " Input six non-negative digits : ");
		int number = scan.nextInt();
		
		int a1 , a2 , a3 , a4 , a5 ,a6 ;
		
		a1 = number / 100000 %10 ;
		a2 = number / 10000 % 10 ;
		a3 = number / 1000 % 10 ;
		a4 = number / 100 % 10 ;
		a5 = number / 10 % 10 ;
		a6 = number % 10 ;
		
		System.out.print( a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6  );
	}
}