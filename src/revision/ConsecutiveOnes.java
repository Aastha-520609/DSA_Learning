package revision;
import java.util.*;
import java.io.*;
public class ConsecutiveOnes {
	public static int longestOnes(int[] nums, int k) {
        int maxLen = 0, left = 0, right = 0, zeros = 0, len = 0;
        int n = nums.length;
        while(right < n)
        {
            if(nums[right] == 0)
            {
                zeros++;
            }

            if(zeros > k)
            {
              if(nums[left] == 0)
              {
                zeros--;
              }
              left++;
            }

            if(zeros <= k)
            {
                len = right-left + 1;
                maxLen = Math.max(len, maxLen);
            }
            right++;
        }
       return maxLen; 
    }
	public static void main(String[] args)
	{
		int[] nums = new int [] {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(longestOnes(nums,k));
	}
}
