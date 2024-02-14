package revision;
import java.util.*;
public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0) + 1);
        }

        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(hmap.containsKey(ch) == false)
            {
                return false;
            }
            else if(hmap.get(ch) == 1)
            {
                hmap.remove(ch);
            }
            else
            {
                hmap.put(ch, hmap.get(ch) - 1);
            } 
        } 
        return true;
    }
	public static void main(String args[])
	{
	  System.out.println(isAnagram("anagram","nagrama"));
	  System.out.println(isAnagram("aa","a"));
	}
}
