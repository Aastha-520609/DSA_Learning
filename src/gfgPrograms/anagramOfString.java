package gfgPrograms;
import java.util.*;
public class anagramOfString {
	public static int isAnagram(String a,String b)
    {
        // Your code here
        if(a.length() != b.length())
        {
            return 0;
        }
        //int n = a.length() + b.length();
        char ch[] = a.toCharArray();
        char ch1[] = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0; i<ch.length; i++)
        {
          if(ch[i] != ch1[i])
          {
              return 0;
          }
        }
      return 1;  
    }
	public static void main(String[] args)
	{
		String a = "geeksforgeeks";
		String b = "forgeeksskeeg";
		System.out.print(isAnagram(a,b));
	}

}
