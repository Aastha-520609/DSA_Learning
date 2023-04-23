package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class PaintHouse {
	public static void main(String args[])
	{
		//find minimum cost to paint a house in such a way that if one color is selected then in next chance it should not be selecte(i.e color should be different)
		//if red is selected at first then in second red should not be selected.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of house (we can also say number of rows)
		
		int[][] houseArray= new int[n][3]; //here 3 is the column
		for(int i=0; i<houseArray.length; i++)
		{
			for(int j=0; j<houseArray[0].length; j++)
			{
				houseArray[i][j] = sc.nextInt();
			}
		}
		
		long[][] dpArray = new long[n][3];
		
		//first row value will include itself
		dpArray[0][0] = houseArray[0][0];
		dpArray[0][1] = houseArray[0][1];
		dpArray[0][2] = houseArray[0][2];
		
		for(int i=1; i<houseArray.length; i++)
		{
			dpArray[i][0] = houseArray[i][0] + Math.min(dpArray[i-1][1], dpArray[i-1][2]);
			dpArray[i][1] = houseArray[i][1] + Math.min(dpArray[i-1][0], dpArray[i-1][2]);
			dpArray[i][2] = houseArray[i][2] + Math.min(dpArray[i-1][0], dpArray[i-1][1]);
		}
		
		long ans = Math.min(dpArray[n-1][0], Math.min(dpArray[n-1][1], dpArray[n-1][2]));
		System.out.println(ans);
	}
}
