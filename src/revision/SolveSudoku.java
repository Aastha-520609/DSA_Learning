package revision;
import java.util.*;
import java.io.*;

public class SolveSudoku {
	public static void sudokuSolver(int[][] board, int row, int col)
	{
		if(row == board.length)
		{
			display(board);
			return;
		}
		
		int next_row = 0;
		int next_col = 0;
		
		if(col == board[0].length - 1)
		{
			next_row = row + 1;
			next_col = 0;
		}
		else
		{
			next_row = row;
			next_col = col + 1;
		}
		
		if(board[row][col] != 0)
		{
			sudokuSolver(board, next_row, next_col);
		}
		else
		{
			for(int i = 1; i<=9; i++) // i here is possible solution
			{
				if(isValid(board, row, col, i) == true)
				{
					board[row][col] = i;
					sudokuSolver(board, next_row, next_col);
					board[row][col] = 0;	
				}
			}
		}
	}
	
	public static boolean isValid(int[][] board, int row, int col, int val)
	{
		for(int j=0; j<board[0].length; j++)
		{
			if(board[row][j] == val)
			{
				return false;
			}
		}
		
		for(int i=0; i<board.length; i++)
		{
			if(board[i][col] == val)
			{
				return false;
			}
		}
		
		int sum_matrix_row = row / 3 * 3;
		int sum_matrix_col = col / 3 * 3;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(board[sum_matrix_row + i][sum_matrix_col + j] == val)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void display(int[][] board)
	{
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sudokuSolver(arr, 0, 0);
	}	
}
