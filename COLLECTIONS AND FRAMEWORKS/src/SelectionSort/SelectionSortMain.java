package SelectionSort;
/*
 * Selection Sort is used to sort the elements by keeping track of Minimum value Index
 * The Time Complexity for SelectionSort is O(n^2)
 * 
 * This works by iteration every element in the Array
  	first we select the 0th index as min and compare it with other elements 
  	if any element is less than the element at 0th index then the index is Replaced with the Element
  	and in the outer loop the Bubble sort takes place
 * 
 */
public class SelectionSortMain {
	public static void main(String [] args) 
	{
		int [] array = {9,1,3,6,7,8,5,4,2};
		for(int i =0;i<array.length;i++) 
		{
			int min = i;
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[min] > array[j]) 
				{
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		for(int a :array) 
		{
			System.out.print(a + " ");
		}
	}
}
