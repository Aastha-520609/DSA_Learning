package revision;
import java.util.*;
import java.io.*;
public class SubArrayWithKDiffInteger {
	public static int subArrays(int[] nums, int k)
    {
        int left = 0, right = 0, count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(right < nums.length)
        {
            hmap.put(nums[right], hmap.getOrDefault(nums[right],0) + 1);
            while(hmap.size() > k)
            {
                int i = hmap.get(nums[left]);
                hmap.put(nums[left], i - 1);

                if(i == 1)
                {
                    hmap.remove(nums[left]);
                }
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int res = subArrays(nums, k) - subArrays(nums, k - 1);
        return res;
    }
	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,1,2,3};
		int k = 2;
		System.out.println(subarraysWithKDistinct(arr,k));
	}
}
