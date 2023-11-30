package LIST;

import java.util.LinkedList;

public class LinkedListClass 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		list.addFirst(1);
		System.out.println(list);

		list.addLast(6);
		System.out.println(list);
		
		
		
		}
}
