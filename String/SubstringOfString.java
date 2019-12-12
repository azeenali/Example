//Write a Java program to get a substring of a given string between two specified positions

public class SubstringOfString
{
	public static void main (String [] args)
	{
		String st ="The quick brown fox jumps over the lazy dog.";
		String new_st = st.substring(10,26);
		
		System.out.println("Old = " + st);
		System.out.println("New = " + new_st);
		
		
	}
}



