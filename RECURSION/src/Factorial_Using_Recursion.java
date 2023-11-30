public class Factorial_Using_Recursion 
{
	public  static int fac_cal(int x) 
	{
		if( x == 1 || x == 0 )
		{
			return x;
		}
		else 
		{
			x = x* (fac_cal(x-1));
			return x;
		}
	}
	public static int ArrayCalculator(int [] arr,int min, int total) 
	{
		int max = arr.length;
		int ar = 0;
		if( min == max ) 
		{
			return total;
		}
		
		ar = arr[min];	
		total = total + ar;
		total = ArrayCalculator(arr,min+1,total);
		
		return total;
	}
	public static int fibonacciSeries(int length) 
	{
		if(length <=1) 
		{
			return length;
		}else 
		{
			return fibonacciSeries(length -1)+fibonacciSeries(length - 2); 
		}
	}
	
	public static void main(String[] args) 
	{
		int x = 5;
		//System.out.println(fac_cal(x));
		for(int i=0;i<x;i++) 
		{
			//System.out.println(fibonacciSeries(i));
		}
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int min = 0;
		int total =0;
		System.out.println("Array calculator : " + ArrayCalculator(array,min,total));
		
		
	}
}
