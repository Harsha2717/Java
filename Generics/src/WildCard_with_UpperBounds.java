//upper bounded WildCard are used with Extend Keyword and parentClass
//In UpperBounded WildCard we cannot Add data directly we need to Assign them
// We can access the Elements
import java.util.ArrayList;

class Machine
{
	ArrayList<String> mac = new ArrayList<>();
	void setList( String name) 
	{
		mac.add(name);
	}
	public void out() 
	{
		System.out.println(mac);
	}
	void Start() 
	{
		System.out.println("Machine Starts");
	}
	void Stop() 
	{
		System.out.println("Machine Stops");
	}
	
	public String toString() 
	{
		return "I am A Machine";
	}
}

class Bike extends Machine
{

	ArrayList<String> mac = new ArrayList<>();
	void setList(String name) 
	{
		mac.add(name);
	}
	
	//Overriding 
	void Start() 
	{
		System.out.println("Bike Starts");
	}
	
	void Stop() 
	{
		System.out.println("Bike Stops");
	}
	public String toString() 
	{
		return "I Am A Bike";
	}
}

class Tires extends Bike
{

	ArrayList<String> mac = new ArrayList<>();
	void setList(String name) 
	{
		mac.add(name);
	}

	void count() 
	{
		System.out.println("Two tires");
	}
	public String toString() 
	{
		return "I Am a Tire";
	}
}


public class WildCard_with_UpperBounds {
	public static void main(String[] args) {
	//	Machine mac = new Machine();
		ArrayList<Machine> machines_list = new ArrayList<>();
		machines_list.add(new Machine());
		machines_list.add(new Machine());
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Harsha");
		list.add("Harsha");
		list.add("Harsha");
		list.add("Harsha");
/*
		Machine mac =  new Machine();
		for(String s : list) 
		{
			mac.setList(s);
		}
		mac.out();
*/	
		output(machines_list);
		//System.out.println(machines_list);
		
		//Bike bike = new Bike();
		ArrayList<Bike> bikes_list = new ArrayList<>();
		bikes_list.add(new Bike());
		bikes_list.add(new Bike());
		//Tires is Subclass of bike so it accepts
		bikes_list.add(new Tires());
		
		
		output(bikes_list);
		System.out.println(bikes_list);
		
		//When a ArrayList is Declared with UpperBound Generic then we cannot add element to it but can get the elements
		//We can Assign Elements to it and obtain them
	
		ArrayList<? extends Machine> list1 = new ArrayList<>();
		//list1.add(new Machine());

		list1 = machines_list; //Assign Elements
		
		System.out.println("List1 : " + list1);
	}
	//When we use a Method with UpperBound WildCard the Extended parent class and Subclass which extends objects can be utilized 
	 
	public static void output(ArrayList<? extends Machine> list) 
	  {
			for(Machine obj : list) 
			{
				System.out.println(obj);
			}
	  }
		
	//This will Accept any Data type and Provide the output
	/*
	  public static void output(ArrayList<?> list) 
	{
		for(Object object : list) 
		{
			System.out.println(object);
		}
	}
	*/
}

