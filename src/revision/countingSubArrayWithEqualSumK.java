package revision;
import java.util.*;
public class countingSubArrayWithEqualSumK {
	public static int countSubArray(int[] array, int n, int target)
	{
		int ans = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		hmap.put(0, 1);
		
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			sum = sum + array[i];
			if(hmap.containsKey(sum-target))
			{
				ans = ans + hmap.get(sum - target);
			}
			hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
		}
		return ans;
	}
	public static void main(String args[])
	{
		int[] array = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int n = array.length;
		int target = 5;
		System.out.println(countSubArray(array,n,target));
	}
}
