import java.util.ArrayList;


//Creating ArrayList in class declaration and Creating getters setters and Constructors	
class lister
{
	private ArrayList<String> array ;
	lister()
	{
		array = new ArrayList<>();
	}
	
	void adddata(String list) 
	{
		array.add(list);
	}
	public String toString() 
	{
		return array.get(0);
	}
}

public class WildCards_usingDefault {
	public static void main(String[] args) 
	{
		
		lister list = new lister();
		list.adddata("Hello");
		
		System.out.println(list.toString());
		
		ArrayList<String> names = new ArrayList<String>();	//Explicit Declaration
		names.add("Harsha");
		names.add("Jaanuu");
		PrintList(names);
		
		ArrayList<Long> numbers = new ArrayList<>();
		numbers.add(9346867605L);
		numbers.add(8978549862L);
		PrintList(numbers); 
		
		//Upper Bounded WildCard
		ArrayList<? extends Number>Numbers = new ArrayList<>();
		//Numbers.add(10);
		Numbers = numbers; //Can only Assign Data Types of its sub classes
		System.out.println(Numbers.get(0));
		//Lower Bounded WildCard
		ArrayList<? super Integer> intNums = new ArrayList<>();
		intNums.add(10);
		intNums.add(20);
		//Error Because the ArrrayList is bounded to Integer Type can only add the super types as Object and Numbers 
		//intNums.add(10.5);
		System.out.println(intNums);
		PrintList(intNums);
		System.out.println(intNums.get(0));
		
		//We use Object when we don't know what type of Data is Passed 
		
		ArrayList<Object> mixedobjects = new ArrayList<>();
		mixedobjects.add("Harsha");
		mixedobjects.add(9346867305L);
		mixedobjects.add(true);
		
		PrintList(mixedobjects);
		//For Obtaining Specific Data type
		for( Object obj : mixedobjects) 
		{
			if(obj instanceof String) 
			{
				System.out.println(obj);
			}
			if(obj instanceof Long) 
			{
				System.out.println(obj);
				
			}
			if(obj instanceof Boolean) 
			{
				System.out.println(obj);
			}
		}
		
	}
	
	//Here We Are Using WildCard And it is Represented by ? and it is used for any data type
	
	//This Method is used for Calling both String type and Long Type
	public static void PrintList(ArrayList<?> list) 	
	{
		//Here We use Object for getting the Type safety as we dont know what type of data we are passing
		for(Object lists : list) 
		{
			System.out.println(lists);
		}
	}
	
	
	//When we Know the data type we can create an ArrayList With String Elements
	/*	
	public static void PrintList(ArrayList<String> list) 	
	{
		for(String lists : list) 
		{
			System.out.println(lists);
		}
	}
	 */
}

