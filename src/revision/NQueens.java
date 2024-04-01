package revision;
public class NQueens {
	public static void printNQueens(int[][] chess, String queen_so_far, int row)
	{
		if(row == chess.length)
		{
			System.out.println(queen_so_far);
			return;
		}
		for(int col = 0; col < chess.length; col++)
		{
			if(placeIsSafe(chess, row, col) == true) 
			{
				chess[row][col] = 1;
				printNQueens(chess, queen_so_far + row + "-" + col + ",", row + 1);
				chess[row][col] = 0;
			}
		}
	}
	
	public static boolean placeIsSafe(int[][] chess, int row, int col)
	{
		//checking vertically upward
		for(int i = row - 1, j = col; i >= 0; i--)
		{
			if(chess[i][j] == 1)
			{
				return false;
			}
		}
		
		//checking diagonally
		for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
		{
			if(chess[i][j] == 1)
			{
				return false;
			}
		}
		
		//checking horizontally
		for(int i = row-1, j = col+1; i >= 0 && j < chess.length; i--, j++)
		{
			if(chess[i][j] == 1)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int[][] chess = new int[4][4];
		printNQueens(chess, "", 0);
	}

}
