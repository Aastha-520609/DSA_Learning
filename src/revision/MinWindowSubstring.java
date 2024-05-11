package revision;
import java.util.*;
import java.io.*;
public class MinWindowSubstring {
	public static String minWindow(String s, String t) {
        int left = 0, right = 0, count = 0;
        int n = s.length();
        int m = t.length();
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<m; i++)
        {
           char ch = t.charAt(i);
           hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        while(right < n)
        {
            char ch1 = s.charAt(right);
            int val = hmap.getOrDefault(ch1, 0);
            if(val > 0)
            {
                count++;
            }
            hmap.put(ch1, val-1);
            while(count == m)
            {
               int len = right - left + 1;
               if(len < minLen)
               {
                minLen = len;
                sIndex = left;
               } 

               char ch2 = s.charAt(left);
               int lval = hmap.getOrDefault(ch2, 0);
               hmap.put(ch2, lval+1);
               if(lval >= 0)
               {
                count--;
               }
               left++;
            }
            right++;
        }
        return sIndex == -1 ? "" : s.substring(sIndex,  sIndex + minLen);
    }
	public static void main(String args[])
	{
		String s = "DDAAABBCA";
		String t = "ABC";
		String res = minWindow(s,t);
		String ans = "";
		for(int i=0; i<res.length(); i++)
		{
			ans += res.charAt(i);
		}
		System.out.println(ans);		
	}
}
