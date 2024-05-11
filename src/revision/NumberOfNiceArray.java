package revision;
import java.util.*;
import java.io.*;
public class NumberOfNiceArray {
	public static int subArrays(int[] nums, int k)
    {
        if(k < 0)
        {
            return 0;
        }

        int left = 0,  right = 0, sum = 0, count = 0;
        while(right < nums.length)
        {
            int i = (nums[right] % 2);
            sum += i;
            while(sum > k)
            {
                int j = (nums[left] % 2);
                sum -= j;
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int res = subArrays(nums, k) - subArrays(nums, k - 1);
        return res;
    }
	public static void main(String args[])
	{
		int arr[] = new int[] {1,1,2,1,1};
		int k = 3;
		System.out.println(numberOfSubarrays(arr,k));
	}

}
