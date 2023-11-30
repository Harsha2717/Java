package ReadingUsingScanner;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class checking 
{
	public static void main(String[] args) {
		Scanner sc = null;
		//String file1 = "D:\\JAVA UDEMY\\examplefile.txt";		
		//File textfile = new File(file1);
		
		File textfile = new File("D:/JAVA UDEMY/examplefile.txt");	//Directly also possible
		
		int line_count = 0;
		
		try 
		{
			if(textfile.isFile())
				{
					sc = new Scanner(textfile);
					while(sc.hasNextLine()) 
					{
						String word = sc.nextLine();						
  						System.out.println(word);
						line_count++;
					}
					sc.close();
				}
			else 
				throw new IOException("File is empty");
		}
		
		catch(IOException e) 
		{
			e.getMessage();
		}
		
		System.out.println("Total Lines are : " + line_count);
		
		
		
		
	}
}
