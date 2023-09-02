package leetcode;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class twoSum {
	public static int[] TwoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0; i<=nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if((nums[i]+ nums[j]) == target)
                {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
	public static void main(String args[]) {
	    
		int arr[] = {2,7,11,15};
		int target = 9;
		int result[] = TwoSum(arr,target);	
		System.out.println("[" + result[0] + "," +  result[1] + "]");
	}
}
