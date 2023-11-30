 package Serialization_and_Deserialization;

 
 //The Process of converting the Object into a type that can be Stored Easily is called Serialization
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) {
		Person p1 = new Person("Harsha", 22);
		Person p2 = new Person("Vaibu", 21);

		try (FileOutputStream fileOut = new FileOutputStream("People.ser")) {
			ObjectOutputStream objout = new ObjectOutputStream(fileOut);

			objout.writeObject(p1);
			objout.writeObject(p2);

			objout.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to Implement");
			e.printStackTrace();
		}
	}
}
