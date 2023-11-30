package MultipleFileExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Handling_Multiple_Exceptions_Using_Try_MultipleCatch 
{
	public static void main(String[] args)  throws FileNotFoundException
	{
		File file = new File("D:/JAVA UDEMY/input.txt");
		try
		{
			if(file.exists()) 
			{
				Scanner sc  = new Scanner(file);
				while(sc.hasNextLine())  
				{
					System.out.println(sc.nextLine());
				}
				sc.close();
			}
			else 
			{
				throw new FileNotFoundException("FileNotFound");
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		/*
		 * catch(FileNotFoundException | IOException e) 
		{
			System.out.println(e.getMessage());
		}
		*/
		/*catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
		*/
		//Another Way
		
		
	}
}
