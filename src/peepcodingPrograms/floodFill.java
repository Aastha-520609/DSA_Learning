package peepcodingPrograms;
import java.util.*;
import java.io.*;
//It is a maze game where we have to find the destination by moving to the all possible paths, while moving there are many obstacles to be faced.
//Here we pass a matrix as a maze where 0 defines we can go to that particular path and 1 is the obstacle where we cannot go.
public class floodFill {
	public static void main(String args[])
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
		
		//To mark the point or box as visited we take this boolean array into consideration.
		//It shows that this particular point or box has been already visited. If visited is  not checked then one node gets visited many time
		//and the stack gets overflow due to which actual path is never found so inorder to get actual path and avoid confusion
		//we mark a point or box as visited.
		boolean[][] visited = new boolean[n][m];
		floodfill(arr,0,0,"",visited);
	}
	public static void floodfill(int[][] maze, int row, int col, String pathSoFar, boolean[][] visited)
	{
		if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true)
		{
			return;
		}
		
		//if we are the destination, print the value and return and find the next path by backtracking.
		if(row == maze.length-1 && col == maze[0].length - 1)
		{
			System.out.println(pathSoFar);
			return;
		}
		
		visited[row][col] = true;
		//if we are in row 0 col 0 then (row (0-1 i.e -1 is the top of row 0)) so this is top, col will be same.
		floodfill(maze, row-1, col, pathSoFar + "t", visited);
		//if we are in row 0 & col 0 then (col (0-1) i.e -1 is the left of col 0) so this is left, row will be same.
		floodfill(maze, row, col-1, pathSoFar + "l", visited);
		//if row is increased by 1 then we move down
		floodfill(maze, row+1, col, pathSoFar + "d", visited);
		//if col is increased then we move right
		floodfill(maze, row, col+1, pathSoFar + "r", visited);
		//we undo all the visited box after all four point top,left,down,right has been visited inorder to get another path if possible.
		visited[row][col] = false;
	}
}
