package ReadingUsingScanner;
import java.util.Scanner;
import java.io.*;

public class Mainclass {
	public static void main(String [] args) throws IOException
	{
		String example1 = "C:/Users/Harsha/Desktop/examplefile.txt/";
					//"C:\\Users\\Harsha\\Desktop\\examplefile.txt\"	
					//To read files we need to use double backslash or backslash
		File textfile = new File(example1);
		
		int count=0;
		Scanner sc = new Scanner(textfile);
		while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				count++;
				System.out.println(count + " : " +line);
		
		String name = sc.findInLine("harsha");
		if(name != null) 
		{
			System.out.println(name);
			sc.nextLine();
		}
			}
		sc.close();
	}
}
