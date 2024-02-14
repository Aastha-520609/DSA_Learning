package revision;
public class SplitArrayLargestSum {
	 public static boolean isPossible(int[] nums, int mid, int k)
	    {
	        int countSubArray = 1;
	        int sum = 0;
	        for(int i=0; i<nums.length; i++)
	        {
	            sum += nums[i];

	            if(sum > mid)
	            {
	                countSubArray++;
	                sum = nums[i];
	            }
	        }
	        return countSubArray <= k;
	    }

	 public static int splitArray(int[] nums, int k) {
	        int low = 0;
	        int high = 0;
	        int ans = 0;
	        for(int val: nums)
	        {
	            if(val > low)
	            {
	                low = val;
	            }
	            high += val;
	        }

	        while(low <= high)
	        {
	            int mid = low + (high - low)/2;
	            if(isPossible(nums,mid,k) == true)
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
		int[] array = {1,2,3,4,5};
		int k = 3;
		System.out.print(splitArray(array,k));
	}
}
