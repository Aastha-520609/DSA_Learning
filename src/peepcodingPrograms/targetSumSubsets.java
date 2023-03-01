package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class targetSumSubsets {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		printTargetSumSubsets(arr, 0, "", 0, target);
	}
    public static void printTargetSumSubsets(int[] arr, int index, String set, int sumOfSubset, int target)
    {
    	if(index == arr.length)
    	{
    		if(sumOfSubset == target)
    		{
    			System.out.println(set + ".");	
    		}
    		return;
    	}
    	//if the number want to be in subset then the set will increase and sum will also increase
    	//so recursive call happens form index+1, if the number will be in the set then set will be appended by that number and sum will also 
    	//increase and checks if it is equal to target or not.
    	printTargetSumSubsets(arr, index+1, set + arr[index] + ",", sumOfSubset + arr[index], target);
    	//if it doesn't go into subset then the set and sum will be as it is.
    	printTargetSumSubsets(arr, index+1, set, sumOfSubset, target);
    }
}
