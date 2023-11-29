package revision;
import java.util.*;
import java.io.*;
public class FourthSum {
	public static List<List<Integer>> quadruple(int[] nums, int target)
	{
		int n = nums.length;
		Set<List<Integer>> st = new HashSet<>();
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				Set<Long> hashset = new HashSet<>();
				for(int k=j+1; k<n; k++)
				{
					long sum = nums[i] + nums[j];
					sum += nums[k];
					
					long fourth = target - sum;
					
					if(hashset.contains(fourth))
					{
						List<Integer> lst = new ArrayList<>();
						lst.add(nums[i]);
						lst.add(nums[j]);
						lst.add(nums[k]);
						lst.add((int) fourth);
						lst.sort(null);
						st.add(lst);	
					}
				hashset.add((long) nums[k]);	
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	
	public static void main(String args[])
	{
		int[] array = {2,2,2,2,1,3};
		int target = 8;
        List<List<Integer>> result = quadruple(array, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
	}

}
