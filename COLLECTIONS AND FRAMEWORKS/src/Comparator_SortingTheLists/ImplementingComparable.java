/*
 * Comparable and Comparator both are used for Sorting
 *
 * Comparable only allows to Sort in Natural order (Default) which is already implemented by BuiltinClass 
  	when we use Custom classes no Natural ordering hence we need to implement the Comparable in order to get NaturalOrdering
 *
 *Comparator Provides both natural and Custom Sorting Logic but for Natural Sorting Comparable is used
 */


package Comparator_SortingTheLists;
import java.util.*;

class Person implements Comparable<Person>
{
	private String name;
	
	Person(String name)
	{
		this.name = name;
	}
	public String getName(){return name;}
	
	public int hashcode() 
	{
		return Objects.hash(name);
	}
	public boolean equals(Object o) 
	{
		if(this == o)return true;
		if(o == null || getClass() != o.getClass())return false;
		Person p = (Person)o;
		return name.equals(p.name);
	}
	public String toString() 
	{
		return "Name :- "+name;
	}
	
	public int compareTo(Person p1) 
	{
		return name.compareTo(p1.name);
	}
	
}
public class ImplementingComparable 
{
	public static void main(String [] args) 
	{
		List<Person> list = new ArrayList<Person>();
		Set<Person>set = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);
		
		for(Person p : list) 
		{
			System.out.println(p);
		}
		System.out.println("\n-------------\n");
		
		for(Person p : set) 
		{
			System.out.println(p); 
		}
	}
	public static void addElements(Collection<Person> col) 
	{
		col.add(new Person("Harsha"));
		col.add(new Person("Jaanuu"));
		col.add(new Person("Sirisha"));
		col.add(new Person("Vaibuu"));
		col.add(new Person("Sindhu"));
	}
}
