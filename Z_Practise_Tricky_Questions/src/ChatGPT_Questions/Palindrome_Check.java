package ChatGPT_Questions;

import java.util.Scanner;

public class Palindrome_Check 
{
	public static boolean isPalindrome(String str) 
	{
		str = str.replaceAll("[A-Za-z0-9 ,:]", "").toLowerCase();
		StringBuilder Build = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) 
		{
			Build.append(str.charAt(i));
		}
		String RevStr = Build.toString();
		if(RevStr.equalsIgnoreCase(str)) 
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a String To Check palindrome");
			String Palindrome = "";
			Palindrome = sc.nextLine();
			if(isPalindrome(Palindrome)) 
			{
				System.out.println(Palindrome + " is Palindrome");
			}else
			System.out.println(Palindrome + " is Not_Palindrome");
		}
		
	}
}
