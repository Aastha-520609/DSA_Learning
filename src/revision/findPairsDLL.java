package revision;
import java.util.*;

class newNode1 {
    public int data;
    public newNode1 next;
    public newNode1 back;

    newNode1() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }

    newNode1(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    newNode1(int data1, newNode1 next1, newNode1 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
}
public class findPairsDLL {
	public static newNode1 findTail(newNode1 head) {
        newNode1 tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public static void findPairs(newNode1 head, int target) {
        newNode1 left = head;
        newNode1 right = findTail(head);

        while (left.data < right.data) {
            int sum = left.data + right.data;
            if (sum == target) {
                System.out.println("Pair found: (" + left.data + ", " + right.data + ")");
                left = left.next;
                right = right.back;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.back;
            }
        }
    }

    public static void main(String args[]) {
        // Create a sample doubly linked list
        newNode1 head = new newNode1(1);
        head.next = new newNode1(2);
        head.next.back = head;
        head.next.next = new newNode1(3);
        head.next.next.back = head.next;
        head.next.next.next = new newNode1(4);
        head.next.next.next.back = head.next.next;

        int target = 5;
        findPairs(head, target);
    }
}
