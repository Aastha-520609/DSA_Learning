package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class minCostPath {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of rows
		int m = sc.nextInt(); // no of columns
		
		//creating a array where cost of each shell is provided by user
		int[][] givenCostArray = new int[n][m];
		for(int i=0; i<givenCostArray.length; i++)
		{
			for(int j=0; j<givenCostArray[0].length; j++)
			{
				givenCostArray[i][j] = sc.nextInt();
			}
		}
		
		//creating a array where we will calculate the cost and store in it
		int[][] minCostPathArray = new int[n][m];
		
		//minimum cost path is calculated from last shell to the first shell. 
		//Inorder to calculate  we divide calculation in 4 parts
		//1st part - the last Shell of the matrix will contain same value as a cost given array.
		//2nd part - the horizontal way of the last shell will contain the added value of its previous shell and the value from given array.
		//3rd part - the vertical way is also same as horizontal way
		//4th part - the particular shell looks in both horizontal way and vertical, it takes the minimum value among them and gets added with the 
		// givenarray shell cost and stores in the particular shell
		
		//it is running from the last shell of a matrix.
		for(int i= minCostPathArray.length - 1; i >= 0; i--)
		{
			for(int j= minCostPathArray[0].length - 1; j>=0; j--)
			{
				//if it is a last shell of a matrix
				if(i == minCostPathArray.length - 1 && j == minCostPathArray[0].length - 1)
				{
					minCostPathArray[i][j] = givenCostArray[i][j];
				}
				//if it is the last row
				else if(i == minCostPathArray.length - 1)
				{
					minCostPathArray[i][j] = minCostPathArray[i][j+1] + givenCostArray[i][j];
				}
				//if it is the last column
				else if(j == minCostPathArray[0].length - 1)
				{
					minCostPathArray[i][j] = minCostPathArray[i+1][j] + givenCostArray[i][j];
				}
				//if it is the shell except all above
				else
				{
					minCostPathArray[i][j] = Math.min(minCostPathArray[i+1][j], minCostPathArray[i][j+1]) + givenCostArray[i][j];
				}
			}
		}
		System.out.println(minCostPathArray[0][0]);
		
	}

}
