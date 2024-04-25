package revision;
import java.util.*;
import java.io.*;
public class QueenPermutation {
	public static void queensPermutations(int queens_tillnow, int total_queen, int[][] chess)
	{
		if(queens_tillnow == total_queen)
		{
			for(int i=0; i<chess.length; i++)
			{
				for(int j=0; j<chess[0].length; j++)
				{
					if(chess[i][j] == 0)
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("q" + chess[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<chess.length; i++)
		{
			for(int j=0; j<chess[0].length; j++)
			{
				if(chess[i][j] == 0)
				{
					chess[i][j] = (queens_tillnow + 1);
					queensPermutations(queens_tillnow + 1, total_queen, chess);
					chess[i][j] = 0;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] chess = new int[n][n];
		queensPermutations(0, n, chess);
	}
}
