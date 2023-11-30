import java.math.BigInteger;
import java.util.Scanner;

public class UsingBIGINTEGERS 
{
	public static void main(String [] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number to Check Prime or Not : ");
		String input = sc.next();
		BigInteger BI = new BigInteger(input);
		if(BI.isProbablePrime(100)) 
		{
			System.out.println(BI + " is Prime ");
		}else 
		{
			System.out.println(BI + " is NotPrime ");
		}
		System.out.print("Enter the Size to find Primes");
		int size = sc.nextInt();
		sc.close();
		//Using for loop
		
		for(int i=0;i<size;i++) 
		{
			String in = Integer.toString(i);
			BigInteger big = new BigInteger(in);
			
			if(big.isProbablePrime(100)) 
			{
				System.out.println(big);
			}
		}

			
	}
	
}
