package leetcode;
import java.util.*;
public class majorityElement {
	public static int majorityEle(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i < nums.length; i++)
        {
           if(map.containsKey(nums[i]))
           {
               map.put(nums[i], map.get(nums[i]) + 1);
           }
           else
           {
               map.put(nums[i], 1);
           }
        }
        
        n = n/2;
        //checking if element has occured more than n times;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue() > n)
            {
                return entry.getKey();
            }
        }
       return 0;
    }
	public static void main(String args[])
	{
		int[] array = {2,2,1,1,1,2,2};
		System.out.println(majorityEle(array));
	}

}
