package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
	public static void main(String [] args) 
	{
		//This PriorityQueue Sorts the Elements in NaturalOrder AscendingOrder
		Queue<Integer>queue = new PriorityQueue<Integer>();
		
		//When we call a Method Comparator Method the Order is Changed to Reverse
		//Queue<Integer>queue = new PriorityQueue<Integer>(Collections.reverseOrder());
	
		queue.offer(15);
		queue.offer(12);
		queue.offer(98);
		queue.offer(67);
		queue.offer(54);
		
		System.out.println(queue);
		System.out.println(queue.peek());
		
	}
	
}
