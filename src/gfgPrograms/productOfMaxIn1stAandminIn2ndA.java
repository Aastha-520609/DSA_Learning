package gfgPrograms;
import java.util.*;
public class productOfMaxIn1stAandminIn2ndA {
	public static long find_multiplication(int arr[], int brr[], int n, int m) {
        // Complete the Function
	   Arrays.sort(arr);
	   int max = arr[n-1];
	   Arrays.sort(brr);
       int min = brr[0];  
       return (max*min);
    }
	public static void main(String[] args)
	{
		int n = 6;
		int m = 6;
		int brr[] = {1,2,6,-1,0,9};
		int arr[] = {5,7,9,3,6,2};
		System.out.println(find_multiplication(arr,brr,n,m));
	}
	

}
