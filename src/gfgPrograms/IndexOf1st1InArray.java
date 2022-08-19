package gfgPrograms;
import java.util.*;
public class IndexOf1st1InArray {
	  public static long firstIndex(long arr[], long n)
	    {
	        // Your code goes here
	        int low = 0;
	        int high = (int)n - 1;
	        int res=-1;
	        while(low<=high)
	        {
	            int mid = (low + high)/2;
	            if(arr[mid] == 1)
	            {
	                res = mid;
	                high = mid - 1;
	            }
	            else if(arr[mid] < 1)
	            {
	                low = mid + 1;
	            }
	        }
	        return res;
	    }
	public static void main(String[] args)
	{
		int n = 10;
		long arr[] = {0,0,0,0,0,0,1,1,1,1};
		long result = firstIndex(arr,n);
		System.out.println(result);
	}
}
