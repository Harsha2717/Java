package QuickSort;
/*
 * The QuickSort Algorithm 
 * Moves the smaller elements to the left of pivot.
 * Moves the Larger elements to the Right of pivot.
 
 * The quickSort Algorithm get the pivot value and moves the Smaller elements to left
 * and larger to right recursively until the base condition
  
  			///To get pivot Value(create An Helper Method)
 
 * The helper method returns an Integer value and has a Pivot which is placed at the end of an Array 
 	* then we use two indices i,j 
 		where i is the Start-1 position
 		where j is the start position
 * now we compare  array[j] < pivot if this condition is satisfied
  	the indices i moves forward one step or the j is moved forward a step
  	if the value is less than the pivot then the we swap the values
  	after the elements are sorted smaller to left and larger to right
 
 * We need to adjust the position of the pivot. 
 *  
 
  
 * Run Time Complexity :
  		*Best :  O(n log(n))
  		*Average : O(n log(n))
  		*Worst 	: O(n^2) (For Sorted Array)								
 
 */
public class QuickSortMain
{
	public static void main(String [] args) 
	{
		int [] array = {8,3,1,4,6,10,5,2,9,7,15,11,14,13,12};
		
		quickSort(array,0,array.length-1);
		
		for(int a : array) 
		{
			System.out.print(a + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) 
	{
		if(end <= start) return; //Base Case
		int pivot = partition(array,start,end);
		quickSort(array,start,pivot-1);
		quickSort(array,pivot+1,end);
	}
	private static int partition(int [] array,int start,int end) 
	{
		int pivot = array[end];
		int i = start-1;
		for(int j=start;j<array.length;j++) 
		{
			if(array[j] < pivot) 
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
	}
}
