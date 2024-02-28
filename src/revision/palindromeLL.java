package revision;
import java.util.*;
import java.io.*;

class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }

public class palindromeLL {
	 public static boolean isPalindrome(ListNode1 head) {
	        ListNode1 temp = head;
	        Stack<Integer> st = new Stack<Integer>();
	        while(temp != null)
	        {
	            st.push(temp.val);
	            temp = temp.next;
	        }

	        temp = head;
	        while(temp != null)
	        {
	            if(st.pop() != temp.val)
	            {
	                return false;
	            }
	            temp = temp.next;
	        }
	        return true;
	        
	    }
	public static void main(String[] args) {
	    ListNode1 head = new ListNode1(1);
	    head.next = new ListNode1(2);
	    head.next.next = new ListNode1(3);
	    head.next.next.next = new ListNode1(4);
	    
	    System.out.println("Output: " +isPalindrome(head));
	}
}
