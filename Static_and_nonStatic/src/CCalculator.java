/*The Static Methods belongs to the Class not to the Objects or Attributes
 * Static method can be directly implemented in main Without any Object 
 * Non-Static Methods belongs to Class Attributes and Methods
 * They Cannot be Initialized with out creating an Object
 * When we declare any method or Variable as Static then it belongs to class not the Object in Class
 */
import java.util.Scanner;

public class CCalculator {
	//Static method
	public static int Static_total;
	public static void addnumstatic(int x,int y) 
	{
		Static_total = x+y;
		System.out.println("Static Addition : " + Static_total);
	}
	public static void subnumstatic(int x,int y) 
	{
		Static_total = x - y;
		System.out.println("Static Substraction : " + Static_total);
	}
	
	//Non Static Method
	public int nonstatictotal;
	
	public void addnumNonStatic(int x,int y) 
	{
		this.nonstatictotal = x+y;
		System.out.println("Non_Static Addition : "+ nonstatictotal);
	}
	
	public void subnumNonstatic(int x,int y) 
	{
		this.nonstatictotal = x - y;
		System.out.println("Non_Static Substraction : "+ nonstatictotal);
	}
	
	
	public static void main(String [] args) 
	{
		//Calling Static Members 
		int x ;
		int y; 
		String name;
		String LastName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		x = scanner.nextInt();
		scanner.nextLine();		
		System.out.println("Enter First name : ");
		name = scanner.nextLine();
		System.out.println("Enter A Number : ");
		y = scanner.nextInt();
		scanner.nextLine();//The Compiler Thinks its the Null Value and Skips the Input from user hence we need to use scanner.nextLine() after every nextInt or nextLine
		System.out.println("Enter Last name : ");
		LastName = scanner.nextLine();
		
		System.out.println("First Name : " + name + "\nLastName : " + LastName);
		CCalculator.addnumstatic(x, y);
		//A Instance of CCalculator is Created in order to USe the Non Static Methods
		CCalculator cal = new CCalculator();
		cal.addnumNonStatic(x, y);
		//cal.addnumstatic(100, 200); 	
		scanner.close();
	}
}
