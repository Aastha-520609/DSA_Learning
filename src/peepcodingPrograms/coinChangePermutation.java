package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class coinChangePermutation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //size of an array
		
		int[] coinsArray = new int[n];
		for(int i=0; i<coinsArray.length; i++)
		{
			coinsArray[i] = sc.nextInt();
		}
		
		int targetAmount = sc.nextInt();
		
		int[] resultantArray = new int[targetAmount + 1];
		resultantArray[0] = 1;
		
		for(int i=1; i<resultantArray.length; i++)
		{
			for(int j=0; j<coinsArray.length; j++)
			{
				if(coinsArray[j] <= i)
				{
					resultantArray[i] = resultantArray[i] + resultantArray[i - coinsArray[j]]; 
				}
			}
		}
		
		System.out.println(resultantArray[targetAmount]);
	}

}
