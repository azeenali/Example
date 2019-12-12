/**
 *
 *
 * this class hat constructors , setter, Getter , getArea Method , getPerimeter Method and toString Method
 *
 */
 
public class Rectangle extends Shape 
{
	private double width;
	private double height;
	
	/**
	 * this is Constructor for this class 
	 */
	public Rectangle(double width , double height , String color , boolean filled)
	{
		super(color,filled);
		this.width = width;
		this.height = height;

	}
	
	 /**
	 * this is Getter Method has return.
	 */
	protected double getHeight()
	{
		return height;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	protected void setHeight(double height)
	{
		this.height = height;
	}
	
	protected void setWidth(double width){
		this.width = width;
	}
	
	 /**
	 * this is Getter Method has return.
	 */
	protected double getWidth()
	{
		return this.width;
	}
	
	/**
	* this method calculate the area
	*/
	@Override
	public double getArea()
	{
		double area =  getWidth() * height;
		return area;
	}
	
	/**
	* this method calculate the perimeter
	*/
	@Override
	public double getPerimeter()
	{
		double perimeter = 2*getWidth() + 2*height;
		return perimeter;
	}
	
	/**
	* this method has this format 
	* "Rectangle [ Color : Filled : Width : Height :  Area : Perimeter : ] "
	*/
	@Override
	public String toString()
	{
		return "Rectangle [ Color : " + this.getColor() + " Filled : " + this.isFilled() + " Width : " + this.getWidth() + " Height : " + this.getHeight() + " Area : " + this.getArea() + " Perimeter : " + this.getPerimeter() + " ]";
	}
	
	
	
}





