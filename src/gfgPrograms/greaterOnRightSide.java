package gfgPrograms;
import java.util.*;
public class greaterOnRightSide {
	public static void nextGreatest(int arr[], int n) 
	{
        // code here
		int greElem = -1;
        for(int i=0; i<n; i++)
        {
          for(int j=i+1; j<=n-1; j++)
          {
        	  //int greElem = arr[j];
        	  if(arr[j] > greElem)
        	  {
        		  greElem = arr[j];
        	  }
          }
          arr[i] = greElem;
    	  greElem = -1;
        }
    }
	public static void main(String[] args)
	{
	  int[] arr = {16, 17, 4, 3, 5, 2};
	  int n = 6;
	  nextGreatest(arr,n);
	  for(int i=0; i<n; i++)
	  {
		  System.out.print(arr[i] + " ");
	  }
	  
	}
}
