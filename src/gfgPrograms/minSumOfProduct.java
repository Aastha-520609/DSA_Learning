package gfgPrograms;
import java.util.*;
public class minSumOfProduct {
	 public static long minValue(long a[], long b[], long n) 
	    {
	        // Your code goes here
	        Arrays.sort(a);
	        Arrays.sort(b);
	        int N = (int)n;
	        long minSum = 0;
	        for(int i=0; i<N; i++)
	        {
	            minSum += (a[i] * b[N-i-1]);
	        }
	        return minSum;
	    }
	public static void main(String[] args)
	{
		int n = 3;
		long a[] = {3,1,1};
		long b[] = {6,5,4};
		long result = minValue(a,b,n);
		System.out.println(result);
	}

}
