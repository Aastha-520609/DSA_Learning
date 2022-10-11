package gfgPrograms;
import java.util.*;
public class maximizeToys {
	public static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<N; i++)
        {
           if(arr[i] <= K)
           {
               count++;
               //amount also decreases on each product
               K = K - arr[i];
           }
        }
        return count;
    }
	public static void main(String[] args)
	{
	 int[] arr = {1, 12, 5, 111, 200, 1000, 10};
	 int n = 7;
	 int k = 50;
	 System.out.print(toyCount(n,k,arr));
	}
}
