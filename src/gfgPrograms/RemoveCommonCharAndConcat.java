package gfgPrograms;
import java.util.*;
public class RemoveCommonCharAndConcat {
	public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String s = "";
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(!s2.contains(String.valueOf(ch)))
            {
                s = s + ch;
            }
        }
        for(int i=0; i<s2.length(); i++)
        {
            char ch = s2.charAt(i);
            if(!s1.contains(String.valueOf(ch)))
            {
                s = s + ch;
            }
        }
        if(s.isEmpty())
        {
            s = "-1";
        }
        return s;
    }
	public static void main(String[] args)
	{
		 String s1 = "aacdb";
		 String s2 = "gafd";
		 String str = concatenatedString(s1,s2);
		 System.out.println(str);
	}

}
