package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class unboundedKnapsack {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of the array
		
		int[] valuesArray = new int[n];
		for(int i=0; i<valuesArray.length; i++)
		{
			valuesArray[i] = sc.nextInt();
		}
		
		int[] weightArray = new int[n];
		for(int i=0; i<weightArray.length; i++)
		{
			weightArray[i] = sc.nextInt();
		}
		
		
		int givenCap = sc.nextInt(); //Total capacity of bag which is provided by user
		
		//In this unbounded knapsack problem, one item can be used twice inorder to calculate maximum profit.
		int[] dpArray = new int[givenCap + 1]; // This array will store maximum profit the particular capacity of bag can store.
		dpArray[0] = 0; // bagCapacity of 0 doesn't contain any weight
		
		for(int bagCap = 1; bagCap <= givenCap; bagCap++) //This takes value from 1 as bagTotalCapacity to givenCapacity as a bagTotalCapacity
		{
			int max = 0;
			for(int i=0; i<n; i++)// this takes the values of weights provided by user
			{
				if(weightArray[i] <= bagCap) //The weight value should be less than the bag capacity then only that particular weight will be included in the bag
				{
					//To get the remaining Bag capacity we deduct particular weight from the bag capacity.
					int remBagCap = bagCap - weightArray[i];
					//To get the profit earned by the particular remaining BAg capacity
					int remBagValue = dpArray[remBagCap];
					//Inorder to get total value we add the remaining bag value with the value that is of given weight
					int totalValue = remBagValue + valuesArray[i];
					
					if(totalValue > max)
					{
						max = totalValue;
					}
				}
			}
			dpArray[bagCap] = max;
		}
		
		System.out.println(dpArray[givenCap]);
	}

}
