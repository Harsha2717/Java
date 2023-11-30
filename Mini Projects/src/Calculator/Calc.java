package Calculator;

import java.util.Scanner;

class Calc 
{
	Add add = new Add();
	public void start() 
	{
		System.out.println("====== WelCome to Calculator ======");
		try(Scanner sc = new Scanner(System.in))
		{
			int select = 0;
		
			System.out.println("Select an Option : ");
			do 
			{
				System.out.println("1. Addition ");
				System.out.println("2. Substraction ");
				System.out.println("3. Multiplication ");
				System.out.println("4. Division ");
				System.out.println("5. Remainder ");
				System.out.println("6. Exit ");
				System.out.println();
				
				if(!sc.hasNextInt()) 
				{
					System.out.println("Please try Again....");
					start();
					break;
				}
				select = sc.nextInt();
				
				switch(select) 
				{
					case 1 :
					{
						System.out.println("Addition");
						add.add();
						break;
					}
					
					case 2 :
					{
						System.out.println("Substraction");
						break;
					}
					
					case 3 :
					{
						System.out.println("Multiplication");
						break;
					}
					
					case 4 :
					{
						System.out.println("Division");
						break;
					}
					
					case 5 :
					{
						System.out.println("Remainder");
						break;
					}
					case 6 :
					{
						System.out.println("\n=============Thanks for Using calculator=============\n");
						break;
					}
					default :
					{
						System.out.println("Try Again");
						start();
						break;
					}
				}
					
			}while(select!=6);
		}
	}
}
