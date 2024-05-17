package revision;
import java.util.*;
public class HouseRobber {
	public static int rob1(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for(int i=1; i<n; i++)
        {
            int pick = nums[i];
            if(i>1)
            {
                pick += prev2;
            }

            int not_pick = 0 + prev;

            int curr = Math.max(pick, not_pick);
            prev2 = prev;
            prev= curr;
        }
        return prev;
    }
    public static int rob(int[] nums)
    {
        int n = nums.length;
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        if(n == 1)
        {
            return nums[0];
        }

        for(int i=0; i<n; i++)
        {
            if(i != 0)
            {
                arr1[i-1] = nums[i];
            }

            if(i != n-1)
            {
                arr2[i] = nums[i];
            }
        }

        int ans1 = rob1(arr1);
        int ans2 = rob1(arr2);

        return Math.max(ans1, ans2);
    }
    public static void main(String args[]) {
        int[] arr = {1, 5, 1, 2, 6};
        System.out.println(rob(arr));
    }
}
