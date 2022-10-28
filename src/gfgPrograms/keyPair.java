package gfgPrograms;
import java.util.*;
public class keyPair {
	public static int hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
       HashMap<Integer, Integer> hmap = new HashMap<>();
       for(int i=0; i<n; i++)
       {
           int ele = x - arr[i];
           if(hmap.containsKey(ele))
           {
              return 1;
           }
           else
           {
               hmap.put(arr[i],1);
           }
       }
       return 0;
    }
	public static void main(String[] args)
	{
	  int[] arr = {1, 4, 45, 6, 10, 8};
	  int n = arr.length;
	  int x = 18;
	  System.out.print(hasArrayTwoCandidates(arr,n,x));
	}
}
