package revision;
import java.util.*;
import java.io.*;
public class GetMazePath {
	public static ArrayList<String> getMaze(int source_row, int source_col, int destination_row, int destination_col)
	{
		//Base Case
		//if we are at last position then we can't do anything instead of just standing at the particular position
		if(source_row == destination_row && source_col == destination_col)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;	
		}
		
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		
		if(source_row < destination_row) //since from last cell we cannot move down
		{
			vpath = getMaze(source_row+1, source_col, destination_row, destination_col);
		}
		
		if(source_col < destination_col) //since from last cell we cannot move forward
		{
			hpath = getMaze(source_row, source_col + 1, destination_row, destination_col);
		}
		
		ArrayList<String> res = new ArrayList<>();
		for(String hpaths: hpath)
		{
			res.add('h' + hpaths);
		}
		
		for(String vpaths: vpath)
		{
			res.add('v' + vpaths);
		}
		
		return res;
	}
	
	public static void printMaze(int source_row, int source_col, int destination_row, int destination_col, String path)
	{
		if(source_row > destination_row || source_col > destination_col)
		{
			return;
		}
		
		if(source_row == destination_row && source_col == destination_col)
		{
			System.out.println(path);
			return;
		}
		
		printMaze(source_row + 1, source_col, destination_row, destination_col, path + 'v');
		printMaze(source_row, source_col + 1, destination_row, destination_col, path + 'h');
	}
	
	public static ArrayList<String> getMazeWithJumps(int source_row, int source_col, int destination_row, int destination_col)
	{
		//Base Case
		//if we are at last position then we can't do anything instead of just standing at the particular position
		if(source_row == destination_row && source_col == destination_col)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;	
		}
		
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		ArrayList<String> dpath = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		
		for(int i = 1; i <= destination_col - source_col; i++)
		{
			hpath = getMazeWithJumps(source_row, source_col + i, destination_row, destination_col);
			for(String hpaths: hpath)
			{
				res.add("h" + i + hpaths);
			}
		}
		
		for(int i = 1; i <= destination_row - source_row; i++)
		{
			vpath = getMazeWithJumps(source_row + i, source_col, destination_row, destination_col);
			for(String vpaths: vpath)
			{
				res.add("v" + i + vpaths);
			}
		}
		
		for(int i = 1; i <= destination_col - source_col && i <= destination_row - source_row; i++)
		{
			dpath = getMazeWithJumps(source_row + i, source_col + i, destination_row, destination_col);
			for(String dpaths: dpath)
			{
				res.add("d" + i + dpaths);
			}
		}
		return res;
	}
	
	public static void printMazePathWithJumps(int source_row, int source_col, int destination_row, int destination_col, String path)
	{
		if(source_row == destination_row && source_col == destination_col)
		{
			System.out.println(path);
			return;
		}
		
		for(int i=1; i<=destination_col - source_col; i++)
		{
			printMazePathWithJumps(source_row, source_col + i, destination_row, destination_col, path + 'h' + i);	
		}
		
		for(int i=1; i<=destination_row - source_row; i++)
		{
			printMazePathWithJumps(source_row + i, source_col, destination_row, destination_col, path  + 'v' + i);	
		}
		
		for(int i=1; i<=destination_row - source_row && i<= destination_col - source_col; i++)
		{
			printMazePathWithJumps(source_row + i, source_col + i, destination_row, destination_col, path + 'd' + i);	
		}
	}
	public static void main(String[] args)
	{
		int source_row = 1;
		int source_col = 1;
		int destination_row = 3;
		int destination_col = 3;
		ArrayList<String> result1 = getMaze(source_row, source_col, destination_row, destination_col);
		System.out.println(result1);
		System.out.println("_____________________________________________");
		ArrayList<String> result = getMazeWithJumps(source_row, source_col, destination_row, destination_col);
		System.out.println(result);
		System.out.println("_____________________________________________");
		printMaze(1,1,3,3,"");
		System.out.println("_____________________________________________");
		printMazePathWithJumps(1,1,3,3,"");
	}
}
