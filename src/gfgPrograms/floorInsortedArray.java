package gfgPrograms;
import java.util.*;
public class floorInsortedArray {
	public static int findFloor(long arr[], int n, long x)
	    {
	        int ans = -1;
	        int l = 0;
	        int r = n - 1;
	        while(l<=r)
	        {
	          int mid = (l+r)/2;
	          if(arr[mid] <= x)
	          {
	            ans = mid;
	            l = mid + 1;
	          }
	          else
	          {
	              r = mid - 1;
	          }
	        }
	        return ans;
	    }
	public static void main(String[] args)
	{
		long[] arr = {1,2,8,10,11,12,19};
		int n = 7;
		long x = 5;
		System.out.print(findFloor(arr,n,x));
	}

}
