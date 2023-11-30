package Serialization_and_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Deserialize {
	public static void main(String[] args) throws ClassNotFoundException, IOException, FileNotFoundException {

		try (FileInputStream file = new FileInputStream("People.ser")) {
			ObjectInputStream objread = new ObjectInputStream(file);
			Person Harsha = (Person) objread.readObject();
			Person Vaibu = (Person) objread.readObject();
			objread.close();

			System.out.println(Harsha + "\n" + Vaibu);
		}
	}
}
