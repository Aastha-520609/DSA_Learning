package revision;
import java.util.*;
import java.io.*;
public class DP_FrogWithKJump {
	public static int minimizeCost(int arr[],int N,int K){
        //code here
        int[] dp = new int[N+1];
        dp[0] = 0;
        for(int i=1; i<N; i++)
        {
            int minSteps = Integer.MAX_VALUE;
            for(int j=1; j<=K; j++)
            {
                if(i-j >= 0)
                {
                    int jump = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[N-1];
    }
	public static void main(String args[])
	{
		int[] arr = {10, 30, 40, 50, 20};
		int n = 5;
		int k = 3;
		System.out.println(minimizeCost(arr,n,k));
	}
}
