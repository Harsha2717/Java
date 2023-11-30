package Practise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialization {
	public static void main(String[] args) {
		Book b1 = new Book(1,"The Catcher in the Rye","J.D. Salinger",100);
		Book b2 = new Book(2,"To Kill a Mockingbird","George Orwell",69);
		Book b3 = new Book(3,"The Da Vinci Code","Dan Brown",168);
		
		try(FileOutputStream filein = new FileOutputStream("Books.ser"))
		{
		
			ObjectOutputStream objin = new ObjectOutputStream(filein);
			
			objin.writeObject(b1);
			objin.writeObject(b2);
			objin.writeObject(b3);
			
			objin.close();
		}catch(FileNotFoundException e) 
		{
			e.getMessage();
		}catch(IOException e) 
		{
			e.getMessage();
		}
	}
}
