package gfgPrograms;
import java.util.*;
public class maxRepeatingNumber {
	public static int maxRepeating(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            if(hmap.containsKey(arr[i]))
            {
               int currf = hmap.get(arr[i]);
               int nextf = currf + 1;
               hmap.put(arr[i],nextf);
            }
            else
            {
                hmap.put(arr[i],1);
            }
        }
        Arrays.sort(arr);
        int maxf = -1;
        int min = 0;
        for(Integer key: hmap.keySet())
        {
            if(hmap.get(key) > maxf)
            {
                maxf = hmap.get(key);
            }
        }
        for(int i=0; i<n; i++)
        {
            if(hmap.get(arr[i]) == maxf)
            {
                min = arr[i];
                break;
            }
        }
        return min;
    }
	public static void main(String[] args)
	{
	  int[] arr = {2, 2, 1, 0, 0, 1};
	  int n = 6;
	  int k = 3;
	  System.out.print(maxRepeating(arr,n,k));
	}
}
