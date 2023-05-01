package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Given a number n representing the length of a floor space which is 2m wide. It's a 2*n board.
 * Given a infinite supply of 2*1 tiles
 * We have to calculate and print the number of ways floor can be tiled using tiles.*/
public class TilingFloorWithParticularTiles {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[n+1];
		dp[1] = 1; //for floor with space 2m broad and 1m length (i.e 2*1 board) there is only one way we can keep the tiles
		dp[2] = 2; //if(2*2 board) then only 2 ways are there to place the tiles.
		
		for(int i=3; i<=n; i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}
}
