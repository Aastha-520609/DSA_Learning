package revision;
import java.util.*;
public class FindingPeakElement {
	public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size();
        int low = 1;
        int high = n - 2;

        if(n == 1)
        {
            return 0;
        }

        if(arr.get(0) > arr.get(1))
        {
            return 0;
        }

        if(arr.get(n-1) > arr.get(n-2))
        {
            return n-1;
        }

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1))
            {
                return mid;
            }
            else if(arr.get(mid)> arr.get(mid - 1))
            {
                low = mid + 1;
            }
            else
            {
               high = mid - 1;
            }
        }
    return -1;
   }
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,5,1)));
		System.out.print(findPeakElement(list));
	}
}
