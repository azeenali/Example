//Write a Java program to compare a given string to the specified character sequence

public class SpecifiedCharacter
{
	public static void main (String [] args)
	{
		String st1 = "example.com";
		String st2 = "Example.com";
		CharSequence ch ="Example.com";
		
	    System.out.println("Comparing "+ st1 + " and "+ ch +" : " + st1.contentEquals(ch));
	    
	    System.out.println("Comparing "+ st2 +" and "+ch + " : " + st2.contentEquals(ch));
		
	}
}


