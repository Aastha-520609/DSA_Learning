package revision;
import java.util.*;
public class AllocateBooks {
	 public static int countStudents(ArrayList<Integer> arr, int pages)
	    {
	        int n = arr.size();
	        int countStd = 1;
	        long pagesStudent = 0;
	        for(int i=0; i<n; i++)
	        {
	            if(arr.get(i) + pagesStudent <= pages)
	            {
	                pagesStudent += arr.get(i);
	            }
	            else{
	                countStd++;
	                pagesStudent = arr.get(i);
	            }
	        }
	        return countStd;
	    }
	 public static int findPages(ArrayList<Integer> arr, int n, int m) {
	        // Write your code here.
	         if(n < m)
	        {
	            return -1;
	        }

	        int low = Collections.max(arr);
	        int high = 0;
	        int ans = 0;
	        for(int i=0; i<n; i++)
	        {
	            high += arr.get(i);
	        }

	        while(low <= high)
	        {
	            int mid = low + (high-low)/2;
	            int student = countStudents(arr, mid);
	            if(student > m)
	            {
	                low = mid + 1;
	            }
	            else
	            {
	                ans = mid;
	                high = mid - 1;
	            }
	        }
	        return ans; 
	    }
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(25,46,28,49,24));
		int n = list.size();
		int m = 4;
		System.out.println(findPages(list,n,m));
	}
}
