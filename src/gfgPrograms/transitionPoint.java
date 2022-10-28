package gfgPrograms;
import java.util.*;
public class transitionPoint {
	public static int transitionPoint(int arr[], int n) {
        // code here
        if(arr[0] == 1)
        {
            return 0;
        }
        for(int i=1; i<n; i++)
        {
            if(arr[i] > arr[i-1] )
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args)
	{
		int[] arr = {0,0,0,1,1};
		int n = arr.length;
		System.out.print(transitionPoint(arr,n));
	}

}
