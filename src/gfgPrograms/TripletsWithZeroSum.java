package gfgPrograms;
import java.util.*;
public class TripletsWithZeroSum {
	public static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
		boolean found = true;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
           int j=i+1;
           int k=n-1;
           while(j<k)
           {
               if(arr[i]+arr[j]+arr[k]==0)
               {
            	  return found;
               }
               else if(arr[i]+arr[j]+arr[k]>0)
               {
                   k--;
               }
               else 
               {
                   j++;
               }
           }
       }
       
    }
	public static void main(String[] args)
	{
		int[] arr = {0,-1,2,-3,1};
		int n = 5;
	    findTriplets(arr,n);
	}

}
