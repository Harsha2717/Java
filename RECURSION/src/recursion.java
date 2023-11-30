public class recursion {
	public static void numberswithoutforloop(int n) 
	{
		if(n>0) 
		{
			numberswithoutforloop(n-1);	//calling the method from the method 
		}
		System.out.println(n);
	}
	public static void numprint(int size) 
	{
		if(size>0) 
		{
			numprint(size-1);
		}
			System.out.println(size);
		
	}
	public static void main(String[] args) 
	{
		int end = 10;
		numberswithoutforloop(end);
		numprint(15);
		//System.out.println(numprint(15));
	}
}
