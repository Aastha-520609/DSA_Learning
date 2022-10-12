package gfgPrograms;
import java.util.*;
public class sortingArrayAfterApplyingEqn {
	public static long[] sortArray(long []arr, int n, long A, long B, long C)
    {
        // Code here
        //done in n^2 time.
        for(int i=0; i<n; i++)
        {
            arr[i] = A*arr[i]*arr[i]+B*arr[i]+C;
        }
        long new_arr[] = new long[n];
        for(int i=0; i<n; i++)
        {
            new_arr[i] = arr[i];
        }
        Arrays.sort(new_arr);
        for(int i=0; i<n; i++)
        {
        	System.out.print(new_arr[i] + " ");
        }
        return new_arr;
    }
    public static void main(String[] args)
    {
    	long[] arr = {-1, 0, 1, 2, 3, 4};
    	sortArray(arr,6,-1,2,-1);
    }
}
