package BubbleSort;
/*
 * Bubble Sort - This is Used to Sort the Element in the Array
 * This compares the Adjacent elements in the Array and Swamp Them
 * The Time Complexity is O(N^2) which is Very Large when used with Large Data Sets
 * 
 * *** 
 */
public class BubbleSortMain 
{
	public static void main(String [] args) 
	{ 
		int [] array = {9,1,6,5,4,8,2,7,3};
		
		BubbleSort(array);
		
		for(int i : array) 
		{
			System.out.print(i + " ");
		}
	}
	
	public static void BubbleSort(int [] array) 
	{
		for(int i=0;i<array.length-1;i++) 
		{
			for(int j=0;j<array.length-i-1;j++) 
			{
				if(array[j] > array[j+1]) 
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;				
				}				
			}
		}
	}
}
