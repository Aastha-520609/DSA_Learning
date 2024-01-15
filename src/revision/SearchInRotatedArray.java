package revision;
import java.util.*;
public class SearchInRotatedArray {
	 public static int search(ArrayList<Integer> arr, int n, int target) {
	        // Write your code here.
	        int low = 0;
	        int high = n - 1;
	        while(low <= high)
	        {
	            int mid = low + (high - low)/2;
	            if(arr.get(mid) == target)
	            {
	                return mid;
	            }
	            else if(arr.get(low) <= arr.get(mid)) //check if left part is sorted
	            {
	              if(arr.get(low) <= target && target <= arr.get(mid))
	              {
	                  high = mid - 1;
	              }
	              else
	              {
	                  low = mid + 1;
	              }
	            }
	            else //right part is sorted
	            {
	               if(arr.get(high) >= target && target >= arr.get(mid))
	               {
	                   low = mid + 1;
	               }
	               else{
	                   high = mid - 1;
	               }
	            }
	        }

	        return -1;
	 } 
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(15);
		list.add(18);
		list.add(2);
		list.add(4);
		
		int n = list.size();
		int target = 2;
		
		int result = search(list,n,target);
		System.out.println(result);
	}
}
