package ReadingUsingFileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) {

		File file = new File("D:/JAVA UDEMY/READING FROM FILES/src/ReadingUsingFileReader/sample.txt");
		BufferedReader br = null;
		try
		{
			FileReader fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found :" + file.toString());
		}
		catch(IOException e) 
		{
			System.out.println("Unable to Read File : " + file.toString());
		}
		finally 
		{
			try 
			{
				br.close();
				System.out.println("BufferReader Closed Successfully\n");
			}catch(IOException ex) 
			{
				System.out.println("BufferReader Didn't Closed Successfully\n");
			}  
		}
		
		
		//Another Method Using StringBuffer
		BufferedReader buff = null;
		File file1 = new File("D:/JAVA UDEMY/READING FROM FILES/src/ReadingUsingFileReader/sample.txt");
		try 
		{
			String strreader;
			FileReader file1Reader = new FileReader(file1);
			StringBuilder file1Read = new StringBuilder();

			buff = new BufferedReader(file1Reader);			
			
			while((strreader = buff.readLine()) != null) 
			{
				file1Read.append(strreader + " \n");
			}
			System.out.println("\n" + file1Read);
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found");
			
		}
		catch (IOException e) 
		{
			System.out.println("Unable to read the File");
		}
		finally 
		{
			try 
			{
				buff.close();
				System.out.println("BufferReader Did Closed Successfully\n");
			}catch(IOException e) 
			{
				System.out.println("BufferReader Didn't Closed Successfully\n");
			}
		}
	}
}
