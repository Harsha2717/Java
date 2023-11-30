
public class Dog {
	int Age;
	String Name;
	String Colour;
	
	//Constructor is Used to Initialize when object is Created
	
	// 0 Argument Constructors
	public Dog() 
	{
		//When An Object is Created by Dog Then Age,Name and Color will Automatically Provided.
		Age = 0;
		Name = "Null";
		Colour = "Null";
	}
	//Three Argument Constructor
	public Dog(int age_val,String Name_val,String Colour_val) 
	{
		Age = age_val;
		Name = Name_val;
		Colour = Colour_val;
	}
	
	//Methods : This are Used To Set or Assign or Provide information to the Object after the creation of The Object.
	
	public void Set_name(String name_val) {
		this.Name = name_val;
	}
	
	public static void main(String [] args) 
	{
		Dog Tiger = new Dog();
		Tiger.Set_name("Tiger");	//Name is Given By Using method
		System.out.println("Name : " + Tiger.Name+"\nAge : " + Tiger.Age+"\nColour : "+Tiger.Colour);
		
		Dog Arjun = new Dog(10,"Arjun","Brown");	//Calling Constructor
		System.out.println("Age : " + Arjun.Age + "\nName : " + Arjun.Name + "\nColour : " + Arjun.Colour);
	}
}
