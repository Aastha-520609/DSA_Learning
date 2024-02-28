package revision;
import java.util.*;
import java.io.*;

class Node9{
	public int data;
	public Node9 next;
	
	Node9()
	{
		this.data = 0;
		this.next = null;
	}
	
	Node9(int data1)
	{
		this.data = data1;
		this.next = null;
	}
	
	Node9(int data1, Node9 next1)
	{
		this.data = data1;
		this.next = next1;
	}
}
public class sortLL {
	public static int[] linkedListToArray(Node head) {
        List<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
	
	public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

	   public static Node arrayToLinkedList(int[] arr) {
	        Node dummy = new Node(0);
	        Node tail = dummy;
	        for (int num : arr) {
	            tail.next = new Node(num);
	            tail = tail.next;
	        }
	        return dummy.next;
	    }

	    public static void printList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	public static void main(String args[])
	{
		    Node head1 = new Node(1);
	        head1.next = new Node(3);
	        head1.next.next = new Node(5);

	        // Create second sorted linked list: 2 -> 4 -> 6
	        Node head2 = new Node(2);
	        head2.next = new Node(4);
	        head2.next.next = new Node(6);

	        System.out.println("First sorted linked list:");
	        printList(head1);

	        System.out.println("Second sorted linked list:");
	        printList(head2);

	        // Convert linked lists to arrays
	        int[] arr1 = linkedListToArray(head1);
	        int[] arr2 = linkedListToArray(head2);

	        // Merge and sort arrays
	        int[] mergedArray = mergeAndSort(arr1, arr2);

	        // Convert sorted array back to linked list
	        Node mergedHead = arrayToLinkedList(mergedArray);

	        System.out.println("Merged sorted linked list:");
	        printList(mergedHead);
	}

}
