package revision;
import java.util.*;
import java.io.*;
public class LongestSubstringWithoutRepeatingChar {
	public static int lengthOfLongestSubstring(String s) {
        HashMap< Character, Integer> hmap = new HashMap<>();
        int total_length = 0;
        int n = s.length();
        int left=0, right=0;
        while(right < n)
        {
            char ch = s.charAt(right);
            if(hmap.containsKey(ch))
            {
                left = Math.max(hmap.get(ch) + 1, left);
            }
            hmap.put(ch, right);
            total_length = Math.max(total_length, right - left + 1);
            right++;
        }
        return total_length;
    }
	public static void main(String[] args)
	{
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
