package revision;
import java.util.*;
public class KthLargestElementInStream {
	public static int K;
    public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    public static void KthLargest(int k, int[] nums) {
        K = k;
        for(int num: nums){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        } 
    }
    
    public static int add(int val) {
        pq.add(val);
        if(pq.size() > K){
            pq.poll();
        }
        return pq.peek();
    }
    
    public static void main(String[] args) {
        // Example input
        int k = 3;
        int[] nums = {4, 5, 8, 2};

        // Initialize KthLargest object
        KthLargest(k, nums);

        // Test add method and print the kth largest element
        System.out.println(add(3)); // Output should be 4
        System.out.println(add(5)); // Output should be 5
        System.out.println(add(10)); // Output should be 5
        System.out.println(add(9)); // Output should be 8
        System.out.println(add(4)); // Output should be 8
    }

}
