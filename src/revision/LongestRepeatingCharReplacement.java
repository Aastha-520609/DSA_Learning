package revision;
import java.util.*;
import java.io.*;
public class LongestRepeatingCharReplacement {
	public static int characterReplacement(String s, int k) {
        int right = 0, left = 0, maxLen = 0, maxFreq = 0;
        int n = s.length();
        HashMap<Character, Integer> hmap = new HashMap<>();
        while(right < n)
        {
           char ch = s.charAt(right);
           hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
           maxFreq = Math.max(maxFreq, hmap.get(ch));
           int len = right - left + 1;
           if(len - maxFreq > k)
           {
             char ch1 = s.charAt(left);
             hmap.put(ch1, hmap.get(ch1) - 1);
             left++;
           }

           if(len - maxFreq <= k)
           {
            maxLen = Math.max(maxLen, len);
           }

           right++;
        }
       return maxLen; 
    }
	public static void main(String args[])
	{
		String str = "ABAB";
		int k = 2;
		System.out.println(characterReplacement(str,k));
	}
}
