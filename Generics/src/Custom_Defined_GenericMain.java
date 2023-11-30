import java.util.ArrayList;
//Generic's are used to create classes , Methods and Interfaces That can be Used by Multiple DataTypes
//Generic's Can be used for Custom Classes or For the default Classes Like ArrayList,LinkedList and Etc

class Animal<T>
//Creating a Custom Animal Class and DataType is Given as ' T ' that will assigned while creating the Object
{
	private T Name;
	private T Breed;
	
	public Animal(T Name,T Breed) 
	{
		this.Name = Name;
		this.Breed = Breed;
	}
	public T get_name()
	{
		return this.Name;
	}
	
	public T get_breed()
	{
		return this.Breed;
	}
}

public class Custom_Defined_GenericMain
{
	//This only Accepts The String type When we Use WildCard ? then we can Call any Data Type
	public static void get_details(Animal<String> details) 
	{
		System.out.println("Name 	: " + details.get_name());
		System.out.println("Breed 	: " + details.get_breed());
	}
	public static void main(String[] args) 
	{
		Animal<String> Dog_name = new Animal<>("Tiger","GermanShepard");
		
		get_details(Dog_name);
		
		Animal<Integer>Dog_num = new Animal<>(100,10);
		
		System.out.println(Dog_num.get_name());
		System.out.println(Dog_num.get_breed());
		get_details(Dog_name);
		
		
		//Default Method and We will learn More in Frame Works Section
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Harsha");
		strings.add("Jaanuu");
		strings.add("Random");
		//Adding to list of Arrays
		System.out.println(strings.get(0));
		System.out.println(strings.get(1));
		System.out.println(strings.get(2));
		
		//Getting Size of ArrayList
		System.out.println("Size of List Before Removing : " + strings.size());
		//Removing
		strings.remove(2);
		System.out.println("Size of List After  Removing : " + strings.size());
		//System.out.println(strings.get(2));//The elements removed
	}	
}
