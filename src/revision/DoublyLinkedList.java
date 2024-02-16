package revision;

class newNode{
	public int data;
	public newNode next;
	public newNode back;
	
	newNode()
	{
		this.data = 0;
		this.next = null;
		this.back = null;
	}
	
	newNode(int data1)
	{
		this.data = data1;
		this.next = null;
		this.back = null;
	}
	
	newNode(int data1, newNode next1, newNode back1)
	{
		this.data = data1;
		this.next = next1;
		this.back = back1;
	}
}
public class DoublyLinkedList {
	public static newNode convert2DLL(int[] arr)
	{
		newNode head = new newNode(arr[0]);
		newNode prev = head;
		
		for(int i=1; i<arr.length; i++)
		{
			newNode temp = new newNode(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
	
	public static newNode deleteHead(newNode head)
	{
		if(head == null || head.next == null)
		{
			return null;
		}
		
		head = head.next;
		head.back = null;
		return head;
	}
	
	public static newNode deleteTail(newNode head)
	{
		if(head == null || head.next == null)
		{
			return null;
		}
		
		newNode tail = head;
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		newNode prev = tail.back;
		prev.next = null;
		tail.back = null;
		return head;	
	}
	
	public static newNode deletekthNode(newNode head, int k)
	{
		if(head == null)
		{
			return null;
		}
		
		int count = 0;
		newNode temp = head; //trying to find the kth position
		while(temp != null)
		{
			count++;
			if(count == k)
			{
				break; // it make sure our temp is at a given poistion 
			}
			temp = temp.next;
		}
		newNode prev = temp.back;
		newNode front = temp.next;
		
		if(prev == null && front == null)
		{
			return null;
		}
		
		else if(prev == null)
		{
			return deleteHead(head);
		}
		
		else if(front == null)
		{
			return deleteTail(head);
		}
		prev.next = front;
		front.back = prev;
		temp.back = null;
		temp.next = null;
		return head;
	}
	
	public static void deleteEle(newNode head)
	{
		newNode prev = head.back;
		newNode front = head.next;
		
		if(front == null)
		{
		  prev.next = null;
		  head.back = null;
		  return;
		}
		
		prev.next = front;
		front.back = prev;
		
		head.back = null;
		head.next = null;
	}
	
	public static void traverse(newNode head)
	{
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static newNode insertBeforeHead(newNode head, int val)
	{
		newNode newHead = new newNode(val, head, null);
		head.back = newHead;
		return newHead;		
	}
	
	public static newNode insertBeforeTail(newNode head, int val)
	{
		newNode tail = head;
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		newNode prev = tail.back;
		newNode newMem = new newNode(val, tail, prev);
		prev.next = newMem;
		tail.back = newMem;

		return newMem ;		
	}
	
	public static newNode insertBeforeKthPos(newNode head, int val, int k)
	{
		if( k == 1)
		{
			return insertBeforeHead(head,val);
		}
		newNode temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			if(count == k)
			{
				break;
			}
			temp = temp.next;
		}
		
		newNode prev = temp.back;
		
		newNode value = new newNode(val, temp, prev);
		temp.back = value;
		prev.next = value;
		
		return head;	
	}
	
	public static void insertBeforeEle(newNode node, int val)
	{
		newNode prev = node.back;
		newNode value = new newNode(val, node, prev);
		node.back = value;
		prev.next = value;
		return;	
	}
	
	public static newNode reverse(newNode head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		newNode temp = head;
		newNode previous = null;
		
		while(temp != null)
		{
			previous = temp.back;
			
			temp.back = temp.next;
			temp.next = previous;
			
			temp = temp.back;
		}
		
		return previous.back;
	}
	
	public static void main(String args[])
	{
		int[] arr = {12,8,7,6};
		newNode head = convert2DLL(arr);
		traverse(head);
		
		//head = deleteHead(head);
		//traverse(head);
		
		//head = deleteTail(head);
		//traverse(head);	
		
		System.out.print("List after deletion: ");
		head = deletekthNode(head, 2);
		traverse(head);
		
		System.out.print("List after deletion: ");
		deleteEle(head.next.next);
		traverse(head);
		
		System.out.println("List after insertion before head: ");
		head = insertBeforeHead(head, 10);
		traverse(head);
		
		System.out.println("List after insertion before tail: ");
		head = insertBeforeHead(head, 17);
		traverse(head);
		
		System.out.println("List after insertion before kthPos: ");
		head = insertBeforeKthPos(head, 19, 3);
		traverse(head);
		
		System.out.println("List after insertion before given element: ");
		insertBeforeEle(head.next, 20);
		traverse(head);
		
		System.out.println("List after reverse: ");
		head = reverse(head);
		traverse(head);
	}
}
