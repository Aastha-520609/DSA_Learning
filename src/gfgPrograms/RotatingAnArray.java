package gfgPrograms;
import java.util.*;
public class RotatingAnArray {
	public static void leftRotate(int[] arr, int n, int d) {
        // code here
        int[] a = new int[d];
        for(int i=0; i<n; i++)
        {
            if(i<d)
            {
                a[i] = arr[i];
            }
            else
            {
                arr[i-d] = arr[i];
            }
        }
        for(int i=0; i<d; i++)
        {
            arr[n-d+i] = a[i];
        }
    }
	public static void main(String[] args)
	{
		int n = 7;
		int d = 2;
		int arr[] = {1,2,3,4,5,6,7};
		leftRotate(arr,n,d);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
