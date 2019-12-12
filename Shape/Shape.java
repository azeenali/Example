/**
 *
 * this class has getArea Method , getPerimeter Method 
 *
 */
public abstract class Shape{

	private String color;
	private Boolean filled;
	
	/**
	 * this is Constructor for this class 
	 */
	public Shape(String color , Boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	/**
	 * this is Getter Method has return.
	 */
	public String getColor()
	{
		if(color == null)
		return null;
		else return color;
	}
	
	/**
	 * this is Getter Method has return.
	 */
	public Boolean isFilled()
	{
		if(filled == null)
		return false;
		else return true;
	}
	
	/*
	*this abstract method calculate the area
	*/
	public abstract double getArea();
	
	/**
	* this method calculate the perimeter
	*/
	public abstract double getPerimeter();
	
}



