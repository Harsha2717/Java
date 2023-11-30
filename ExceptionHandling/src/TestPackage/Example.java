package TestPackage;
import java.io.FileNotFoundException;

public class Example {
	public static void main(String [] args)	{
		int a = 2;
		try 
		{
			if(a >= 2)
			{
				throw new CustomException("Custom EXCPETION");
			}
			else 
			{
				throw new FileNotFoundException("FIle Exception");	
			}
		}
		catch(FileNotFoundException | CustomException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class CustomException extends Exception
{	private static final long serialVersionUID = 1L;

	public CustomException (String message)
	{
		super(message);
	}
}
