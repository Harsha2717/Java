/*
 * Hashtable :
 		* A Hashtable is a DataStructure that store the Elements with Unique Keys to Values(Eg : <K,V>
 		* Each Key/value pair is known as Entry
 		* The Insertion,Removal and Retreiving of the Elements are fast.
 		* This Can be Most Effiecient with large Data Sets
 		* The Hashtables are Synchronized by Default so this provides thread Safety While Working at MultiThreading Applications
 		 	
 * Hashing : 
 		* In Hashing the Key is passed through a Formula and then a Integer is Generated
 		* We use the Integer to identify the Index of the Buckets to Store the Element in.
 		* This can be Achieved by Dividing the Integer with 10 and considering the Remainder
 			*** index = key.hashCode() % sizeofHashtable; *** 		
 		* If the Size of Hashtable is More the Less Number of Collisions Takes Place
 * Bucket : 
 		* An Indexed Storage that can be Used for Storing elements in it.
 		* In case of Multiple Collisions at same Bucket it can act as LinkedList.
 
  * Collision : 
  		* If hash Function Generates same index for multiple Elements then it is Collision
  		* in case of Collision the bucket act as LinkedList
  		* Less Collision More Efficiency
  
  * RunTimeComplexity :
  		* Best case = O(1)
  		* Worst Case =O(N) //When every element is placed in same bucket 	
 */



package HashTables;
import java.util.Hashtable;
public class HashTableMain 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		//table.put(100, null);
		table.put(100, "Braian");
		table.put(123, "Peter");
		table.put(137, "Lois");
		table.put(555, "Chirs");
		table.put(524, "Stewie");
		table.put(666, "Meg");
		
		//table.remove(100);
		//table.remove(100,"Braian");
		
		//System.out.println(table.contains("Braian"));
		//System.out.println(table.containsKey(100));
		//System.out.println(table.replace(100, "Braian"));
		
		for(Integer key : table.keySet())
		{
			System.out.println(key.hashCode()%10+"\t"+key + "\t" + table.get(key));
		}	
	}
	
}
 