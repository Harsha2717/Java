
public class ArrayMain 
{
	public static void main(String[] args) 
	{
		int arr = 10;	//Literal 
		System.out.println("Arr : " + arr);

		//Declaration of Array and Initialization	
		int array [] = new int[2];
		array[0] = 1;
		array[1] = 2;
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		//Declaring with initialization
		int array1[]  = {1,3,5,7,9};
		System.out.print("Array1 : ");
		for(int i : array1) 
		{
			System.out.print(i + " ");
		}
	}
}
