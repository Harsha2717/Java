

//Method is Used to Define the Behavior of the Program 
public class Methods {
	public static void main(String [] args) 
	{
		Dog Tiger = new Dog();
		Tiger.set_details(12, "TIGER", "White", "Short");
		Tiger.get_details();
		System.out.println("--------------------------------------------\n");
		Dog Arjun = new Dog();
	
		Arjun.get_Age(15);
		Arjun.get_name("Arjun");
		Arjun.get_colour("Brown");
		System.out.println("--------------------------------------------\n");
		Tiger.get_Age(18);
		System.out.println("-------------------------------------------\n");
		Tiger.get_details();
		
	}
}
