package ChatGPT_Questions;

import java.util.Scanner;
import java.math.BigInteger;

public class IsPrimeChecker 
{
	public static boolean isPrime(int n) 
	{
		if(n<=1) 
		{
			return false;
		}
		if(n<=3) 
		{
			return true;
		}
		if(n%2==0 || n%3==0) 
		{
			return false;
		}
		for(int i=5;i*i<=n;i++) 
		{
			if(n%i==0 ||n%(i+2)==0) 
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String [] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a Integer to check if Prime : ");
			int n = sc.nextInt();
			System.out.println(isPrime(n));
			
			BigInteger big = new BigInteger(Integer.toString(n));
			System.out.println(big.isProbablePrime(100));
		}
	}
}
