package gfgPrograms;
import java.util.*;

public class insertInMiddleOfLL {
	Node head;
	static class Node 
	{
	    int data;
	    Node next;
	    
	    public Node(int data)
	    {
	        this.data = data;
	        this.next = null;
	    }
	}  
	 public void insertInMid(int data)
	 {
        //Insert code here, return the head of modified linked list
        Node new_node = new Node(data);
        Node curr = head;
        int count = 0;
        //finding total size of linked list
        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        //if no element is in linked list set new node as head;
        if(head == null)
        {
            new_node = head;
        }
        
        Node temp = head;
        int start = 0;
        int end = count - 1;
        int mid = (start + end)/2;
        for(int i=1; i<=mid && temp!=null; i++)
        {
            temp=temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
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
	public static void main(String[] args)
	{
		insertInMiddleOfLL l = new insertInMiddleOfLL();
		
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		
		l.head.next = second;
		second.next = third;
		
		l.insertInMid(3);
		l.printList();	
	}
}
