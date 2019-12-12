import java.util.Scanner;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApplicationTest
{
	public static void main (String [] args)
    {
     /**
	 *This is main Method ,in this Method there are new objects from classes Customer , Invoice
	 * and print the result.
	 *
	 */
	 
	   StringBuilder sb = new StringBuilder();
	   sb.append(" Hallo Customer ");
	   System.out.println(sb);
	
		
		Customer customer = new Customer("Muaz" , "Azeen" , "Ali");
		Invoice invoice = new Invoice(customer , 100);
		customer.addInvoice(invoice);
		
		
		System.out.println("The User name : " + customer.getUserName());
		System.out.println("The First name: " + customer.getFirstName ());
		System.out.println("The Last name : " + customer.getLastName());
		System.out.println("The Full name : " + customer.getFullName());
		System.out.println("The Total spend : " + customer.getTotalSpend());
		
		double expectedTotalSpend = BigDecimal.valueOf(100).setScale(2 , RoundingMode.HALF_UP).doubleValue();
		double resultTotalSpend = BigDecimal.valueOf(customer.getTotalSpend()).setScale(2 , RoundingMode.HALF_UP).doubleValue();
		String totalSpend = String.format("expected totalSpend is %s , and got the value %s , and the result is %S " , expectedTotalSpend , resultTotalSpend , expectedTotalSpend == resultTotalSpend);
		System.out.println(totalSpend);
		
		System.out.println("The Id : " + invoice.getId ());
		System.out.println("The Customer : " + invoice.getCustomer());
		System.out.println("The Amount : " + invoice.getAmount());
		
		System.out.print("Input the discount : ");
		double discount = 15;
		invoice.setDiscount(discount);
		System.out.println("The Discount : " + invoice.getDiscount());
		System.out.println("The Customer name : " + invoice.getCustomerName());
	
		
		
	    System.out.println("The Final amount : " + invoice.getFinalAmount());
		
	
		double expectedFinalAmount = BigDecimal.valueOf(85).setScale(2 , RoundingMode.HALF_UP).doubleValue();
		double resultFinalAmount = BigDecimal.valueOf(invoice.getFinalAmount()).setScale(2 , RoundingMode.HALF_UP).doubleValue();
		String finalAmount = String.format("Expected finalAmount is %s , and got the value %s , and the result is %s " , expectedFinalAmount , resultFinalAmount , expectedFinalAmount == resultFinalAmount);
		System.out.println(finalAmount);
		
		testAddInvoicesToCustomer(customer);
		
	}
	
	 public static void testAddInvoicesToCustomer(Customer c)
	 {
		Invoice inv1 = new Invoice(c, 30);
		c.addInvoice(inv1);
		int invoicesCount = c.getInvoices().size();
		System.out.println(String.format("The expected size of invoices is %s, we got %s", 2, invoicesCount));
	 }

}


