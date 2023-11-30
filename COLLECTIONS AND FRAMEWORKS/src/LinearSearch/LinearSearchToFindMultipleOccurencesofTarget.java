package LinearSearch;
import java.util.ArrayList;
public class LinearSearchToFindMultipleOccurencesofTarget {
	public static void main(String [] args) 
	{
			int [] array = {4, 2, 7, 4, 8, 2, 9, 4, 6};
			int target = 4;
			ArrayList<Integer> list = new ArrayList<>();
			list = linearSearch(array,target);
			System.out.println(list);
	}
	public static ArrayList<Integer> linearSearch(int [] array,int target) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<array.length;i++) 
		{
			if(array[i] == target) 
			{
				list.add(i);
			}
		}
		return list;
	}
}
