package revision;
import java.util.*;
public class NormalQueue {
	public static class CustomQueue{
		int[] data;
		int front;
		int size;
		
		public CustomQueue(int cap) {
			data = new int[cap];
			front = 0;
			size = 0;
		}
		
		int size()
		{
			return size;
		}
		
		void add(int val)
		{
			if(size == data.length) 
			{
				System.out.println("Queue Overflow");
			}
			else
			{
				int rear = (front + size) % data.length;
				data[rear] = val;
				size++;
			}
		}
		
		int remove()
		{
			if(size == 0) 
			{
				System.out.println("Queue Underflow");
				return -1;
			}
			else
			{
				int val = data[front];
				front = (front + 1) % data.length;
				size--;
				return val;
			}
		}
		
		int peek()
		{
			if(size == 0)
			{
				System.out.println("Queue Underflow");
				return -1;
			}
			else
			{
				return data[front];
			}
		}
		
		void display()
		{
			for(int i=0; i<data.length; i++) {
				int idx = (front + i) % data.length;
				System.out.println(data[idx] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CustomQueue q = new CustomQueue(n);
		
        System.out.println("Adding elements 10, 20, 30 to the queue...");
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Displaying queue:");
        q.display();

        System.out.println("Front element is: " + q.peek());

        System.out.println("Removing front element: " + q.remove());
        System.out.println("Displaying queue after removal:");
        q.display();

        System.out.println("Queue size is: " + q.size());

        System.out.println("Testing queue overflow by adding more elements...");
        q.add(40);
        q.add(50);
        q.add(60);

        System.out.println("Removing all elements to test underflow...");
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();	
	}
}
