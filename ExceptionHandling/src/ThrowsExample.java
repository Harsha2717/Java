
public class ThrowsExample {
	public void Add(int a,int b)throws ArithmeticException,NullPointerException
	{
		if(a == 0 && b == 0) 
		{
			throw new NullPointerException("Values Cannot be Zero");
		}
		else if(a < 0 || b <0 ) 
		{
			throw new ArithmeticException("Value Must be Greater than Zero");
		}else 
		{
			System.out.println("Addition of " +a + " + "+ b + " = " + (a+b)); 
		}
	}
	public static void main(String [] args) 
	{
		ThrowsExample Th = new ThrowsExample();
		CustomExceptionHandling cs = new CustomExceptionHandling();
		
		try 
		{
			cs.sub(10,20);		//here we call the method sub and passed the Parameter and in the method 
		}
		catch(ArithmeticException e) 
		{
			System.err.println(e.getMessage());
		}
							//we check for Exceptions and it is handled in the method
		try 
		{
			Th.Add(100,200);
		}
		catch (ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
