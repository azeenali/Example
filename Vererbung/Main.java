

public class Main
{
	public static void main(String [] args)
	{
		
	/**
	 * 
	 * this is main Method ,in this Method there is new object from class Book
	 * and new object from class Sort
	 * and for loop for  and print the result.
	 */
		Book [] books = new Book [3];
		
		books[0] = new Book("bb" , "Azeen" , "fd" , 3432534 , "fgf");
		books[1] = new Book("bbb" , "Azo" , "ffd" , 4 , "ffff");
		books[2] = new Book("bbbb" , "Azee" , "fffd" , 511 , "dddd");
		
		
		
		Sort sort1 = new Sort ();
		sort1.sort(SortMode.PRICE , books);
		for(int i=0 ; i < books.length ; i++)
			System.out.println(books[i].getSortString(SortMode.PRICE));
		
		CD cd = new CD("www" , "eee" , "ddd" , 5 , "ccc");
		System.out.println(cd.getSortString(SortMode.NAME));
		
		BluRay blue = new BluRay("sss" , 2 , "aaa" , "qqq");
		System.out.println(blue.getSortString(SortMode.ID));
		
		
	}
}

