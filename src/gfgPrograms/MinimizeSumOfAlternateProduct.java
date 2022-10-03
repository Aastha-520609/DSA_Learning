package gfgPrograms;
import java.util.*;
public class MinimizeSumOfAlternateProduct {
	public static long altProduct(long arr[], long n)
    {
        // Your code goes here 
        Arrays.sort(arr);
        long sum = 0;
        long i = 0;
        long j = n - 1;
        while(i<j)
        {
            sum = sum + (arr[(int)j] * arr[(int)i]);
            i++;
            j--;
        }
        return sum;
    }
	public static void main(String[] args)
	{
		long n = 8;
		long[] arr = {9,2,8,4,5,6,7,0};
		System.out.print(altProduct(arr,n));
	}

}
