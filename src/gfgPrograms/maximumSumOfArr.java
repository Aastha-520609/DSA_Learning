package gfgPrograms;
import java.util.*;
public class maximumSumOfArr {
	public static int Maximize(int arr[], int n)
	    {
	        // Complete the function
	        Arrays.sort(arr);
	        long sum = 0;
	        for(int i=0; i<n; i++)
	        {
	            sum = sum + (long) arr[i]*i;
	        }
	        return (int)(sum%(1000000007));
	    }
	public static void main(String[] args)
	{
		int[] arr = {5,3,2,4,1};
		int n = 5;
		System.out.print(Maximize(arr,n));
	}

}
