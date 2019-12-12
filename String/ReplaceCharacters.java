//Write a Java program to replace all the 'd' characters with 'f' characters


public class ReplaceCharacters
{
	public static void main (String [] args)
	{
		String st = "The quick brown fox jumps over the laty dog.";
		System.out.println("The Original string :" + st);
		
	
		String st2 = st.replace('d' , 'f');	
		System.out.println("New String : " + st2);
	}
	
}



