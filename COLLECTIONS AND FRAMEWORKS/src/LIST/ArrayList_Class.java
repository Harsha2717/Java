package LIST;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//An ArrayList is Basically a Class derived from List and it is Derived from a Main class Called COLLECTIONS
 
/*
 
 * Collections conisists of Multiple classes and Interfaces
 * This cannot be Directlt implemented or initiated only the classes Like LIST,Queue,Set and Maps
 * The ArrayList is one of the Class In List 
 * ArrayList is a Dynamic Data Structure That can be Dynamically Resizable 
 * The ArrayList can be more Efficient way of Storing data and this can store Any object
 * There are Multiple Methods in order to Add remove and Manipulate the Elements
 * The ArryList Supports Generic Methods hence we can have TypeSafety for it
 
 */


/*
 * ArrayList are Contiguoes in memory [0][1][2][3].......and so on
   ////////////////////////////////////////////////////////////////
  
  Time Complexities:
  
  	* Adding Element:
  
  * Inserting Element at end 			: O(1)	 	//Doesn't Depend on the Input
  * Inserting Element at the Middle		: O(n) 		//Is worst case. It is Directly Propostional to input
  * Inserting Element at the beginning 	: O(n) 		//Time taken to Complete is depends on the size input
  * 
  
  	* Searching Element:
  	
  *Searching Element at Index 			:O(1) 		//Directly find the Element so no need to reading the whole ArrayList
  *Searching Element using For Loop 	:O(M)		//M is the size of the Loop //Hence we need to iterate over the Loop.
  *Searching Element using inner Loops 	:O(M*N)		//M*N Times 
  
  
  	* Removing Element:
  	
  *Removing Element at end of List		:O(1)		
  *Removing Element in the Middle		:O(n)
  *Removing Element in the Beginning 	:O(n)
  
  
 */


public class ArrayList_Class {
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		
		@SuppressWarnings("rawtypes")
		Collection list = new ArrayList();	
		list.add(1);
		list.add(2);
		
		//Collection only Support Add the elements and retriving it using loop
		//but we cannot access the index Elements we need to implement List
		//We can create a object without any Parameters but it is not VeryEfficient
		
		//Using For Each
		//We need to create the Instacne of Object because we Dont know what data Type we used
		System.out.println("List : ");
		for(Object a : list) 
		{
			int b = (Integer)a;
			System.out.print(b + " ");
		}
		System.out.println();
				
		
		
		
		Collection<String> list1 = new ArrayList<String>();
		list1.add("Harsha");
		list1.add("Sirisha");
		
		System.out.println("\nlist1 : " + list1);
		//Using For Each
		//Here We can directly use NonPrimitive Type String because we only store String Data type to List
		System.out.print("\nlist1 : ");
		for(String s : list1) 
		{
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Accesing data using index
		
		//Inorder to Retrieve Data Using Index It is not Possible using Collections
		//The ArrayList implements List using which we can access the Elements using the index
		List<String> list2  = new ArrayList<String>();
		
		list2.add("Harsha");
		list2.add("Jaanuu");
		
		System.out.println("\nlist2 : " + list2);
		//we can retrieve data using loops
		//Traditional Indexed For Loop
		System.out.println("\nUsing Indexed For Loop");
		System.out.print("\nlist2 : ");
		for(int i=0;i<list2.size();i++) 
		{
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("\nlist2 : " + list2);
		//we can retrieve data using loops
		//Traditional Indexed For Loop
		System.out.println("\nUsing ForEach Loop");
		System.out.print("\nlist2 : ");
		for(String ans : list2)
		{
			System.out.print(ans + " ");
		}
		System.out.println();
		
		
		list.remove(1);
		list1.remove("Sirisha");
		list2.remove("Harsha");
		
		
		//we can directly create and implement the ArrayList Object
		//ArrayList<int> arr = new ArrayList<>();
	}
}
