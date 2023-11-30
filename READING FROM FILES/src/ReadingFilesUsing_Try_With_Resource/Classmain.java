package ReadingFilesUsing_Try_With_Resource;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Classmain {
	public static void main(String[] args) {
		File file = new File("D:/JAVA UDEMY/READING FROM FILES/src/ReadingFilesUsing_Try_With_Resource/TestFile.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			StringBuffer buff = new StringBuffer();
			String s ;
			
			while((s = br.readLine()) != null)
			{
				s = s.trim();	//Use to Remove White spaces in String
				buff.append(s + "\n");
			}
			System.out.println(buff);
		}catch(FileNotFoundException e) 
		{	
			System.out.println("Unable to open the File : " + file.toString());
			
		}catch(IOException e) 
		{
			System.out.println("Unable to Read the File " + file.toString() );
		}
	}
}
