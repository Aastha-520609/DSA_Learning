package leetcode;
import java.util.*;
public class rotateGivenArray {
	 public static int rotate(int[] nums, int k) {

	        k %= nums.length;
	        func_reverse(nums,0,nums.length-1);
	        func_reverse(nums,0,k-1);
	        func_reverse(nums,k,nums.length - 1);
	        return 0;
	        
	    }
	    
	    public static void func_reverse(int[] nums, int start, int end)
	    {
	        while(start < end)
	        {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }
	public static void main(String args[])
	{
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}

}
