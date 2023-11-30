package Queue;
import java.util.LinkedList;
import java.util.Queue;
/*
 * The Queue is a DataStructure that supports the FIFO 
 * Queue contains a head and a tail
 * head is the first element and tail is last element
 * the Queue has multiple methods where some methods
  
 	///////Set 1//////

 * add() -> add element to end of Queue and throws IllegalStateException when Queue is Full
 * remove() -> removes the head element and when Queue is Empty then it throws NoSuchElementException
 * element() -> Shows the Head Element as Output and when empty then throws NoSuchElementException
  
  /////////Set 2 ////////
   
 * offer() -> Add element to end of Queue and Doesnt Throw any Exception
 * poll()  -> Removes the head element and when Queue is Empty no Exception is thrown
 * peek()  -> Shows the Head Element as Output when Queue is Empty no Exception is thrown.

 
 */
public class QueueMain {
	public static void main(String [] args) 
	{
		//Queue<String> queue = new ArrayBlockingQueue<String>(3);
		Queue<String> queue = new LinkedList<String>();

		System.out.println("=============- Using Set1 Methods -===============\n");
		//Using Set1 Methods
		
		//Add Element at Tail
		queue.add("Harsha");
		queue.add("Sirisha");
		queue.add("Vaibu");
		queue.add("Sindhu");
		queue.add("Jaanu");
		
		System.out.println(queue);
		
		//Remove Element 
		//Removes Head
		//Throws NoSuchElementException when we try to remove elements more than the Size of queue
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();

		//Element() gives the Head element in the queue
		while(!queue.isEmpty()) 
		{
			System.out.println(queue.element());
			queue.remove();
		}
		System.out.println(queue);
		
		System.out.println("\n=============- Using Set2 Methods -===============\n");
		//This Set methods throws the RunTime Exceptions hence we can use the another methods like
		//offer() -> add()
		//poll() -> remove()
		//peek() -> element()
		
		queue.offer("Harsha");
		queue.offer("Sirisha");
		queue.offer("Vaibu");
		queue.offer("Sindhu");
		queue.offer("Jaanu");
		
		System.out.println(queue);
		
		
		//peek() is Used to see the Head elements 
		System.out.println(queue.peek());
		
		
		
		//poll() is used to remove head elements and when the queue is empty it doesnt throw any error instead
		//shows null
		
		queue.poll();
		System.out.println(queue);
		while(!queue.isEmpty()) 
		{
			System.out.println(queue.peek());
			queue.poll();
		}
		System.out.println(queue);
		//Even after the Queue is Empty when we call the method it doesnt throw any error
		queue.poll();	
		System.out.println(queue);
	}
}
