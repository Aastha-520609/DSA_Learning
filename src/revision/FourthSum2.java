package revision;
import java.util.*;
import java.io.*;
public class FourthSum2 {
	public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<n; i++)
        {
            if( i!=0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j=i+1; j<n; j++)
            {
               if( j!=i+1 && nums[j] == nums[j-1])
               {
                   continue;
               }

               int k = j+1;
               int fourth = n-1;

               while(k<fourth)
               {
                   long sum = nums[i] + nums[j];
                   sum += nums[k];
                   sum += nums[fourth];

                   if(sum == target)
                   {
                       List<Integer> lst = new ArrayList<>();

                       lst.add(nums[i]);
                       lst.add(nums[j]);
                       lst.add(nums[k]);
                       lst.add(nums[fourth]);

                       ans.add(lst);
                       k++;
                       fourth--;

                       while(k<fourth && nums[k] == nums[k-1])
                       {
                           k++;
                       }

                       while(k<fourth && nums[fourth] == nums[fourth - 1])
                       {
                           fourth--;
                       }
                   }
                   else if(sum < target)
                   {
                       k++;
                   }
                   else
                   {
                       fourth--;
                   }
               }
            }
        }
        return ans;
    }
	public static void main(String args[])
	{
		int[] array = {2,2,2,2,1,3};
		int target = 8;
        List<List<Integer>> result = fourSum(array, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
	}

}
