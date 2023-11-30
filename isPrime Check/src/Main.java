import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			int num = sc.nextInt();
			boolean b = isPrime(num);

			if (b == true) 
			{
				System.out.println(num + "is Prime");
			} else 
			{
				System.out.println(num + " is not Prime!!");
			}
			
			System.out.println("Enter number to find the Prime numbers until it: ");
			int size = sc.nextInt();
			System.out.println("Prime numbers are : " );
			for (int i = 2; i < size; i++) 
			{
				if (isPrime(i)) 
				{
					System.out.print(i + ",");
				}
			}
		}
	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i++) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
