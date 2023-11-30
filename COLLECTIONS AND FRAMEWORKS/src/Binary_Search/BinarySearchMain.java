
/**
 * The Binary Search Performs its search Operation on Sorted Array
 * by starting at the middle Index and Splits the Half of the Array(Changes the Position of Middle value)
 * if target is less than the Middle value Then left half is considered.
 * target is greater than the Middle value Then Right half is Considered.
 * The Time Complexity for BinarySearch is O(log n)
 * The BinarySearch Performance will be Efficient when used with Large data 
 * 
 * The BinarySearch has A default method in the Arrays.binarySearch(can be multiple inputs);
 * 
 */

package Binary_Search;
//import java.util.Arrays;
public class BinarySearchMain
{
	public static void main(String [] args) 
	{
		int [] array = {1,2,3,4,4,5,6,7};
		int target = 5;
		//Default Binary Search Method
		//int index = Arrays.binarySearch(array, 4);
		int index = binarySearch(array, target);
		
		if(index != -1) System.out.println("Target : " +target + " Found at Index : " + index);
		else System.out.println("Target : " + target + " not Found ");
	}
	public static int binarySearch(int [] arr , int target) 
	{
		int start = 0;
		int end = arr.length-1;
		while(start <= end)
			/* This can be Used for Safety Check whether Target is Present in the Array
			 * while(target >= arr[start] && target <= arr[end] && start<=end )
			 * 
			 * */
		{
			int middle = start + (end - start)/2;
			int value = arr[middle];
			if(value > target) start = middle+1;
			else if(value < target) end = middle -1;
			else return middle;
		}
		return -1; 
	}
}
