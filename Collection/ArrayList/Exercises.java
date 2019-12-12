import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Exercises
{
	public List arrList()
	{
		List <String> list = new ArrayList <String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		return list;
	}
	
	public void iterateInArrayList()
	{
		List <String> list = new ArrayList <String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(" iterate through all elements in a array list : ");
		for (String element : list)
		System.out.println(element);
	}
	
	public List indertElement()
	{
		List <String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add(0 , "Pink");
		list.add(5 , "Yellow");
		
		return list;
	}
	
	public void retrieveElement()
	{
		List <String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		String element = list.get(0);
		System.out.println("The first element : " + element);
		
		element = list.get(2);
		System.out.println("The third element : " + element);
	}

     public void updateSpecifiArray()
	 {
		List <String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("The list : " + list);
		list.set(3 , "Yellow");
		System.out.println("The update array : " + list);
	 }
	 
	 public void removeThirdElement()
	 {
	    List <String> list = new ArrayList<String>();
	    list.add("Red");
	    list.add("Green");
	    list.add("Orange");
	    list.add("White");	
		list.add("Black");
		System.out.println("The original list : " + list);
		list.remove(2);
		System.out.println("After removing third element from the list : " + list);
		
	 }
	 
	 public void searchElement()
	 {
		 List<String> list = new ArrayList <String>();
		 list.add("Red");
	     list.add("Green");
	     list.add("Orange");
	     list.add("White");	
		 list.add("Black");
		 if(list.contains("Red"))
		   System.out.println("Found the element");
		  else 
		  System.out.println("There is no such element");
		  
	 }
	 
	 public void sortArray()
	 {
		 List<String> list = new ArrayList<String>();
		 list.add("Red");
	     list.add("Green");
	     list.add("Orange");
	     list.add("White");	
		 list.add("Black");
		 System.out.println("List before sort : " + list);
		 Collections.sort(list);
		System.out.println("List after sort : " + list); 
	 }
	 
	public void copyArrayList()
	{
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println("list1 : " + list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		System.out.println("list2 : " + list2);
		
		Collections.copy(list1 , list2);
		System.out.println("copy list1 to list2 : ");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
	}

	public void shuffleElements()
	{
		List<String> list = new ArrayList<String>();
		 list.add("Red");
	     list.add("Green");
	     list.add("Orange");
	     list.add("White");	
		 list.add("Black");
		System.out.println("list before shuffling : " + list);
		Collections.shuffle(list);
		System.out.println("list after shuffling : " + list);
		
	}
	
	public void reverseElement()
	{
		List<String> list = new ArrayList<String>();
		list.add("Red");
	    list.add("Green");
	    list.add("Orange");
	    list.add("White");	
		list.add("Black");
		
		System.out.println("list before reversing : " + list);
		Collections.reverse(list);
		System.out.println("list after reversing : " + list);
		
	}
	/*
	public void compareTwoArrayList()
	{
		List <String> list1 = new ArrayList<String>();
		list1.add("Red");
	    list1.add("Green");
	    list1.add("Orange");
	    list1.add("White");	
		list1.add("Black");
		
		List <String> list2 = new ArrayList<String>();
		list2.add("Red");
	    list2.add("Green");
	    list2.add("Orange");
	    list2.add("White");	
		list2.add("Black");
		
		List <String> list3 = new ArrayList<String>();
	
	    String s ="";
        for(int i =0 ; i<list1.size() ; i++)
		   if(list2.contains(e))
		   {
			   list3.add(s);
			   System.out.println("Yes");
		   }
		   else 
		    System.out.println("No");
	
	     System.out.println("list3 : " + list3);
	}*/
	
	public void swapTwoElement()
	{
		List <String> list = new ArrayList<String>();
		 list.add("Red");
	     list.add("Green");
	     list.add("Orange");
	     list.add("White");	
		 list.add("Black");
		 System.out.println("Array list before swap : " + list);
		 Collections.swap(list , 0 , 2);
		 System.out.println("Array List after swap : " + list);
	}
	
	public void joinTwoArrayList()
	{
		List <String> list1 = new ArrayList<String>();
		list1.add("Red");
	    list1.add("Green");
	    list1.add("Orange");
	    list1.add("White");	
	    list1.add("Black");
		System.out.println("list of Array list1 : " + list1);
		
		List <String> list2 = new ArrayList<String>();
		list2.add("Red");
	    list2.add("Green");
	    list2.add("Pink");	
	    list2.add("Black");
		System.out.println("list of Array list2 : " + list2);
		
		
		ArrayList <String> arrList = new ArrayList<String>();
		
		arrList.addAll(list1);
		arrList.addAll(list2);
		System.out.println("the new array : " + arrList);
	}
	
	public void cloneArrayList()
	{
		ArrayList <String> arrlist = new ArrayList<String>();
		 arrlist.add("Red");
	     arrlist.add("Green");
	     arrlist.add("Orange");
	     arrlist.add("White");	
		 arrlist.add("Black");
		 
		 System.out.println("Array list : " + arrlist);
		 ArrayList<String> newa = (ArrayList <String>)arrlist.clone();
		 
		 System.out.println("cloned array list : " + newa);
	}
	
	public void emptyArrayList()
	{
		ArrayList <String> arrlist = new ArrayList<String>();
		 arrlist.add("Red");
	     arrlist.add("Green");
	     arrlist.add("Orange");
	     arrlist.add("White");	
		 arrlist.add("Black");
		 
		 System.out.println("original array list : " + arrlist);
		 
		 arrlist.removeAll(arrlist);
		 System.out.println("array list after remove all element :" + arrlist);
		 
	}
	
	public void testArrayList()
	{
		ArrayList <String> arrlist = new ArrayList<String>();
		 arrlist.add("Red");
	     arrlist.add("Green");
	     arrlist.add("Orange");
	     arrlist.add("White");	
		 arrlist.add("Black");
		 
		 System.out.println("original array list : " + arrlist);
		 System.out.println("checking the above array list is empty or not : " + arrlist.isEmpty());
		 
	}
	
	public void increaseSizeArrayList()
	{
		ArrayList <String> arrlist = new ArrayList <String>();
		 arrlist.add("Red");
	     arrlist.add("Green");
		 arrlist.add("Black");
		 System.out.println("original array list : " + arrlist);
		 
		 arrlist.ensureCapacity(6);
		 arrlist.add("White");
		 arrlist.add("Pink");
		 arrlist.add("Yellow");
		 System.out.println("New array list : " + arrlist);
	}
	
}



