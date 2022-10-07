package gfgPrograms;
import java.util.*;
public class checkIfArrayIsSorted {
	public static boolean arraySortedOrNot(int[] arr, int n) {
	        // code here
	        for(int i=0; i<n-1; i++)
	        {
	            if(arr[i] > arr[i+1])
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args)
	{
		int n = 5;
		int arr[] = {1,2,3,4,5};
		boolean ans = arraySortedOrNot(arr,n);
		if(ans == true)
		{
			System.out.print(1);
		}
		else
		{
			System.out.print(0);
		}
	}
}
