package revision;
import java.util.*;
import java.io.*;
class ListNode {
	      public int data;
	      public ListNode next;
	      ListNode() {}
	      ListNode(int data) { this.data = data; }
	      ListNode(int data, ListNode next) { this.data = data; this.next = next; }
	  }
public class deleteNthNodeFromTail {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head; 
        }

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<n; i++)
        {
            fast = fast.next;
        }

        if(fast == null)
        {
            return head.next;
        }

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode deleteNode = slow.next;
        slow.next = slow.next.next;

        return head;
    }
	
	public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
	}
	
	public static void main(String args[])
	{
		ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("List:");
        printList(node1);
        
        // Remove 2nd node from the end
        int n = 2;
        System.out.println("After Deletion: ");
        ListNode updatedList = removeNthFromEnd(node1, n);
        printList(updatedList);
		
	}

}
