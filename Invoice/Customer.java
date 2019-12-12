import java.util.List;
import java.util.ArrayList;

/**
 *
 *
 * diese klasse hat konstruktors , setter, Getter , addInvoice Methode, getTotalSpend Methode 
 *
 */
 
public class Customer
{
	
	private String userName ;
	private String lastName;
	private String firstName;
	private List <Invoice> invoices = new ArrayList<Invoice>();
	
	Invoice invoice;

	/**
	 * this is Constructor for this class 
	 */
	public Customer (String userName , String firstName , String lastName)
	{
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	public String getUserName()
	{
		return userName;
	}
	
     /**
	 * this is Getter Method has return.
	 */
	public String getFirstName ()
	{
		return firstName;
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	public String getLastName ()
	{
		return lastName;
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	*this method added the invoices together
	*/
	public void addInvoice(Invoice invoiceToAdd)
	{
	   invoices.add(invoiceToAdd);
	}
	
	public List<Invoice> getInvoices()
	{
		return invoices;
	}
	
	public double getTotalSpend()
	{
		int sum = 0;
		for (Invoice inv : invoices)
		  sum += inv.getFinalAmount();
		  
		  return sum;
	}
	
}

