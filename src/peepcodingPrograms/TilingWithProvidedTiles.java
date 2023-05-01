package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Given a number n and a number m separated by line break representing the length and breadth of a n*m floor.
 * Given a infinite supply of m*1 tiles
 * We have to calculate and print the number of ways floor can be tiled using tiles.*/
public class TilingWithProvidedTiles {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //length
		int m = sc.nextInt(); //breadth
		
		int[] dp = new int[n+1];
		for(int i=1; i<=n; i++)
		{
			if(i < m)
			{
				dp[i] = 1; 
			}
			else if(i == m)
			{
				dp[i] = 2;
			}
			else
			{
				dp[i] = dp[i-1] + dp[i-m];
			}
		}
     System.out.println(dp[n]);
 }
}