package MultipleFileExceptionHandling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Handling_Multiple_Exceptions_Using_Throws 
{
	public static void method() throws IOException,FileNotFoundException
	{
		//Multiple Throw Declaration
		//throw new IOException();
		throw new FileNotFoundException("MULTIPLE FILE NOT FOUND");
	}
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		File file_name = new File("D:/JAVA UDEMY/input.txt");
		Scanner sc = new Scanner(file_name);
		while(sc.hasNext()) 
		{
			System.out.println(sc.next());
		}
		sc.close();
		
		method();
	}
}
