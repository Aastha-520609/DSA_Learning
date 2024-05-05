package revision;
import java.util.*;
import java.io.*;
public class LongestSubstringWithKChar {
	public static int kDistinctChars(int k, String str) {
		int maxLen = 0;
		int left = 0, right = 0;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int n = str.length();
		while(right < n)
		{
		   char ch = str.charAt(right);
		   hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		   if(hmap.size() > k)
		   {
			   char ch1 = str.charAt(left);
			   hmap.put(ch1, hmap.get(ch1) - 1);
			   if(hmap.get(ch1) == 0)
			   {
				   hmap.remove(ch1);
			   }
			   left++;
		   }

		   if(hmap.size() <= k)
		   {
			   maxLen = Math.max(maxLen, right - left + 1);
		   }
		   right++;
		}
		return maxLen;
	}
	
	public static void main(String args[])
	{
		String str = "abbbbbbc";
		int k = 2;
		System.out.println(kDistinctChars(k,str));
	}
}
