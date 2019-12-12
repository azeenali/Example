/** Write a Java program to takes the user for a distance (in meters)
* and the time was taken (as three numbers: hours, minutes, seconds),
* and display the speed, in meters per second, kilometers per hour and miles per hour
*/
import java.util.Scanner;

public class Distance
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner (System.in);
		float meters , hour , minutes , seconds , time ;
		System.out.print( " Input distance in meters : " );
		meters = scan.nextFloat();
		
		System.out.print(" Input hour : " );
		hour = scan.nextFloat();
		
		System.out.print(" Input minutes : " );
		minutes =  scan.nextFloat();
		
		System.out.print(" Input seconds : " );
		seconds =  scan.nextFloat();
		
		time = ( hour * 3600 ) + ( minutes * 60 )+ seconds ;
		float speed1 ,speed2 ,speed3 ;
		
		speed1 =  meters / time;
		System.out.print(" Your speed in meters/seconds is : " + speed1);
		
		
		speed2 =( meters / 1000) / ( time / 3600 );
		System.out.print(" Your speed in km/hour is : " + speed2);
		
		speed3 = ((meters * 1000) /( time / 3600 ))/ 1609;
		System.out.print(" Your speed in miles/hour is : " + speed3);
		
	}
}