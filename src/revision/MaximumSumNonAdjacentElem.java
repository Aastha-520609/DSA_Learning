package revision;
import java.util.*;
import java.io.*;
public class MaximumSumNonAdjacentElem {
	public static int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1; i<n; i++)
        {
            int pick = nums[i];
            if(i > 1)
            {
                pick += prev2;
            }
            int not_pick = 0 + prev;

            int curr = Math.max(pick, not_pick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
	public static void main(String args[])
	{
		int[] arr = new int[] {1,2,3,1};
		System.out.println(rob(arr));
	}
}
