package gfgPrograms;
import java.util.*;
public class countPairsWithGivenSum {
	 public static int getPairsCount(int[] arr, int n, int k) {
	        // code here
	        HashMap<Integer,Integer> hmap = new HashMap<>();
	        int count = 0;
	        for(int i=0; i<n; i++)
	        {
	            int ele1 = arr[i];
	            int ele2 = k - arr[i];
	            if(hmap.containsKey(ele2))
	            {
	              count = count + hmap.get(ele2);  
	            }
	            if(hmap.containsKey(ele1))
	            {
	               hmap.put(ele1, hmap.get(ele1)+1);
	            }
	            else
	            {
	                hmap.put(ele1,1);
	            }
	        }
	      return count;
	    }
	public static void main(String[] args)
	{
	 int[] arr = {0,0,0,3,3};
	 int n = arr.length;
	 int k = 3;
	 System.out.print(getPairsCount(arr,n,k));
	}

}
