package LIST;

public class DoublyLinkedList 
{
	Node head;
	Node tail;
	private int size;
	
	class Node
	{
		String data;
		Node next;
		Node prev;
	
		Node(String data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void addFirst(String data) 
	{
		Node newNode = new Node(data);
		
		if(head == null) 
		{
			head = newNode;
			tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode.prev;
		head = newNode;
		head.prev = null;	////////////////////////////////
	}
	
	public void print() 
	{
		Node CurrNode = head;
		Node PrevNode = tail;

		if(head == null) 
		{
			System.out.println("Empty");
			return;
		}
		
		
		 while(CurrNode !=null) 
		{
			System.out.print(CurrNode.data + " -> ");
			CurrNode = CurrNode.next;
		}
		System.out.println("null");
		
		while(PrevNode !=null) 
		{
			System.out.print(PrevNode.data + " <- ");
			PrevNode = PrevNode.prev;
		}
		System.out.println("null");
	}
	
	void print(int index) 
	{
		if(index<0 || index<size) 
		{
			System.out.println("Invalid");
		}
		Node CurrNode = head;
	
		for(int i=0;i<index;i++) 
		{
			CurrNode = CurrNode.next;
		}
		System.out.println(CurrNode.data);
	}
	
	void printBeforeandAfter(int index) 
	{
		if(index<0 || index<size) 
		{
			System.out.println("Invalid");
		}
		Node CurrNode = head;
		Node PrevNode = null;
		Node NextNode = null;
		
		
		for(int i=0;i<index;i++) 
		{
			PrevNode = CurrNode;
			CurrNode = CurrNode.next;
			NextNode = CurrNode.next;
			System.out.print("PrevNode : " + PrevNode.data + " : ");			
			System.out.print("CurrNode : " + CurrNode.data + " : ");
			System.out.print("NextNode : " + NextNode.data + " : ");
			System.out.println();
		}
		System.out.println(PrevNode.data + " == " + NextNode.data);
	}
	
	public static void main(String[] args) 
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst("Harsha");
		dll.addFirst("Sirisha");
		dll.addFirst("Jaanu");
		dll.addFirst("Vaishu");
		dll.addFirst("Vaibu");
		dll.addFirst("Sindhu");
		dll.printBeforeandAfter(3);
		
		
	}
}
