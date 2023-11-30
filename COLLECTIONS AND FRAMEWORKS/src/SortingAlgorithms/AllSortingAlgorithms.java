package SortingAlgorithms;

public class AllSortingAlgorithms 
{
	public static void main(String[] args)
	{
		int[] nums = {8,1,4,6,2,3,5,7};
		//BubbleSort(nums);
		//SelectionSort(nums);
		//InsertionSort(nums);
		//MergeSort(nums);
		QuickSort(nums,0,nums.length-1);
		
		for(int num : nums) 
		{
			System.out.print(num+" ");
		}
	}
	public static void BubbleSort(int [] nums) 
	{
		for(int i=0;i<nums.length;i++) 
		{
			for(int j=i+1;j<nums.length;j++) 
			{
				if(nums[i] > nums[j]) 
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void SelectionSort(int [] nums) 
	{
		for(int i=0;i<nums.length-1;i++) 
		{
			int min = i;
			for(int j=i+1;j<nums.length-1;j++) 
			{
				if(nums[min] > nums[j]) 
				{
					min = j;
				}				
			}
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
	}
	
	public static void InsertionSort(int [] nums) 
	{
		for(int i=1;i<nums.length;i++) 
		{
			int temp = nums[i];
			int j = i-1;
			while(j>=0 && temp < nums[j]) 
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
	}
	
	public static void MergeSort(int [] nums) 
	{
		//Base Condition Because we call the Recursive Method
		if(nums.length<=1) return ;
		int middle = nums.length/2;
		
		//Two new SubArrays
		int [] leftArray = new int[middle];
		int [] rightArray = new int[nums.length - middle];
		
		//Indices
		int i = 0,j=0;
		//Using For Loop we will divide the array into two halfs
		for(;i<nums.length;i++) 
		{
			if(i<middle) 
			{
				leftArray[i] = nums[i];
			}else 
			{
				rightArray[j] = nums[i];
				j++;
			}
		}
		MergeSort(leftArray);
		MergeSort(rightArray);
		Merger(leftArray,rightArray,nums);
	}
	public static int Merger(int [] leftArray,int[] rightArray,int [] array) 
	{
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		//Create Three Indices for the Array 
		int i = 0,left = 0,right = 0;
		
		while(left<leftSize && right<rightSize) 
		{
			if(leftArray[left] < rightArray[right]) 
			{
				array[i] = leftArray[left];
				left++;
			}
			else 
			{
				array[i] = rightArray[right];
				right++;
			}
			i++;
		}
		
		while(left < leftSize) 
		{
			array[i] = leftArray[left];
			i++;
			left++;
		}
		while(right < rightSize) 
		{
			array[i] = rightArray[right];
			i++;
			right++;
		}
		
		return i;
	}
	
	public static void QuickSort(int [] nums,int start,int end) 
	{
		if(end<=start) return;//Base condition
		int pivot = partition(nums,start,end);
		QuickSort(nums,start,pivot-1);
		QuickSort(nums,pivot+1,end);
	}
	public static int partition(int [] nums,int start,int end) 
	{
		int pivot = nums[end];
		int i = start - 1;
		for(int j=start;j<nums.length;j++) 
		{
			if(nums[j] < pivot) 
			{
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		i++;
		int temp = nums[i];
		nums[i] = nums[end];
		nums[end] = temp;
		
		return i;
	}
}

