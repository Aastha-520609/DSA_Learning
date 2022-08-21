package gfgPrograms;
import java.util.*;
public class FirstNFiboNumber {
	 public static long[] printFibb(int n) 
	    {
	        //Your code here
	        long n1 = 1;
	        long n2 = 1;
	        long[] arr = new long[n];
	        long n3=0;
	        for(int i=0; i<n; i++)
	        {
	            n1 = n2;
	            n2 = n3;
	            n3 = n1 + n2;
	            arr[i] = n3;
	        }
	        return arr;
	    }
	public static void main(String[] args)
	{
		int N = 5;
		long[] arr = printFibb(N);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");	
		}
	}
}
