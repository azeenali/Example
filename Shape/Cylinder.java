import java.lang.Math;

/**
 *
 *
 * this class hat constructors , setter, Getter , getArea Method , getFaceArea Method , volume Method and toString Method
 *
 */
 
public class Cylinder extends Circle
{
	
	private double height;
	
	/**
	 * this is Constructor for this class 
	 */
	public Cylinder(double radius , double height , String color , boolean filled)
	{
		super(radius,color,filled);
		this.height = height;
	}
	
     /**
	 * this is Getter Method has return.
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * this is setter Method has no return.
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	* this method calculate the area
	*/
	@Override
	public double getArea()
	{
		//double laterArea = 2 * Math.PI * getRadius() * height;
		//double totalAreaTwoBases = 2 * Math.PI * getRadius() * getRadius();
		//double area = laterArea + totalAreaTwoBases;
		double area = super.getArea() * getHeight();
		return area;
	}
	
	/**
	* this method calculate the faceArea
	*/
	public double getFaceArea()
	{
		return super.getArea();
	}
	
	/**
	* this method calculate the volume
	*/
	public double valume()
	{
		double valume = Math.PI * getRadius() * getRadius() * height;
		return valume;
	}
	
	/**
	* this method has this format 
	* "Cylinder [ Color : Filled : Radius : Height : Area : Perimeter : ] "
	*/
	@Override
	public String toString()
	{
		return "Cylinder [ Color : " + getColor() + " Filled : " + this.isFilled() + " Radius : " + this.getRadius() + " Height : " + this.getHeight() + " Area : " + this.getArea() + " Perimeter : " + this.getPerimeter() + "]";
	}

	
}




