package ArraySerializing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerialization {
	public static void main(String [] args) 
	{
		try(FileInputStream file = new FileInputStream("Person.bin"))
		{
			ObjectInputStream objread = new ObjectInputStream(file);
			
			Person [] persons = (Person[])objread.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person> peoples = (ArrayList<Person>)objread.readObject();
			
			System.out.println("Using Array");
			for(Person person : persons) 
			{
				System.out.println(person);
			}
			
			System.out.println("Using ArrayList");
			for(Person person : peoples) 
			{
				System.out.println(person);
			}
		
			objread.close();
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
