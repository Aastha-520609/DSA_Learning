package revision;
import java.util.*;
class nNode{
    public int data;
    public nNode next;
   
    nNode()
    {
        this.data = 0;
        this.next = null;
    }
   
    nNode(int data)
    {
        this.data = data;
        this.next = null;
    }
   
    nNode(int data, nNode next)
    {
        this.data = data;
        this.next = next;
    }
}
public class sortZeroOneTwoLL {
	public static nNode sortList(nNode head) {
        // Write your code here
    if (head == null || head.next == null) {
            return head;
        }
    
    nNode dummyZero = new nNode(-1);
    nNode dummyOne = new nNode(-1);
    nNode dummyTwo = new nNode(-1);

    nNode zero = dummyZero;
    nNode one = dummyOne;
    nNode two = dummyTwo;

    nNode temp = head;

    while(temp != null)
    {
        if(temp.data == 0)
        {
            zero.next = temp;
            zero = zero.next; 
        }
        else if(temp.data == 1)
        {
            one.next = temp;
            one = one.next;
        }
        else
        {
            two.next = temp;
            two = two.next;
        }

        temp= temp.next;
    }

    //change the pointer of zero end to the one's first if one exists if not point it to two.
    zero.next = (dummyOne.next != null) ? dummyOne.next : dummyTwo.next;
    //point one to the two if two exists else it will be automatically point to null as dummyTwo
    //will be null if there is no two
    one.next = dummyTwo.next;
    //two will always point to null
    two.next = null;

    return dummyZero.next;
    }
	
	public static void printList(nNode head) {
        nNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
	}
	
	public static void main(String args[])
	{
		nNode nNode7 = new nNode(1);
	    nNode nNode6 = new nNode(2, nNode7);
	    nNode nNode5 = new nNode(0, nNode6);
	    nNode nNode4 = new nNode(1, nNode5);
	    nNode nNode3 = new nNode(2, nNode4);
	    nNode nNode2 = new nNode(0, nNode3);
	    nNode nNode1 = new nNode(1, nNode2);

	   
	    System.out.println("Unsorted List:");
	    printList(nNode1);

	    nNode sortedList = sortList(nNode1);

	    System.out.println("\nSorted List:");
	    printList(sortedList);
	}

}
