package gfgPrograms;
import java.util.*;
public class closetNumber {
	public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
        int ans = 0;
        if(target <= arr[0])
        {
            return arr[0];
        }
        else if(target >= arr[n-1])
        {
            return arr[n-1];
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i] <= target && arr[i+1] > target)
            {
                int a = target - arr[i];
                int b = arr[i+1] - target;
                if(a >= b)
                {
                    ans = arr[i+1];
                }
                else
                {
                    ans = arr[i];
                }
            }
        }
        return ans;
    } 
	public static void main(String[] args)
	{
	   int arr[] = {1, 2, 3, 5, 6, 8, 9};
	   int n = 6;
	   int target = 4;
	   System.out.println(findClosest(arr,n,target));
	}
}
