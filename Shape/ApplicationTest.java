import java.math.BigDecimal;
import java.math.RoundingMode;


public class ApplicationTest
{
	public static void main (String [] args)
	{
     /**
	 * This is main Method ,in this Method there are new objects from classes Square , Circle , Cylinder , Rectangle
	 * and print the result.
	 */
	 
		Square square= new Square(5 , "Red" , true);
		double expectedAreaSq = BigDecimal.valueOf(25.0000).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		double resultedAreaSq = BigDecimal.valueOf(square.getArea()).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		String areaResultSq = String.format("Expected square area is %s , and got the value %s , and the result is %b ", expectedAreaSq , resultedAreaSq , expectedAreaSq == resultedAreaSq );
		System.out.println(areaResultSq);
		double expectedPerimeterSq = BigDecimal.valueOf(20.0000).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		double resultedPerimeterSq = BigDecimal.valueOf(square.getPerimeter()).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		String perimeterResultSq = String.format("Expected square Perimeter is %s , and got the value %s , and the result is %b ", expectedPerimeterSq , resultedPerimeterSq , expectedPerimeterSq == resultedPerimeterSq);
		System.out.println(perimeterResultSq);
		System.out.println("The area of square is : " + square.getArea());
		System.out.println("The perimeter of square is : " + square.getPerimeter());
		System.out.println("toString of square is : " + square.toString());
		System.out.println();
		
		Cylinder cylinder = new Cylinder(3.3 , 2.1 , "Blau" , true);
		double expectedAreaCy = BigDecimal.valueOf(111.9663621).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		double resultedAreaCy = BigDecimal.valueOf(cylinder.getArea()).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		String areaResultCy = String.format("Expected cylinder area is %s , and got the value %s , and the result is %b ", expectedAreaCy , resultedAreaCy , expectedAreaCy == resultedAreaCy );
		System.out.println(areaResultCy);
		double expectedFaceAreaCy = BigDecimal.valueOf(34.211943).setScale(5 , RoundingMode.HALF_UP).doubleValue();
		double resultedFaceAreaCy = BigDecimal.valueOf(cylinder.getFaceArea()).setScale(5 , RoundingMode.HALF_UP).doubleValue();
		String faceAreaResultCy = String.format("Expected cylinder faceArea is %s , and got the value %s , and the result is %b ", expectedFaceAreaCy , resultedFaceAreaCy , expectedFaceAreaCy == resultedFaceAreaCy );
		System.out.println(faceAreaResultCy);
		double expectedValumeCy = BigDecimal.valueOf(71.845082).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		double resultedValumeCy = BigDecimal.valueOf(cylinder.valume()).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		String valumeResultCy = String.format("Expected cylinder valume is %s , and got the value %s , and the result is %b ", expectedValumeCy , resultedValumeCy , expectedValumeCy == resultedValumeCy );
		System.out.println(valumeResultCy);
		System.out.println("The area of cylinder is : " + cylinder.getArea());
		System.out.println("The faceArea of cylinder is : " +cylinder.getFaceArea());
		System.out.println("The valume of cylinder is : " + cylinder.valume());
		System.out.println("toString of cylinder is : " + cylinder.toString());
		System.out.println();
		
		Rectangle rectangle = new Rectangle(4.1 , 1.2 , "Green" , true);
		double expectedAreaRe = BigDecimal.valueOf(4.92).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		double resultedAreaRe = BigDecimal.valueOf(rectangle.getArea()).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		String areaResultRe = String.format("Expected rectangle area is %s , and got the value %s , and the result is %b ", expectedAreaRe , resultedAreaRe , expectedAreaRe == resultedAreaRe );
		System.out.println(areaResultRe);
		double expectedPerimeterRe = BigDecimal.valueOf(10.6).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		double resultedPerimeterRe = BigDecimal.valueOf(rectangle.getPerimeter()).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		String perimeterResultRe = String.format("Expected rectangle Perimeter is %s , and got the value %s , and the result is %b ", expectedPerimeterRe , resultedPerimeterRe , expectedPerimeterRe == resultedPerimeterRe );
		System.out.println(perimeterResultRe);
		System.out.println("The area of rectangle is : " + rectangle.getArea());
		System.out.println("The perimeter of rectangle is : " + rectangle.getPerimeter());
		System.out.println("toString of rectangle is : " + rectangle.toString());
		System.out.println();
		
		Circle circle = new Circle(5.2 , "Red" , true);
		double expectedAreaCi = BigDecimal.valueOf(84.9486653).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		double resultedAreaCi = BigDecimal.valueOf(circle.getArea()).setScale(3 , RoundingMode.HALF_UP).doubleValue();
		String areaResultCi = String.format("Expected circle area is %s , and got the value %s , and the result is %b ", expectedAreaCi , resultedAreaCi , expectedAreaCi == resultedAreaCi );
		System.out.println(areaResultCi);
		double expectedPerimeterCi = BigDecimal.valueOf(32.6725635973).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		double resultedPerimeterCi = BigDecimal.valueOf(circle.getPerimeter()).setScale(4 , RoundingMode.HALF_UP).doubleValue();
		String perimeterResultCi = String.format("Expected circle Perimeter is %s , and got the value %s , and the result is %b ", expectedPerimeterCi , resultedPerimeterCi , expectedPerimeterCi == resultedPerimeterCi );
		System.out.println(perimeterResultCi);
		System.out.println("The area of circle is : " + circle.getArea());
		System.out.println("The perimeter of circle is : " + circle.getPerimeter());
		System.out.println("toString of circle is : " + circle.toString());
		System.out.println();
		
	}
}