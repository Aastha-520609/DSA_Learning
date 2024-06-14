package revision;
import java.util.*;
import java.io.*;
public class NinjaTrainingDp {
	public static int maximumPoints(int points[][],int N){
        //code here
        int dp[][] = new int[N][4];
        
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
        
        for(int day=1; day<N; day++)
        {
            for(int last=0; last<4; last++)
            {
                dp[day][last] = 0;
                for(int task=0; task<3; task++)
                {
                    if(task != last)
                    {
                        int point = points[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[N-1][3];
    }
	public static void main(String args[])
	{
		int points[][] = {
	            {1, 2, 5},
	            {3, 1, 1},
	            {3, 3, 3}
	        };
	        
	    int N = 3;
	    int result = maximumPoints(points, N);
	    System.out.println("Maximum points: " + result);
	}
}
