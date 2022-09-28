package practicingDataStructure;
import java.util.*;
public class insertion_SLL {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d)
		{
			data = d;
			next = null;
		}
	}
	public void printList()
		{
			Node n = head;
			while(n!=null)
			{
				System.out.print(n.data + " ");
				n = n.next;
			}
		}
	public void insertAtFront(int new_data)
		{
		 //if linked list is empty
			if(head == null)
			  {
				head = new Node(new_data); // first element of linked list
				return;
			  }
			Node new_node = new Node(new_data); //creating new node with new data that is to be inserted
			new_node.next = head; // initiliaze newnode as newnode next is head
			head = new_node; // then make newnode as head
		}
	public void insertAtEnd(int new_data)
	{
		Node new_node = new Node(new_data);
		
		//if linked list is empty
		if(head == null)
		{
			head = new Node(new_data); // first element of linked list
			return;
		}
		//make head as current node inorder to traverse the ll
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = new_node;	
	}
	public void insertAtPos(int new_data, int pos)
	{
		Node new_node = new Node(new_data);
		if(pos == 0)
		{
			new_node.next = head;
			head = new_node;
		}
		
		//Inorder to add any node in between we have to keep track of prev node also 
		// as we will link prev.next to new_node and new_nodenext to the another node(preceding)
		Node prev = head;
		for(int i=0; i<pos-1; i++)
		{
			prev = prev.next;
		}
		new_node.next = prev.next;
		prev.next = new_node;
	}
	public static void main(String[] args)
		{
		  insertion_SLL l = new insertion_SLL();
		  l.head = new Node(2);
		  Node second = new Node(3);
		  Node third = new Node(4);
		  Node fourth = new Node(5);
		  
		  l.head.next = second;
		  second.next = third;
		  third.next = fourth;
		  
		  l.insertAtFront(1);
		  
		  l.insertAtEnd(6);
		  
		  l.insertAtPos(30, 3);
		  
		  l.printList(); 
		}
}
