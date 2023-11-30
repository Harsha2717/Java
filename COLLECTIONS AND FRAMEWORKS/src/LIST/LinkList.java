package LIST;

public class LinkList {
	Node head;
	int size;
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
	
	public void addFirst(String data) 
	{
		Node newNode = new Node(data);
		
		if(head == null) 
		{
			head = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void add(int index ,String data) 
	{
		Node newNode = new Node(data);
		
		if(head == null) 
		{
			head = newNode;
			size++;
			return;
		}
		Node CurrNode = head;
		
		while(CurrNode.next != null) 
		{
			if(index > size) 				{
				System.out.println("Index Goes Out of Bound");
				return;
			}

			for(int i=0;i<index;i++) 
			{
					CurrNode = CurrNode.next;									
			}
		}
		CurrNode.next = newNode;
		size++;
	}

	public void addLast(String data) 
	{
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			size++;
			return;
		}
		Node CurrNode = head;
		
		while(CurrNode.next != null) 
		{
			CurrNode = CurrNode.next;
		}
		CurrNode.next = newNode;
		size++;
	}
	public String printList(int index) 
	{
		Node CurrNode = head;
		if(head == null) 
		{
			return "List is Empty" ;
		}
		if(index>size) 
		{
			return "Index OutOfBound" ;
			
		}
		for(int i=0;i<index;i++) 
		{
			CurrNode = CurrNode.next;
		}
		return CurrNode.data;
	}
	
	
	public void printList() 
	{
		if(head == null) 
		{
			System.out.println("List is Empty");
			
		}
		
		Node CurrNode = head;
		while(CurrNode != null) 
		{
			System.out.print(CurrNode.data + " -> ");
			CurrNode = CurrNode.next;
		}
		System.out.println("null");
		
	}
	
	public void size()
	{
		System.out.println("Size : " + size);
	}

	
	public void remove() 
	{
		if(head == null) 
		{
			System.out.println("The list is Empty");
			return;
		}
		Node newNode = head;
		head = newNode.next;
		newNode = null;
	}
	
	public void remove(int index) 
	{
		if(head == null) 
		{
			System.out.println("The list is Empty");
			return;
		}
		
		Node CurrNode = head;
		Node NewNode = null;
		for(int i=0;i<index;i++) 
		{
			NewNode = CurrNode;
			CurrNode = CurrNode.next;
		}
		NewNode.next = CurrNode.next;
	}
	public static void main(String [] args) 
	{
		LinkList ll = new LinkList();
		
		
		ll.addFirst("Harsha");
		ll.printList();
		
		ll.addLast("Jaanu");
		ll.printList();
		
		
		ll.remove();
		ll.printList();
		
		ll.add(1, "Good");
		ll.printList();
		
		ll.remove(1);
		ll.printList();
	}
}
