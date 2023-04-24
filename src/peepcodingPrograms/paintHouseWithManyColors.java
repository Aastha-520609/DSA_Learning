package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class paintHouseWithManyColors {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of houses / no of rows
		int c = sc.nextInt(); //no of colors / no of column
	    
		int[][] houseArray = new int[n][c];
		for(int i=0; i<houseArray.length; i++)
		{
			for(int j=0; j<houseArray[0].length; j++)
			{
			    houseArray[i][j] = sc.nextInt();
			}
		}
		
		int[][] dpArray = new int[houseArray.length][houseArray[0].length];
		
		//Here we need to find two minimum value from the row of the array , if the first minimum value color is the same color value to be taken then we will 
		//take second minimum value as we can't paint the house with same color simultaneously
		
		int leastVal = Integer.MAX_VALUE;
		int secondLeastVal = Integer.MAX_VALUE;
		
		
		for(int j=0; j<houseArray[0].length; j++)
		{
			dpArray[0][j] = houseArray[0][j];
			
			//While place value only we will calculate the minimum value from the row of the array, inorder to reduce time complexity
			if(houseArray[0][j] <= leastVal)
			{
				secondLeastVal = leastVal;
				leastVal = houseArray[0][j];
			}
			else if(houseArray[0][j] <= secondLeastVal)
			{
			    secondLeastVal = houseArray[0][j];	
			}
			
		}
		//from 1
		for(int i=1; i<dpArray.length; i++)
		{
			int newLeastVal = Integer.MAX_VALUE;
			int newSecondLeastVal = Integer.MAX_VALUE;
			
			for(int j=0; j<dpArray[0].length; j++)
			{
				//if leastVal is equal to previous row value which means if the next house need to color that particular color which may colored previously too, 
				//then in this case we will take another minimum cost from the all colors except the color which we want to chose
				if(leastVal == dpArray[i-1][j]) //here we get least value and color to be colored same so we exclude this leastval and go for another
				{
					dpArray[i][j] = houseArray[i][j] + secondLeastVal; 
				}
				else
				{
					dpArray[i][j] = houseArray[i][j] + leastVal; //if not similar then add the first least value;
				}
				
				//again we have to find least and second least value from row 1 , 2 and so on. Inorder to compare and get the minimum cost
				if(dpArray[i][j] <= newLeastVal)
				{
					newSecondLeastVal = newLeastVal;
					newLeastVal = dpArray[i][j];
				}
				else if(dpArray[i][j] <= newSecondLeastVal)
				{
					newSecondLeastVal = dpArray[i][j];
				}
			}	
			
			leastVal = newLeastVal;
			secondLeastVal = newSecondLeastVal;
		}
		
		System.out.println(leastVal);
	}

}
