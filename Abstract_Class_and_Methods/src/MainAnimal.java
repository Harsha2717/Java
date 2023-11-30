//
abstract class Animal
{
	 abstract void walkAnimal();
	
	public void display() 
	{
		System.out.println("Display Data");
	}
}

class Dog extends Animal
{
	void walkAnimal() 
	{
		System.out.print("Dog Walks");
	}
}

class Cat extends Animal
{
	void walkAnimal() 
	{
		System.out.println("\nCat Walks");
	}
}

public class MainAnimal 
{
	public static void main(String[] args) 
	{
		Animal dog = new Dog();
		dog.walkAnimal();
		Animal cat = new Cat();
		cat.walkAnimal();
	}
}