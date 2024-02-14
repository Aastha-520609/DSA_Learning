package revision;

class Node{
	public int data;
	public Node next;
	
	Node()
	{
		this.data = 0;
		this.next = null;
	}
	
	Node(int data1)
	{
		this.data = data1;
		this.next = null;
	}
	
	Node(int data1, int next1)
	{
		this.data = data1;
		this.next = next1;
	}
}

public class SinglyLinkedList {
	public static Node convert2LL(int arr[])
	{
		Node head = new Node(arr[0]);
		Node mover = head; 
		
		for(int i=1; i<arr.length; i++)
		{
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}
	
	public static void traverse(Node head)
	{
		//Traverse to the linked list
		Node temp = head; //because we can move head itself, so we declare temp as head and perform operations on temp.
				
		System.out.print("Elements of the LL are: ");
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static int lengthLL(Node head)
	{
		int count = 0;
		Node temp = head;
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public static boolean presenceOfEle(Node head, int val)
	{
		Node temp = head;
		
		while(temp != null)
		{
			if(temp.data == val)
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static Node deleteAtFirst(Node head)
	{
		if(head == null)
		{
			return head;
		}
		
		head = head.next;
		return head;
	}
	
	public static Node deleteAtLast(Node head)
	{
		if(head == null || head.next == null)
		{
			return null;
		}
		
		Node temp = head;
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public static Node deleteKthPos(Node head, int k)
	{
		if(head == null)
		{
			return head;
		}
		
		if(k == 1)
		{
			head = head.next;
			return head;
		}
		
		Node temp = head;
		Node prev = null;
		int count = 0;
		while(temp != null)
		{
			count++;
			if(count == k)
			{
				prev.next = prev.next.next;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return head;
	}
	
	public static Node deleteEle(Node head, int ele)
	{
		if(head == null)
		{
			return head;
		}
		
		if(head.data == ele)
		{
			head = head.next;
			return head;
		}
		
		Node temp = head;
		Node prev = null;
		while(temp != null)
		{
			if(temp.data == ele)
			{
				prev.next = prev.next.next;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
	public static Node insertHead(Node head, int val)
	{
		Node temp = new Node(val);
		temp.next = head;
		head = temp;
		return head;	
	}
	
	public static Node insertTail(Node head, int val)
	{
		if(head == null)
		{
			return new Node(val);
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		Node newNode = new Node(val);
		temp.next = newNode;
		return head;
	}
	
	public static Node insertAtPos(Node head, int ele, int k)
	{
		if(head == null)
		{
			if(k == 1)
			{
				return new Node(ele);
			}
		}
		
		if( k == 1)
		{
			Node temp = new Node(ele);
			temp.next = head;
			head = temp;
			return head;
		}
		
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			if(count == (k-1))
			{
				Node newNode = new Node(ele);
				newNode.next = temp.next; //at first we link the new node with its precceding node then substitue the value;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static Node insertBeforeVal(Node head,int ele, int val)
	{
		if(head == null)
		{
			return null;
		}
		
		if(head.data == val)
		{
			return new Node(val);
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			if(temp.next.data == val)
			{
				Node newNode = new Node(ele);
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static void main(String args[])
	{
		int[] arr = {12,3,4,5};
		Node head = convert2LL(arr);
		System.out.println("Head of the Linked list is: " + head.data);
		
		traverse(head);
		
	    System.out.println();
		System.out.println("Length of the Linked List is: "+ lengthLL(head));
		
		int val = 5;
		System.out.println(presenceOfEle(head,val));
		
		//Printing the ll after deletion of the first elem
		//head = deleteAtFirst(head); 
		//traverse(head);
		
		//head = deleteAtLast(head);
		//System.out.println();
		//traverse(head);
		
		head = deleteKthPos(head, 2);
		System.out.println("After deletion: ");
		traverse(head);
		
		head = deleteEle(head,12);
		head = deleteEle(head,4);
		head = deleteEle(head,5);
		System.out.println();
		System.out.println("After deletion: ");
		traverse(head);
		
		head = insertHead(head,10);
		head = insertHead(head,11);
		head = insertHead(head,12);
		System.out.println();
		System.out.println("After inserting head: ");
		traverse(head);
		
		head = insertTail(head, 9);
		System.out.println();
		System.out.println("After inserting Tail: ");
		traverse(head);
		
		head = insertAtPos(head, 16, 4);
		System.out.println();
		System.out.println("After inserting Tail: ");
		traverse(head);
		
		head = insertBeforeVal(head, 6, 10);
		System.out.println();
		System.out.println("After inserting Tail: ");
		traverse(head);
		
	}
}
