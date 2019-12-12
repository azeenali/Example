

public class Book implements ISortable
{
	public String Titel;
	public String Author;
	public String Publisher;
	public int Preis;
	public String ISBN;
	
	/**
	 * this is Constructor for this class
	 */
	public Book(String Titel , String Author , String Publisher , int Preis, String ISBN)
	{
		this.Titel = Titel;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Preis = Preis;
		this.ISBN = ISBN;
	}
	
	/**
	 * this Getter Method has return titel
	 */
	public String getTitel()
	{
		return this.Titel;
	}
	
	/**
	 * this is Getter Method hat return Author 
	 */
	public String getAuthor()
	{
		return this.Author;
	}
	
	/**
	 * this is Getter Method hat return Publisher 
	 */
	public String getPublisher()
	{
		return this.Publisher;
	}
	
	/**
	 * this is Getter Method has return Price
	 */
	public int getPreis()
	{
		return this.Preis;
	}
	
	/**
	 * this is Getter Method hat return ASIN 
	 */
	public String getISBN()
	{
		return this.ISBN;
	}
	
	/**
	 *this Method  return String output with defined format 
	 */
	@Override
	public String getSortString(SortMode mode)
	{
		String zero = this.getZero();
		String st = "";
		switch(mode)
		{
			case NAME:
		       st = "${" + getTitel() + "}-${" + getAuthor() + "}-{" + getPublisher() + "}";
		       break;
		    case PRICE:
		       st = "${" + zero + getPreis() + "}";
			   break;
			case ID:
			    st = "${" + getISBN() + "}";
		}
		return st;
	}
	
	/**
	 * this Method help to add the 6 firsts position  with zeros 
	 * (just for Price)
	 */
	public String getZero()
	{
		String st = "";
		String p = String.valueOf(this.Preis);
		for(int i = 1 ; i <= 6-p.length() ; i++)
		st = st + "0";
		
		return st;
	}
	
	
	
} 
