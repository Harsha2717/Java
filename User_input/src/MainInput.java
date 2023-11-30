import java.util.*;

public class MainInput {
public static void main(String [] args) 
{
	Scanner scanner  = new Scanner(System.in);
	System.out.print("Enter your name : ");
	String name = scanner.nextLine();
	System.out.print("Enter Your Number : ");
	long Number = scanner.nextLong();
	scanner.nextLine();
	System.out.print("Enter your address : " );
	String add = scanner.nextLine();

	System.out.println("Your Name is :" + name);
	System.out.println("Your Number is : " + Number);
	System.out.println("Your Address is : " + add);
	scanner.close();
}	
}
