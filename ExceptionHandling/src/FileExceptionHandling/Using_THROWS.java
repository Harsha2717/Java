package FileExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Using_THROWS {
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("D:/JAVA UDEMY/input.text");
		FileReader buff = new FileReader(file);
		
		while(file.exists()) 
		{
			System.out.println(buff);
		}
	}
}

//Here We Throws the Exception of FileNotFoundException 
//in the Main method there is no need to handle them Separately