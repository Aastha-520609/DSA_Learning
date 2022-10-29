package gfgPrograms;
import java.util.*;
public class maxOccuringChar {
	public static char getMaxOccuringChar(String line)
    {
        // Your code here
		//char[] ch = line.toCharArray();
		//Arrays.sort(ch);
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<line.length(); i++)
        {
           char ch = line.charAt(i);
           if(hmap.containsKey(ch))
           {
               int currf = hmap.get(ch);
               int nextf = currf+1;
               hmap.put(ch, nextf);
           }
           else
           {
               hmap.put(ch,1);
           }
        }
        //let max freq be at char 0
       // ArrayList<Character> arr = new ArrayList<>();
        char maxf = line.charAt(0);
        for(Character key: hmap.keySet())
        {
          if(hmap.get(key) > hmap.get(maxf))
          {
              
              maxf = key;
          }
        }
        return maxf;
    } 
	public static void main(String[] args)
	{
	  String str = "testsample";
	  System.out.print(getMaxOccuringChar(str));
	}
}
