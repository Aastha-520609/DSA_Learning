package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Question Requirement: 
 * n represents - no of stairs
 * climb from 0th step to nth step
 * an array is given where the ith element values indicates, you can jump these many step from this ith position*/
public class climbingStairsWithJumps {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Creating an array and taking values of jump as user input
		int[] noOfJumps = new int[n];
		for(int i=0; i<noOfJumps.length; i++)
		{
			noOfJumps[i] = sc.nextInt();
		}
		//this array stores the calculated values 
		int[] storeValue = new int[n+1];
		storeValue[n] = 1; // since we are going from up to down. From n there will be no path to go.
		for(int i=n-1; i>=0; i--) {
			for(int j=1; j<=noOfJumps[i] && i+j < storeValue.length; j++)
			{
				storeValue[i] = storeValue[i] + storeValue[i+j];
			}
		}
		System.out.println(storeValue[0]);
	}

}
