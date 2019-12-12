/*Write a Java program that accepts two integers from the user and 
* then prints the sum, the difference, the product, the average, the distance (the difference between integer), 
* the maximum (the larger of the two integers), 
* the minimum (smaller of the two integers
*/


import java.util.Scanner;

public class Twonum
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a , b , sum , diff , pro , ave , dis , max , min ;
		
		System.out.print( " Input 1st integer : " );
		a = scan.nextInt();
		
		System.out.print( " Input 2nd integer : " );
		b = scan.nextInt();
		
		sum = a + b ;
		System.out.print(" Sum of two integers : " + sum);
		System.out.println();
		
		diff = a-b ;
		System.out.print(" Difference of two integers :" + diff);
        System.out.println();		
		
		pro = a * b;
		System.out.print(" Product of two integers : " + pro);
		System.out.println();
		
		ave = ( a+b ) / 2 ;
		System.out.print(" Average of two integers : " + ave);
		System.out.println();
		
		dis = a-b;
        System.out.print(" Distance of two integers :" + dis);
		System.out.println();

		if ( a > b )
		{
            max = a;
		min = b;}
			else
			{
				max =b;
			    min = a;
			}
		    System.out.print(" Max integer :  " + max );
			System.out.println();
			
			System.out.print(" Min integer : " + min );
			System.out.println();
			
		
	}
}