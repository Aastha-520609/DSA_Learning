package gfgPrograms;
import java.util.*;
public class sumArrayPuzzle {
	public static void SumArray(int arr[], int n)
    {
        // your code here
        int sum = 0;
        for(int i=0; i<n; i++)
        {
           sum = sum + arr[i]; 
        }
        for(int i=0; i<n; i++)
        {
            arr[i] = sum - arr[i];
            System.out.print(arr[i] + " ");
        }
    }
	public static void main(String[] args)
	{
	 int[] arr = {3, 6, 4, 8, 9};
	 int n = 5;
	 SumArray(arr,n);
	}
}
