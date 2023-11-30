import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class User implements Serializable
{
	private static final long serialVersionUID = -6206092409676901684L;
	private int iD;
	private String UserName;
	private String Email;
	
	
	User(int iD,String UserName,String Email)
	{
		this.iD = iD;
		this.UserName = UserName;
		this.Email = Email;
	}
	
	int get_iD() 
	{
		return this.iD;
	}

	String get_UserName() 
	{
		return this.UserName;
	}
	
	String get_Email() 
	{
		return this.Email;
	}
	public String toString() 
	{
		return "User Id \t: "+iD+"\nUserName\t: "+UserName+"\nEmail ID \t: "+Email;
	}
	
}

public class Main
{
	public static void main(String [] args) 
	{
		
		User U1 = new User(10,"Harsha_27","ncsriharsha90@gmail.com");
		User U2 = new User(15,"Vaibu@22","krishVaibu@gmail.com");
		
		
		try(FileOutputStream file = new FileOutputStream("Person.bin"))
		{
			ObjectOutputStream Stream = new ObjectOutputStream(file);
			Stream.writeObject(U1);
			Stream.writeObject(U2);
			System.out.println("Serialization is Successfull");
			System.out.println("===================================================");
		}
		catch(IOException e) 
		{
			System.out.println("Unable to Serialize");
		}
		
		try(FileInputStream filein = new FileInputStream("Person.bin"))
		{
			System.out.println("De Serialization is Started");
			System.out.println("===================================================");
			ObjectInputStream in = new ObjectInputStream(filein);

			User u1 = (User)in.readObject();
			User u2 = (User)in.readObject();
			
			System.out.println(u1);
			System.out.println("--------------------------------------------------------");
			System.out.println(u2);
			
			System.out.println("De Serialization is Completed");
			System.out.println("===================================================");
		}
		catch(IOException e) 
		{
			System.out.println("Unable to De-Serialize");
		}catch(ClassNotFoundException e) 
		{
			System.out.println("File not found");
		}
	}
	
}