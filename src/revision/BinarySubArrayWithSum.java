package revision;
import java.util.*;
import java.io.*;
public class BinarySubArrayWithSum {
	public static int numSubarraysWithSum(int[] nums, int goal) {
        int res = subArray(nums, goal) - subArray(nums, goal - 1);
        return res;
    }
	
	public static int subArray(int[] nums, int goal)
    {
        if(goal < 0)
        {
            return 0;
        }
        int left = 0, right = 0, sum = 0, count = 0;
        while(right < nums.length )
        {
            sum += nums[right];
            while(sum > goal)
            {
                sum = sum - nums[left];
                left++;
            }
            count += (right - left + 1);
            right = right + 1;
        }
        return count;
    }
	public static void main(String args[])
	{
		int[] arr = new int[] {1,0,1,0,1};
		int goal = 2;
		System.out.println(numSubarraysWithSum(arr,goal));
	}   
}
