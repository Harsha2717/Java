
class Animals<T>
{
	T Name;
	Animals(T name)
	{
		this.Name = name;
	}
	public void detail() 
	{
		System.out.println("Animal Barks");
	}
	public void nothing() 
	{
		System.out.println("Nothing");
		
	}
}


class Dog<T> extends Animals<T>
{
	Dog(T name)
	{
		super(name);
	}
	public void detail() 
	{
		System.out.println("Dog Barks");
	}
	public void dogbarks() 
	{
		System.out.println("Dogs Say bow bow");
	}
}

class Cat<T> extends Animals<T>
{
	Cat(T name)
	{
		super(name);
	}
	public void detail() 
	{
		System.out.println("Cat Barks");
	}
	public void catbarks() 
	{
		System.out.println("Cat Say meow");
	}
}

public class WildCardsUsing_CustomeGenericClasses {
	public static void main(String[] args) {
		Animals<String> animals = new Animals<>("Animals");
		animals.detail();
		Dog<String>dog = new Dog<>("Dogs");
		dog.detail();
		Cat<String>cat = new Cat<>("Cats");
		cat.detail();
		
		
	//	Dog<? extends Animals<String>> dogs = new Dog<>("Tiger");	
	}
}
