/*
N by d elements

# Example 1:
# input = [1, 2, 3, 4, 5]
# d = 2
# output = [3, 4, 5, 1, 2]

# Example 2:
# input = [1, 2, 3, 4, 5]
# d = 4
# output = [5, 1, 2, 3, 4]

*/

public class ArrayRotate {

	public static void main(String [] Args) 
	{
		int [] input = {1,2,3,4,5};
		
		int d = 2;	
		int size = input.length;
		int [] Array = new int[size];
		int position = 0;

		
		for(int i= 0; i<size;i++) 
		{
			position = (i + size - d)%size;
			Array[position] = input[i];
		}
		
		System.out.println("position : " + position);
		
		for(int i=0;i<size;i++) 
		{
			System.out.println(Array[i]);
		}
		
	}
}
