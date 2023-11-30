package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorMain {
	public static void main(String [] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
	
		System.out.println();
		
		Iterator<String> it = list.iterator(); 
		while(it.hasNext()) 
		{
			String iter = it.next();
			System.out.print(iter + " ");
			
			if(iter.equals("g")) 
			{
				it.remove();
				System.out.print(iter + " ");
			}
		}
		System.out.println("\n"+list);
		
		//// Using ForEach Loop After Java 5 
		System.out.println();
		for(String s : list) 
		{
			System.out.print (s + " ");
		}
		System.out.println();
	
			}
	
	
}
