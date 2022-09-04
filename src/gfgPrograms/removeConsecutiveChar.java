package gfgPrograms;
import java.util.*;
public class removeConsecutiveChar {
	public static String removeConsecutiveCharacter(String S){
        String str = "";
        str += S.charAt(0);
        for(int i=1; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            char ch1 = S.charAt(i-1);
            if(ch1 != ch)
            {
              str += ch;  
            }
        }
        return str;
	}
	public static void main(String[] args)
	{
		String s = "aabaa";
		System.out.println(removeConsecutiveCharacter(s));
	}

}
