package leetcode;
import java.util.*;
public class firstOccurenceOfString {
	public static int strStr(String haystack, String needle) 
	{
	       int inputlength = haystack.length();
	       int substringlength = needle.length();

	       if(inputlength < substringlength)
	       {
	           return -1;
	       }

	       for(int i=0; i<=inputlength - substringlength; i++)
	       {
	           int j=0; 
	           while(j<substringlength && haystack.charAt(i+j) == needle.charAt(j))
	           {
	               j++;
	           }

	           if(j == substringlength)
	           {
	               return i;
	           }
	       }
	       return -1;
	   }
	public static void main(String args[])
	{
		String s1 = "sadbutsad";
		String s2 = "sad";
		int i = strStr(s1,s2);
		System.out.println(i);
	}
}
