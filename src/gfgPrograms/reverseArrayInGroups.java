package gfgPrograms;
import java.util.*;
public class reverseArrayInGroups {
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0; i<n; i+=k)
        {
            int start = i;
            int end = Math.min(i+k-1, n-1);
            int temp;
            while(start < end)
            {
                /*temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;*/
                Collections.swap(arr,end,start);
                start++;
                end--;
            }
        }
    }
	public static void main(String[] args)
	{
	  ArrayList<Integer> arr = new ArrayList<>();
	  arr.add(1);
	  arr.add(2);
	  arr.add(3);
	  arr.add(4);
	  arr.add(5);
	  int n = 5;
	  int k = 3;
	  reverseInGroups(arr,n,k);
	  for(int i=0; i<n; i++)
	  {
		  System.out.print(arr.get(i) + " ");
	  }
	}
}
