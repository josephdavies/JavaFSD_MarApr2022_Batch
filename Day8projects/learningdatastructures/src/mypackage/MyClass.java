package mypackage;

class Node
{
	public int data;
	public Node next;
}

class SinglyLinkedList
{
	private Node head;
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertFirst(int data)
	{
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int data)
	{
		Node newNode = new Node();
		newNode.data=data;
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
				current=current.next;
			
			current.next=newNode;			
		}
		
	}
	
	public void printLinkedList()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}		
	}
	
	public void deleteFirst()
	{
		head=head.next;
	}
	
	public void deleteLast()
	{
        if (head.next == null) 
        {
            head=head.next;
        }
        else
        {
	     // Find the second last node
	        Node current = head;
	        while (current.next.next != null)
	            current = current.next;
	 
	        // Change next of second last
	        current.next = null;
        }
	}
	
	public int size()
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
}


public class MyClass 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList data = new SinglyLinkedList();
		data.insertLast(75);
		System.out.println(data.isEmpty());
		data.insertFirst(10);
		data.printLinkedList();
		data.insertLast(54);
		data.insertLast(27);
		data.insertLast(44);
		data.printLinkedList();
		
		data.deleteFirst();
		data.deleteLast();
		System.out.println("\n");
		data.printLinkedList();
		
		System.out.println(data.size());
		

	}
}