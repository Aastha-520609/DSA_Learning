package gfgPrograms;
import java.util.*;
public class largestSubarrayWithSum0 {
	public static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int i = -1;
        int sum = 0;
        int maxlen = 0;
        hmap.put(sum, i);
        while(i < arr.length - 1)
        {
            i++;
            sum = sum + arr[i];
            
            if(!hmap.containsKey(sum))
            {
                hmap.put(sum,i);
            }
            else
            {
                int len = i - hmap.get(sum);
                if(len > maxlen)
                {
                    maxlen = len;
                }
            }
        }
        return maxlen;
    }
	public static void main(String[] args)
	{
		int[] arr = {15,-2,2,-8,1,7,10,23};
		int n = 8;
		System.out.print(maxLen(arr,n));
	}

}
