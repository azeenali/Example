//Write a Java program to find whether a region in the current string matches a region in another string


public class StringMatches
{
	public static void main(String[] args)
	{
		String st1 = "Shanghai Houston colorado Alexandria";
		String st2 = "Alexandria Colorado Houston Shanghai";
		
		boolean match1 = st1.regionMatches(0 , st2 , 28 , 8); //?
		boolean match2 = st1.regionMatches(9 , st2 , 9 , 8);
		
		System.out.println("st1[0 - 7] == st2[28 - 35]? " + match1);
		System.out.println("st1[9 - 15] == st2[9 - 15]? " + match2);
		
		
	}
	
}


