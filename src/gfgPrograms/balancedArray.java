package gfgPrograms;
import java.util.*;
public class balancedArray {
	public static long minValueToBalance(long a[] ,int n)
    {
      long sum = 0;
      long sum1 = 0;
      for(int i=0; i<n/2; i++)
      {
          sum += a[i];
      }
      for(int i=n/2; i<n; i++)
      {
          sum1 += a[i];
      }
      return Math.abs(sum-sum1);
    }
	public static void main(String[] args)
	{
		int n = 4;
		long arr[] = {1,5,3,2};
		System.out.println(minValueToBalance(arr,n));
	}
}
