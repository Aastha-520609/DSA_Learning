package revision;
import java.util.*;
public class CherryPickup {
	public static int maxChoc(int i, int j1, int j2, int n, int m, int[][] grid, int[][][] dp)
    {
        if(j1 < 0 || j2 < 0 || j1 >= m || j2 >= m){
            return (int) (Math.pow(-10,9));
        }
        
        if(i == n-1){
            if(j1 == j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1] + grid[i][j2];
            }
        }
        
        if(dp[i][j1][j2] != -1)
        {
            return dp[i][j1][j2];
        }
        
        int maxi = Integer.MIN_VALUE;
        for(int alice = -1; alice <= 1; alice++)
        {
            for(int bob = -1; bob <=1; bob++)
            {
                int ans;
                if(j1 == j2)
                {
                    ans = grid[i][j1] + maxChoc(i+1, j1+alice, j2+bob, n, m, grid, dp);
                }
                else
                {
                    ans = grid[i][j1] + grid[i][j2] + maxChoc(i+1, j1+alice, j2+bob, n, m, grid, dp);
                }
                
                maxi = Math.max(maxi, ans);
            }
        }
        return dp[i][j1][j2] = maxi;
    }
    public static int solve(int n, int m, int grid[][]) {
        int dp[][][] = new int[n][m][m];
        
        for(int row1[][] : dp)
        {
            for(int row2[] : row1)
            {
                Arrays.fill(row2, -1);
            }
        }
        
        return maxChoc(0,0,m-1,n,m,grid,dp);
    }
	public static void main(String args[])
	{
		int[][] matrix = {
                {3, 1, 1},
                {2, 5, 1},
                {1, 5, 5},
                {2, 1, 1}
            };
		System.out.println(solve(matrix.length, matrix[0].length, matrix));
	}
}
