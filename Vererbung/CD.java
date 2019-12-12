
public class CD implements ISortable
{
	public String Albumtitel;
	public String Kunstler;
	public String Publisher;
	public int Preis;
	public String ASINCode;
	
	/**
	 * this is Constructor for this class
	 */
	public CD (String Albumtitel , String Kunstler , String Publisher , int Preis , String ASINCode)
	{
		this.Albumtitel = Albumtitel;
		this.Kunstler = Kunstler;
		this.Publisher = Publisher;
		this.Preis = Preis;
		this.ASINCode = ASINCode;
	}
	
	/**
	 * this Getter Method has return Albumtitel 
	 */
	public String getAlbumtitel()
	{
		return this.Albumtitel;
	}
	
	/**
	 * this is Getter Method hat return Kunstler 
	 */
	public String getKunstler()
	{
		return this.Kunstler;
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
	public String getASINCode()
	{
		return this.ASINCode;
	}
	
	/**
	 *this Method  return String output with defined format 
	 */
	
	@Override
	public String getSortString(SortMode mode)
	{
		String st = "";
		String zero = this.getZero();
		switch(mode)
		{
			case NAME:
			  st = "${" + getAlbumtitel() + "}-${" + getKunstler() + "}-${" + getPublisher() + "}"; 
		      break;
			case PRICE:
			  st = "${" + zero + getPreis() + "}";
			  break;
			case ID:
			  st = "${" + getASINCode() + "}";
	          break;
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
		for(int i = 1 ; i <= 6- p.length() ; i++)
		st = st + "0";
		return st;
	}
	
	
	
	
} 


