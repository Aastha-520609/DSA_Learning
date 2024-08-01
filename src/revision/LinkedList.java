package revision;
class Node{
	int data;
	Node next;
	
	Node(){
		this.data = 0;
		this.next = null;
	}
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}
public class LinkedList {
	
	public static Node convert2LL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	public static void main(String args[]) {
		int[] arr = {12,5,6,8};
		LinkedList list = new LinkedList();
		Node head = list.convert2LL(arr);
		System.out.println(head.data);
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
