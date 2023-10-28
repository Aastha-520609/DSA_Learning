package revision;
import java.util.*;
public class countPairsEqualToK {
	public static int getPairsCount(int[] arr, int n, int k) {
	    HashMap<Integer, Integer> hmap = new HashMap<>();
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	        int ele1 = arr[i];
	        int ele2 = k - arr[i];
	        if (hmap.containsKey(ele2)) {
	            count = count + hmap.get(ele2);
	        }
	        if (hmap.containsKey(ele1)) {
	            hmap.put(ele1, hmap.get(ele1) + 1);
	        } else {
	            hmap.put(ele1, 1);
	        }
	    }
	    return count;
	}
	public static void main(String args[])
	{
		int[] array = {1,5,7,1};
		int k = 6;
		int n = array.length;
		int result = getPairsCount(array,n,k);
		System.out.println(result);
		
	}

}
