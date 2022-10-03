package gfgPrograms;
import java.util.*;
public class MaximumProductOfTwoNumbers {
	public static int maxProduct(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int last = n - 1;
        int secondLast = n - 2;
        int result = 1;
        for(int i=0; i<n; i++)
        {
           result = arr[last] * arr[secondLast];
        }
        return result;
    }
	public static void main(String[] args)
	{
		int[] arr = {1,4,3,6,7,0};
		int n = 6;
		System.out.print(maxProduct(arr,n));
	}
}
