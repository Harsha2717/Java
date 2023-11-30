package ArrayList_Serializing;
import java.io.*;
import java.util.ArrayList;

public class DeSerialization 
{
	public static void main(String [] args) 
	{
		try(FileInputStream file = new FileInputStream("Animals.file"))
		{
			ObjectInputStream input = new ObjectInputStream(file);
			@SuppressWarnings("unchecked")
			ArrayList<Animal>animals = (ArrayList<Animal>)input.readObject();
			for(Animal animal : animals) 
			{
				System.out.println(animal);
			} 
			
		}catch(FileNotFoundException e) 
		{
			System.out.println("File not found");
		}catch(IOException e) 
		{
			System.out.println("IO EXception");
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println("Class Not found");
			
		}
	}
}
