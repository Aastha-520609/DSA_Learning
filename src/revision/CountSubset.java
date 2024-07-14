package revision;
import java.util.*;
import java.io.*;
public class CountSubset {
	public static int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int MOD = 1000000007;
	    int[][] dp = new int[n][sum+1];
	    
	    for(int i=0; i<n; i++)
	    {
	        dp[i][0] = 1;
	    }
	    
	    if(arr[0] == 0)
	    {
	        dp[0][0] = 2;
	    }
	    else if (arr[0] <= sum) {
            dp[0][arr[0]] = 1;
        }
	    
	    for(int index = 1; index < n; index++)
	    {
	        for(int target = 0; target <= sum; target++)
	        {
	            int notPick = dp[index - 1][target];
	            int pick = 0;
	            if(arr[index] <= target)
	            {
	                pick = dp[index-1][target - arr[index]];
	            }
	            
	            dp[index][target] = (pick + notPick) % MOD;
	        }
	    }
	    
        return dp[n - 1][sum];
	} 
	
	public static void main(String args[])
	{
		int[] arr = {0,0,0,0,0,0,0,0,1};
		int n = arr.length;
		int sum = 1;
		System.out.println(perfectSum(arr,n,sum));
	}
}
