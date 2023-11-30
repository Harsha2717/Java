	import java.util.Scanner;
	
	public class Exceptionmainclass 
	{
		public void div(int a,int b)throws CustomExceptionHandling
		
		//throws is used to provide multiple exceptions in Method and it is called in Method 
		
		{
			if(b == 0)  
			{
				throw new CustomExceptionHandling("Cannot divide by Zero");
			}
			else 
			{
				System.out.println("a + b " + (a+b));
			}
		}
		
		public static void main(String [] args) 
		{
			
			int x =10;
			int y = 0;
			//We need to create an object for calling method using class name
			Exceptionmainclass ex = new Exceptionmainclass();
			try
			{
				ex.div(x, y);
			}
			catch(CustomExceptionHandling e) 
			{
				e.getMessage();
			}
			
			try 
			{
				if(y>0) 
				{
					int z = x/y;
					System.out.println("X/Y : " + (z));
				}
				else 
				{
					throw new CustomedExceptions("Please Enter proper Number");
				}
			}
			catch(CustomedExceptions e)
			{
				System.err.println(e.getMessage());
			}
	
			Scanner sc = new Scanner(System.in);
			boolean bool = true;
			int age = 0;
			
			do 
			{
				System.out.println("Enter your Age : ");
				age = sc.nextInt();
				
				//double a = (double)age;	//Explicit casting Int to Double
				
				try 
				{
					if(age < 0) 
					{
						bool = false;
						throw new CustomExceptionHandling("Age Cannot be Negative Value");
					}
					else if(age == 0) 
					{
						bool = false;
						throw new NullPointerException("Age Cannot be Zero");
					}
					else
					{	
						bool = true;
						System.out.println("Age : " + age);
					}
				}
				catch(CustomExceptionHandling err)
				{
					System.err.println(err.getMessage());
				}
				
				catch(NullPointerException e) {
					System.err.println(e.getMessage());
				}
			}while(!bool);
			
			sc.close();
	}		
}
	
	
	
class CustomedExceptions extends Exception
{
	private static final long serialVersionUID = 1L;

	public CustomedExceptions(String message) 
	{
		super(message);
	}
}