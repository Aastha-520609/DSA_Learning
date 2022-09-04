package gfgPrograms;
import java.util.*;
public class totalCount {
	public static int totalCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        for(int i=0; i<n; i++)
        {
            int temp = arr[i];
            int rem = temp % k;
            int quo = temp / k;
            if(rem == 0)
            {
                count += quo;
            }
            else
            {
                count += quo+1;
            }
        }
        return count;
    }
	public static void main(String[] args)
	{
		int n = 4;
		int k = 3;
		int arr[] = {5,8,10,13};
		System.out.println(totalCount(arr,n,k));
	}

}
