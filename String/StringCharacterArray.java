// Write a Java program to get the contents of a given string as a character array

public class StringCharacterArray
{
	public static void main (String [] args)
	{
		String st = "This is a sample string";
		char [] arr = new char [] {' ' , ' ' , ' ' , ' ' , ' ' , ' '};
	    st.getChars(3,5,arr,2);
		
		System.out.println("The char array equals : " + arr);

	
	}
}


