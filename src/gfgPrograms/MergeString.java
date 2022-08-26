package gfgPrograms;
import java.util.*;
public class MergeString {
	 public static String merge(String S1, String S2)
	    { 
	        // code here
		    String final_str = "";
	        for(int i=0; i<S1.length() || i<S2.length(); i++)
	        {
	            if(i<S1.length())
	            {
	             final_str += S1.charAt(i);   
	            }
	            if(i<S2.length())
	            {
	             final_str += S2.charAt(i);   
	            }
	        }
	        return final_str;
	    }
	
	public static void main(String args[])
	{
		String S1 = "Hello";
		String S2 = "Bye";
		System.out.println(merge(S1, S2));
	}
}
