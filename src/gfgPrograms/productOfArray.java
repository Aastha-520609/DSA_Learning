package gfgPrograms;
import java.util.*;
public class productOfArray {
	public static long products(long arr[], long mod, int n)
    {
        //yout code here
        long prod = 1;
        for(int i=0; i<n; i++)
        {
            prod = (prod * arr[i])%mod;
        }
        return prod;
    }
	public static void main(String[] args)
	{
		int n = 4;
		long mod = 1;
		long[] arr = {1,2,3,4};
		long res = products(arr,mod,n);
		System.out.print(res);
		
	}

}
