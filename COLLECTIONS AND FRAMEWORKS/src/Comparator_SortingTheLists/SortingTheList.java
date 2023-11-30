package Comparator_SortingTheLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingTheList 
{
	public static void main(String[] args) 
	{
		List<String> animals = new ArrayList<String>();
		animals.add("Zebra");
		animals.add("Fox");
		animals.add("Rabbit");
		animals.add("Elephant");
		animals.add("Wolf");
		
		//Before Sorting
		System.out.println(animals);
		
		///////////Using the Collections.sort the Basic sorter////////////
		
		//Collections.sort(animals);
		//System.out.println(animals);
		
		
		//Sorting the List by a Custom Comparator method implemeting using the Interface Comparator
		
		Collections.sort(animals,new sortAlphabetical());
	
		System.out.println(animals);
		
		//Sorting the List according to the Length of the String Custom Implementation
		Collections.sort(animals,new Comparator<String>() 
		{
			public int compare(String s1,String s2) 
			{
				if(s1.length() > s2.length()) 
				{
					return 1;
				}
				else if(s1.length() < s2.length()) 
				{
					return -1;
				}
				return 0;
			}
		});
		System.out.println(animals);
		
		//ReverseSorting by String length
		
		Collections.sort(animals,new revsortbystringLength());
		System.out.println(animals);
	
		
		System.out.println("\n=========== Integers =============\n");
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(134);
		numbers.add(123);
		numbers.add(312);
		numbers.add(6609);
		numbers.add(78);
		numbers.add(23);
		
		
		System.out.println(numbers);
		
		//Sorting in Ascending Order
		Collections.sort(numbers);
		
		System.out.println(numbers);

		//Sorting in Descending Order
		Collections.sort(numbers,new DescendingOrder());
		System.out.println(numbers);
		
		//
		
	}
	
	

}

class sortbystringLength implements Comparator<String>
{
	@Override
	public int compare (String s1,String s2) 
	{
		
		
		if(s1.length()>s2.length()) 
		{
			return 1;
		}else if(s1.length() < s2.length()) 
		{
			return -1;
		}
		return 0;
		
	}
}

class sortAlphabetical implements Comparator<String>
{
	@Override
	public int compare(String one,String two)
	{
		return one.compareTo(two);
	}
	
}


class revsortbystringLength implements Comparator<String>
{
	@Override
	public int compare (String s1,String s2) 
	{
		if(s1.length() < s2.length()) 
		{
			return 1;	
		}
		else if(s1.length() > s2.length()) 
		{
			return -1;
		}
		return 0;
	}
}

class DescendingOrder implements Comparator<Integer>
{
	@Override
	public int compare(Integer a,Integer b) 
	{
		/*
		if(a < b) 
		{
			return 1;
		}
		else if(a > b) 
		{
			return -1;
		}
		return 0;
		*/
		
		//OR//
		
//		ascending Order
//		return Integer.compare(a, b);
		
//		descending Order
		return -Integer.compare(a, b);
	}
}