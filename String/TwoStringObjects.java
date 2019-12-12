//Write a Java program to check whether two String objects contain the same data

public class TwoStringObjects
{
	public static void main (String [] args)
	{
		String st1 = "Stephen Edwin king";
		String st2 ="Walter Winchell";
		String st3 ="Mike Royko";
		
		boolean b1 = st1.equals(st2);
		boolean b2 = st1.equals(st3);
		
		System.out.println(st1 + " equals " + st2 + " ? " + b1);
		System.out.println(st1 + " equals " + st3 + " ? " + b2);
		
	}
}

