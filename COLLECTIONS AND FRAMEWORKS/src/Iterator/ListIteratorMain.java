package Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMain 
{
	public static void main(String [] args) 
	{
		List<String>Animals = new LinkedList<>();
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Fox");
		Animals.add("pig");
		Animals.add("Donkey");
		Animals.add("Zebra");
		
		System.out.println(Animals);
		System.out.println();
		
		ListIterator<String> it = Animals.listIterator();
		
		while(it.hasNext()) 
		{
			if(it.next().equalsIgnoreCase("Dog")) 
			{
				it.remove();
				it.add("DOGGY");			
			}
		}
		
		while(it.hasPrevious()) 
		{
			String s = it.previous();
			System.out.print(s +  " ");
		}
		
		System.out.println();
		System.out.println("\n"+Animals);
		System.out.println();
	}
}
