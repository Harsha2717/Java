package FileExceptionHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Using_TRY_CATCH_BLOCK 
{
	public static void main(String[] args) 
	{
		File file1 = new File("D:/JAVA UDEMY/input.txt");
		
		try 
		{
			Scanner sc = new Scanner(file1);
			while(sc.hasNext()) 
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch (IOException e) 
		{
			e.getMessage();
		} 
	}
}

