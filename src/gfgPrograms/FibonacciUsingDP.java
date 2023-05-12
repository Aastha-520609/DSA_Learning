package gfgPrograms;
import java.util.*;
import java.io.*;
public class FibonacciUsingDP {
	public static long nthFibonacci(long n){
        // code here
       int N = (int)n;
       long dp[] = new long[N+1];
       dp[0] = 0;
       dp[1] = 1;
       for(int i=2; i<=N; i++)
       {
           dp[i] = (dp[i-1] + dp[i-2])%1000000007;
       }
       return dp[N];
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthFibonacci(n));
	}

}
