package revision;
import java.util.*;
public class minFallingPathSum {
	public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
    
        //Base Case
        for(int j=0; j<n; j++)
        {
            dp[0][j] = matrix[0][j];
        }

        for(int i=1; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int up = matrix[i][j] + dp[i-1][j];

                int diagLeft = matrix[i][j];
                if(j > 0) {
                    diagLeft += dp[i-1][j-1];
                }
                else {
                    diagLeft += (int) Math.pow(10,9);
                }

                int diagRight = matrix[i][j];
                if(j < n-1){
                    diagRight += dp[i-1][j+1];
                }
                else {
                    diagRight +=  (int) Math.pow(10,9);
                }

                dp[i][j] = Math.min(up, Math.min(diagLeft, diagRight));
            }
        }
        
        int mini = Integer.MAX_VALUE;   
        for(int j=0; j<n; j++)
        {
            mini = Math.min(mini, dp[m-1][j]);
        }

        return mini;
    }
	public static void main(String args[])
	{
        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
            };
        
        System.out.println(minFallingPathSum(matrix));
	}

}
