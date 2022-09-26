package gfgPrograms;
import java.util.*;
public class firstLastCharWithSimilarFirstSubstr {
	public static int countSubstringWithEqualEnds(String s) {
        // code here
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
    	String s = "abcab";
    	int result = countSubstringWithEqualEnds(s);
    	System.out.println(result);
    }
}
