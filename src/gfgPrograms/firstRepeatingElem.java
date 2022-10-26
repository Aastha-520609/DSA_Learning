package gfgPrograms;
import java.util.*;
public class firstRepeatingElem {
	public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i], 1);
            }
            else
            {
                int count = hmap.get(arr[i]);
                hmap.put(arr[i], count+1);
            }
        }
        for(int i=0; i<n; i++)
        {
            if(hmap.get(arr[i]) > 1)
            {
                return i+1;
            }
        }
        return -1;
    }
	public static void main(String[] args)
	{
		int[] arr = {1, 5, 3, 4, 3, 5, 6};
		int n = 7;
		System.out.print(firstRepeated(arr,n));
	}
}
