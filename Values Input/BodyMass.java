//Write a Java program to compute body mass index (BMI)


import java.util.Scanner;

public class BodyMass
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		double weight , inches , BMI ;
		
		System.out.print("Input weight in pounds : " );
		weight = scan.nextDouble();
		
		System.out.print(" Input height in inches: " );
		inches = scan.nextDouble();
		
		BMI = weight * 2.2 / ( inches * 0.254 * inches* 0.254 );
		System.out.print(" Body Mass Index is : " + BMI);
	}
}