
public class CustomExceptionHandling extends Exception{
		
	private static final long serialVersionUID = 1L;

	CustomExceptionHandling(){}

	public void sub(int a,int b) throws ArithmeticException,NullPointerException
	{
		if(a<b) 
		{
			throw new ArithmeticException("Output Cannot be Negative");
		}
		else
			System.out.println("The substraction of " + a + " - " + b +" = " +(a-b));
	}
	public CustomExceptionHandling(String message) 
	{
		super(message);
		System.out.println("THIS IS A CUSTOM EXCEPTION HANDLER");
	}
}
