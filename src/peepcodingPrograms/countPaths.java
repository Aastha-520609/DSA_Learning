package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class countPaths {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countPathsUsingTabulation(n));
	}
    public static int countPathsUsingTabulation(int n)
    {
    	//Creating an array of size + 1 inorder to store the values
    	int[] storeValue = new int[n+1];
    	//since at position 0, when we want to take the value, the values are in negative since 0-1 and so on is negative 
    	//so we return value 1 in position 0
    	storeValue[0] = 1;
    	for(int i=1; i<=n; i++) {
    		if(i == 1)
    		{
    			//since from 1, we can only go to 0 else all values are negative so
    			storeValue[i] = storeValue[i-1];
    		}
    		else if( i == 2)
    		{
    			storeValue[i] = storeValue[i-1] + storeValue[i-2]; //since from 2 we can only go to 1 and 0.
    		}
    		else {
        		storeValue[i] = storeValue[i-1] + storeValue[i-2] + storeValue[i-3]; //since from 3 we donot get any negative value
    		}
    	}
    	return storeValue[n];
    }
}
