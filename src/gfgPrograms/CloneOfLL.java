package gfgPrograms;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CloneOfLL {
	public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while(curr != null){
            curr.next = newCurr.next;
            curr = curr.next;
            if(curr != null){
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }
	
	public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("Node val: " + curr.val + ", Random val: ");
            if (curr.random != null) {
                System.out.print(curr.random.val);
            } else {
                System.out.print("null");
            }
            System.out.println();
            curr = curr.next;
        }
    }
	
	public static void main(String[] args) {
        CloneOfLL cloneOfLL = new CloneOfLL();

        // Create nodes
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        // Set next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Set random pointers
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        // Print original list
        System.out.println("Original list:");
        printList(node1);

        // Copy the list with random pointers
        Node copiedList = cloneOfLL.copyRandomList(node1);

        // Print copied list
        System.out.println("\nCopied list:");
        printList(copiedList);
    }
}
