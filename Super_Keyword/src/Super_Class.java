import java.util.Scanner;

class Calculator
{
	double a;double b;
	Calculator()
	{
		this.a = 0;
		this.b = 0;
	}
	Calculator(double a,double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void Addition(double a, double b) 
	{
		System.out.println("===========Parent Class===========\n");
		System.out.println("Addition of " + a + " + " + b + " : " + (a+b)+"\n");
	}
	public void Substraction(double a, double b) 
	{
		System.out.println("===========Parent Class===========\n");
		System.out.println("\nSubstraction of " + a + " - " + b + " : " + (a-b)+"\n");
	}
}
class Add extends Calculator
{
	Add(double a,double b)	//2 Args Constructor
	{
		super(a,b);
	}
	
	Add(){}	//no Args or Default Constructor
	
	public void Addition(double a,double b) 
	{
		System.out.println("===========Child Class===========");
		super.Addition(a, b);
	}
}

class Sub extends Calculator
{
	
	Sub(double a,double b)	
	{
		super(a,b);
	}
	
	Sub(){}
	
	public void Substraction(double a,double b) 
	{
		System.out.println("===========Child Class===========");
		super.Substraction(a, b);
	}
}
public class Super_Class
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for X : ");
		double x = sc.nextInt();
		//sc.nextLine();
		System.out.print("Enter value for Y : ");
		double y = sc.nextInt();
		
		Calculator add = new Add(100,200);
		add.Addition(x,y);
		System.out.println("A Val : " + add.a + "B Val : " + add.b);
		Calculator sub = new Sub(x,y);
		sub.Substraction(x, y);
		sc.close();
		
	}
}
