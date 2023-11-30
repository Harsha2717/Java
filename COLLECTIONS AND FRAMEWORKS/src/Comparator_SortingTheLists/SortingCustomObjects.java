/*
 * Comparator is a Interface that Consists of only a Single Method
 * The Method need to be Overriden in the class that implements it and it returns integer value 1 or -1 or 0
 * Comparator is used to implement custom Sorting of the Custom classes or the Primivite Wrapper classes or The non Primitive 
 * This can be used to Sort the Elements based on the Requirement by Overriding the Method with custom Logic
  
  
 *	Basically the Comparator can only be used to sort the Lists
 *	but if we need to sort the Maps or Sets we need to pass them as List and then we can sort them according to Our Need
  
 *	When a class implements the Comparable we can directly sort the elements
 *	When the class need to be sorted in custom way then we need to call the Comparator
 */


package Comparator_SortingTheLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Player implements Comparable<Player>
{ 
	private String name;
	private int age;
	
	//Constructor  
	Player(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//Methods
	public String getName()
	{
		return name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	@Override
	public String toString() 
	{
		return name + " : " + age;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name,age);
	}
 
	
	@Override
	public boolean equals(Object o) 
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Player p = (Player)o;
		return name.equals(p.name) && age == p.age;
	}

	@Override
	public int compareTo(Player p1) 
	{
		if(this.age > p1.age)return 1;
		else if(this.age < p1.age)return -1;
		return 0;
	}
}

public class SortingCustomObjects 
{
	public static void main(String [] args) 
	{
		
		//Creating Player Objects
		Player p1 = new Player("Harsha",22);
		Player p2 = new Player("Siri  ",18);
		Player p3 = new Player("Sindhu",25);
		Player p4 = new Player("Vaibu ",21);
		Player p5 = new Player("Vaishu",23);
		
		
		//Creating a List as ArrayList 
		List<Player> mainList = new ArrayList<Player>();
		mainList.add(p1);
		mainList.add(p2);
		mainList.add(p3);
		mainList.add(p4);
		mainList.add(p5);
		
		System.out.println("================== Sorting in order of Age ==============================");
		System.out.println();
		System.out.println("================== List Before Sorting ==============================");
		
		///printing Elements using ForEach Loop
		for(Player p : mainList) 
		{
			System.out.println(p.getName() + " -- " + p.getAge());
		}
		
		System.out.println("================== List After  Sorting ==============================");
	
		//We need to implement the Comparable interface and the Method in it in order to make the Class to Sort Directly
		Collections.sort(mainList);
			
//		Collections.sort(mainList,new Comparator<Player>() 
//		{
//			//Creating a Anonomus Class And Implementing the Sorting Logic
//			@Override
//			public int compare(Player p1,Player p2) 
//			{
//				if(p1.getAge() > p2.getAge()) 
//				{
//					return 1;
//				}
//				else if(p1.getAge() < p2.getAge()) 
//				{
//					return -1;
//				}
//				return 0;
//			}
//		});
		
		for(Player p : mainList) 
		{
			System.out.println(p.getName() + " -- " + p.getAge());
		}
		
		System.out.println("================== Sorting in order of Name ==============================\n");
		
		System.out.println("================== Before Sorting ==============================");
		for(Player p : mainList) 
		{
			System.out.println(p.getName() + " -- " + p.getAge());
		}
		
		List<Player> li = new LinkedList<Player>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		li.add(p5);
		
		Collections.sort(li,new Comparator<Player> () 
		{
			public int compare(Player p1,Player p2) 
			{
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("================== After  Sorting ==============================");
		for(Player p : li) 
		{
			System.out.println(p.getName() + " -- " + p.getAge());
		}
		
		
		
		
//		Set<Player> list = new LinkedHashSet<Player>();
//		
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
//		list.add(p5);
//		
//		List<Player> lists = new ArrayList<Player>(list);
//		System.out.println("================== Set Before Sorting ==============================");
//		for(Player p : list) 
//		{
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//		
//		System.out.println("================== Set After  Sorting ==============================");
//
//			
//		Collections.sort(lists ,new Comparator<Player>() 
//		{
//			@Override
//			public int compare(Player p1,Player p2) 
//			{
//				//Descending Order
//				if(p1.getAge() < p2.getAge()) 
//				{
//					return 1;
//				}
//				else if(p1.getAge() > p2.getAge()) 
//				{
//					return -1;
//				}
//				return 0;
//			}
//		});
//		
//		for(Player p : lists) 
//		{
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//		
//		Map<Integer,Player> map = new LinkedHashMap<Integer,Player>();
//		map.put(23, p5);
//		map.put(22, p1);
//		map.put(25, p3);
//		map.put(21, p4);
//		map.put(18, p2);
//		System.out.println("================== Map Before Sorting ==============================");
//		for(Map.Entry<Integer, Player> ma : map.entrySet()) 
//		{
//			System.out.print(ma.getKey() + " -- ");
//			System.out.println(ma.getValue());
//		}
//		System.out.println("================== Map After  Sorting ==============================");
//		
//		List<Map.Entry<Integer, Player>> val = new ArrayList<Map.Entry<Integer,Player>>(map.entrySet());
//		
//		Collections.sort(val,new Comparator<Map.Entry<Integer, Player>>() 
//		{
//			public int compare(Entry<Integer,Player> p1,Entry<Integer,Player>p2) 
//			{
//				if(p1.getKey() < p2.getKey()) 
//				{
//					return 1;
//				}
//				else if(p1.getKey() > p2.getKey()) 
//				{
//					return -1;
//				}
//				return 0;
//			}	
//		});
//		
//		for(Entry<Integer,Player> m : val) 
//		{
//			System.out.print("Key = "+m.getKey() + " Value = ");
//			System.out.println(m.getValue());
//		}

		
	}
}
