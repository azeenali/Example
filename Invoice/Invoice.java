import java.math.*;
import java.util.Random;

/**
 *
 *
 * diese klasse hat konstruktors , setter, Getter , setDiscount Methode, getFinalAmount Methode 
 *
 */
 
public class Invoice
{
	private int id; 
	private double amount;
	public double discount;
	
	private Customer customer;
	
	/**
	 * this is Constructor for this class 
	 */
	public Invoice (Customer customer , double amount)
	{
		this.customer = customer;
		this.amount = amount;
	    Random random = new Random ();
		id = random.nextInt(999);
		
	}
	
	  /**
	 * this is Getter Method has return.
	 */
	public int getId ()
	{
		return id;
	}
	
     /**
	 * this is Getter Method has return.
	 */
	public Customer getCustomer ()
	{
		return customer;
	}
	
	  /**
	 * this is Getter Method has return.
	 */
	public double getAmount ()
	{
		return amount;
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	public double getDiscount()
	{
		return discount;
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	public String getCustomerName()
	{
		return customer.getFullName();
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setDiscount (double discount)
	{
		this.discount = discount; 
	}
	
    /**
	* this method return the final amount 
	*/
	public double getFinalAmount()
	{
		double result = (discount * amount) / 100;
		return getAmount() - result;
	}
	
	
	
}


