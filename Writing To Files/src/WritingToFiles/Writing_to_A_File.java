package WritingToFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_to_A_File 
{
	public static void main(String [] args) 
	{
		//Method 1
		File file = new File("D:/JAVA UDEMY/Writing To Files/src/WritingToFiles/test.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
		{
			bw.write("Hello I am SriHarsha");
			bw.newLine();
			bw.write("My mobile number is 9346867305\n");
			bw.write("I live in Hyderabad.");
		}
		catch(IOException e) 
		{
			System.out.println("Unable to Write");
		}
		
		//Method 2
		
		File file1 = new File("test1.txt");
		BufferedWriter buff = null;
		try 
		{
			buff = new BufferedWriter(new FileWriter(file1));
			buff.write("HElloo Guys");
			buff.newLine();
			buff.write("Hello world!");
		}
		catch(IOException e) 
		{
			System.out.println("Unble to Write to File : " + file1.toString());
		}
	}
}
