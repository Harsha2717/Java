package ArraySerializing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Serialization {
	public static void main(String[] args) {
		Person[] people = 
			{
				new Person("Harsha", 22),
				new Person("Sirisha", 18),
				new Person("Vaibu ", 21),
				new Person("Sindhu ", 25), 
			};

		try (FileOutputStream file = new FileOutputStream("Person.bin")) {
			ObjectOutputStream objwrite = new ObjectOutputStream(file);

			//Creating an ArrayList and converting the Array.asList an d passing Array Object
			ArrayList<Person> peoples = new ArrayList<Person> (Arrays.asList(people));

			objwrite.writeObject(people);
			objwrite.writeObject(peoples);

			System.out.println("Serializing the Array");
			objwrite.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}

	}

}
