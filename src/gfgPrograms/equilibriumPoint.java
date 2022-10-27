package gfgPrograms;
import java.util.*;
public class equilibriumPoint {
	public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        if(n == 1)
        {
            return 1;
        }
        int i = 0;
        int j = n-1;
        int sum1 = 0;
        int sum2 = 0;
        while(i<j)
        {
            if(sum1 < sum2)
            {
                sum1 = sum1 + (int)arr[i]; 
                i++;
            }
            else
            {
                sum2 = sum2 + (int)arr[j];
                j--;
            }
        }
        if(sum1 == sum2)
        {
            return i+1;
        }
        return -1;
    }
	public static void main(String[] args)
	{
		long[] arr = {1,3,5,2,2};
		int n = 5;
		System.out.print(equilibriumPoint(arr,n));
	}
}
