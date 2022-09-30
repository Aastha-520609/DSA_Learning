package practicingDataStructure;
import java.util.*;
public class Insertion_DLL {
	Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}
	public void insertAtFront(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
		{
			head.prev = new_node;
		}
		head = new_node;
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
	public static void main(String[] args)
	{
		Insertion_DLL l = new Insertion_DLL();
		
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		l.head.next = second;
		second.next = third;
		
		l.insertAtFront(0);
		l.printList();
		
	}

}
