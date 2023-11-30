import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regexmain 
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Enter A Mobile Number : ");
		String number = sc.nextLine();
		while(!mobileNumValidator(number)) 
		{
			System.out.println("Mobile Number : " + number + " is not valid");
			System.out.print("Please Enter a New Number :");
			mobileNumValidator(number);
			number = sc.nextLine();
		}		
		System.out.println("Number : " + number + " is valid");
		sc.close();
	*/
		
	/*
		System.out.println("Enter a Sentence : ");
		String name = sc.nextLine();
		while(!nameValidator(name)) 
		{
			System.out.println("Invalid name Please try Again........");
			System.out.print("Enter a Name : " );
			name = sc.next();
			nameValidator(name);
		}
		System.out.println(name + " is Valid");
		sc.close();
	*/
	     System.out.println("Enter Email-ID: ");
	        String email = sc.nextLine();

	        while (!emailValidator(email)) {
	            System.out.println("Invalid Email ID. Please try again.");
	            System.out.print("Enter an Email ID: ");
	            email = sc.nextLine();
	        }

	        System.out.println(email + " is valid");
	        sc.close();
	    }

	public static boolean mobileNumValidator(String num) 
	{
		String valid = "^[89][0-9]{9}$";
		Pattern p = Pattern.compile(valid);
		Matcher m = p.matcher(num);
		
		if(m.matches()) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean nameValidator(String name) 
	{
		String valid = "[A-Za-z]*[@#&]+[0-9]*$";
		Pattern p = Pattern.compile(valid);
		Matcher m = p.matcher(name);
		if(m.matches()) 
		{
			return true;
		}
		return false;
	}
	public static boolean emailValidator(String email) {
		
		String valid = "[\\w\\d]+@[\\w]+\\.[\\w]{3}";
					//or
		//String valid = "^[\\w\\D]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(valid);
        Matcher m = p.matcher(email);

        return m.matches();
}
}

