import java.util.Scanner;

public class string_
{	
	public static void main(String [] args) 
	{
		String Name = "Sri Harsha";
		
		System.out.println("Name :"+Name);
		String Capital = Name.toUpperCase();
		String Lower = Name.toLowerCase();
		System.out.println("Capital : "+Capital);
		System.out.println("Lower : "+Lower);
		System.out.println("Length of String : " + Name.length());
		System.out.println("Index of Harsha : "+Name.indexOf("Harsha"));	
		
		//Use Back Slash to Get DOuble Quotes in the Text""
		String Double_Quote = "Hello \"HARSHA\"How are You Doing?";
		System.out.println(Double_Quote);
		
		String single_quote = "Hello \'Harsha\'How are you?";
		System.out.println(single_quote);

		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(d);
		
		sc.close();
	}
	
}
