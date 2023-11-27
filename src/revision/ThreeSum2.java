package revision;
import java.util.*;
import java.io.*;
public class ThreeSum2 {
	public static List<List<Integer>> triplet(int[] arr, int n)
	{
		List<List<Integer>> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++)
		{
			if(i != 0 && arr[i] == arr[i-1]) //inorder to remove duplicates
			{
				continue;
			}
			
			int j = i+1;
			int k = n-1;
			
			while(j<k)
			{
				int sum = arr[i]+arr[j]+arr[k];
				if(sum < 0)
				{
					j++;
				}
				else if(sum > 0)
				{
					k--;
				}
				else //means its getting the required sum i.e 0
				{
					List<Integer> lst = Arrays.asList(arr[i], arr[j], arr[k]);
					ans.add(lst);
					j++;
					k--;
					
					//remove duplicates
					while(j<k && arr[j] == arr[j-1])
					{
						j++;
					}
					
					while(j<k && arr[k] == arr[k+1])
					{
						k--;
					}
					
				}
			}
		}
		
		return ans;
	}
	public static void main(String args[])
	{
		int[] array = {-18, -1, -44, -48, -9, -16, -36, -13, 29, 17, -12, 9, -49};
        List<List<Integer>> result = triplet(array, array.length);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
	}
}
