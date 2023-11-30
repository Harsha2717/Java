package ChatGPT_Questions;

import java.util.Scanner;

public class FibbonaciUsingRecursion {
	
	public static int fibonaci(int n) 
	{
		if(n == 0) 
		{
			return 0;
		}
		
		if(n == 1) 
		{
			return 1;
		}
		
		return fibonaci(n-1)+fibonaci(n-2);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of fibonnaci Series : ");
		int n = sc.nextInt();
		System.out.println(fibonaci(n));
		sc.close();
	}
}
