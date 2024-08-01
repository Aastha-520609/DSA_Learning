package revision;
public class Partition {
	public static boolean subsetSum(int[] nums, int N, int target)
    {
       boolean[][] dp = new boolean[N][target+1];

       //if target becomes equal to 0 return true
       for(int i=0; i<N; i++)
       {
         dp[i][0] = true;
       }

       //if the first element of the array is less than equal to target then only it can be taken into subset
       if(nums[0] <= target)
       {
        dp[0][nums[0]] = true; 
       }

       for(int i=1; i<N; i++)
       {
        for(int j=1; j <=target; j++)
        {
           boolean notTake = dp[i-1][j];
           boolean take = false;
           //if arr[i] is less than equal to target then only it can be taken into the subset
           if(nums[i] <= j)
           {
               take = dp[i-1][j - nums[i]];
           }

           dp[i][j] = take || notTake;
        }
       }
       return dp[N-1][target];
    }
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        int N = nums.length;
        for(int i=0; i<N; i++)
        {
            totalSum += nums[i];
        }

        if(totalSum % 2 == 1)
        {
            return false;
        }

        int target = totalSum / 2;
        return subsetSum(nums, N, target);
    }
	public static void main(String args[])
	{
		int[] arr = {1,5,11,5};
		System.out.println(canPartition(arr));
	}
}
