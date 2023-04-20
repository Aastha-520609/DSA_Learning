package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class ZeroOneKnapsackProblem {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //size of array
		
		int[] valueArray = new int[n];
		for(int i=0; i<valueArray.length; i++)
		{
			valueArray[i] = sc.nextInt();
		}
		
		int[] weightArray = new int[n];
		for(int i=0; i<weightArray.length; i++)
		{
			weightArray[i] = sc.nextInt();
		}
		
		int capacity = sc.nextInt(); //total weight which we can keep in the bag
		
		int[][] dpArray = new int[n+1][capacity+1];
	
		for(int i=1; i<dpArray.length; i++)
		{
			for(int j=1; j<dpArray[0].length; j++)
			{
				if(j >= weightArray[i-1]) // i-1 is done here because dpArray is one more row than weightArray. Same is happened with valueArray so further valueArray is also decreased by 1
				{
					if(dpArray[i-1][j - weightArray[i -1]] + valueArray[i-1] > dpArray[i-1][j])
					{
						dpArray[i][j] = dpArray[i-1][j - weightArray[i-1]] + valueArray[i-1];
					}
					else
					{
						dpArray[i][j] = dpArray[i-1][j];	
					}
				}
				else
				{
					dpArray[i][j] = dpArray[i-1][j]; // when i doesn't include in bag
				}
			}
		}
		System.out.println(dpArray[n][capacity]);
	}

}
