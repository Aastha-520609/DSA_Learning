package collectionFramework;
import java.util.ArrayDeque;
public class LearnDeque {
	public static void main(String args[])
	{
                //Learning array deque
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(23);
		adq.offerFirst(67);
		adq.offerLast(45);
		adq.offer(56);
		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.poll());
		System.out.println(adq);
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
	}

}
