package revision;
import java.io.*;
import java.util.*;
public class FindingFirstAndLastOccurence {
	/*//This is done by finding lower bound and upper bound
	public static int lower(ArrayList<Integer> arr, int n, int k)
    {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) >= k)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upper(ArrayList<Integer> arr, int n, int k)
    {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) > k)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int lb = lower(arr,n,k);
        if(lb == n || arr.get(lb) != k)
        {
            return new int[] {-1,-1};
        }
        int ub = upper(arr,n,k);
        return new int[] {lb, ub - 1};
    }
    */
	
	//This is by simple binary search problem
	public static int firstOccurence(ArrayList<Integer> arr, int n, int target)
    {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == target)
            {
                first = mid;
                high = mid - 1;
            }
            else if(arr.get(mid) < target)
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

    public static int lastOccurence(ArrayList<Integer> arr, int n, int target)
    {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == target)
            {
                last = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) < target)
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

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first = firstOccurence(arr,n,k);
        if(first == -1)
        {
            return new int[] {-1, -1};
        }
        int last = lastOccurence(arr,n,k);
        return new int[] {first,last};
    }
    
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(5);
		int n = list.size();
		int k = 1;
		int[] res = firstAndLastPosition(list,n,k);
		for(int i=0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
