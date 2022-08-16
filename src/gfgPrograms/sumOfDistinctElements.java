package gfgPrograms;
import java.util.*;
import java.util.HashSet;
public class sumOfDistinctElements {
	public static int findSum(int arr[], int n)
	{
		 Arrays.sort(arr);
	        int sum = arr[0];
	        for(int i=0; i<n-1; i++)
	        {
	            if(arr[i] != arr[i+1])
	            {
	                sum = sum + arr[i+1];
	            }
	        }
	        return sum;
		//using hashing
		/*Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				sum = sum + arr[i];
			}
		}
		return sum;*/
	}
	public static void main(String[] args)
	{
		int n = 5;
		int arr[] = {1,2,3,4,5};
		int sum1 = findSum(arr,n);
		System.out.println(sum1);
	}

}
