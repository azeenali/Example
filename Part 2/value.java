

public class value 
{
	public static void main (String [] args )
	{
		int i = ( 101 + 0) / 3 ;
		System.out.println( " The resulr is "  + i );
		
		double a = 3.0e-6 * 10000000.1 ; 
		System.out.println(a);
		
		boolean b = ( true && true );
		System.out.println( " true && true ->" + b );
		
		
		boolean c = (false && true );
		System.out.println( "(false && true ) -> " + c );
		
		boolean d = ( false && false ) || ( true && true) ; 
		System.out.println( " ( false && false ) || ( true && true) -> " + d );
		
		boolean e = ( ( false || false) && ( true && true ) );
		System.out.println( " ( false || false) && ( true && true ) -> " + e );
	}
}