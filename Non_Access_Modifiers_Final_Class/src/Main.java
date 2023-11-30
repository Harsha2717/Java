

//Once a Class is Declared As Final It cannot be implemented in subclass
final class Animal
{
	void bark() 
	{
		System.out.println("BOW BOW");
	}
	
	void Eat() 
	{
		System.out.println("Food Over");
	}
}
/*
class Dog extends Animal() 
{
	void Eat();
	void Eat();
}
*/
public class Main 
{
	public static void main(String[] args) 
	{
		Animal tiger = new Animal();
		tiger.bark();
	}
}
