package ReadingUsingScanner;
import java.io.*;
import java.util.Scanner;

public class AverageWordFinder {
	public static void main(String [] args) throws IOException
	{
		String text_file = "D:\\JAVA UDEMY\\input.txt";
		File file = new File(text_file);
		String words = null;
		int wordCount = 0;
		int charcount = 0;
		

		Scanner sc = new Scanner(file);
				
				while(sc.hasNextLine()) 
				{
					words = sc.next();	//input the string until a white space
					System.out.println(words);
					wordCount++;
					charcount += words.length();
				}
				double avgLength = (double)charcount/wordCount;	//TypeCasting int to double (Explicitly)
				System.out.println(wordCount);
				System.out.println("The Average length is : " + avgLength);
				
			
			sc.close();
	}
}
