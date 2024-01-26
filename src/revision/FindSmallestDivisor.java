package revision;
import java.util.*;
public class FindSmallestDivisor {
	  public static int max(int[] nums)
	    {
	        int maxi = Integer.MIN_VALUE;
	        for(int i=0; i<nums.length; i++)
	        {
	          maxi = Math.max(maxi, nums[i]);
	        }
	        return maxi;
	    }

	    public static int logic(int[] nums, int val)
	    {
	        int sum = 0;
	        for(int i=0; i<nums.length; i++)
	        {
	          sum += Math.ceil((double)nums[i]/(double)val);
	        }
	        return sum;
	    }
	    public static int smallestDivisor(int[] nums, int threshold) {
	        int low = 1;
	        int high = max(nums);
	        int ans = 0;
	        while(low <= high)
	        {
	           int mid = low + (high - low)/2;
	           int res = logic(nums, mid);
	           if(res <= threshold)
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
		int[] array = {8,4,2,3};
		int threshold = 10;
		System.out.println(smallestDivisor(array, threshold));
	}
}
