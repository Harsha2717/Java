package ChatGPT_Questions;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		String str ="";
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter A String : ");
			str = sc.next();
			System.out.println("String Before " + str);
			StringBuilder build = new StringBuilder();

			for(int i=str.length()-1;i>=0;i--) 
			{
				build.append(str.charAt(i));
			}
			System.out.println("String After " + build);
			
		}
		
	}
}
