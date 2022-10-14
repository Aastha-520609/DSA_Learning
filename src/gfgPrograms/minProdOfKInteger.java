package gfgPrograms;
import java.util.*;
public class minProdOfKInteger {
	public static int minProduct(int arr[], int n,int k)
    {
        // Complete the function
        Arrays.sort(arr);
        long min = 1;
        for(int i=0; i<k; i++)
        {
            min = (min * (long) arr[i])%1000000007;
        }
        return (int) min;
    }
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int k = 2;
		int n = 5;
		System.out.print(minProduct(arr,n,k));
	}
}
