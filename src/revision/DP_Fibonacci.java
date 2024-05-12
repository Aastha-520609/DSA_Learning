package revision;
import java.util.*;
import java.io.*;
public class DP_Fibonacci {
	public static int Fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		int res = Fib(n-1) + Fib(n-2);
		return res;
	}
	public static int FibMemoized(int n, int[] dp)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		if(dp[n] != 0)
		{
			return dp[n];
		}
		
		int res = FibMemoized(n-1, dp) + FibMemoized(n-2, dp);
		dp[n] = res;
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fib = FibMemoized(n, new int[n+1]);
		System.out.println(fib);
	}
}
