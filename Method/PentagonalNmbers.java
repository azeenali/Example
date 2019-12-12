/* Write a Java method to display the first 50 pentagonal numbers. Go to the editor
Note: A pentagonal number is a figurate number that extends the concept of triangular and
 square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are
 not rotationally symmetrical.

*/

public class PentagonalNmbers
{
	
	
	public static void main (String [] args)
	{
		int num =0;
		
		for (int i =1; i<=50; i++)
		{
			num = (i*(3*i-1))/2;
			System.out.print(num + " ");
		}
		
		
	}
}