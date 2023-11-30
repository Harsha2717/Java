
public class MinimumAndMaximum {
	public static void main(String [] args) 
	{
		int[] numbers = { 5, 2, 9, 1, 5, 6 }; 
	
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i=0;i<numbers.length;i++) 
		{  
			int num = numbers[i];
			if(num < min ) 
			{
				min = num;
			}
			if(num>max) 
			{
				max = num;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}
	
}
