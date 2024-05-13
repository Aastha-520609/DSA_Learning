package revision;
import java.util.*;
public class DP_ClimbingStairs {
	public static int bottomUp(int n, int[] dp)
	{
		dp[0] = 1;
		for(int i=1; i<=n; i++)
		{
			if(i==1)
			{
				dp[i] = dp[i-1];
			}
			else
			{
				dp[i] = dp[i-1] + dp[i-2];
			}
		}
		return dp[n];
	}
	public static int topDown(int n, int[] dp)
	{
		if(n <= 1)
		{
			return n;
		}
		
		if(dp[n] != 0)
		{
			return dp[n];
		}
		
		return dp[n] = topDown(n-1, dp) + topDown(n-2, dp);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		int tabulation = bottomUp(n, dp);
		int memoization = topDown(n, dp);
		System.out.println(tabulation);
		System.out.println(memoization);
	}
}
