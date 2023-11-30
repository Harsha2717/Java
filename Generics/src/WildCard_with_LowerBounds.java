//While using while card with LowerBound
//we can access the elements from the Sub class and also the parent class
//Here We can Add Elements to the Subclass and Obtain them.
import java.util.ArrayList;

public class WildCard_with_LowerBounds {
	public static void main(String[] args) 
	{	
		
		//Basic ArrayList Initialization
		ArrayList<Machine>Machine_List = new ArrayList<>();
		Machine_List.add(new Machine());
		ArrayList<Bike>Bikes  = new ArrayList<>();
		Bikes.add(new Bike());
		
		
		//Using WildCard with LowerBounds
		ArrayList<? super Bike> bikes = new ArrayList<>();
		bikes.add(new Bike());
		bikes.add(new Bike());
		//We can Add the Machine Element but cannot add it Directly or by casting
		//bikes.add(new Machine());
		System.out.println("Getting Bike Elements Using Method");
		details(bikes);
		
		//when we create a LowerBound Wildcard with class all the subclasses that extend it can be accessed
		System.out.println("Accessing Bikes Elements: " + bikes);
	}
	
	public static void details(ArrayList<? super Bike> list) 
	{
		for(Object b : list) 
		{
			System.out.println(b);
		}
	}
}
