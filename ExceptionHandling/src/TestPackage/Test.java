package TestPackage;
import java.io.FileNotFoundException;

public class Test 
{
	public void run() throws CustomException, FileNotFoundException 
	{
		throw new FileNotFoundException("File Not Found");
	}
	

}

