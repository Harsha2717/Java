package ChatGPT_Questions;

import java.util.Scanner;

public class CalculatingSumUsingRecursion {
	public static int recAdd(int a) 
	{		
		if(a <= 0) 
		{
			return a;
		}
		int temp = a + recAdd(a-1);
		return temp;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(recAdd(num));
		sc.close();
		
	}
}
