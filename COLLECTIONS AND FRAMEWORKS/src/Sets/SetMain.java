package Sets;
import java.util.Set;
import java.util.TreeSet;

public class SetMain 
{
	public static void main(String [] args) 
	{
		//When we Use LinkedHashSet it uses doublyLinkedList in order to retain the Input order
		
		/*
		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<>();
		TreeSet<String> TreeSet = new TreeSet<>();
		
		Set<String> linkedhashSet = new LinkedHashSet<>();
		linkedhashSet.add("Fox");
		linkedhashSet.add("Cat");
		linkedhashSet.add("Elephant");
		linkedhashSet.add("Dog");
		linkedhashSet.add("Hyna");
		linkedhashSet.add("Giraffe");
		
		System.out.println(linkedhashSet);
		
		*/
		
		//The HashSet Doesnt Maintain any order of Storing the Data
		/*
		 
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Fox");
		hashSet.add("Cat");
		hashSet.add("Elephant");
		hashSet.add("Dog");
		hashSet.add("Hyna");
		hashSet.add("Giraffe");
		
		System.out.println(hashSet);
		
		*/
		
		Set<String> treeSet  = new TreeSet<>();
		treeSet.add("Fox");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Hyna");
		treeSet.add("Giraffe");
		
		System.out.println("Default Set\t: " + treeSet+"\n");
		
		Set<String> newSet = new TreeSet<>();
		newSet.size();
		newSet.add("Dog");
		newSet.add("Zebra");
		newSet.add("King Kong");
		newSet.add("Cat");
		newSet.add("Elephant");
		newSet.add("Snake");
		//Searching for ELements

		if(newSet.contains("Zebra")) 
		{
			System.out.println("Zebra : Found\n");
		}
		if(newSet.contains("Rat")) 
		{
			System.out.println("Rat :  NotFound\n");
		}
		
		//Merging two Sets with no Duplicates in it
		//treeSet.addAll(newSet);
		
		//System.out.println(treeSet);
		System.out.println("New Set	\t: " + newSet+"\n");
		//System.out.println(treeSet);
		
		//Intersection
		//This Add New Set with Only Elements That are Common in Both we create the list by passing TreeSet to Constructor 
		Set<String> intersect = new TreeSet<>(treeSet);
		intersect.retainAll(newSet);
		
		System.out.println("Common Elements\t: " + intersect+"\n");
		
		
		//Difference
		//This Compares two Sets and Removes the elements which are common in Both.
		Set<String>Difference = new TreeSet<String>(treeSet);
		Difference.removeAll(newSet);
		System.out.println("UnComm Element\t: " + Difference+"\n");
		
		
		
		//Removing Elements
		Difference.remove("Giraffe");
		System.out.println("Element Removed\t: " + Difference+"\n");
		treeSet.removeAll(newSet);
		System.out.println("removeAll\t: " + treeSet + "\n");
		
		//Clears All the Elements
		treeSet.clear();
		System.out.println("Remove All \t: " +treeSet + "\n");
		
		
	}
}
