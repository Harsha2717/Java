//Here we are creating a class with name Robot and implementing another Class Brain in it.
/*
 * The brain class can access the properties of Robot class Directly Without any implementation 
 * When Robot class cannnot access the properties of Brain class directly we need to create a Instance of object and then Implement it.
 * When A method is declared Static then we can directly call the Static method and we cannot pass the Value of Instance Variable.
 */

public class Robot 
{
	private int id;
	class Brain 
	{
		//Inner Class
		void work() 
		{
			System.out.println("Robot " + id + " Started Thinking...");
		}	
	}

	//public static int iD;	//When varible is declared as Static then we can refer to it
	
	//Constructor
	Robot(int id)
	{
		this.id = id;
	}

	public void Start() 
	{
		System.out.println("Starting Robot " + id);

		//Creating an Object with Inner Class Brain and calling its method
		Brain brain = new Brain();
		brain.work();
		
		String name = "Chitti";
		
		class temp
		//Creating a class inside the Method and this goes out of scope once the Method is Executed
		{
			public void doSomething() 
			{
				System.out.println("ID	: " + id);
				System.out.println("My Name is "  + name);
			}
		}
		temp t = new temp();
		t.doSomething();
	}	
	
	//Static method can be Directly implemented and Can only assign values of Static
	static void battery() 
	{
		System.out.println("Battery is Charging : ");
		//System.out.println("Battery is Charging : " + id);	//Error		
		//System.out.println("Battery is Charging : " /*+ iD*/);	//When variable is declared Static then we can refer to it
	}

}
