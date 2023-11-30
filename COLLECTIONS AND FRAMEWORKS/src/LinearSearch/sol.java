package LinearSearch;

public class sol 
{
	public static void main(String [] args) 
	{
		int [] nums = {7, 14, 2, 9, 5, 12, 21, 8};
		int target = 12;
		int index = BinarySearch(nums,target);
		if(index != -1) 
		{
			System.out.println("Target found at Index : " + index);
		}
		else 
		{
			System.out.println("Target Not Found");
		}
	}
	
	public static int linearSearch(int [] nums,int target) 
	{
		for(int i=0;i<nums.length;i++) 
		{
			if(target == nums[i]) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int [] nums,int target) 
	{
		for(int i=0;i<nums.length;i++) 
		{
			int start = 0,end = nums.length-1;
			while(start<=end) 
			{
				int middle = start + (end - start)/2;
				if(target > nums[middle]) 
				{
					start = middle+1;
				}
				else if(target < nums[middle]) 
				{
					end = end -1;
				}
				else 
				{
					return middle;
				}
			}
		}
		return -1;
	}
	
	public static int InterpolationSearch(int [] nums , int target) 
	{
		for(int i=0;i<nums.length;i++) 
		{
			int start = 0,end = nums.length-1;
			while(target>=nums[start] && target<=nums[end]&&start<=end) 
			{
				int middle = start+(end - start)*target-nums[start]/nums[end]-nums[start];
				if(target == nums[middle]) 
				{
					return middle;
				}else if(target > nums[middle]) 
				{
					start = middle+1;
				}else 
				{
					end = middle-1;
				}
			}
		}
		return -1;
	}
}
