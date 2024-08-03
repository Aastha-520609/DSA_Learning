package revision;
import java.util.*;
public class CountElements {
	 public static int maxFrequencyElements(int[] nums) {
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	        int maxFreq = 0;
	        for(int num: nums){
	            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
	            maxFreq = Math.max(maxFreq, hmap.get(num));
	        }

	        int res = 0;
	        for(int key : hmap.keySet()){
	           if(hmap.get(key) == maxFreq){
	              res += hmap.get(key);
	           }
	        }

	        return res;
	    }
	 public static void main(String args[]) {
		 int[] arr = {1,2,2,3,1,4};
		 int res = maxFrequencyElements(arr);
		 System.out.println(res);
	 }
}
