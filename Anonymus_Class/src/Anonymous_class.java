
class Animal
{
	public void bark() 
	{

		System.out.println("\n========Base Class======\n");
		System.out.println("Animal is Barking");
	}
}
class Cat extends Animal
{
	public void bark() 
	{
		System.out.println("\n========Sub Class======\n");
		System.out.println("cat is Barking");
	}
}
interface Plant
{
	public void name();
}

public class Anonymous_class {
	public static void main(String[] args) 
	{
		Animal animal = new Animal();	//Default implementation and Creating and Object
		animal.bark();	//Calling Animal Class method
		
		Animal Dog = new Animal() 
		{
			@Override
			//Creating an Anonymous class with one time implementation and this cannot be further Implemented
			public void bark() 
			{
				System.out.println("\n========Anonymous Class======\n");
				System.out.println("Dog is Barking");
			}
		};
		
		//Here in the Heap we have created an Anonymous class in the implementation and
		//The method is Overridden and when the ANimal object is called the Method 
		//in the Anonymous class is Called and After Execution it Goes OutOfScope
		
		Dog.bark();
		
		//we can also create and Anonymous interface
		
		//Plant p1 = new Plant();	
		//This Line provides error because we need to implement the Method in the Interface
		//So we can create An class and implement the Methods of the Interface or
		//We can directly create an Anonymous class while creating the Object and Implement it.
		
		
		Plant Rose = new Plant() 
		{
			@Override
			public void name() 
			{
				System.out.println("\n========Interface========\n");
				System.out.println("Rose");
			}
		};
		
		Rose.name();

		//Anonymous class that extends an existing class
		Animal Cat = new Cat() 
		{
			@Override
			public void bark() 
			{
				System.out.println("\n======Sub class=======\n");
				System.out.println("Cat is BArking");
			}
		};
		Cat.bark();
		
		
		
		
		
		
		
		
		
	
	}	
}
