package gfgPrograms;
import java.util.*;
public class removeAllCharOtherThanAlpha {
	 public static String removeSpecialCharacter(String s) {
	        // code here
	        StringBuilder ans=new StringBuilder();
	        for(int i=0; i<s.length(); i++)
	        {
	            char ch=s.charAt(i);
	            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	            {
	                ans.append(ch);
	            }
	        }
	        if(ans.toString().length() == 0)
	        {
	         return "-1";   
	        }
	        return ans.toString();
	     }
	public static void main(String[] args)
	{
		String S = "Gee*k;s..fo, r'Ge^eks?";
		String result = removeSpecialCharacter(S);
		System.out.println(result);
	}

}
