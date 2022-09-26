package gfgPrograms;
import java.util.*;
public class firstRepatedChar {
	public static String firstRepChar(String s) 
    { 
        // code here
        HashSet<Character> h = new HashSet();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
           if(h.contains(ch[i]))
           {
               return Character.toString(ch[i]);
           }
           else
           {
               h.add(ch[i]);
           }
        }
        return "-1";
    }
	public static void main(String[] args)
	{
		String s = "geeksofgeeks";
		String res = firstRepChar(s);
		System.out.println(res);
		
	}

}
