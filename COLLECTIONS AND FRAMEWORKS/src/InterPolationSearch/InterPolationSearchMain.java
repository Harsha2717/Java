package InterPolationSearch;

/*
 * Interpolation Search - Is a algorithm is used to search the index of the position for any unsortedArray
 * this is Improved version of BinarySearch
  
  *It Uses the Estimation of positions. to Find the target Position
  *The Estimated Position is Called Probe 
  *Probe can be Calculated by a Formula : 
  		*** start + (end - start)*(target - array[start]) / (array[end] -	array[start])	
  
 * The Interpolation search performs very fast in the Uniform Array(Every Element is Unique)
   and Sorted Array.
  
 * TimeComplexity : 
 *	 	Average Case :  O(log(log n)) 
 * 		Worst case   :  O(n) (Increased Exponentially)(1 2 4 8 16 32 64 128 .....)
 * 
 * The interpolation search cannot be used with Non Uniform Array
  	 because it Provides errors in the Search
 
 * For the Unsorted Array But can be Used for Searching an Unsorted Array
 */
public class InterPolationSearchMain 
{
	public static void main(String [] args) 
	{
		//int [] array = {1,2,4,8,16,32,64,128,256,512,1024}; //worstCase
		int [] array = new int[1000];
		for(int i=0;i<1000;i++) 
		{
				array[i] = i;				
		}
		
		int target = 55;
		System.out.println(InterPolationSearch(array,target));
				/******* or *******/
		int index = InterPolationSearch(array,target);
		if(index != -1) 
		{
			System.out.println("Target Found at Index : " + index);
		}else 
		{
			System.out.println("Target Not Found");
		}
	}
	public static int InterPolationSearch(int [] array,int target) 
	{
		int start = 0;
		int end = array.length-1;
		while(target >= array[start] && target<=array[end] && start <= end) 
		{
			int mid = start+(end - start)*(target - array[start])/(array[end] - array[start]);
			System.out.println("Middle : " + mid);
			int value = array[mid];
			
			if(target == value)	return mid;
			else if(target > value) start = mid + 1;
			else end = mid-1; 
		}
		return -1;
	}
}
