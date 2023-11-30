
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Serialization {
	public static void main(String[] args) {
		Student stu1 = new Student("Harsha",22,446,"MREM");
		Student stu2 = new Student("Vaibu",21,445,"MREM");
		Student stu3 = new Student("Sirisha",18,444,"MREM");
		
		try(ObjectOutputStream OSS = new ObjectOutputStream(new FileOutputStream("Students.bin")))
		{
			System.out.println("Serialization .......... Completed");
			OSS.writeObject(stu1);
			OSS.writeObject(stu2);
			OSS.writeObject(stu3);
			Student.set_mobile(1100);
		}catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}catch(IOException e) 
		{
			System.out.println(e.getMessage());			
		}
	}

}
