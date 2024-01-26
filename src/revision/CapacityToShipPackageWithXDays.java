package revision;
import java.util.*;
import java.io.*;
public class CapacityToShipPackageWithXDays {
	 public static int noOfDays(int[] weights, int capacity)
	    {
	        int days = 1;
	        int load = 0;
	        for(int val: weights)
	        {
	            if(val + load > capacity)
	            {
	                days = days + 1;
	                load = val;
	            }
	            else
	            {
	                load += val;
	            }
	        }
	        return days;
	    }
	    public static int shipWithinDays(int[] weights, int days) {
	        int low = Integer.MIN_VALUE;
	        int high = 0;
	        for(int val: weights)
	        {
	            low = Math.max(low, val);
	            high += val;
	        }
	        int ans = 0;
	        while(low <= high)
	        {
	            int mid = (low + high)/2;
	            int numberOfDays = noOfDays(weights, mid);
	            if(numberOfDays <= days)
	            {
	                ans = mid;
	                high = mid - 1;
	            }
	            else
	            {
	                low = mid + 1;
	            }
	        }
	        return ans;
	    } 
	public static void main(String args[])
	{
	  int[] weights = {1,2,3,4,5,6,7,8,9,10};
	  int days = 5;
	  System.out.println(shipWithinDays(weights, days));
	}
}
