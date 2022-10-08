package gfgPrograms;
import java.util.*;
public class minDiffPair {
	public static int minimum_difference(int[] nums)
    {
        // code here
       Arrays.sort(nums);
       int min = Integer.MAX_VALUE;
       for(int i=0; i<nums.length -1 ; i++)
       {
           if(nums[i+1] - nums[i] < min)
           {
              min = nums[i+1] - nums[i]; 
           }
       }
       return min;
    }
	public static void main(String[] args)
	{
		int[] arr = {2,4,5,9,7};
		System.out.print(minimum_difference(arr));
	}
}
