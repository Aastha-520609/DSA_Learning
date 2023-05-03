package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Given number n representing the no of elements.
 * Given number K representing the no of partition.
 * Print the number of ways in which these elements can be partitioned in k non-empty subsets.*/
public class partitionIntoSubset {
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt(); //no of elements.
		int k = sc.nextInt(); //no of partition.
		
		if(n == 0 || k == 0 || n < k)
		{
			System.out.println(0);
			return;
		}
	    
		long[][] resultantArray = new long[k+1][n+1];
		
		for(int i=1; i<=k; i++) //row - parition
		{
			for(int j=1; j<=n; j++) //column - elements
			{
				//if no of people is less than number of partition.
				if(j < i)
				{
					resultantArray[i][j] = 0;
				}
				else if(j == i) //no of elem is equal to no partition
				{
					resultantArray[i][j] = 1;
				}
				else
				{
					resultantArray[i][j] = resultantArray[i-1][j-1] + resultantArray[i][j-1] * i;
				}
			}
		}
		
		System.out.println(resultantArray[k][n]);
	}
}
