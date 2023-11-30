package SortingAlgorithms;

public class SelectionSortMain 
{
	public static void main(String [] args) 
	{
		int [] array = {9,1,8,2,7,3,6,5,4};
		SelectionSort(array);
		for(int a : array) 
		{
			System.out.print(a + " ");
		}
	}
	public static void SelectionSort(int [] array) 
	{
		for(int i=0;i<array.length;i++) 
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
	}
}
