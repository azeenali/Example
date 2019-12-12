// Write a Java program to create a new String object with the contents of a character array

public class StringOfCharacterArray
{
	public static void main (String [] args)
	{
		char [] arr = new char[]{'3' , '6' , '5' , '1'};
		String st = String.copyValueOf(arr , 1 , 2);
		System.out.print("The book contains " + st + " pages. ");
		
	}
}



