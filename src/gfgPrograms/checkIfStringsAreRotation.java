package gfgPrograms;
import java.util.*;
public class checkIfStringsAreRotation {
	 public static int areRotations(String s1, String s2 )
	    {
	        // Your code here
	        if(s1.length() != s2.length())
	        {
	            return 0;
	        }
	        String s3 = s1.concat(s1);
	        if(s3.contains(s2))
	        {
	            return 1;
	        }
	        return 0;
	    }
	public static void main(String[] args)
	{
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		System.out.print(areRotations(s1,s2));
	}

}
