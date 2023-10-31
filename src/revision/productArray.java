package revision;
import java.util.*;
public class productArray {
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] array = new long[n];
       /* for(int i=0; i<n; i++)
        {
           long prod = 1;
           for(int j=0; j<n; j++)
           {
               if(i!=j)
               {
                   prod = prod * nums[j];
               }
           }
           array[i] = prod;
        }
        return array;*/
        int i=0, j=0, k=0;
        long prod = 1L;
        while(i < n)
        {
            if(i!=j && j<n)
            {
                prod = prod * nums[j];
                j++;
            }
            else
            {
                j++;
            }
            
            if( j == n)
            {
               array[k] = prod;
               k++;
               j = 0;
               prod = 1L;
               i++;
            }
        }
        return array;
	}
	public static void main(String args[])
	{
		int[] nums = {10,3,5,6,2};
		int n = nums.length;
		long[] res = productExceptSelf(nums, n);
		for(int i=0; i<n; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
