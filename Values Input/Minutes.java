import java.util.Scanner ;

public class Minutes 
{
	public static void main ( String [] args )
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print (" Input the number of minutes : ");
		double minutes = scan.nextDouble();
		double years ;
        double	days ;
		years = minutes / ( 60 * 24 * 365 ) ;
        days = ( minutes / 60 / 24 ) % 365 ;		
		System.out.println ( minutes + " minutes is approximately " + years + " years and " +days + " days " );
	}
	
}