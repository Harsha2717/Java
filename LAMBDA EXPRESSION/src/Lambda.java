/*
 * Lambda Expression can only be used in the Functional Interface which only contain a single method(SAM)
 * SAM Single Abstract method
 * The lambda Expression can be used to call the method inline without any Anonymus inner Class 
 * 
 *  When we have a method with no parameters and single output Statement
 	*
 		Greeting greet = () -> System.out.println("Hello");  
 	*
 		Greeting greet = (name) -> System.out.println("Hello" + name);
 	*
 		Greeting greet = (name) -> {
 		
 			System.out.println("hello");
 			System.out.println("harsha");
 			System.out.println(name);
 		};
 		*  
 *  
 */

interface Greeting
{
	public void Greet();
}

interface GreetwithName
{
	public void GreetWithName(String name);
}

public class Lambda 
{
	public static void main(String[] args) 
	{
		String name = "Harsha";
		
		Greeting greet = () -> System.out.println("Hello World");
		greet.Greet();
		
		//Anonymus Class
		Greeting gree = new Greeting() 
		{
			public void Greet() 
			{
				System.out.println("Helloo");
			}
		};
		gree.Greet();
		
		//When we pass the name a Conflict occurs hence we need to be Clear same as Creating an Anonymus class
		GreetwithName g = (Name)->System.out.println("Hello " + Name);
		g.GreetWithName(name);
		
		
	}	
}
