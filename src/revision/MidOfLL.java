package revision;
import java.util.*;
import java.io.*;

class Node5{
	public int data;
	public Node5 next;
	
	Node5()
	{
		this.data = 0;
		this.next = null;
	}
	
	Node5(int data1)
	{
		this.data = data1;
		this.next = null;
	}
	
	Node5(int data1, Node5 next1)
	{
		this.data = data1;
		this.next = next1;
	}
}
public class MidOfLL {
	public static Node5 middleNode(Node5 head) {
        Node5 slow = head;
        Node5 fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast =  fast.next.next;
        }
        return slow;
    }
	
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Node5 head = null;
		Node5 tail = null;
		for (int value : list) {
		    Node5 newNode = new Node5(value);
		    if (head == null) {
		        head = newNode;
		        tail = newNode;
		    } else {
		        tail.next = newNode;
		        tail = newNode;
		    }
		}
		System.out.println("Middle node value: " + middleNode(head).data);
	}

}
