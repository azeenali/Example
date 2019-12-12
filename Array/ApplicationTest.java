
public class ApplicationTest
{
	public static void main (String [] args)
	{

		Exercise ex = new Exercise();
		
		ex.sortArray();
		System.out.println();
		
		ex.sumArrayValues();
		System.out.println();
		
		ex.print();
		System.out.println();
		
		ex.aversgeArray();
		System.out.println();
		
		int [] arr1 = {232, 12 , 7 , 1 , 5 , 9};
		System.out.println("Is the element in array ? " + ex.specificValueOfArray(arr1 , 5));
		System.out.println("Is the element in array ? " + ex.specificValueOfArray(arr1 , 3));
		System.out.println();
		
		System.out.println("Index position of 1 is : " + ex.findIndext(arr1 , 1));
		System.out.println("Index position of 1 is : " + ex.findIndext(arr1 , 3));
		System.out.println();
		
		ex.removeElement();
		System.out.println();
		
		ex.copyArray();
		System.out.println();
		
		ex.insertElement();
		System.out.println();
		
		ex.maxMin();
		System.out.println();
		
		ex.reverseArray();
		System.out.println();
		
		ex.findDuplicateValues();
		System.out.println();
		
		ex.duplicateValueArray();
		System.out.println();
	}
}

