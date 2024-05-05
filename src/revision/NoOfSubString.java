package revision;
import java.util.*;
import java.io.*;
public class NoOfSubString {
	 public static int numberOfSubstrings(String s) {
	        int[] lastSeen = new int[] {-1,-1,-1};
	        int count = 0;
	        for(int i=0; i<s.length(); i++)
	        {
	            char ch = s.charAt(i);
	            lastSeen[ch - 'a'] = i;
	            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1 )
	            {
	                int minLastSeen = Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);
	                count = count + (1 + minLastSeen);
	            }
	        } 
	        return count; 
	    }
	public static void main(String args[])
	{
		String str = "abcabc";
		System.out.println(numberOfSubstrings(str));
	}
}
