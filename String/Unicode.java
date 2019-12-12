 //Write a Java program to get the character (Unicode code point) at the given index within the String
 
 import java.util.Scanner;
 
 public class Unicode
 {
	 public static void main (String [] args)
	 {
		 Scanner scan = new Scanner (System.in);
		 System.out.print("Original String : " );
		 String st = scan.nextLine();
		 
		 int i = st.codePointAt(3);
		 int j = st.codePointAt(5);
		 
		 System.out.println("Character(unicode point) = "  + i);
		 System.out.println("Character(unicode point) = " + j);
		 
		 
	 }
 }
 
 