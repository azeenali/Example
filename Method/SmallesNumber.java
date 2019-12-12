//Write a Java method to find the smallest number among three numbers.


import java.util.Scanner;
public class SmallesNumber
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Input the first number : ");
		int number1 = scan.nextInt();
		
		System.out.print("Input the second number : ");
		int number2 = scan.nextInt();
		
		System.out.print("Input the third number : ");
		int number3 = scan.nextInt();
		
		if (number1 < number2 && number1 < number3)
		System.out.print("The smallest value is : " + number1);
		
		else if (number2 < number1 && number2 < number3)
		System.out.print("The smallest value is : " + number2);
		
		else if (number3 < number1 && number3 < number2)
		System.out.print("The smallest value is : " + number3);
	}
}