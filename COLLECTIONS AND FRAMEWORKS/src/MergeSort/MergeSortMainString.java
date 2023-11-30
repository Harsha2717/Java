package MergeSort;

public class MergeSortMainString
{
	public static void main(String [] args) 
	{
	
		String [] array = {"d","a","f","c","b","e"};
		
		MergeSort(array);
		for(String s : array) 
		{
			System.out.print(s + " ");
		}
	}
	
	public static void MergeSort(String [] array) 
	{
		if(array.length <= 1) return;
		int middle = array.length/2;
		String [] leftArray = new String [middle];
		String [] rightArray = new String[array.length - middle];
		
		int i=0;//LeftArray Index
		int j=0;//Right Array Index
		for(;i<array.length;i++) 
		{
			if(i < middle) 
			{
				leftArray[i] = array[i];
			}
			else 
			{
				rightArray[j] = array[i];
				j++;
			}
		}
		
		MergeSort(leftArray);
		MergeSort(rightArray);
		Merge(leftArray,rightArray,array);
	}
	
	public static void Merge(String [] leftArray,String [] rightArray,String [] array) 
	{
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		int i=0, left = 0, right = 0;
		
		while(left < leftSize && right < rightSize) 
		{
			if(leftArray[left].compareTo(rightArray[right]) < 0) 
			{
				array[i] = leftArray[left];
				left++;
				i++;
			}else 
			{
				array[i] = rightArray[right];
				right++;
				i++;
			}
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
	}
}