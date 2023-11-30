 package InsertionSort;
/*
 *	Insertion sort Starts at the index 1
 *	The index 1 value is stored in temp and compared with index -1 position
 *	if the Index 0 is greater than then the index 1 elements are right shifted
 *	
 *	The TimeComplexity is O(n^2)
 *	This cant be Used for Larger Data Sets
 * 
 */

public class InsertionSortMain 
{
	public static void main(String [] args) 
	{
		int [] array = {9,1,8,2,7,3,6,5,4};
		
		InsertionSort(array);
		
		for(int a : array) 
		{
			System.out.print(a + " ");
		}
	}
	
	public static void InsertionSort(int [] array) 
	{
		for(int i=1;i<array.length;i++) 
		{
			int temp = array[i];
			int j = i-1;
			while(j>=0 && array[j] > temp) 
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
}
