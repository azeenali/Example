//Write a Java program to round a float number to specified decimals

import java.math.*;


public class RoundFloatToDecimals
{
	public static void main(String []args)
	{
		
		BigDecimal b = new BigDecimal("342.124758");
		
		
		MathContext m = new MathContext(7);
		BigDecimal d = b.round(m);
		
		
		System.out.println("The value of " + b + "rounding to " + d );
	}	
}
