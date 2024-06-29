package revision;
import java.util.*;
public class MinPathSumInGrid {
	public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] val: dp)
        {
            Arrays.fill(val, -1);
        }
     
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == 0 && j == 0)
                {
                    dp[i][j] = grid[i][j];
                }
                else
                {
                     int up = Integer.MAX_VALUE;
                    if (i > 0) {
                        up = dp[i-1][j] + grid[i][j];
                    }

                    int left = Integer.MAX_VALUE;
                    if (j > 0) {
                        left = dp[i][j-1] + grid[i][j];
                    }

                    dp[i][j] = Math.min(up,left);
                }
            }
        }
        return dp[m-1][n-1];
    }
	public static void main(String args[])
	{
		 int matrix[][] = {
		            {5, 9, 6},
		            {11, 5, 2}
		        };
		 
		 System.out.println(minPathSum(matrix));
	}
}
