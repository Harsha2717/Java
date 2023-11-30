package LIST;

public class CustomLinkedList
{
	Node head;
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	//Add_First Element
	public void addFirst(String data) 
	{
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void add(String data) 
	{
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			return;
		}
		Node CurrNode = head;
		while(CurrNode.next !=null) 
		{
			CurrNode = CurrNode.next;
		}
		CurrNode.next = newNode;
	}
	
	public void addLast(String data) 
	{
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			return;
		}
		Node CurrNode = head;
		
		while(CurrNode.next!=null) 
		{
			CurrNode = CurrNode.next;
		}
		CurrNode.next = newNode;
	}
	
	
	public void removeLast() 
	{
		if(head == null) 
		{
			System.out.println("List is Empty");
		}
		
		if(head.next == null) 
		{
			System.out.println("No Node in next ");
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) 
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;		
	}
	public void removeFirst() 
	{
		if(head == null) 
		{
			System.out.println("List is Empty");
		}
		head = head.next;
	
	}

	//printing
	public void printList() 
	{
		if(head == null) 
		{
			System.out.println("List is Empty");
		}
		Node CurrNode = head;
		while(CurrNode!= null) 
		{
			System.out.print(CurrNode.data + "->");
			CurrNode = CurrNode.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String [] args) 
	{
		CustomLinkedList list = new CustomLinkedList();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("List");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.removeLast();
		list.printList();
		list.removeFirst();
		list.printList();	
	}
}