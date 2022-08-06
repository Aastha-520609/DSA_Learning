package collectionFramework;
import java.util.Queue;
import java.util.PriorityQueue;
public class LearnPriorityQueue {
	public static void main(String args[])
	{
		Queue<Integer> pq = new PriorityQueue<>();
		//adding elements in the queue
		pq.offer(23);
		pq.offer(20);
		pq.offer(34);
		pq.offer(45);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}
