package revision;
import java.util.*;
public class MinSumTriangle {
	 public static int minimumTotal(List<List<Integer>> triangle) {
	        int n = triangle.size();
	        int dp[][] = new int[n][n];
	        for (int[] row : dp) {
	            Arrays.fill(row, -1);
	        }     
	       for(int j=0; j<n; j++)
	       {
	         dp[n-1][j] = triangle.get(n-1).get(j);
	       }  

	       for(int i=n-2; i>=0; i--)
	       {
	        for(int j=i; j>=0; j--)
	        {
	            int down = triangle.get(i).get(j) + dp[i+1][j];
	            int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];

	            dp[i][j] = Math.min(down, diagonal);
	        }
	       }
	       return dp[0][0];
	    }
	public static void main(String args[])
	{
		 List<List<Integer>> triangle = List.of(
		            List.of(2),
		            List.of(3, 4),
		            List.of(6, 5, 7),
		            List.of(4, 1, 8, 3)
		        );
		 
		 System.out.println(minimumTotal(triangle));
	}

}
