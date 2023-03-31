package gfgPrograms;
import java.util.*;
public class spaceString {
	public static ArrayList<String> spaceString(String str)
    {
        // Your code here
        ArrayList<String> result = new ArrayList<>();
        findString(result,str,0,""); // calling another function with arraylist,string,index as 0 and empty temp string
        return result;
    }
    
    public static void findString(ArrayList<String> result, String s, int i, String temp)
    {
        if(i == s.length())
        {
            result.add(temp);
            return;
        }
        
        char ch = s.charAt(i);
        if(i == 0)
        {
            findString(result,s,i+1,temp+ch); 
        }
        else
        {
            findString(result,s,i+1,temp+ch);
            findString(result,s,i+1,temp+" "+ch);
        }
    }
	public static void main(String args[])
	{
		String str = "abc";
		spaceString obj = new spaceString();
		ArrayList<String> ans= spaceString(str);
		System.out.println(ans);
		
	}
}
