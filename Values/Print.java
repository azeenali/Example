/**Write a Java program to print the following grid
Expected Output :

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - -
**/
public class Print 
{
	public static void main ( String [] args)
	{
		char c = '-' ;
		for (int i = 1 ; i <= 10 ; i++ )
		{
			for(int j = 1 ; j <= 10; j++)
			System.out.print( c );
			System.out.println();
		}
	}	
}