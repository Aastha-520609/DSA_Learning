package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class targetSumSubset {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//size of array
		int n = sc.nextInt();
		
		//array with user given values
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//target for which we have to check that array contains any subsets whose sum is equal to target.
		int target = sc.nextInt();
		
		//a 2d array which stores the values true or false, that a particular number should include or not to make a sum that equals to target
		//this array is of n+1 and target + 1 size
		boolean[][] solutionArray = new boolean[n+1][target+1];
		
		for(int i=0; i<solutionArray.length; i++)
		{
			for(int j=0; j<solutionArray[0].length; j++)
			{
				//if it is the first shell, it is an empty set so it gets included 
				if(i == 0 && j == 0)
				{
					solutionArray[i][j] = true;
				}
				//in the 0th row, except 0th column, all column doesn't get included because for the 0 value in array, no subset is there.
				else if(i == 0)
				{
					solutionArray[i][j] = false;
				}
				//in the 0th column, every value contains the value 0(i.e empty set) so it is true. 
				else if(j == 0)
				{
					solutionArray[i][j] = true;
				}
				else
				{
					//if the previous row value of a particular column is included in the subset then this value will also be included
					//which means if suppose (4 2) can make subset of (4) (2) and (4 2) then (4 2 7) will make subset of (4) (2) (7) (4 2) (2 7) (4 7) 
					//(4 2 7) which shows that (4 2) is always included
					if(solutionArray[i-1][j] == true)
					{
						solutionArray[i][j] = true;
					}
					//now if previous row value is not included then the upcoming number will look if i can make or not and asks the previous values
					//if they are able to make some values then the particular number will summ up with them
					else
					{
						int val = arr[i-1]; // since givenArray index varies from solutionArray
						if(j >= val) //the value should be greater than column value then o
						{
							if(solutionArray[i-1][j-val] == true)
							{
								solutionArray[i][j] = true;
							}
						}
					}
				}
			}
		}
		
		System.out.println(solutionArray[arr.length][target]);
	}

}
