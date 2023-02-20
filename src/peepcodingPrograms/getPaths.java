package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class getPaths {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> paths = getStairPaths(n);
		System.out.println(paths);
	}
    public static ArrayList<String> getStairPaths(int n)
    {
    	if(n == 0)
    	{
    		ArrayList<String> blankWay = new ArrayList<>();
    		blankWay.add(" "); //There is a way which is you stay at the end point, don't move, don't walk just stay there, staying there is your blankway.
    		return blankWay; //The concept is if there is no path left to walk on, stay there.
    	}
    	else if(n < 0)
    	{
    		ArrayList<String> blankWay = new ArrayList<>();
    		return blankWay;
    	}
    	ArrayList<String> paths1 = getStairPaths(n-1);
    	ArrayList<String> paths2 = getStairPaths(n-2);
    	ArrayList<String> paths3 = getStairPaths(n-3);
    	ArrayList<String> paths = new ArrayList<>();
    	
    	for(String path : paths1)
    	{
    		paths.add(1+path);
    	}
    	
    	for(String path : paths2)
    	{
    		paths.add(2+path);
    	}
    	
    	for(String path : paths3)
    	{
    		paths.add(3+path);
    	}
    	
    	return paths;
    }
}
