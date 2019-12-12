// Write a Java program to compare a given string to the specified string buffer


public class StringBuff
{
	public static void main (String [] args)
	{
		String st1 = "example.com";
		String st2 = "Example.com";
		StringBuffer sf = new StringBuffer("example.com");
		
		System.out.println("comparing" + st1 + " and " + sf + st1.contentEquals(sf) );
		System.out.println("comparing" + st2 + " and " + sf + st2.contentEquals(sf) );
		
		
	}
}
