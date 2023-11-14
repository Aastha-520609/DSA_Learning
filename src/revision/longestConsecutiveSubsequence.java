package revision;
import java.util.*;
import java.io.*;

public class longestConsecutiveSubsequence {
	 public static int longestSuccessiveElements(int []a) {
	        // Write your code here.
	        int n = a.length;

	        HashMap<Integer,Boolean> map = new HashMap<>();

	        //placing true as they all can be starting point of subsequence
	        for(int i=0; i<n; i++)
	        {
	            map.put(a[i], true);
	        }

	        //making false to the those value whose lesser elem is present in the map, as it cannot be the starting poiint
	        for(int i=0; i<n; i++)
	        {
	            int res = a[i] - 1;
	            if(map.containsKey(res))
	            {
	                map.put(a[i], false);
	            }
	        }

	        int maxLength = 0;

	        for(int i=0; i<n; i++)
	        {
	            int tempLength = 1;
	            int tempStartPoint = a[i];
	            //if the successor of starting point is present in map, we increment the templength that is counter.
	            while(map.containsKey(tempStartPoint + tempLength))
	            {
	                tempLength++;
	            }

	            if(tempLength > maxLength)
	            {
	                maxLength = tempLength;
	            }
	        }

	        return maxLength;
	    }
	 
	public static void main(String args[])
	{
	    int[] array = {101,1,2,5,102,3,103,4};
	    System.out.println(longestSuccessiveElements(array));
	}
}
