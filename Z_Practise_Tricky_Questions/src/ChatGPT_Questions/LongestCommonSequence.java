package ChatGPT_Questions;

import java.util.Scanner;

public class LongestCommonSequence {
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter");
			String a = sc.next();
			String b = sc.next();
			StringBuffer buff = new StringBuffer();
			
			for(int i=0;i<=a.length()-1;i++) 
			{
				for(int j=0;j<=b.length()-1;j++) 
				{		
					if(a.charAt(i) == b.charAt(j)) 
					{
						buff.append(a.charAt(i));
					}
				}
			}
			//String 1: "ABCDB"
			//String 2: "AFCDFB"
			System.out.println(buff);
		}
	}
}
