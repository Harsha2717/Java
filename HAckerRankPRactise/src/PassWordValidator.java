import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Password :");
		String Password = sc.nextLine();
		while(!isValid(Password)) 
		{
			System.out.println("Error Invalid Password\n");
			System.out.println("Enter a Password :");
			Password = sc.nextLine();
		}
		System.out.println("PassWord is valid ");
		sc.close();
	}
	public static boolean isValid(String password) 
	{
		String Validator = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
		Pattern p = Pattern.compile(Validator);
		Matcher m = p.matcher(password);
		if(m.find()) 
		{
			return true;
		}
		return false;
	}
}
