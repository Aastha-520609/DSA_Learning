package gfgPrograms;
import java.util.*;
public class peakElem {
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
       int l = 0;
       int r = n - 1;
       while(l<=r)
       {
           int mid = (l + r)/2;
           if((mid == 0 || (arr[mid] >= arr[mid-1])) && (mid == n-1 || (arr[mid] >= arr[mid + 1])))
           {
               return mid;
           }
           else if(mid > 0 && arr[mid] < arr[mid - 1])
           {
               r = mid - 1;
           }
           else
           {
               l = mid + 1;
           }
       }
        return -1;
    }
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		int n = 3;
		System.out.print(peakElement(arr,n));
	}
}
