package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class mazePath {
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  
	  ArrayList<String> paths = getMazePaths(1,1,n,m);
	  System.out.println(paths);
	}
	public static ArrayList<String> getMazePaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn)
	{
		if(sourceRow == destinationRow && sourceColumn == destinationColumn)
		{
			ArrayList<String> blankWay = new ArrayList<>();
			blankWay.add("");
			return blankWay;
		}
		ArrayList<String> vpaths = new ArrayList<>(); //verticalPaths
		ArrayList<String> hpaths = new ArrayList<>(); //horizontalPaths
		
		if(sourceColumn < destinationColumn)
		{
			hpaths = getMazePaths(sourceRow, sourceColumn+1, destinationRow, destinationColumn);
		}
		
		if(sourceRow < destinationRow)
		{
			vpaths = getMazePaths(sourceRow+1, sourceColumn, destinationRow, destinationColumn);
		}
		
		ArrayList<String> paths = new ArrayList<>();
		for(String horizontalPath : hpaths)
		{
			paths.add( "h" + horizontalPath);
		}
		
		for(String verticalPath : vpaths)
		{
			paths.add("v" + verticalPath);
		}
		return paths;
	}

}
