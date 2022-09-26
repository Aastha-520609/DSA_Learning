package gfgPrograms;
import java.util.*;
public class stringReversal {
	public static String reverseString(String s)
    {
        //code here.
        //reversing string 
        String r ="";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            r = ch + r;
        }
        //checking whether element is already present or not 
        HashSet<Character> set = new HashSet<>();
        String res ="";
        char[] ch = r.toCharArray();
        for(int i=0; i<r.length(); i++)
        {
            if(!set.contains(ch[i]) && ch[i]!=' ')
            {
              set.add(ch[i]);
              res = res + ch[i];
            }
        }
        return res;
        //Another Method
        /*public String reverseString(String s)
          {
        //code here.
        String rev = "";
        for(int i=s.length() - 1; i>=0; i--)
        {
            if(!rev.contains(s.charAt(i) + "") && s.charAt(i)!=' ')
            {
                rev = rev + s.charAt(i);
            }
        }
        return rev;
        }*/
    }
	public static void main(String[] args)
	{
		String s = "GEEKS FOR GEEKS";
		String result = reverseString(s);
		System.out.println(result);
	}
}
