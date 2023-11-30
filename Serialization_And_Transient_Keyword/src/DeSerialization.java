import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeSerialization {
	public static void main(String [] args) 
	{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Students.bin")))
		{
			Student stu1 = (Student)in.readObject();
			Student stu2 = (Student)in.readObject();
			Student stu3 = (Student)in.readObject();
			
			System.out.println(stu1 + "\n" + stu2 + "\n" + stu3);
		}catch(FileNotFoundException e) 
		{
			
		}catch(IOException e) 
		{
			
		}catch(ClassNotFoundException e) 
		{
			
		}
	}
}
