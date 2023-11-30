import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) 
	{
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Name : ");
		String name = sc.nextLine();
		
		switch(name)
		{
		case "Harsha":
			System.out.println("Hi Harsha");
			break;
		case "Vaibu":
			System.out.println("Hi Vaibu");
			break;
		case "Siri":
			System.out.println("Hi Siri");
		case "Sindhu":
			System.out.println("Hi Sindhu");	
			break;
		default:
			System.out.println("GOod Bye");
		}
		sc.close();
	}
}
