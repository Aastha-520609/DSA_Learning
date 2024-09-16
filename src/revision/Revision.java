package revision;
import java.util.*;
public class Revision {
	public static boolean isPalindrome(String s) {
        if(s.isEmpty())
        {
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;  
    }
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);

            if(pq.size() > k){
                pq.remove();
            }
        }
     return pq.peek();
    }
	public static void reverseString(char[] s) {
	       int left = 0;
	       int right = s.length - 1;
	       while(left < right){
	        char temp = s[left];
	        s[left] = s[right];
	        s[right] = temp;

	        left++;
	        right--;
	       }
	    }
	public static void main(String args[]) {
		char[] str = {'h', 'e', 'l','l', 'o'};
		reverseString(str);
		System.out.println(str);
		
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(nums,k));
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}
