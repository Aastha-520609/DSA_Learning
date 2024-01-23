package revision;
import java.util.*;
public class FindNoOfRotation {
	public static int findKRotation(int []arr){
        // Write your code here.
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid])
            {
                if(arr[low] < ans)
                {
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
            }
            else
            {
                if(arr[mid] < ans)
                {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
	public static void main(String args[])
	{
	   int[] arr = {3,4,0,1,2};
	   System.out.println(findKRotation(arr));
	}
}
