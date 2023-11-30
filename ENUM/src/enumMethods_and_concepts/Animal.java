package enumMethods_and_concepts;

public class Animal 
{
	public static void main(String[] args) 
	{
		 Animals animal = Animals.DOG;
		 
		 //Cannot modify or add value to ir.
		 //Animals animals = Animals.DOG("Name",10);
		 
		 System.out.println(animal.getClass());
		 
		 //Checks if Dog is instance of Enum
		 System.out.println("Animals.Dog instanceof Enum : " +( Animals.DOG instanceof Enum));
		 
		 //Gets the name of the class of DOg
		 System.out.println("Animals.Dog.name() : " + Animals.DOG.name());
		 
		 
		 
		 //The toString method gives the data present in the constant values
		 //The data can be of Anytype
		 System.out.println(animal.toString());
	}

}