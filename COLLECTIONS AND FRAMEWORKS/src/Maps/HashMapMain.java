package Maps;
/*
 * HashMap is the DataStructure that contains pairs of data and each pair contains a key value and data
 * Every Key is Unique and data can be Duplicated
 * Keys cannot be duplicated instead when we try to duplicate the key it replaces the Original one.
 * 
 * ******************* HashMaps Store the Data internally in the form of ArrayofLinkedList *******************
 * 
 * The TimeComplexity for Data Putting and retrieval and removing is O(1)
 * When we print every element then it is O(N)
 * 
 * 
 * 
 */


import java.util.HashMap;
import java.util.Map;

public class HashMapMain
{
	public static void main(String [] args) 
	{
		Map<String ,Integer> Students = new HashMap<String,Integer>();
		
		//Adding Students to the Map
		
		Students.put("Harsha", 22);
		Students.put("Jaanuu",21);
		Students.put("Vaibu",21);
		Students.put("Sirisha",19);
		
		System.out.println(Students);
		System.out.println();
		//Accessing the Students and Updating the Ages
		
		System.out.println(" Age : " + Students.get("Vaibu"));
		System.out.println();
		
		if(Students.containsKey("Jaanuu"))
		{
			Students.replace("Jaanuu", 21, 20);
		}
		System.out.println(Students);
		System.out.println();
		
		//Iterating and Printing
		for(Map.Entry<String, Integer> stu  : Students.entrySet()) 
		{
			String key = stu.getKey();
			int age = stu.getValue();
			
			System.out.println(key + "	: " +age);
				
		}

		//OR
		System.out.println();
		for(Map.Entry<String, Integer> stu1 : Students.entrySet()) 
		{
			System.out.println(stu1);			
		}

		//Checking whether key is present or not 
	
		System.out.println();
		if(Students.containsKey("Harsha")) 
		{
			System.out.println("The Student Present");
		}
		else 
		{
			System.out.println("The Student is Not Present");
		}
		
		//checking if student with age is present or not
		
		System.out.println();
		if(Students.containsValue(22)) 
		{
			System.out.println("The Student Present");
		}
		else 
		{
			System.out.println("The Student is Not Present");
		}
		
		
		System.out.println();
		//Removing Students	using Keys	
		Students.remove("Vaibu");
		System.out.println(Students);
		System.out.println();
		
		//Removing Students	using Keys	and data
		Students.remove("Sirisha", 19);
		System.out.println(Students);
		System.out.println();

		//Size of map
		System.out.println("Size : " + Students.size());
		
		Students.clear();
		System.out.println(Students);
		
		
		
	}
	
	
}