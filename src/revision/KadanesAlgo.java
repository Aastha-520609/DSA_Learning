package revision;
import java.util.*;
public class KadanesAlgo {
	 public static long maxSubarraySum(int arr[], int n){
	        // Your code here
	        long currentSum = arr[0];
	        long overallSum = arr[0];
	        
	        for(int i=1; i<arr.length; i++)
	        {
	            if(currentSum >= 0)
	            {
	                currentSum = currentSum + arr[i];
	            }
	            else
	            {
	                currentSum = arr[i];
	            }
	            
	            if(currentSum > overallSum)
	            {
	                overallSum = currentSum;
	            }
	        }
	        
	        return overallSum;
	    }
	public static void main(String args[])
	{
		int[] array = {1,2,7,-4,3,2,-10,9,1};
		int n = array.length;
		System.out.println(maxSubarraySum(array,n));
	}
}
