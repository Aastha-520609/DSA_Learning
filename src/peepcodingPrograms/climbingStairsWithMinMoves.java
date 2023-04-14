package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class climbingStairsWithMinMoves {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] noOfJumps = new int[n]; //given the value of how many jumps should particular point should have from there
		for(int i=0; i<noOfJumps.length; i++)
		{
			noOfJumps[i] = sc.nextInt();
		}
		
		Integer[] storeValue = new Integer[n+1]; //stores the calculated value like how many path is possible from particular point
		storeValue[n] = 0;
		for(int i= n-1; i>=0; i--)
		{
			if(noOfJumps[i] > 0)
			{
				int min = Integer.MAX_VALUE;
				
				for(int j=1; j <= noOfJumps[i] && i+j < storeValue.length; j++)
				{
					if(storeValue[i+j] != null)
					{
						min = Math.min(min, storeValue[i+j]);
					}
				}
				if(min != Integer.MAX_VALUE)
				{
					storeValue[i] = min + 1;
				}
			}
		}
		System.out.println(storeValue[0]);
	}

}
