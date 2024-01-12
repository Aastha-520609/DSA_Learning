package revision;
import java.util.*;
public class CountOccurenceOfTarget {
	public static int firstOccurence(int[] arr, int n, int target)
    {
        int low = 0;
        int high = n - 1;
        int first = 0;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurence(int[] arr, int n, int target)
    {
        int low = 0;
        int high = n - 1;
        int last = 0;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid]== target)
            {
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            
        }
        return last;
    }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int first = firstOccurence(arr,n,x);
        int last = lastOccurence(arr,n,x);
        if(first == 0 && last == 0)
        {
            return 0;
        }
        int res = last - first + 1;
        return res;
    }
	public static void main(String args[])
	{
		int[] arr = {1,1,1,2,2,3,3};
		int n = arr.length;
		int x = 3;
		System.out.println(count(arr,n,x));
	}

}
