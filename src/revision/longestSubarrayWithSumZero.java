package revision;
import java.util.*;
import java.io.*;
public class longestSubarrayWithSumZero {
	public static int LongestSubarray(int[] arr)
	{
		int n = arr.length;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int maxLen = 0;
		int sum = 0;
		int index = -1; //as we have to add one extra index inorder to match the sum 0
		hmap.put(sum, index); //placing 0 with index -1;
		
		while(index < n - 1)
		{
			index++;
			sum = sum + arr[index];
			
			if(hmap.containsKey(sum))
			{
				int len = index - hmap.get(sum);
				if(len > maxLen)
				{
					maxLen = len;
				}
			}
			else
			{
				hmap.put(sum, index);
			}
		}
		return maxLen;
	}
	public static void main(String args[])
	{
		int[] array = {1,2,-2,4,-4};
		System.out.println(LongestSubarray(array));
	}
}
