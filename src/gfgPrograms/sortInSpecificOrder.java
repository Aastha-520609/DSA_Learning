package gfgPrograms;
import java.util.*;
public class sortInSpecificOrder {
	 public static void sortIt(long arr[], long n)
	    {
	        //code here.
	        ArrayList<Long> odd = new ArrayList<Long>();
	        ArrayList<Long> even = new ArrayList<Long>();
	        for(int i=0; i<n; i++)
	        {
	            if(arr[i] % 2 == 0)
	            {
	                even.add(arr[i]);
	            }
	            else
	            {
	                odd.add(arr[i]);
	            }
	        }
	        Collections.sort(even);
	        Collections.sort(odd);
	        int q = 0;
	        for(int i=odd.size()-1; i>=0; i--)
	        {
	            arr[q] = odd.get(i);
	            q++;
	        }
	        int p = 0;
	        for(int i=odd.size(); i<n; i++)
	        {
	            arr[i] = even.get(p);
	            p++;
	        }
	    }
	 public static void main(String[] args)
	 {
		 long n = 7;
		 long[] arr = {1,2,3,5,4,7,10};
		 sortIt(arr,n);
		 System.out.println(Arrays.toString(arr));
	 }
}
