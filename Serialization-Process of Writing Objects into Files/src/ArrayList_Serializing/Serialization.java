package ArrayList_Serializing;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Serialization {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Animal dog = new Animal("Spike","Dog",3);
		Animal cat = new Animal("Tom","Cat",2);
		Animal mouse = new Animal("Jerry","mouse",1);
		
		animals.add(dog);
		animals.add(cat);
		animals.add(mouse);
		
		try(FileOutputStream file = new FileOutputStream("Animals.file"))
		{
			System.out.println("Serializing..........");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(animals);
			
		}catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
