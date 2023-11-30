package LIST;

class LinkedListClassPractise<T> {
		Node head;
		Node tail;
		int size = 0;
	
	class Node
	{
		T data;
		Node next;
		Node prev;
		Node(T data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void addFirst(T data) 
	{
		Node node = new Node(data);
		
		if(head == null) 
		{
			head = node;
			tail = node;
			size++;
			return;
		}
		
		node.next = head;
		head.prev = node.prev;
		head = node;
		head.prev = null;
		size++;
	}
	public void addLast(T data) 
	{
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		Node currNode = head;
		
		while(currNode.next != null) 
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
		newNode.prev = currNode;
		tail = newNode;
		size++;
	}
	
	public void print() 
	{
		if(head == null) 
		{
			System.out.println("Empty Linked List");
			return;
		}
		Node currNode = head;
		
		while(currNode != null) 
		{
			System.out.print(currNode.data +" -> ");
			currNode = currNode.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	
	public void remove() 
	{
		if(head == null) 
		{
			System.out.println("Empty");
			return;
		}
		head = head.next;
		size--;
	}
	
	public void removeLast() 
	{
		if(head == null) 
		{
			System.out.println("Empty");
			return;
		}
		Node SecondLast = head;
		Node Last = head.next;
		while(Last.next != null) 
		{
			Last = Last.next;
			SecondLast = SecondLast.next;
		}
		SecondLast.next = null;
		size--;
	}
	
	public void remove(int index) 
	{
		Node currNode = head;
		
		if(currNode != null ) 
		{
			if(head == null) 
			{
				System.out.println("Empty");
				return ;
			}
			
			if(index == 0) 
			{
				head = head.next;
				size--;
				return;
			}
			
			for(int i=0;i<index-1;i++)
			{
				currNode = currNode.next;								
			}
			currNode.next = currNode.next.next;
			size--;
		}
		else if(currNode == null || currNode.next == null)
		{
			System.out.println("Index out of bounds");
			return;
		}
	
	}
	
	public void length() 
	{
		if(size == 0) 
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println(size);
	}
}

public class DLL
{
	public static void main(String [] args) 
	{
		LinkedListClassPractise<Integer> LL = new LinkedListClassPractise<Integer>();
        LL.addFirst(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.print(); // Expected output: 10 -> 20 -> 30 -> Null

        // Test removing elements
        LL.remove();
        LL.print(); // Expected output: 20 -> 30 -> Null
        LL.removeLast();
        LL.print(); // Expected output: 20 -> Null
        LL.remove(0);
        LL.print(); // Expected output: Empty Linked List
        LL.length();

        LL.addLast(40);
        LL.addLast(40);
        LL.addLast(40);
        LL.addLast(40);
        LL.addFirst(50);
        LL.print(); // Expected output: 50 -> 40 -> Null

        // Test removing from an empty list and out-of-bounds index
        LL.remove(); // Should print "Empty"
        LL.length();
        // Test adding and removing multiple elements
//        LL.addFirst(60);
//        LL.addLast(70);
//        LL.addLast(80);
//        LL.print(); // Expected output: 60 -> 50 -> 40 -> 70 -> 80 -> Null
//        LL.remove(1);
//        LL.remove(3);
//        LL.print(); // Expected output: 60 -> 40 -> 70 -> Null
	}
}
