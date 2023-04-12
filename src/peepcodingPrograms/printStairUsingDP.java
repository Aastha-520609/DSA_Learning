package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class printStairUsingDP {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totalPaths = countStairPath(n, new int[n+1]);
		System.out.println(totalPaths);
	}
    public static int countStairPath(int n, int[] storedValue)
    {
    	if(n == 0)
    	{
    		return 1;
    	}
    	if(n < 0)
    	{
    		return 0;
    	}
    	if(storedValue[n] > 0)
    	{
    		return storedValue[n];
    	}
    	
    	System.out.println("Hello" + n);
    	int path1 = countStairPath(n-1, storedValue);
    	int path2 = countStairPath(n-2, storedValue);
    	int path3 = countStairPath(n-3, storedValue);
    	int resPath = path1 + path2 + path3;
    	
    	storedValue[n] = resPath;
    	return resPath;
    }
}
