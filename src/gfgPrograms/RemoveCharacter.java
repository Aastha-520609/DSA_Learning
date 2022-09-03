package gfgPrograms;
import java.util.*;
public class RemoveCharacter {
	 public static String removeChars(String string1, String string2){
	        // code here
	        ArrayList<Character> list = new ArrayList<>();
	        for(int i=0; i<string2.length(); i++)
	        {
	          list.add(string2.charAt(i));   
	        }
	        
	        String res = "";
	        for(int i=0; i<string1.length(); i++)
	        {
	            char ch = string1.charAt(i);
	            if(!list.contains(ch))
	             {
	               res += ch;
	             }
	            else
	             {
	               continue;
	             }
	        }
	        return res;
	    }
	public static void main(String[] args)
	{
		String s1 = "computer";
		String s2 = "cat";
		String res = removeChars(s1,s2);
		System.out.println(res);
	}

}
