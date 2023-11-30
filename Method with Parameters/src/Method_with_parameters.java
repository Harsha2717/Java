
public class Method_with_parameters
{
	public static int Add_numbers(int x,int y) 
	{
		int z = x+y;
		return z;
	}
	public static int Sub_num(int x,int y) 
	{
		int z = x-y;
		return z;
	}
	
	public static void main(String [] args) 
	{
		int a =10;
		int b = 20;
		int result = Sub_num(a,b);
	
		System.out.println("Result = " + result);
	}
}