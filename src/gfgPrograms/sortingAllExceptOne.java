package gfgPrograms;
import java.util.*;
public class sortingAllExceptOne {
	 public static int[] sortExceptK (int arr[], int n, int k) 
	    {
	        //Complete the function
	        int temp = arr[k];
	        arr[k] = 0;
	        Arrays.sort(arr);
	        for(int i=0; i<k; i++)
	        {
	            arr[i] = arr[i+1];
	        }
	        arr[k] = temp;
	        return arr;
	    }
	public static void main(String[] args)
	{
		int arr[] = {10,4,11,7,6,20};
		int n = 6;
		int k = 2;
		sortExceptK(arr,n,k);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
