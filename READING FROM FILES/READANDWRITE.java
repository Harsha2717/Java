import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;


public class READANDWRITE {
	public static void main(String[] args) 
	{
		File file = new File("D:/JAVA UDEMY/RECURSION/src/READANDWRITE");
	
		
		//Writing using BufferedWriter
		try(BufferedWriter buff = new BufferedWriter(new FileWriter(file)))
		{
			buff.write("Hello My name is Sri Harsha\n");
			buff.write("I Live in Hyderabad");
			
		}catch(FileNotFoundException e) 
		{
			System.out.println("Cannot not Find the file " + file + " at the Location");
		}catch(IOException e) 
		{
			System.out.println("Unable to perform Write to the File " + file);
		}
		
		//Reading using Scanner
		
		System.out.println("Reading From a file using Scanner\n");
		try(Scanner sc = new Scanner(new FileReader(file)))
		{
			StringBuffer stringbuff = new StringBuffer();
			while(sc.hasNextLine()) 
			{
				stringbuff.append(sc.nextLine() + "\n");
			}
			System.out.println(stringbuff);
			
		}catch(FileNotFoundException e) 
		{
			
		}
		
		//Reading
		System.out.println("Reading From a file using bufferedReader\n");
		try(BufferedReader buffRead = new BufferedReader(new FileReader(file)))
		{
			String s = null;
			while((s = buffRead.readLine()) != null) 
			{
				System.out.println(s);				
			}
		}catch(FileNotFoundException e) 
		{
			System.out.println("Cannot not Find the file " + file + " at the Location");
		}catch(IOException e) 
		{
			System.out.println("Unable to perform Read to the File " + file);
		}
	}

}
