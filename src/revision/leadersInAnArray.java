package revision;
import java.util.*;
import java.io.*;
public class leadersInAnArray {
	 public static List<Integer> superiorElements(int []a) {
	        // Write your code here.

	        ArrayList<Integer> list = new ArrayList<>();
	        int n = a.length;

	        int max = a[n-1];
	        list.add(a[n-1]);

	        for(int i=n-2; i>=0; i--)
	        {
	            if(a[i] > max)
	            {
	                list.add(a[i]);
	                max = a[i];
	            }
	        }
	        
	        Collections.sort(list);
	        return list;
	    }
	public static void main(String args[])
	{
		int[] arr = {1, 2, 2, 1};

        List<Integer> leaders = superiorElements(arr);

        System.out.println("Leaders in the array are: " + leaders);
		
	}
}
