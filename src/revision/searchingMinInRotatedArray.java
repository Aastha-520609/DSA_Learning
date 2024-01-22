package revision;
import java.util.*;
public class searchingMinInRotatedArray {
	public static int findMin(int []arr) {
        // Write your code here.
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid])
            {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }
        return ans;
    }
	public static void main(String args[])
	{
		int[] arr= {3,4,5,1,2};
		System.out.println(findMin(arr));
	}
}
