package revision;
import java.util.*;
import java.io.*;
public class DP_FrogsJump {
	public static int by_recursion(int[] arr, int index)
	{
		if(index == 0)
		{
			return 0;
		}
		
		int left = by_recursion(arr, index - 1) + Math.abs(arr[index] - arr[index-1]);
		int right = Integer.MAX_VALUE;
		if(index > 1)
		{
			right = by_recursion(arr, index - 2) + Math.abs(arr[index] - arr[index-2]);
		}
		
		return Math.min(left, right);
	}
	public static int by_memoization(int[] arr, int index, int[] dp)
	{
		if(index == 0)
		{
			return 0;
		}
		
		if(dp[index] != 0)
		{
			return dp[index];
		}
		
		int left = by_memoization(arr, index - 1, dp) + Math.abs(arr[index] - arr[index-1]);
		int right = Integer.MAX_VALUE;
		if(index > 1)
		{
			right = by_memoization(arr, index-2, dp) + Math.abs(arr[index] - arr[index-2]);
		}
		
		return dp[index] = Math.min(left, right);
	}
	
	public static int by_tabulation(int[] arr, int N, int[] dp)
	{
	   	dp[0] = 0;
	   	for(int i=1; i<N; i++)
	   	{
	   	  int left = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
	   	  int right = Integer.MAX_VALUE;
	   	  if(i > 1)
	   	  {
	   		  right = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
	   	  }
	   	  
	   	  dp[i] = Math.min(left, right);
	   	}
	   	
	   	return dp[N-1];
	}
	public static void main(String args[])
	{
		int[] arr = {10, 20, 30, 10};
		int n = 4;
		System.out.println(by_recursion(arr, n-1));
		int dp[] = new int[n+1];
		System.out.println(by_memoization(arr, n-1, dp));
		System.out.println(by_tabulation(arr, n, dp));
	}
}
