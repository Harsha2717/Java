import java.util.Scanner;

import com.ownpackage.addition.*;
import com.ownpackage.substraction.*;


public class MainPackage 
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 0; int b = 0;
		System.out.println("Enter Two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		Addition add = new Addition();
		add.addition(a, b);
		Substraction sub = new Substraction();
		sub.substraction(a, b);
		
		Multiplication multi = new Multiplication();
		multi.multiply(a, b);
		
		Division Div = new Division();
		Div.divide(a,b);
		
	}

}

