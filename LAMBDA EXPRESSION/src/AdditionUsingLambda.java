interface Add
{
	public int add(int a);
}
class Calculator
{
	public void addtwoNumbers(Add a) 
	{
		System.out.println("Addition of Elements : ");
		int ans = a.add(10);
		System.out.println("Total : " + ans);
		
	}
}
public class AdditionUsingLambda {
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		cal.addtwoNumbers((int a) ->  a+10);
	
		cal.addtwoNumbers(new Add() 
		{
			public int add(int a) 
			{
				return 8+a;
			}
		});
			
	}
}
