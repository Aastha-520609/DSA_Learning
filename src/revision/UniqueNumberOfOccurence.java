package revision;
import java.util.*;
public class UniqueNumberOfOccurence {
	public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1); 
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int val: hmap.values())
        {
            set.add(val);
        }
        
        return hmap.size() == set.size();
    }
    public static void main(String args[]) {
    	int[] arr = {1,2,2,1,1,3};
    	System.out.println(uniqueOccurrences(arr));
    }
}
