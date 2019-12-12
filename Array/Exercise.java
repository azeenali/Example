import java.util.Arrays;


public class Exercise
{
	int [] arr1 = {23 , 11 , 2 , 1 , 5 , 9};
	String [] arr2 = {"How" , "Why" , "What" , "No" , "yes"};
	
	//Write a Java program to sort a numeric array and a string array
	public void sortArray()
	{	
		System.out.println("Original numeric array : " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Sorted numeric array : " + Arrays.toString(arr1));
		
		System.out.println("Original string array : " + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Original string array : "+ Arrays.toString(arr2));
	}
	
	//Write a Java program to sum values of an array.
	public void sumArrayValues()
	{
		int sum = 0;
		for(int i=0 ; i<arr1.length ; i++)
		    sum += arr1[i];
		System.out.println("the values of array is : " + sum);	
	}
	
	//Write a Java program to print the following grid
	public void print()
	{
		for(int i=0 ; i<10 ; i++)
		{
			for(int j=0 ; j<10 ; j++)
			{
				System.out.print("-" + " ");
			}
			System.out.println();
		}
	}
	
	//Write a Java program to calculate the average value of array elements
	public void aversgeArray()
	{
		int sum=0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			sum += arr1[i];
		}
		double ave = sum/arr1.length;
		System.out.println("the average of the array  elements is : " + ave);
	}
	
	// Write a Java program to test if an array contains a specific value
	public boolean specificValueOfArray(int []arr1 , int item)
	{
		for(int i : arr1)
		{
			if(item == i)
			   return true;	
		}
		return false;
    }
	
	// Write a Java program to find the index of an array element.
	public int findIndext(int arr1[] , int n)
	{
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			if(arr1[i] == n)
			return i;
		}
		return 0;
	}
	
	//Write a Java program to remove a specific element from an array.
	public void removeElement()
	{
		System.out.println("Original Array : " +Arrays.toString(arr1));
		int removeIndex = 1;
		for(int i = removeIndex ; i<arr1.length-1 ; i++)
			arr1[i] = arr1[i+1];
		
		System.out.println("After removing the second element : " + Arrays.toString(arr1));
	}
	
	//Write a Java program to copy an array by iterating the array.
	public void copyArray()
	{
		int [] newArr = new int[10];
		System.out.println("Source Array : " + Arrays.toString(arr1));
		for(int i=0 ; i<arr1.length ; i++)
		   newArr[i] = arr1[i];
		
		System.out.println("New Array : " + Arrays.toString(newArr));
		
	}
	
	//Write a Java program to insert an element (specific position) into an array.
	public void insertElement()
	{
		int pos = 2;
		int value = 3;
		System.out.println("Original Array : " + Arrays.toString(arr1));
		for(int i=arr1.length-1 ; i>pos ; i--)
			arr1[i] = arr1[i-1];
		arr1[pos] = value;
		
		System.out.println("New Array : " + Arrays.toString(arr1));
	}
	
	//Write a Java program to find the maximum and minimum value of an array
	public void maxMin()
	{
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0 ; i<arr1.length-1 ; i++)
		{
			if(arr1[i]>arr1[i+1])
			{
				max=arr1[i];
			    min=arr1[i+1];
			}
		}
		System.out.println("the maximum element is : " + max );
		System.out.println("the minimum element is : " + min );
	}
	
	//Write a Java program to reverse an array of integer values.
	public void reverseArray()
	{
		int temp = arr1[0];
		System.out.println("the original Array is : " + Arrays.toString(arr1));
		for(int i=0 ; i<arr1.length-1 ; i++)
		{
			temp=arr1[i];
		    arr1[i]=arr1[arr1.length-1-i];
			arr1[arr1.length-1-i]=temp;
		}
		System.out.println("the reverse Array is : " + Arrays.toString(arr1));
	}
	
	//Write a Java program to find the duplicate values of an array of integer values.
	public void findDuplicateValues()
	{
		for(int i=0 ; i<arr1.length-1 ; i++)
		{
			for(int j=i+1 ; j<arr1.length-1 ; j++)
			{
				if(arr1[i] == arr1[j])
				System.out.println("Duplicate Element : " + arr1[j]);
			}
		}
	}
	
	//Write a Java program to find the duplicate values of an array of string values
	public void duplicateValueArray()
	{
		System.out.println("Original Array : " + Arrays.toString(arr2));
		for(int i=0 ; i<arr2.length-1 ; i++)
		{
			for(int j=i+1 ; j<arr2.length-1 ; j++)
			{
				if(arr2[i].equals(arr2[j]))
				System.out.println("Duplicate Element of string array : " + arr2[j]);
			}
		}
	}
	
}


