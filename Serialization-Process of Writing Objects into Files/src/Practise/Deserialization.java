package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {
	public static void main(String [] args) 
	{
		try(FileInputStream file = new FileInputStream("Books.ser"))
		{
			ObjectInputStream objread = new ObjectInputStream(file);
			Book b1 = (Book)objread.readObject();
			Book b2 = (Book)objread.readObject();
			Book b3 = (Book)objread.readObject();
			
			ArrayList<Book> list = new ArrayList<>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			
			objread.close();	
			
			System.out.println(b1 + "\n" + b2 + "\n" + b3);
			
		}catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
