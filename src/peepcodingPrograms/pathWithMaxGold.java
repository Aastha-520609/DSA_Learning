package peepcodingPrograms;
import java.util.*;
import java.io.*;
import java.lang.*;
public class pathWithMaxGold {
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] givenArray = new int[n][m]; // array where all values are provided by user
		for(int i=0; i<givenArray.length; i++)
		{
			for(int j=0; j<givenArray[0].length; j++)
			{
				givenArray[n][m] = sc.nextInt();
			}
		}
		
		//calculation is done from last to first because last column value is same as the given value because there is  no previous column to compare.
	   int[][] calculatedCostArray = new int[n][m]; // array that stores the max cost of gold.
	   
	   for(int j=givenArray[0].length - 1; j>=0; j--)
	   {
		   for(int i=givenArray.length - 1; i>=0; i--)
		   {
			   if(j == givenArray[0].length - 1) //if it is a last column
			   {
				   calculatedCostArray[i][j] = givenArray[i][j];  // it will store the same value as given array
			   }
			   else if(i == 0) // if it is a first row
			   {
				   //it compares with two values only
				   calculatedCostArray[i][j] = givenArray[i][j] + Math.max(calculatedCostArray[i][j+1], calculatedCostArray[i+1][j+1]);
			   }
			   else if(i == givenArray.length - 1) // if it is in last row
			   {
				   //it compares with two values only
				   calculatedCostArray[i][j] = givenArray[i][j] + Math.max(calculatedCostArray[i][j+1], calculatedCostArray[i-1][j+1]);
			   }
			   else // it compares with three values
			   {
				   calculatedCostArray[i][j] = givenArray[i][j] + Math.max(calculatedCostArray[i][j+1], Math.max(calculatedCostArray[i-1][j+1] , 
						   calculatedCostArray[i+1][j+1])); 
			   }
		   }
	   }
	   
	   int max = calculatedCostArray[0][0];
	   for(int i=1; i<calculatedCostArray.length; i++)
	   {
		   if(calculatedCostArray[i][0] > max)
		   {
			   max = calculatedCostArray[i][0];
		   }
	   }
	   
	   System.out.println(max);
	}

}
