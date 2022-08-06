package collectionFramework;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;
public class LearnStack {
	public static void main(String args[])
	{
		//Stack Framework
				/*Stack<String> animals = new Stack<>();
				
				animals.push("Lion");
				animals.push("Dog");
				animals.push("Horse");
				animals.push("Cat");
				
				System.out.println(animals);
				//Peek is used to get the element at the top
				System.out.println(animals.peek());
				//pop is used to delete the element at the top
				animals.pop();
				System.out.println(animals);*/
		
		//Queue Framework
		//Queue is an interface which can be implemented by ArrayList, linkedlist, priority queue
		Queue<Integer> queue = new LinkedList<>();
		//offer and and are used to add elements in the queue;
		queue.offer(12);
		queue.offer(14);
		queue.offer(30);
		System.out.println(queue);
		//poll and remove is used to remove the first element of the queue;
		queue.poll();
		System.out.println(queue);
		//peek and element is used to get the element which is in top
		System.out.println(queue.peek());
		
	}

}
