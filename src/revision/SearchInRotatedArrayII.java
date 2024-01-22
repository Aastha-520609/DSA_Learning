package revision;
import java.util.*;
public class SearchInRotatedArrayII {
	public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        // Write your code here.
        int n = A.length;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(key == A[mid])
            {
                return true;
            }
            
            if(A[low] == A[mid] && A[high] == A[mid])
            {
                low++;
                high--;
                continue;
            }

            else if(A[low] <= A[mid])//left side is sorted
            {
                if(A[low] <= key && key <= A[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(A[high] >= key && key >= A[mid])
                {
                    low = mid + 1;
                }
                else
                {
                   high = mid - 1;
                }

            }
        }
        return false;
    }
	public static void main(String args[])
	{
		int[] array = {3,4,5,0,0,1,2};
		int key = 4;
		System.out.println(searchInARotatedSortedArrayII(array,key));
	}   
}
