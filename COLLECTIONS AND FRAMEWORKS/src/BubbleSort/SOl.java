package BubbleSort;

public class SOl 
{
	public static void main(String [] args) 
	{
		String [] names = {"h","e","c","g","b","f","d","a","i"};
		for(String s : names) 
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//BubbleSort(names);
		//SelectionSort(names);
		InsertionSort(names);
		for(String s : names) 
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void BubbleSort(String [] names) 
	{
		for(int i=0;i<names.length;i++) 
		{
			for(int j = i+1;j<names.length;j++) 
			{
				if(names[i].compareTo(names[j]) > 0) 
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
	}
	
	public static void SelectionSort(String [] names) 
	{
		for(int i=0;i<names.length;i++) 
		{
			int min = i;
			for(int j = i+1;j<names.length;j++) 
			{
				if(names[min].compareTo(names[j]) > 0) 
				{
					String temp = names[j];
					names[j] = names[i];
					names[i] = temp;	
				}
				
			}
		}
	}
	
	public static void InsertionSort(String [] names) 
	{
		for(int i=1;i<names.length;i++) 
		{
			String temp = names[i];
			int j = i-1;
			while(j>=0 && temp.compareTo(names[j]) < 0) 
			{
				names[j+1] = names[j];
				j--;
			}
			names[j+1] = temp;
		}
	}
}
