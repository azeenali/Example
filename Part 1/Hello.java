import java.util.Scanner;


public class Hello
{

public static void main (String [] args)
{
	Scanner scan = new Scanner (System.in);
	System.out.print(" Enter your name : ");
	String name ;
	name =  scan.next();
	
	System.out.println ("Hello  " + name );
	
	}
}