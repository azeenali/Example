

public class Sort
{
	/**
	* this class has sort method to sort the ISortable inputs
	*
	*/
	public static void sort(SortMode mode , ISortable[] toSort)
	{
	    
		for(int i=0 ; i < toSort.length-2 ; i++)
		{
			for(int j=0 ; j<toSort.length-1 ; j++)
			{
				if (toSort[i].getSortString(mode).compareTo(toSort[j].getSortString(mode))>0)
			    {
				 ISortable is = toSort[i];
				 toSort[i] = toSort[j];
				 toSort[j] = is;
				}
			}
		}
	for(int i=0 ; i < toSort.length ; i++){
		System.out.println(toSort[i].getSortString(mode));
	}
		
	}
}
