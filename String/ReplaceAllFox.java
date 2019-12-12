//Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement


public class ReplaceAllFox
{
	public static void main (String [] args)
	{
		String st ="The quick brown fox jumps over the lazy dog";
		System.out.println("Original string : " + st);
		
		String new_st = st.replaceAll("fox" , "cat");
		
		System.out.println("New String : " + new_st);
		
	}
}


