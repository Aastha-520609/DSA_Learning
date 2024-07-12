package revision;
import java.util.*;
public class SubsetSumProblem {
	public static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp = new boolean[N][sum+1];
        for(int idx = 0; idx < N; idx++)
        {
            dp[idx][0] = true;
        }
        
        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }
        
        for(int idx=1; idx<N; idx++)
        {
            for(int target = 1; target<=sum; target++)
            {
                boolean notTake = dp[idx-1][target];
                boolean take = false;
                if(arr[idx] <= target)
                {
                    take = dp[idx-1][target - arr[idx]];
                }
                
                dp[idx][target] = take | notTake;
            }
        }
        
        return dp[N-1][sum];
    }
	public static void main(String args[])
	{
	  int[] arr = {3,34,4,12,5,2};
	  int n = arr.length;
	  int sum = 9;
	  System.out.println(isSubsetSum(n,arr,sum));
	}
}
