package gfgPrograms;
import java.util.*;
public class alternativeSorting {
	public static ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        // Your code goes here
        ArrayList<Long> a = new ArrayList<>();
        Arrays.sort(arr);
        int i=0; 
        int j = N - 1;
        while(i<j)
        {
           a.add(arr[j]);
           a.add(arr[i]);
           i++;
           j--;
        }
        if(N % 2 != 0)
        {
            a.add(arr[N/2]);
        }
        return a;
    }
	public static void main(String[] args)
	{
	  int N = 7; 
	  long[] arr = {7,1,6,2,5,3,4};
	  System.out.print(alternateSort(arr,N));
	}

}
