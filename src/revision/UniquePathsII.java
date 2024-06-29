package revision;
import java.util.*;
public class UniquePathsII {
	public static int uniquePaths(int m, int n, int[][] obstacleGrid, int[][] dp)
    {
       if(m==0 && n==0)
       {
        return obstacleGrid[m][n] == 1 ? 0 : 1;
       }

       if(m<0 || n<0)
       {
        return 0;
       }

       if (obstacleGrid[m][n] == 1) {
            return 0;
        }

       if(dp[m][n] != -1)
       {
        return dp[m][n];
       }

       int up = uniquePaths(m, n-1, obstacleGrid, dp);
       int left = uniquePaths(m-1, n, obstacleGrid, dp);

       return dp[m][n] = up + left;
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return uniquePaths(m-1, n-1, obstacleGrid, dp);
    }
    
    public static int[][] getInputGrid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];
        System.out.println("Enter the grid values row: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        return grid;
    }
    public static void main(String[] args) {
    	int[][] obstacleGrid = getInputGrid();
        System.out.println(uniquePathsWithObstacles(obstacleGrid ));
    }
}
