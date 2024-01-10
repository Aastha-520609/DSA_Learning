package revision;
import java.util.*;
import java.io.*;
public class FindingTarget {
	public static int BinarySearch(int[] nums, int low, int high, int target)
    {
        if(low > high)
        {
            return -1;
        }
        
        int mid = low + (high - low)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(target < nums[mid])
        {
            return BinarySearch(nums, low, mid - 1, target);
        }
        else{
            return BinarySearch(nums, mid + 1, high, target);
        }
    }
    public static int search(int []nums, int target) 
    {
        return BinarySearch(nums, 0, nums.length - 1,target);
    }
	public static void main(String args[])
	{
		int nums[] = {1,3,7,9,11,12,45};
		int target = 3;
		int res = search(nums,target);
		System.out.println(res);
	}

}
