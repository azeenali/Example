//Write a Java program to check whether a given string starts with the contents of another string

public class CheckString
{
	public static void main(String [] args)
	{
		String st1 = "Red is favorite colore.";
		String st2 = "Orange is also my favorite color.";
		String startst = "Red"; 
		
		boolean start1 = st1.startsWith(startst);
		boolean start2 = st2.startsWith(startst);
		
		System.out.println(st1 + " starts wish " + startst + " ? " + start1);
		System.out.println(st2 + " starts wish " + startst + " ? " + start2);
		
	}
	
}




