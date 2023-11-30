/*Method Overriding is type of Polymorphism and It inherits all the methods and variables 
 * From parent class and implements in its own way
 * The method inherited must be with same name and same parameters must implements either 
 * as-is or Changes as per requirement
 * This is also called as Dynamic Polymorphism
*/
//code 1
/*
class Animal 
{
	void makesound() 
	{
		System.out.println("Animal Barks");
	}
}
class Dog extends Animal
{
	void makesound() 
	{
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal
{
	void makesound() 
	{
		System.out.println("Cat Barks");
	}
}
public class Method_Overriding {
	public static void main(String[] args)
	{
		Animal dog = new Dog();
		dog.makesound();
		Animal cat = new Cat();
		cat.makesound();
	}
}
*/
//Code 2
/*
 * In this code we have a Calculator class, sub class as Mycalculator class and Main class where code starts
 * The calculator class have methods like addnum and subnum
 * The child class mycalculator inherited the methods and overridden it by some changes
 */
class calculator
{
	public void addnum(int a,int b) 
	{
		System.out.println("Calling Addnum Calculator class : "+  (a+b));
	}
	public void subnum(int a,int b) 
	{
		System.out.println("Calling subnum Calculator class : "+  (a-b));
	}
	
}
class mycalculator extends calculator
{
	//@overriding
	public void addnum(int a,int b) 
	{
		System.out.println("Calling Addnum MyCalculator class : "+  (a+b));
	}
	public void subnum(int a,int b) 
	{
			System.out.println("Calling subnum MyCalculator class : "+  (a-b));
	}
}

public class Method_Overriding{
	public static void main(String [] args) 
	{
		calculator calculate = new calculator();
		//calculate.addnum(100, 200);
		calculate.addnum(100, 200);
		calculator mycal = new mycalculator();
		mycal.subnum(100, 200);
	}
}