package revision;
import java.util.*;
import java.io.*;
public class QueenCombination1 {
	public static void queensCombination(int current_queens, int total_queen, int row, int col, String ans)
	{
		if(row == total_queen)
		{
			if(current_queens == total_queen)
			{
				System.out.println(ans);
			}
			return;	
		}
		
		int new_row = 0;
		int new_col = 0;
		String included = "";
		String notIncluded = "";
		
		if(col == total_queen - 1)
		{
			new_row = row + 1;
			new_col = 0;
			included = ans + "q\n";
			notIncluded = ans + "-\n";
		}
		else
		{
			new_row = row;
			new_col = col + 1;
			included = ans + "q";
			notIncluded = ans + "-";
		}
		
		queensCombination(current_queens + 1, total_queen, new_row, new_col, included);
		queensCombination(current_queens + 0, total_queen, new_row, new_col, notIncluded);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		queensCombination(0, n, 0, 0, "");
	}
}
