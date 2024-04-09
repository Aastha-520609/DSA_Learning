package revision;
import java.util.*;
import java.io.*;

public class NQueensBacktracking {
	public static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag, String ans)
	{
		if(row == board.length)
		{
			System.out.println(ans + ".");
			return;
		}
		for(int col = 0; col < board[0].length; col++)
		{
			if(cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length - 1] == false)
			{
				board[row][col] = true;
				cols[col] = true;
				ndiag[row + col] = true;
				rdiag[row - col + board.length - 1] = true;
				solve(board, row+1, cols, ndiag, rdiag, ans + row + "-" + col + ",");
				board[row][col] = false;
				cols[col] = false;
				ndiag[row + col] = false;
				rdiag[row - col + board.length - 1] = false;	
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[][] board = new boolean[n][n];
		
		//Creating an array to store status of columns
		boolean[] cols = new boolean[n];
		//Creating an array to store status of normal diagonals
		boolean[] ndiag = new boolean[2*n-1]; //size of diagonal needed to store the status
		//Creating an array to store status of reverse diagonals
		boolean[] rdiag = new boolean[2*n-1];
		
		solve(board, 0, cols, ndiag, rdiag, "");
	}

}
