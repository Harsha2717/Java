package Ternary_Operator;

import java.util.Scanner;

public class ternaryOperations {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.print("Enter value of X : ");
			int x = sc.nextInt();
			// Ternary Operation
			// Conditon ? Statement1 : Statement2;
			System.out.println((x <= 10) ? x * x : 0);
		}
	}
}
