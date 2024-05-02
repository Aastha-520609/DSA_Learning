package revision;
import java.util.*;
import java.io.*;
public class FruitIntoBaskets {
	public static int findMaxFruits(int []arr, int n) {
        int left = 0,right = 0, maxLen = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(right < arr.length - 1)
        {
            int element = arr[right];
            hmap.put(element, hmap.getOrDefault(element, 0) + 1);
            if(hmap.size() > 2) 
            {
                int val = arr[left];
                hmap.put(val, hmap.get(val) - 1);
                if(hmap.get(val) == 0)
                {
                    hmap.remove(val);
                }
                left++;
            }

            if(hmap.size() <= 2)
            {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
	public static void main(String[] args)
	{
	  int n = 4;
	  int[] arr = new int[] {1, 1, 2, 3};
	  System.out.println(findMaxFruits(arr, n));
	}
}
