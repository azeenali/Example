import java.lang.Math;

/**
 *
 *
 * this class hat constructors , setter, Getter , getArea Method, getPerimeter Method and toString Method
 *
 */
 
public class Circle extends Shape
{
	private double radius;
	
	/**
	 * this is Constructor for this class 
	 */
	public Circle(double radius , String color , boolean filled)
	{
		super(color,filled);
		this.radius = radius;
	}
	
     /**
	 * this is Getter Method has return.
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	/**
	* this method calculate the area
	*/
	public double getArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	
	/**
	* this method calculate the perimeter
	*/
	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	/**
	* this method has this format 
	* "Circle [ Color : Filled : Radius : Height :  Area :  Perimeter :] "
	*/
	public String toString()
	{
		return "Circle [ Color : " + this.getColor() + " Filled : " + this.isFilled() + " Radius : " + this.getRadius() + " Area : " + this.getArea() + " Perimeter : " + this.getPerimeter() + " ]";
	}
	
}

