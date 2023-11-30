//public class Solution 
//{
//	public static void main(String [] args) 
//	{
//		int [] array = {1,2,3,4,5,6,7,8,9};
//		
//		int target = 6;
//		int index = InterpolationSearch(array,target);
//		
//		if(index != -1) 
//		{
//			System.out.println("found");
//		}else
//		System.out.println("not found");
//		
////			quickSort(array,0,array.length-1);
////		for(int a :array) 
////		{
////			System.out.print(a + " ");
////		}
//	}
//	private static int InterpolationSearch(int[] array, int target)
//	{
//		int start =0 ;
//		int end = array.length-1;
//		while(start<=end) 
//		{
//			int middle = start + (end - start)*(target - array[start])/(array[end] - array[start]);
//			if(target > array[middle]) start = middle + 1;
//			else if(target < array[middle]) end = middle - 1;
//			else return middle;
//		}
//		return -1;
//	}
//	private static int binarySearch(int[] array, int target) 
//	{
//		int start = 0;
//		int end = array.length-1;
//		while(start<=end) 
//		{
//			int middle = start + (end - start) / 2;
//			
//			if(target > array[middle])	start = middle + 1;
//			else if(target < array[middle]) end = middle - 1;
//			else return middle;
//		}
//		return -1;
//	}
//	private static int linearSearch(int[] array, int target) 
//	{
//		for(int i=0;i<array.length;i++) 
//		{
//			if(array[i] == target) return i;
//		}
//		return -1;
//	}
//	private static void quickSort(int[] array, int start, int end) 
//	{
//		if(start>=end) 
//		{
//			return;
//		}
//		int pivot  = partition(array,start,end);
//		quickSort(array,start,pivot-1);
//		quickSort(array,pivot+1,end);
//	}
//	public static int partition(int[] array, int start, int end) 
//	{
//		int pivot = array[end];
//		int i = start-1;
//		for(int j=start;j<array.length;j++) 
//		{
//			if(array[j] < pivot) 
//			{
//				i++;
//				int temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//		}
//		i++;
//		int temp = array[i];
//		array[i] = array[end];
//		array[end] = temp;
//		return i;
//	}
//	private static void mergeSort(int[] array) 
//	{
//		if(array.length <= 1) return;
//		int length = array.length;
//		int middle = length /2;
//		int []leftArray = new int[middle];
//		int [] rightArray = new int[length-middle];
//		int i = 0;
//		int j = 0;
//		
//		for(;i<length;i++) 
//		{
//			if(i<middle) 
//			{
//				leftArray[i] = array[i];
//			}else 
//			{
//				rightArray[j] = array[i];
//				j++;
//			}
//		}
//		mergeSort(leftArray);
//		mergeSort(rightArray);
//		merge(leftArray,rightArray,array);
//		
//		;
//	}
//	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
//	
//		int leftSize = leftArray.length;
//		int rightSize = rightArray.length;
//		
//		int left = 0;
//		int right = 0;
//		int i = 0;
//		
//		while(left<leftSize && right < rightSize) 
//		{
//			if(leftArray[left] < rightArray[right]) 
//			{
//				array[i] = leftArray[left];
//				left++;
//			}else 
//			{
//				array[i] = rightArray[right];
//				right++;
//			}
//			i++;
//		}
//		while(left < leftSize) 
//		{
//			array[i] = leftArray[left];
//			i++;
//			left++;
//		}
//		while(right < rightSize) 
//		{
//			array[i] = rightArray[right];
//			i++;
//			right++;
//		}
//	}
//	private static void insertionSort(int[] array) 
//	{
//		for(int i=1;i<array.length;i++) 
//		{
//			int temp = array[i];
//			int j = i-1;
//			while(j>=0 && temp < array[j]) 
//			{
//				array[j+1] = array[j];
//				j--;
//			}
//			array[j+1] = temp;
//		}
//	}
//	private static void selectionSort(int[] array) {
//		for(int i=0;i<array.length;i++) 
//		{
//			int min = i;
//			for(int j=i+1;j<array.length;j++) 
//			{
//				if(array[min] > array[j]) 
//				{
//					min = j;
//				}
//			}
//			int temp = array[i];
//			array[i] = array[min];
//			array[min] = temp;
//		}
//		
//	}
//	public static void bubbleSort(int [] array) 
//	{
//		for(int i=0;i<array.length;i++) 
//		{
//			for(int j=i+1;j<array.length;j++) 
//			{
//				if(array[i] > array[j]) 
//				{
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//	}
//}
