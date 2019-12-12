

public class BluRay implements ISortable
{
	public String Titel;
	public int Preis;
	public String Publisher;
	public String ASINCode;
	
	/**
	 * this is Constructor for this class
	 */
	public BluRay(String Titel , int Preis , String Publisher , String ASINCode)
	{
		this.Titel = Titel;
		this.Preis = Preis;
		this.Publisher = Publisher;
		this.ASINCode = ASINCode;
	}
	
	/**
	 * this Getter Method has return titel 
	 */
	public String getTitel()
	{
		return this.Titel;
	}
	
	/**
	 * this is Getter Method has return Price
	 */
	public int getPreis()
	{
		return this.Preis;
	}
	
	/**
	 * this is Getter Method hat return Publisher 
	 */
	public String getPublisher()
	{
		return this.Publisher;
	}
	
	/**
	 * this is Getter Method hat return ASIN 
	 */
	public String getASINCode()
	{
		return this.ASINCode;
	}
	
	/**
	 *this Method  return String output with defined format 
	 */
	public String getSortString(SortMode mode)
	{
		String st = "";
		String zero = getZero();
		switch(mode)
		{
			
		    case NAME:
		      st = "${" + getTitel() + "}-${" + getPublisher() + "}";
		      break;
		    case PRICE:
			  
		      st = "${" +zero + getPreis() + "}";
		      break;
		    case ID:
		      st = "${" + getASINCode() + "}";
		}
		return st;
	}

	/**
	 * this Method help to add the 6 firsts position  with zeros 
	 * (just for Price)
	 */
	public String getZero()
	{    
		String p = String.valueOf(this.Preis);
		String st = "";
		for(int i = 1 ; i <= 6-p.length() ; i++)
			st = st + "0";
		return st;
	}
	
	
}