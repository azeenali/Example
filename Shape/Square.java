/**
 *
 * this class has constructors , setter, Getter , getArea Method , getPerimeter Method and toString Method
 *
 */
 
public class Square extends Rectangle
{
	public Square(double side)
	{
		super(side , side , null , null);
	}
	
	/**
	 * this is Constructor for this class 
	 */
	public Square(double side , String color , boolean filled)
	{
		super(side , side ,color,filled);		
	}
	
     /**
	 * this is Getter Method has return.
	 */
	public double getSide()
	{
		return super.getWidth();
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setSide(double side)
	{
		this.setWidth(side);
		this.setHeight(side);
	}
	
	private double getHeight(){
		super.getHeight()
	}
	
	/**
	* this method has this format 
	* "Square [ Color : Filled : Side :  Area : Perimeter : ] "
	*/
	public String toString()
	{
		return "Square [ Color : " + getColor() + " Filled : " + this.isFilled() + " Side : " + this.getSide() + " Area : " + this.getArea() + " Perimeter : " + this.getPerimeter() + " ]" ;
	}
		
	
}






