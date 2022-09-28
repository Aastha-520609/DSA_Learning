package practicingDataStructure;
import java.util.*;
public class deletion_SLL {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void printList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public void deleteAtFirst()
	{
		if(head == null)
		{
			System.out.print("List is Empty");
		}
		head = head.next;
	}
	public void deleteAtLast()
	{
		if(head == null)
		{
			System.out.print("List is Empty");
		}
		
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node secondlast = head;
		Node last = head.next;
		while(last.next != null)
		{
			last = last.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
	}
	public static void main(String[] args)
	{
		deletion_SLL l = new deletion_SLL();
		
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
	    
		l.deleteAtFirst();
		l.deleteAtLast();
		l.printList();	
	}
}
