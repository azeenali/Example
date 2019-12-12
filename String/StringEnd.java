/*Write a Java program to check whether a given string ends
* with the contents of another string
*/


public class StringEnd
{
	public static void main (String [] args)
	{
		String s = "es";
		
		String st1 = "Python Exercises";
		boolean b1 = st1.endsWith(s);
		System.out.println(st1 + " ends with " + s + " ? " + b1);
		
		String st2 = "Python Exercise";
		boolean b2 = st2.endsWith(s);
		System.out.println(st2 + " ends with " + s + " ? " + b2);
		
	}
}

