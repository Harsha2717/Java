package TryWithResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class TryWithResourceExample
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("====================================Method 1====================================");
		File file = new File("D:/JAVA UDEMY/ExceptionHandling/src/TryWithResource/test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String str = null;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
		
		}catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("====================================Method 2====================================");
		//Method 2
		
		BufferedReader br1 = null; 
		try
		{
			br1 = new BufferedReader(new FileReader(file));
			StringBuffer buff = new StringBuffer();
			String str1 = null;
			while((str1 = br1.readLine())!=null) 
			{
				buff.append(str1 + "\n");
			}
			System.out.println(buff);
		}catch(FileNotFoundException e) 
		{
			System.out.println("FIle not found");
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			try 
			{
				br1.close();
			}catch(IOException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}	
}