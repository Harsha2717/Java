package ChatGPT_Questions;
import java.util.Scanner;
public class FindLeapYear {
	public static void main(String [] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int a = sc.nextInt();
			
			if(LeapYearFinder(a))
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not a leap Year");
			}
		}
		
	}
	static boolean LeapYearFinder(int year) 
	{
		return ((year%4==0) && (year%100 != 0 || year%400 == 0));
	}
}

