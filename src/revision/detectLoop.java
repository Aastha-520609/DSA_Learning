package revision;
import java.util.*;
import java.io.*;

class Nodemon {
    public int data;
    public Nodemon next;
   
    Nodemon()
    {
        this.data = 0;
        this.next = null;
    }
   
    Nodemon(int data)
    {
        this.data = data;
        this.next = null;
    }
   
    Nodemon(int data, Nodemon next)
    {
        this.data = data;
        this.next = next;
    }
}
public class detectLoop {
	public static boolean hasCycle(Nodemon head) {
        Nodemon slow = head;
        Nodemon fast = head;
        while(fast != null && fast.next != null)
        {
          slow = slow.next;
          fast = fast.next.next;

          if(slow == fast)
          {
              return true;
          }  
        } 
        return false; 
    }
	 public static boolean detectCycle(Nodemon head) {
	        //Your code goes here
	        HashMap<Nodemon, Integer> hmap = new HashMap<>();
	        Nodemon temp = head;
	        while(temp != null)
	        {
	            if(hmap.containsKey(temp))
	            {
	                return true;
	            }
	            else
	            {
	                hmap.put(temp, 1);
	            }
	            temp = temp.next;
	        }
	        return false;
	    }
	 
	public static void main(String args[])
	{
		    Nodemon Nodemon1 = new Nodemon(1);
		    Nodemon Nodemon2 = new Nodemon(2);
		    Nodemon Nodemon3 = new Nodemon(3);
		    Nodemon Nodemon4 = new Nodemon(4);
		    
		    // Create the linked list: 1 -> 2 -> 3 -> 4 -> null
		    Nodemon1.next = Nodemon2;
		    Nodemon2.next = Nodemon3;
		    Nodemon3.next = Nodemon4;
		    // Uncomment the below line to create a cycle for testing
		    Nodemon4.next = Nodemon2;
		    
		    // Testing for cycle detection
		   // boolean hasCycle = detectCycle(Nodemon1);
		    boolean hasCycle = hasCycle(Nodemon1);
		    if (hasCycle) {
		        System.out.println("The linked list has a cycle.");
		    } else {
		        System.out.println("The linked list does not have a cycle.");
		    }
	}
}
