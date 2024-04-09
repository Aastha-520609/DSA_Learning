package revision;
import java.util.*;
import java.io.*;
public class PathWithMaxGold {
	public static void travelAndCollect(int[][] arr, int row, int col, boolean[][] visited, ArrayList<Integer> bag)
	{
		if(row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] == 0 || visited[row][col] == true)
		{
			return;
		}
		
		visited[row][col] = true;
		bag.add(arr[row][col]);
		travelAndCollect(arr, row - 1, col, visited, bag); //up
		travelAndCollect(arr, row, col + 1, visited, bag); //right
		travelAndCollect(arr, row, col - 1, visited, bag); //left
		travelAndCollect(arr, row + 1, col, visited, bag); //down
		
	}
	static int max = 0;
	public static void getMaxGold(int[][] arr)
	{
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] != 0 && visited[i][j] == false)
				{
					ArrayList<Integer> bag = new ArrayList<>();
					travelAndCollect(arr, i, j, visited, bag);
					
					int sum = 0;
					for(int val: bag)
					{
					  sum += val;	
					}
					if(sum > max)
					{
						max = sum;
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
	}
}
