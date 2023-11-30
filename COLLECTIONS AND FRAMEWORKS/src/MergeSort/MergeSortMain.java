package MergeSort;
/*
 * Merge sort is the efficient method to Sort thr larger Data Set
 * The Merge Sort uses the Divide and Conquer Algorithm
 * This Recursively calls the Method until the BaseCondition is Satisfied
 * (Base Condition) : until the length of SubArray is Less or equal to 1
 * 
 *	In this we use a helper function which sorts and merges the Subarray 	
 *	In Helper method called merge we provide the leftArray rightArray and array as the parameters
  		* we will create three indices that are used for tracking
  		* i , left , right : i for mainArray , left for LeftArray and right for RightArray
  		* we need to check the Condition whether the element at left is less than right 
  		* then assing the element main Array[i] to leftArray
  		* else mainArray[i] to rightArray[i]
  	* and we create two more conditions which are used only when the Elements at two Subarrays are uneven
  	* and returns every value to the Subarray using them without leaving anything Behind
 */
public class MergeSortMain {
	public static void main(String [] args) 
	{
		int [] nums = {8,5,3,1,7,2,6,4,9};
		MergeSort(nums);
		for(int n : nums) System.out.print(n + " ");
	}

	//Recursively Splits the Array into SubParts until base condition is Satisfied
	private static void MergeSort(int[] nums)
	{
		//Creating  the Base Case
		if(nums.length <= 1) return ;
		
		int length = nums.length;
		int middle = length/2;
		
		//Creating Two SubArrays with size of splitted array
		int [] leftArray = new int[middle];
		int [] rightArray = new int[length - middle];
		
		//Creating Index for Left Array and Right Array
		int i = 0;	//For Left
		int j = 0;	//For Right
		
		for(;i<length;i++) 
		{
			if(i<middle) {
				leftArray[i] = nums[i];
			}else {
				rightArray[j] = nums[i];
				j++;
			}
		}
		
		MergeSort(leftArray);
		MergeSort(rightArray);
		Merge(leftArray,rightArray,nums);
	}
	
	private static void Merge(int [] leftArray,int[]rightArray,int [] nums) 
	{
		//Determining the Sizes of the Arrays
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		//Creating Indexes for the Arrays
		int i=0,left=0,right=0;
		
		/*
		 * i for nums array
		 * left for leftArray
		 * right for rightArray
		 */
		
		while(left<leftSize && right<rightSize) 
		{
			if(leftArray[left] < rightArray[right]) 
			{
				nums[i] = leftArray[left];
				left++;
			}
			else 
			{
				nums[i] = rightArray[right];
				right++;
			}
			i++;
		}
		
		while(left < leftSize) 
		{
			nums[i] = leftArray[left];
			i++;
			left++;
		}
		while(right < rightSize) 
		{
			nums[i] = rightArray[right];
			i++;
			right++;
		}
		
	}
}
