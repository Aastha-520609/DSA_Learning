package revision;
import java.util.*;
public class KthMissingNumber {
	public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return (high+1+k);
    }
	public static void main(String args[])
	{
		int[] array = {2,3,4,7,11};
		int k = 5;
		System.out.println(findKthPositive(array,k));
	}

}
