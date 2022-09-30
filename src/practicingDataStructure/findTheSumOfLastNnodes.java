package practicingDataStructure;
import java.util.*;

public class findTheSumOfLastNnodes {
	Node head;
	static class Node {
	    int data;
	    Node next;
	    
	    public Node (int data){
	        this.data = data;
	        this.next = null;
	    }
	}
	public int sum(int k){
	      //write code here
	      if(head == null)
	      {
	          return 0;
	      }
	      Node curr = head;
	      int count = 0;
	      while(curr != null)
	      {
	         count++;
	         curr = curr.next;
	      }
	      int x = count - k;
	      int sum = 0;
	      for(int i=0; i<count; i++)
	      {
	          if(i>=x)
	          {
	           sum += head.data;   
	          }
	         head = head.next;
	      }
	      System.out.print(sum);
	      return 0;
	    }
	
	public static void main(String[] args)
	{
		findTheSumOfLastNnodes l = new findTheSumOfLastNnodes();
		l.head = new Node(5);
		Node second = new Node(9);
		Node third = new Node (6);
		Node fourth = new Node (3);
		Node fifth = new Node (4);
		Node sixth = new Node (10);
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		l.sum(3);
	}

}
